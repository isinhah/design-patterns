package factory_method.factory_method_database.after.factory;

import factory_method.factory_method_database.after.db.DB;
import factory_method.factory_method_database.after.db.MySQLDB;

public class MySQLFactory implements DBFactory {

	@Override
	public DB getDatabase() {
		return new MySQLDB();
	}

}
