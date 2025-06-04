package neo.proxy;

public class DatabaseProxy implements Database {
    private RealDatabase realDatabase;
    private String dbName;

    public DatabaseProxy(String dbName) {
        this.dbName = dbName;
    }

    public void connect() {
        String fullUrl = "localhost:5432/" + dbName;
        if (realDatabase == null) {
            realDatabase = new RealDatabase(fullUrl);
        }
        realDatabase.connect();
    }
}
