package factory_method.factory_method_database.after.factory;

import factory_method.factory_method_database.after.db.DB;

public interface DBFactory {
	DB getDatabase();
}
