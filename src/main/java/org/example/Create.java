package org.example;
import java.sql.*;

public class Create {
    public void createMethod()
    {
        Connection conn=null;
        Statement st=null;



        String url = "jdbc:postgresql://127.0.0.1:5432/homework";
        String user = "postgres";
        String password = "kw1996";
        String sql = "create table College(cName varchar(20), state varchar(20), enrollment int,primary key(cName));\n" +
                "\n" +
                "create table Student(sID int, sName varchar(20), GPA numeric(2,1), sizeHS int, primary key(sID));\n" +
                "create table Apply(sID int, cName varchar(20), major varchar(20), decision char, primary key(sID,cName,major));";

        try {
            conn = DriverManager.getConnection(url, user, password);
            st = conn.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException sqlEX) {
            System.out.println(sqlEX);
        } finally {
            try {

                st.close();
                conn.close();
            } catch (SQLException sqlEX) {
                System.out.println(sqlEX);
            }
        }
    }
}
