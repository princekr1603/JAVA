 //class is a blueprint 
// class is keyword
// classs is a logical entity
// class is a class in java

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {
    public static void main(String[] args) {
        try {
            //step1. load and register and the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            //connection-java.sql(package)
            //step2. create the connection
            Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
            //username-root

            //step3.  create a statement
            Statement s =c.createStatement();

            //step4. execute the statement
            s.execute("insert into student values (102,'prince',2026,'9.4')");
            //s.execute("delete from student where id=102");
            //s.execute("update student set name="ram" where id=102");

            // int num=s.executeUpdate("insert into student values (102,'prince',2026,'9.4')");(only for DML query)

            //step5. process the resultant data
            System.out.println(s.getUpdateCount());

            //step6. close all costly resources
            //costly resources means how more store ram etc (not money)
            s.close();
            c.close();
        } catch (ClassNotFoundException | SQLException e) {
            
            e.printStackTrace();
        }
    }
}
