package factory_method.factory_method_database.after;

import factory_method.factory_method_database.after.db.DB;
import factory_method.factory_method_database.after.factory.MySQLFactory;
import factory_method.factory_method_database.after.factory.OracleFactory;

public class App {

    public static void main(String[] args) {
//		DB db = new MySQLFactory().getDatabase();
        DB db = new OracleFactory().getDatabase();
        db.query("SELECT * FROM users");
        db.update("INSERT INTO users VALUES ('User', 25)");
    }
}
