package ch16;

import java.sql.*;
//�����ݱ��в�������

public class C16_2 {
    // MySQL 8.0 ���°汾 - JDBC �����������ݿ� URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://135.252.218.128:3306/liuhuan_test";
 
    // MySQL 8.0 ���ϰ汾 - JDBC �����������ݿ� URL
    //static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    //static final String DB_URL = "jdbc:mysql://localhost:3306/RUNOOB?useSSL=false&serverTimezone=UTC";
 
 
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
            sql2 = "INSERT INTO `JavaJDBCConnectiontoMySQL` VALUES ('1', 'Google', 'https://www.google.cm/', '1', 'USA'), ('2', '�Ա�', 'https://www.taobao.com/', '13', 'CN'), ('3', '����̳�', 'http://www.runoob.com', '5892', ''), ('4', '΢��', 'http://weibo.com/', '20', 'CN'), ('5', 'Facebook', 'https://www.facebook.com/', '3', 'USA');";
            stmt.executeUpdate(sql2);  //ִ��SQL����
            stmt.close();
            conn.close();
    	}
        catch(SQLException e){
        	System.out.println("SQLException: "+e.getMessage());
        }
    }
}
