package com.neusoft.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author shihaobo
 * @date 2020/8/4 17:00
 */
public class JDBCDemo1 {
    public static void main(String[] args) throws Exception {
        //        1、导入驱动jar包 mysql-connector-java-5.1.37-bin.jar
//        2、注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        // mysql5后可以省略上面的注册步骤
//        3、获取数据库连接对象 Connection
        Connection coon = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java9", "root", "root");
        System.out.println(coon);
//        4、定义sql
        String sql = "update account set balance = 20000 where id = 2";
//        5、获取执行sql语句的对象 Statement
        Statement stmt = coon.createStatement();
//        6、执行sql，接受返回结果
        int count = stmt.executeUpdate(sql);// 返回受影响的行数
//        7、处理结果
        System.out.println(count);
//        8、释放资源
        stmt.close();
        coon.close();
    }
}
