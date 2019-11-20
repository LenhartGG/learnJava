package ch16;

import java.sql.*;
//创建数据表
//在liuhuan_test数据库中创建 JavaJDBCConnectiontoMySQL 表

//CREATE TABLE `JavaJDBCConnectiontoMySQL` (
//		  `id` int(11) NOT NULL AUTO_INCREMENT,
//		  `name` char(20) NOT NULL DEFAULT '' COMMENT '站点名称',
//		  `url` varchar(255) NOT NULL DEFAULT '',
//		  `alexa` int(11) NOT NULL DEFAULT '0' COMMENT 'Alexa 排名',
//		  `country` char(10) NOT NULL DEFAULT '' COMMENT '国家',
//		  PRIMARY KEY (`id`)
//		) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

//INSERT INTO `JavaJDBCConnectiontoMySQL` VALUES ('1', 'Google', 'https://www.google.cm/', '1', 'USA'), ('2', '淘宝', 'https://www.taobao.com/', '13', 'CN'), ('3', '菜鸟教程', 'http://www.runoob.com', '5892', ''), ('4', '微博', 'http://weibo.com/', '20', 'CN'), ('5', 'Facebook', 'https://www.facebook.com/', '3', 'USA');

public class C16_1 {
    // MySQL 8.0 以下版本 - JDBC 驱动名及数据库 URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://135.252.218.128:3306/liuhuan_test";
 
    // MySQL 8.0 以上版本 - JDBC 驱动名及数据库 URL
    //static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    //static final String DB_URL = "jdbc:mysql://135.252.218.128:3306/liuhuan_test?useSSL=false&serverTimezone=UTC";
 
 
    // 数据库的用户名与密码，需要根据自己的设置
    static final String USER = "root";
    static final String PASS = "aceshanghai";
 
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        	try {
                Class.forName(JDBC_DRIVER);			//加载 JDBC 驱动程序
        	}
            catch(ClassNotFoundException e){
            	System.out.println("ForName: "+e.getMessage());
            }
        	try {
                
                // 建立与数据库的连接
                System.out.println("连接数据库...");
                conn = DriverManager.getConnection(DB_URL,USER,PASS);
            
                // 创建Statement对象
                System.out.println(" 实例化Statement对象...");
                stmt = conn.createStatement();
                String sql1, sql2, sql3;
                sql1 = "CREATE TABLE `JavaJDBCConnectiontoMySQL` ("+
    			  		  "`id` int(11) NOT NULL AUTO_INCREMENT,"+
    			  		  "`name` char(50) NOT NULL DEFAULT '' COMMENT '站点名称',"+
    			  		  "`url` char(55) NOT NULL DEFAULT '',"+
    			  		  "`alexa` char(51) NOT NULL DEFAULT '0' COMMENT 'Alexa 排名',"+
    			  		  "`country` char(50) NOT NULL DEFAULT '' COMMENT '国家',"+
    			  		  "PRIMARY KEY (`id`)" +
    			  		") ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;";
                sql2 = "INSERT INTO `JavaJDBCConnectiontoMySQL` VALUES ('1', 'Google', 'https://www.google.cm/', '1', 'USA'), ('2', '淘宝', 'https://www.taobao.com/', '13', 'CN'), ('3', '菜鸟教程', 'http://www.runoob.com', '5892', ''), ('4', '微博', 'http://weibo.com/', '20', 'CN'), ('5', 'Facebook', 'https://www.facebook.com/', '3', 'USA');";
                sql3 = "SELECT id, name, url FROM JavaJDBCConnectiontoMySQL";
                stmt.executeUpdate(sql1);  	//执行SQL命令
                stmt.close();				//释放Statement所连接的数据库及JDBC资源
                conn.close();				//关闭与数据库的连接	
        	}
            catch(SQLException e){
            	System.out.println("SQLException: "+e.getMessage());
            }
    }
}
