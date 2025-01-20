import java.sql.Connection;

public interface databaseconnection {

    public Connection connect();
    public void disconnect();
    public void query();
}
