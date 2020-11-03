package org.example;
import java.sql.*;

public class Insert {
    public void insertMethod()
    {
        Connection conn = null;
        Statement st = null;


        String url = "jdbc:postgresql://127.0.0.1:5432/homework";
        String user = "postgres";
        String password = "kw1996";
        String sql="insert into College values ('Stanford', 'CA', 15000);\n" +
                "insert into College values ('Berkeley','CA',36000);\n" +
                "insert into College values ('MIT','MA',10000);\n" +
                "insert into College values ('Cornell','NY',21000);\n" +
                "\n" +
                "insert into Student values (123,'Amy',3.9,1000);\n" +
                "insert into Student values (234,'Bob',3.6,1500);\n" +
                "insert into Student values (345,'Craig',3.5,500);\n" +
                "insert into Student values (456,'Doris',3.9,1000);\n" +
                "insert into Student values (567,'Edward',2.9,2000);\n" +
                "insert into Student values (678,'Fay',3.8,200);\n" +
                "insert into Student values (789,'Gary',3.4,800);\n" +
                "insert into Student values (987,'Helen',3.7,800);\n" +
                "insert into Student values (876,'Irene',3.9,400);\n" +
                "insert into Student values (765,'Jay',2.9,1500);\n" +
                "insert into Student values (654,'Amy',3.9,1000);\n" +
                "insert into Student values (543,'Craig',3.4,2000);\n" +
                "\n" +
                "insert into Apply values (123,'Stanford','CS','Y');\n" +
                "insert into Apply values (123,'Stanford','EE','N');\n" +
                "insert into Apply values (123,'Berkeley','CS','Y');\n" +
                "insert into Apply values (123,'Cornell','EE','Y');\n" +
                "insert into Apply values (234,'Berkeley','biology','N');\n" +
                "insert into Apply values (345,'MIT','bioengineering','Y');\n" +
                "insert into Apply values (345,'Cornell','bioengineering','N');\n" +
                "insert into Apply values (345,'Cornell','CS','Y');\n" +
                "insert into Apply values (345,'Cornell','EE','N');\n" +
                "insert into Apply values (678,'Stanford','history','Y');\n" +
                "insert into Apply values (987,'Stanford','CS','Y');\n" +
                "insert into Apply values (987,'Berkeley','CS','Y');\n" +
                "insert into Apply values (876,'Stanford','CS','N');\n" +
                "insert into Apply values (876,'MIT','biology','Y');\n" +
                "insert into Apply values (876,'MIT','marine biology','N');\n" +
                "insert into Apply values (765,'Stanford','history','Y');\n" +
                "insert into Apply values (765,'Cornell','history','N');\n" +
                "insert into Apply values (765,'Cornell','psychology','Y');\n" +
                "insert into Apply values (543,'MIT','CS','N');";

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
