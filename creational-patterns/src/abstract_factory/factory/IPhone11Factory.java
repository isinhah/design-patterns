package abstract_factory.factory;

import abstract_factory.factory.abstractFactory.CountryRulesAbstractFactory;
import abstract_factory.model.IPhone;
import abstract_factory.model.IPhone11;
import abstract_factory.model.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {

	public IPhone11Factory(CountryRulesAbstractFactory rules) {
		super(rules);
	}

	public IPhone createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhone11(rules);
		} else if(level.equals("highEnd")) {
			return new IPhone11Pro(rules);
		} else return null;
	}

}
