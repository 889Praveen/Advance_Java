import java.sql.*;

class mysql implements databaseconnection {
  // String ab="SELECT * FROM student";
  Connection con=null;
   
  public Connection connect() 
  {
    try {

          Class.forName("com.mysql.jdbc.Driver");

         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc2025", "root", "");
      
         if (con != null) 
         {
           System.out.println("Connected to MySQL Database Successfully....");
         }

     
        } catch (Exception e)
         {
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
}catch(Exception e)
{
  System.out.println(e);
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
