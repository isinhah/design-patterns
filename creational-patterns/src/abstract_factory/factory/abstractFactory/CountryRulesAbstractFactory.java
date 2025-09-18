package abstract_factory.factory.abstractFactory;

import abstract_factory.certificate.Certificate;
import abstract_factory.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	
	Packing getPacking();
}
