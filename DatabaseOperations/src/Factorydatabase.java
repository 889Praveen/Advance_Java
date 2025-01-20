class Factorydatabase {
   
    public static databaseconnection getdatabasetype(String dbtype)
    {
        databaseconnection objDatabaseconnection=null;
      switch (dbtype)
       {
        case "mysql":objDatabaseconnection=new mysql();
        break;  
        case "sqlite":objDatabaseconnection=new sqlite();
        break;         
        case "postgresql":objDatabaseconnection=new postgresql();
        break;
        default:
        System.out.println("Database NotFound...! ");
            break;
       }
      return objDatabaseconnection;

    }
}
