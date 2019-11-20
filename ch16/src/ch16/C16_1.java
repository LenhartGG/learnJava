package ch16;

import java.sql.*;
//�������ݱ�
//��liuhuan_test���ݿ��д��� JavaJDBCConnectiontoMySQL ��

//CREATE TABLE `JavaJDBCConnectiontoMySQL` (
//		  `id` int(11) NOT NULL AUTO_INCREMENT,
//		  `name` char(20) NOT NULL DEFAULT '' COMMENT 'վ������',
//		  `url` varchar(255) NOT NULL DEFAULT '',
//		  `alexa` int(11) NOT NULL DEFAULT '0' COMMENT 'Alexa ����',
//		  `country` char(10) NOT NULL DEFAULT '' COMMENT '����',
//		  PRIMARY KEY (`id`)
//		) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

//INSERT INTO `JavaJDBCConnectiontoMySQL` VALUES ('1', 'Google', 'https://www.google.cm/', '1', 'USA'), ('2', '�Ա�', 'https://www.taobao.com/', '13', 'CN'), ('3', '����̳�', 'http://www.runoob.com', '5892', ''), ('4', '΢��', 'http://weibo.com/', '20', 'CN'), ('5', 'Facebook', 'https://www.facebook.com/', '3', 'USA');

public class C16_1 {
    // MySQL 8.0 ���°汾 - JDBC �����������ݿ� URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://135.252.218.128:3306/liuhuan_test";
 
    // MySQL 8.0 ���ϰ汾 - JDBC �����������ݿ� URL
    //static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    //static final String DB_URL = "jdbc:mysql://135.252.218.128:3306/liuhuan_test?useSSL=false&serverTimezone=UTC";
 
 
    // ���ݿ���û��������룬��Ҫ�����Լ�������
    static final String USER = "root";
    static final String PASS = "aceshanghai";
 
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        	try {
                Class.forName(JDBC_DRIVER);			//���� JDBC ��������
        	}
            catch(ClassNotFoundException e){
            	System.out.println("ForName: "+e.getMessage());
            }
        	try {
                
                // ���������ݿ������
                System.out.println("�������ݿ�...");
                conn = DriverManager.getConnection(DB_URL,USER,PASS);
            
                // ����Statement����
                System.out.println(" ʵ����Statement����...");
                stmt = conn.createStatement();
                String sql1, sql2, sql3;
                sql1 = "CREATE TABLE `JavaJDBCConnectiontoMySQL` ("+
    			  		  "`id` int(11) NOT NULL AUTO_INCREMENT,"+
    			  		  "`name` char(50) NOT NULL DEFAULT '' COMMENT 'վ������',"+
    			  		  "`url` char(55) NOT NULL DEFAULT '',"+
    			  		  "`alexa` char(51) NOT NULL DEFAULT '0' COMMENT 'Alexa ����',"+
    			  		  "`country` char(50) NOT NULL DEFAULT '' COMMENT '����',"+
    			  		  "PRIMARY KEY (`id`)" +
    			  		") ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;";
                sql2 = "INSERT INTO `JavaJDBCConnectiontoMySQL` VALUES ('1', 'Google', 'https://www.google.cm/', '1', 'USA'), ('2', '�Ա�', 'https://www.taobao.com/', '13', 'CN'), ('3', '����̳�', 'http://www.runoob.com', '5892', ''), ('4', '΢��', 'http://weibo.com/', '20', 'CN'), ('5', 'Facebook', 'https://www.facebook.com/', '3', 'USA');";
                sql3 = "SELECT id, name, url FROM JavaJDBCConnectiontoMySQL";
                stmt.executeUpdate(sql1);  	//ִ��SQL����
                stmt.close();				//�ͷ�Statement�����ӵ����ݿ⼰JDBC��Դ
                conn.close();				//�ر������ݿ������	
        	}
            catch(SQLException e){
            	System.out.println("SQLException: "+e.getMessage());
            }
    }
}
