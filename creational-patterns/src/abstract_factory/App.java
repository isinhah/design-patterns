package abstract_factory;


import abstract_factory.factory.IPhone11Factory;
import abstract_factory.factory.IPhoneFactory;
import abstract_factory.factory.IPhoneXFactory;
import abstract_factory.factory.abstractFactory.BrazilianRulesAbstractFactory;
import abstract_factory.factory.abstractFactory.CountryRulesAbstractFactory;
import abstract_factory.model.IPhone;

public class App {
	
	public static void main(String[] args) {
		CountryRulesAbstractFactory rules = new BrazilianRulesAbstractFactory();
		IPhoneFactory genXFactory = new IPhoneXFactory(rules);
		IPhoneFactory gen11Factory = new IPhone11Factory(rules);
		
		System.out.println("### Ordering an iPhone X");
		IPhone iphone = genXFactory.orderIPhone("standard");
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = gen11Factory.orderIPhone("highEnd");
		System.out.println(iphone2);
	}
}