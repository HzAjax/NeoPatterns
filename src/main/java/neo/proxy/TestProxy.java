package neo.proxy;

public class TestProxy {
    public static void main(String[] args) {
        Database db = new DatabaseProxy("mydb");
        db.connect();
    }
}
