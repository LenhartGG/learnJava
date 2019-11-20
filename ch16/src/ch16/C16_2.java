package ch16;

import java.sql.*;
//向数据表中插入数据

public class C16_2 {
    // MySQL 8.0 以下版本 - JDBC 驱动名及数据库 URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://135.252.218.128:3306/liuhuan_test";
 
    // MySQL 8.0 以上版本 - JDBC 驱动名及数据库 URL
    //static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    //static final String DB_URL = "jdbc:mysql://localhost:3306/RUNOOB?useSSL=false&serverTimezone=UTC";
 
 
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
            sql2 = "INSERT INTO `JavaJDBCConnectiontoMySQL` VALUES ('1', 'Google', 'https://www.google.cm/', '1', 'USA'), ('2', '淘宝', 'https://www.taobao.com/', '13', 'CN'), ('3', '菜鸟教程', 'http://www.runoob.com', '5892', ''), ('4', '微博', 'http://weibo.com/', '20', 'CN'), ('5', 'Facebook', 'https://www.facebook.com/', '3', 'USA');";
            stmt.executeUpdate(sql2);  //执行SQL命令
            stmt.close();
            conn.close();
    	}
        catch(SQLException e){
        	System.out.println("SQLException: "+e.getMessage());
        }
    }
}
