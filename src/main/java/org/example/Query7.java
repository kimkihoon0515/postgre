package org.example;
import java.sql.*;
import java.util.*;

public class Query7 {
    public void query7Method()
    {
        Connection conn=null;
        Statement st=null;
        ResultSet rs = null;


        String url = "jdbc:postgresql://127.0.0.1:5432/homework";
        String user = "postgres";
        String password = "kw1996";

        try {
            conn = DriverManager.getConnection(url, user, password);
            st = conn.createStatement();
            rs = st.executeQuery("select sName, GPA\n" +
                    "from Student join Apply\n" +
                    "on Student.sID = Apply.sID\n" +
                    "where sizeHS < 1000 and major = 'CS' and cName = 'Stanford'");

            while (rs.next()) {
                System.out.print(rs.getString(1));
                System.out.print(" ");
                System.out.print(rs.getString(2));
                System.out.println(" ");
            }
        } catch (SQLException sqlEX) {
            System.out.println(sqlEX);
        } finally {
            try {
                rs.close();
                st.close();
                conn.close();
            } catch (SQLException sqlEX) {
                System.out.println(sqlEX);
            }
        }
    }
}
