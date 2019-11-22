package ch16;

import java.sql.*;
//��������

public class C16_3 {
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
        int[] id= {2, 3, 4};
        String[] name= {"taobao","runoob","weibo"};
        
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
        
            // �޸����ݿ������ݱ������
            System.out.println(" �޸����ݿ������ݱ������");
            String sql="UPDATE `JavaJDBCConnectiontoMySQL` set name=? where id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            int i=0;
            do {
            	ps.setString(1, name[i]);
            	ps.setInt(2, id[i]);
            	ps.executeUpdate();				//ִ��sql�޸�����
            	++i;
            } while(i<id.length);
            ps.close();
            //��ѯ���ݿⲢ�����ݱ�������������Ļ��
            Statement s=conn.createStatement();
            sql="select * from JavaJDBCConnectiontoMySQL";
            ResultSet rs=s.executeQuery(sql);
            while(rs.next()) {
            	System.out.println("\t"+rs.getInt("id")+
            						"\t"+rs.getString("name")+
            						"\t"+rs.getString("url")+
            						"\t"+rs.getString("alexa")+
            						"\t"+rs.getString("country"));
            }
            s.close();
            conn.close();
    	}
        catch(SQLException e){
        	System.out.println("SQLException: "+e.getMessage());
        }
    }
}
