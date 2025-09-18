package factory_method.factory_method_database.after.db;

public class MySQLDB implements DB {
    public void query(String sql) {
        System.out.println("Querying " + sql + " in MYSQL database");
    }

    public void update(String sql) {
        System.out.println("Uptade query " + sql + " in MYSQL database");
    }
}
