package mybatis.plugins;

import org.mybatis.generator.api.GeneratedJavaFile;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.config.PropertyRegistry;
import org.mybatis.generator.config.TableConfiguration;

import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 * 生成Mapper对应的Service类的插件
 * @author jason.guan
 * @create 2017-12-19 下午2:25
 **/
public class ServiceClientPlugin extends PluginAdapter {

    private static Boolean isExceted = false;
    private FullyQualifiedJavaType superService;
    private FullyQualifiedJavaType superServiceImpl;
    private FullyQualifiedJavaType service;
    private FullyQualifiedJavaType serviceImpl;
    private FullyQualifiedJavaType controller;
    private String repository;

    @Override
    public boolean validate(List<String> list) {
        superService = new FullyQualifiedJavaType(properties.getProperty("superService"));
        superServiceImpl = new FullyQualifiedJavaType(properties.getProperty("superServiceImpl"));
        service = new FullyQualifiedJavaType(properties.getProperty("service"));
        serviceImpl = new FullyQualifiedJavaType(properties.getProperty("serviceImpl"));
        controller = new FullyQualifiedJavaType(properties.getProperty("controller"));
        repository = properties.getProperty("repository");
        List<TableConfiguration> tableConfigurations = context.getTableConfigurations();
        return true;
    }

    @Override
    public List<GeneratedJavaFile> contextGenerateAdditionalJavaFiles(IntrospectedTable introspectedTable) {

        List<GeneratedJavaFile> files = new ArrayList<GeneratedJavaFile>();
        if (!isExceted) {
            isExceted = true;
        }
       generatedServiceController(introspectedTable, files);
//        generateController(introspectedTable, files);
        return files;
    }

    @Override
    public boolean clientGenerated(Interface interfaze, TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        /**
         * 添加 继承
         */
        interfaze.addAnnotation(repository);
        interfaze.addImportedType(new FullyQualifiedJavaType("com.jason.learning.datasource.annotation."+repository.substring(1)));
        return true;
    }

    private void generatedServiceController(IntrospectedTable introspectedTable, List<GeneratedJavaFile> files) {
        String objectName = introspectedTable.getFullyQualifiedTable().getDomainObjectName();
        FullyQualifiedJavaType objectFqjt = new FullyQualifiedJavaType(context.getJavaModelGeneratorConfiguration().getTargetPackage() + "." + objectName);
        String serviceInterfaceString = service.getFullyQualifiedName() + ".I" + objectName + "Service";
        FullyQualifiedJavaType serviceInterface = new FullyQualifiedJavaType(serviceInterfaceString);
        Interface interfaze = new Interface(serviceInterface);
        interfaze.setVisibility(JavaVisibility.PUBLIC);

        FullyQualifiedJavaType superServiceFqjt = new FullyQualifiedJavaType(properties.getProperty("superService"));
        superServiceFqjt.addTypeArgument(objectFqjt);
        interfaze.addImportedType(objectFqjt);
        interfaze.addSuperInterface(superServiceFqjt);
        interfaze.addImportedType(new FullyQualifiedJavaType(properties.getProperty("superService")));
        GeneratedJavaFile javaFile = new GeneratedJavaFile(interfaze, context.getJavaModelGeneratorConfiguration()
                .getTargetProject(),
                context.getProperty(PropertyRegistry.CONTEXT_JAVA_FILE_ENCODING),
                context.getJavaFormatter());
        files.add(javaFile);

        /**
         * service impl
         */
        FullyQualifiedJavaType currentServiceImpl = new FullyQualifiedJavaType(serviceImpl.getFullyQualifiedName() + "." + objectName + "ServiceImpl");
        TopLevelClass topLevelClass = new TopLevelClass(currentServiceImpl);
        topLevelClass.setVisibility(JavaVisibility.PUBLIC);
        FullyQualifiedJavaType superServiceImpl = new FullyQualifiedJavaType(properties.getProperty("superServiceImpl"));
        superServiceImpl.addTypeArgument(objectFqjt);
        topLevelClass.setSuperClass(superServiceImpl);
        topLevelClass.addImportedType(new FullyQualifiedJavaType(properties.getProperty("superServiceImpl")));

        serviceInterface = new FullyQualifiedJavaType(serviceInterfaceString);
        topLevelClass.addImportedType(serviceInterface);
        topLevelClass.addSuperInterface(serviceInterface);
        this.superServiceImpl.addTypeArgument(objectFqjt);
        topLevelClass.addAnnotation("@Service");//(\"".concat(currentServiceImpl.getShortNameWithoutTypeArguments()).concat("\")")
        topLevelClass.addImportedType(new FullyQualifiedJavaType("org.springframework.stereotype.Service"));
        topLevelClass.addImportedType(objectFqjt);
        javaFile = new GeneratedJavaFile(topLevelClass, context.getJavaModelGeneratorConfiguration()
                .getTargetProject(),
                context.getProperty(PropertyRegistry.CONTEXT_JAVA_FILE_ENCODING),
                context.getJavaFormatter());
        files.add(javaFile);


        //controller
        String controllerString = controller.getFullyQualifiedName() + "." +objectName + "Controller";
        FullyQualifiedJavaType controllerClass = new FullyQualifiedJavaType(controllerString);
        TopLevelClass topContrllerLevelClass = new TopLevelClass(controllerClass);
        topContrllerLevelClass.setVisibility(JavaVisibility.PUBLIC);
        topContrllerLevelClass.addImportedType(objectFqjt);
        topContrllerLevelClass.addAnnotation("@Api(\"".concat(objectName + "Controller").concat("\")"));
        topContrllerLevelClass.addImportedType(new FullyQualifiedJavaType("io.swagger.annotations.Api"));
        topContrllerLevelClass.addAnnotation("@RestController");
        topContrllerLevelClass.addImportedType(new FullyQualifiedJavaType("org.springframework.web.bind.annotation.RestController"));
        topContrllerLevelClass.addAnnotation("@RequestMapping(\"/"+objectName.substring(0,1).toLowerCase()+objectName.substring(1)+"/*\")");
        topContrllerLevelClass.addImportedType(new FullyQualifiedJavaType("org.springframework.web.bind.annotation.RequestMapping"));
        String serviceShortName = serviceInterface.getShortName();
        String serviceInterfaceAlias = serviceShortName.substring(1, 2).toLowerCase() + serviceShortName.substring(2);
        Field serviceField = new Field(serviceInterfaceAlias, serviceInterface);
        serviceField.addAnnotation("@Autowired");
        serviceField.setVisibility(JavaVisibility.PRIVATE);
        topContrllerLevelClass.addField(serviceField);
        topContrllerLevelClass.addImportedType(new FullyQualifiedJavaType("org.springframework.beans.factory.annotation.Autowired"));
        topContrllerLevelClass.addImportedType(serviceInterface);
        String paramShortName = objectFqjt.getShortName();
        String paramName = paramShortName.substring(0,1).toLowerCase().concat(paramShortName.substring(1));
        // get Method
        Method get = new Method("get"+paramShortName);
        get.setVisibility(JavaVisibility.PUBLIC);
        get.addParameter(new Parameter(objectFqjt,paramName));
        get.setReturnType(objectFqjt);
        get.addBodyLine("return this.".concat(serviceInterfaceAlias).concat(".get(").concat(paramName).concat(");"));
        get.addAnnotation("@RequestMapping(\"get\")");
        get.addAnnotation("@ApiOperation(value = \"get\", httpMethod = \"POST\")");
        topContrllerLevelClass.addMethod(get);
        // save Method
        Method save = new Method("save"+paramShortName);
        save.setVisibility(JavaVisibility.PUBLIC);
        save.addParameter(new Parameter(objectFqjt,paramName));
        save.setReturnType(objectFqjt);
        save.addBodyLine("this.".concat(serviceInterfaceAlias).concat(".save(").concat(paramName).concat(");"));
        save.addBodyLine("return ".concat(paramName).concat(";"));
        save.addAnnotation("@RequestMapping(\"save\")");
        save.addAnnotation("@ApiOperation(value = \"save\", httpMethod = \"POST\")");
        topContrllerLevelClass.addMethod(save);
        // delete Method
        Method delete = new Method("delete"+paramShortName);
        delete.setVisibility(JavaVisibility.PUBLIC);
        delete.addParameter(new Parameter(objectFqjt,paramName));
        delete.setReturnType(FullyQualifiedJavaType.getIntInstance());
        delete.addBodyLine("return this.".concat(serviceInterfaceAlias).concat(".delete(").concat(paramName).concat(");"));
        delete.addAnnotation("@RequestMapping(\"delete\")");
        delete.addAnnotation("@ApiOperation(value = \"delete\", httpMethod = \"POST\")");
        topContrllerLevelClass.addMethod(delete);
        // update Method
        Method update = new Method("update"+paramShortName);
        update.setVisibility(JavaVisibility.PUBLIC);
        update.addParameter(new Parameter(objectFqjt,paramName));
        update.setReturnType(FullyQualifiedJavaType.getIntInstance());
        update.addBodyLine("return this.".concat(serviceInterfaceAlias).concat(".update(").concat(paramName).concat(");"));
        update.addAnnotation("@RequestMapping(\"update\")");
        update.addAnnotation("@ApiOperation(value = \"update\", httpMethod = \"POST\")");
        topContrllerLevelClass.addMethod(update);
        // list Method
        Method list = new Method("list"+paramShortName);
        list.setVisibility(JavaVisibility.PUBLIC);
        list.addParameter(new Parameter(objectFqjt,paramName));
        FullyQualifiedJavaType listReturn = FullyQualifiedJavaType.getNewListInstance();
        listReturn.addTypeArgument(objectFqjt);
        list.setReturnType(listReturn);
        list.addBodyLine("return this.".concat(serviceInterfaceAlias).concat(".list(").concat(paramName).concat(");"));
        list.addAnnotation("@RequestMapping(\"list\")");
        list.addAnnotation("@ApiOperation(value = \"list\", httpMethod = \"POST\")");

        topContrllerLevelClass.addImportedType(FullyQualifiedJavaType.getNewListInstance());
        topContrllerLevelClass.addMethod(list);
        topContrllerLevelClass.addImportedType(new FullyQualifiedJavaType("org.springframework.web.bind.annotation.RequestMapping"));
        topContrllerLevelClass.addImportedType(new FullyQualifiedJavaType("io.swagger.annotations.ApiOperation"));
        javaFile = new GeneratedJavaFile(topContrllerLevelClass, context.getJavaModelGeneratorConfiguration()
                .getTargetProject(),
                context.getProperty(PropertyRegistry.CONTEXT_JAVA_FILE_ENCODING),
                context.getJavaFormatter());
        files.add(javaFile);
    }
}
