# datasource
mybatis生成器，完全注解配置，去除xml

Mybatis Generator 自定义Generator Plugin

一，实现的功能：

1. 支持多数据源
2. 生成表对应的Entity实体类，表字段映射到实体类符合驼峰命名
3. 生成表对应的Mapper类，Mapper类上有数据源标识
4. 生成表对应的Service类，包含基础增删改查
5. 生成表对应的Controller类，包含增删改查操作
6. 集成Swagger2
7. 集成Druid监控
8. 集成通用Mapper

二， 使用方法
1. 执行test_tables.sql，生成多个库
2. 配置generator_config.properties
3. 配置generatorConfig.xml，指定需要生成的表
4. 执行生成器Main入口
com.jason.learning.datasource.generator.GeneratorMainEntry
