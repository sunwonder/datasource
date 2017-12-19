package com.jason.learning.datasource.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 数据库连接相关的参数
 * @author jason.guan
 * @create 2017-12-18 上午11:26
 **/
@Component
@ConfigurationProperties(prefix = "spring.datasource")
public class DBProperties {
    private int initialSize;
    private int minIdle;
    private int maxActive;
    private Dbone dbone;
    private Dbtwo dbtwo;


    public int getInitialSize() {
        return initialSize;
    }

    public void setInitialSize(int initialSize) {
        this.initialSize = initialSize;
    }

    public int getMinIdle() {
        return minIdle;
    }

    public void setMinIdle(int minIdle) {
        this.minIdle = minIdle;
    }

    public int getMaxActive() {
        return maxActive;
    }

    public void setMaxActive(int maxActive) {
        this.maxActive = maxActive;
    }

    public Dbone getDbone() {
        return dbone;
    }

    public void setDbone(Dbone dbone) {
        this.dbone = dbone;
    }

    public Dbtwo getDbtwo() {
        return dbtwo;
    }

    public void setDbtwo(Dbtwo dbtwo) {
        this.dbtwo = dbtwo;
    }

    public static class Dbone {
        private String driverClassName;
        private String jdbcUrl ;
        private String userName ;
        private String password ;

        public String getDriverClassName() {
            return driverClassName;
        }

        public void setDriverClassName(String driverClassName) {
            this.driverClassName = driverClassName;
        }

        public String getJdbcUrl() {
            return jdbcUrl;
        }

        public void setJdbcUrl(String jdbcUrl) {
            this.jdbcUrl = jdbcUrl;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }


    public static class Dbtwo {
        private String driverClassName;
        private String jdbcUrl ;
        private String userName ;
        private String password ;

        public String getDriverClassName() {
            return driverClassName;
        }

        public void setDriverClassName(String driverClassName) {
            this.driverClassName = driverClassName;
        }

        public String getJdbcUrl() {
            return jdbcUrl;
        }

        public void setJdbcUrl(String jdbcUrl) {
            this.jdbcUrl = jdbcUrl;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
}
