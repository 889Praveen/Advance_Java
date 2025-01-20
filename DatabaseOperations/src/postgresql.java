import java.sql.*;


public class postgresql implements databaseconnection {
      Connection con;

  public Connection connect() {
    try {

      Class.forName("org.postgresql.Driver");
      
      con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/sms", "postgres", "root");
  
    } catch (Exception e) {
      System.out.println(e);
    }
  return con;
  }
   public void query()
   {


    try
    {
      Statement smt = con.createStatement();
      ResultSet rs = smt.executeQuery("select*from student");
      while (rs.next()) {
        int id = rs.getInt("sid");
        String name = rs.getString("sname");
        System.out.println("student id:" + id);
        System.out.println("student name:" + name);

      }
    } catch (Exception e) {
      System.out.println(e);
    }
   }
  public void disconnect() {
    try {
   
         con.close();
         System.out.println("connection is closed.......!");
         con=null;
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
