package abstract_factory.factory.abstractFactory;

import abstract_factory.certificate.Certificate;
import abstract_factory.certificate.USCertificate;
import abstract_factory.packing.Packing;
import abstract_factory.packing.USPacking;

public class USRulesAbstractFactory implements CountryRulesAbstractFactory {

	public Certificate getCertificates() {
		return new USCertificate();
	}

	public Packing getPacking() {
		return new USPacking();
	}

}
