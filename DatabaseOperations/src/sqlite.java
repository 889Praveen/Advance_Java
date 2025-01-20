import java.sql.*;

public class sqlite implements databaseconnection {
    Connection con = null;

    public Connection connect() {
        // String q="select * from student";
        try {

            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:sqlite:sqlitedb.db");
            
        } 
        catch (Exception e)
         {
            e.printStackTrace();
        }
    return con;
    }
    public void query()
    {
      try
      {
        Statement smt = con.createStatement();
        // String createTableSQL = "CREATE TABLE student (id INTEGER , name TEXT)";
        // smt.execute(createTableSQL);
        // System.out.println("create table sucessfully...");
        // smt.executeUpdate("insert into student values(1,'manish')");
        // System.out.println("insert sucessfully...");
        // smt.execute(q);
        ResultSet rs = smt.executeQuery("select * from student");
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            System.out.println("student id:" + id);
            System.out.println("student name:" + name);

        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
    
    public void disconnect() {
        try {
            if (con != null) {
                con.close();
                System.out.println("connection is closed.......!");
                con=null;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
