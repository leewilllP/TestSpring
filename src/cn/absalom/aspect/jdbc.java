package cn.absalom.aspect;

import java.sql.*;

public class jdbc {
    public static void main(String[] args) {
    }
    public static void jdbca(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try(Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/tmall_ssm?useUnicode=true&characterEncoding=utf8",
                "root","admin");
            Statement s = c.createStatement();
        ){
            String sql = "select * FROM product";
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()){
                String name = rs.getString("name");
                System.out.println(name);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
