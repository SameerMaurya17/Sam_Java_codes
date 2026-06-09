package com.learning_java24.N15_JDBC.PostgreSQL;

//import java.sql.*; // Import package
import java.sql.*;

public class DemoJDBC {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

    /*

            Import package
            Load and register Driver
            Create connection
            Create statement
            Execute statement
            Process the results
            Close

*/

        String url = "jdbc:postgresql://localhost:5432/demo";
        String uName = "postgres";
        String pass = "HopeWasALie";
//        String sql = "select * from student"; // This might not give the proper order
        String sql = "select * from student order by sid"; // use order by clause for the proper order
//        String sql = "insert into student values (4,'Daksh',70)";
//        String sql = "update student set sname = 'Sam' where sid = 1";
//        String sql = "insert into student values (5,'nigger',69)";
//        String sql = "delete from student where sid = 5";

        // Load and Register Driver
        Class.forName("org.postgresql.Driver"); // It throws ClassNotFoundException Exception
        // Modern JDBC drivers use Service Provider Mechanism (SPI), so this line is optional if the driver JAR is on the classpath.


        // Create connection
        Connection con = DriverManager.getConnection(url,uName,pass); // it throws SQLException
        System.out.println("Connection established");


        // Create statement
        Statement st = con.createStatement(); // throws SQLException
        // The object used for executing a static SQL statement and returning the results it produces.

        // Execute statement
//        st.executeQuery(); // use this when we want to fetch some data (It gives data in form of ResultSet Interface)
//        st.execute(); // use this when you want to execute a query like to make some changes , add values into a database (basically not get any data in return)

        ResultSet rs = st.executeQuery(sql);

//        rs.next(); // it gives a boolean value which is determined on based on a pointer which is present in own table, and does that pointer pointing to that row has a next row or not
        // ByDefault it pointers before the first Value inside Database

//        System.out.println(rs.next()); // just to check if we have some data or not

//        rs.next(); // we need to use next() method in order to get our pointer to start pointing at the first row of table
////        String name = rs.getString(2);  // Can use Column Index but it may be confusing and may lead to bugs
//        String name = rs.getString("sname"); // Can use Column Label/name less confusing
//        System.out.println(name);


//        // Can print the whole table using this
        while(rs.next()){
            System.out.print(rs.getInt(1) + " | ");
            System.out.print(rs.getString(2) + " | ");
            System.out.println(rs.getInt(3));
        }


        // CRUD Operations (Create , Read , Update , Delete)

//        boolean status = st.execute(sql); // throws SQLException
//
//        System.out.println(status);

        // Close
        con.close();
        System.out.println("Connection Closed");
    }

}
