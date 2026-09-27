import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws IOException,SQLException, ClassNotFoundException{
    databaseconection obj=databaseconection.getdatabaseconnection();
    System.out.println(obj);
    }
}


