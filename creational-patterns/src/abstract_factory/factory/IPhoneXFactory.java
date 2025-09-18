package abstract_factory.factory;

import abstract_factory.factory.abstractFactory.CountryRulesAbstractFactory;
import abstract_factory.model.IPhone;
import abstract_factory.model.IPhoneX;
import abstract_factory.model.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhoneXFactory(CountryRulesAbstractFactory rules) {
		super(rules);
	}

	public IPhone createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhoneX(rules);
		} else if(level.equals("highEnd")) {
			return new IPhoneXSMax(rules);
		} else return null;
	}

}
