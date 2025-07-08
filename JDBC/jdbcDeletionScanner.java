import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class jdbcDeletionScanner {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println(("enter id: "));
        int id=sc.nextInt();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
            PreparedStatement ps=c.prepareStatement("delete from student where id=?");
            ps.setInt(1, id);
            int num=ps.executeUpdate();
            System.out.println(num);

            ps.close();
            c.close();
            sc.close();
        } catch (ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }
    }
}
