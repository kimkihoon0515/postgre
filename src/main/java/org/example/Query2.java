package org.example;
import java.sql.*;

public class Query2 {
    public void query2Method()
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
            rs = st.executeQuery("SELECT * from Student");

            while (rs.next()) {
                System.out.print(rs.getString(1));
                System.out.print(" ");
                System.out.print(rs.getString(2));
                System.out.print(" ");
                System.out.print(rs.getString(3));
                System.out.print(" ");
                System.out.print(rs.getString(4));
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
