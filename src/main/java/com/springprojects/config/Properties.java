package com.springprojects.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContext;

@Component
@PropertySource(value = "classpath:application.properties")
public class Properties {

    public static final String DB_DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
    public static final String DB_URL = "jdbc:mysql://localhost:3306/qa_board?createDatabaseIfNotExist=true&serverTimezone=UTC&useSSL=false";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "";

    public static final String HIBERNATE_DIALECT = "org.hibernate.dialect.MySQL5Dialect";
    public static final String HIBERNATE_SHOW_SQL = "true";
    public static final String HBM2DDL_AUTO = "update";
    public static final String ENTITY_MANAGER_PACKAGES_TO_SCAN = "com.springprojects.entity";

    public static final String SMTP_HOST = "smtp.gmail.com";
    public static final String SMTP_PORT = "465";
    public static final String SMTP_CLASS = "javax.net.ssl.SSLSocketFactory";
    public static final String SMTP_AUTH = "true";

    public static String TEMP_PATH = System.getProperty("user.home") + "/qa_board/files/";
}
