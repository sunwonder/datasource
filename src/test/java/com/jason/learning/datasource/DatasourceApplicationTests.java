package com.jason.learning.datasource;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DatasourceApplicationTests {

    @Test
    public void contextLoads() {
    }

//    @SuppressWarnings("all")
//    @Autowired
//    AdminMapper adminMapper;

//    @Autowired
//    UserMapper userMapper;
//    @Autowired
//    IUserService userService;

    @Test
    public void test_db() {
        //开始进行测试
//        List<Admin> list = adminMapper.selectAll();
//        System.out.println(JSON.toJSONString(list));
//        User user = new User();
//        user.setUserName("jason");
////        user.setPassword("admin2");
//        User list2 = userService.get(user);
//        System.out.println(JSON.toJSONString(list2));

//        List<User> list2 = userMapper.querySelected(user);
//        System.out.println(JSON.toJSONString(list2));

        //	assertThat(userMapper.list().size()).isGreaterThan(1);
        //	assertThat(userMapper.getOne(1)).isNotEqualTo(null);

    }


    /**
     * 1.用于获取结果集的映射关系
     */
//    @Test
//    public void getResultsStr() {
//        Class origin = User.class;
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("@Results({\n");
//        for (Field field : origin.getDeclaredFields()) {
//            String property = field.getName();
//            //映射关系：对象属性(驼峰)->数据库字段(下划线)
//            String column = new PropertyNamingStrategy.SnakeCaseStrategy().translate(field.getName()).toUpperCase();
//            stringBuilder.append(String.format("@Result(property = \"%s\", column = \"%s\"),\n", property, column));
//        }
//        stringBuilder.append("})");
//        System.out.println(stringBuilder.toString());
//    }


}
