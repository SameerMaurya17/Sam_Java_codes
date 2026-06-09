package com.learning_java24.N15_JDBC.PostgreSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Prepared_Statement {
    public static void main(String[] args) throws Exception {

   /*

            Import package
            Load and register Driver
            Create connection
            Create statement
            Execute statement
            Process the results
            Close

*/

        int sid = 143;
        String sname = "Jasmine";
        int marks = 69;

        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "HopeWasALie";

//        String sql = "insert into student values ("+sid+",'"+sname+"',"+marks+")"; // Can still use this method but, it kinda is pain in the ass to type this all the time
        String sql = "insert into student values (?,?,?)"; // we can use the prepareStatement


        Connection con = DriverManager.getConnection(url, uname, pass);
//        Statement st = con.createStatement();
        PreparedStatement st = con.prepareStatement(sql); // for PrepareStatement you also need to pass the query for creating the object of the PrepareStatement

        st.setInt(1, sid);
        st.setString(2, sname);
        st.setInt(3, marks);

//        st.execute(sql);
        st.execute();


        con.close();


    }
}
