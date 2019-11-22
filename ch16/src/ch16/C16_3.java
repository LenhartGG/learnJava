package ch16;

import java.sql.*;
//更新数据

public class C16_3 {
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
        int[] id= {2, 3, 4};
        String[] name= {"taobao","runoob","weibo"};
        
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
        
            // 修改数据库中数据表的内容
            System.out.println(" 修改数据库中数据表的内容");
            String sql="UPDATE `JavaJDBCConnectiontoMySQL` set name=? where id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            int i=0;
            do {
            	ps.setString(1, name[i]);
            	ps.setInt(2, id[i]);
            	ps.executeUpdate();				//执行sql修改命令
            	++i;
            } while(i<id.length);
            ps.close();
            //查询数据库并把数据表的内容输出到屏幕上
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
