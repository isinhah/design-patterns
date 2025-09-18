package factory_method.factory_method_database.before;

import factory_method.factory_method_database.before.db.OracleDB;

public class App {

	public static void main(String[] args) {
		OracleDB db = new OracleDB();
		db.query("SELECT * FROM users");
		db.update("INSERT INTO users VALUES ('User', 25)");
	}
}