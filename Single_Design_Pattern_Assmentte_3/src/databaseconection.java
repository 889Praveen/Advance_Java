

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class databaseconection 
{
   static Connection conn=null;
private databaseconection()
{
   
    
}

public static databaseconection getdatabaseconnection() throws IOException,SQLException, ClassNotFoundException
{
    try
    {
      if(conn == null )
      {
        synchronized(databaseconection.class){
          if(conn == null)
          {
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc2025", "root","");
          }
      }
   }
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
    return new databaseconection();
}
  
}

