import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class jdbcScanner {
   
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter id: ");
        int id=sc.nextInt();
        System.out.print("enter name: ");
        String name=sc.next();
        System.out.print("enter yop: ");
        int yop=sc.nextInt();
        System.out.print("enter id: ");
        String cgpa=sc.next();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
            //get and set method present in driver class

            PreparedStatement ps=c.prepareStatement("insert into student values(?,?,?,?)");
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, yop);
            ps.setString(4, cgpa);

            int num=ps.executeUpdate();
            System.out.println(num);

            ps.close();
            c.close();
            sc.close();
        } 
        catch (ClassNotFoundException | SQLException e) {  
            e.printStackTrace();
        }
    }
}
