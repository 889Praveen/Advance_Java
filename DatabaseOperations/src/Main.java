import java.sql.Connection;
import java.util.Scanner;
public class Main {
  
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        
        while (true) {
            System.out.println("Enter Database Name:");
            String daString=sc.next();
            databaseconnection data=Factorydatabase.getdatabasetype(daString);
            Connection con=data.connect();
            if(con !=null)
            {
                System.out.println("Connected to "+daString+" Database Successfully....");
            }
            else{
                System.out.println("Connection Not Found...");
            }
            data.query();
            data.disconnect();
    }
}
}