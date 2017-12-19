package com.jason.learning.datasource.mapper.provider;

import org.apache.ibatis.jdbc.SQL;

/**
 * ${DESCRIPTION}
 *
 * @author jason.guan
 * @create 2017-12-18 下午1:40
 **/
public class UserProvider {
//    /**
//     * 查询语句.
//     * @param user
//     * @return
//     */
//    public String querySelected(User user){
//        StringBuffer sql = new StringBuffer("select *from t_user where 1=1 ");
//        if(user.getUserName() != null){
//            sql.append(" and user_Name=#{userName}");
//        }
//        if(user.getPassword() != null){
//            sql.append(" and password=#{password}");
//        }
//        return sql.toString();
//    }
//
//
//    public String querySelected2(final User user){
//        return new SQL(){{
//            SELECT("*");
//            FROM("t_user");
//            if(user.getUserName() != null){
//                WHERE("user_Name=#{userName}");
//            }
//            if(user.getPassword() != null){
//                WHERE("password=#{password}");
//            }
//            //从这个toString可以看出，其内部使用高效的StringBuilder实现SQL拼接
//        }}.toString();
//    }
}
