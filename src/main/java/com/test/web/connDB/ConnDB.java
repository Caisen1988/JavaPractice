package com.test.web.connDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnDB {
    private Connection conn = null;

    private void createConn()
    {
        String driver = "com.mysql.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/test?serverTimezone=GMT%2B8&useSSL=false";
        String userName = "root";
        String passWord = "root";
        if (conn == null)
        {
            try {
                Class.forName(driver);
                conn = DriverManager.getConnection(url,userName,passWord);

                System.out.println("数据库连接成功！");
            }
            catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            catch (SQLException e) {
                System.out.println("数据库连接失败！");
                e.printStackTrace();
            }
        }
    }

    public Connection getConn() {
        if( conn == null) {
            createConn();
        }
        return conn;
    }

    /*** 提交事务 ***/
    public void commitConn()
    {
        try {
            conn.commit();
        } catch (SQLException e){

            System.out.println(e.getSQLState());
        }
    }

    /*** 回滚事务 ***/
    public void rollbackConn()
    {
        try {
            conn.rollback();
        } catch (SQLException e){
            System.out.println("提交异常！");
        }
    }

    /*** 关闭连接 ***/
    public void closeConn()
    {
        try {
            conn.close();
            conn = null;
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
