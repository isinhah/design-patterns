package abstract_factory.factory.abstractFactory;

import abstract_factory.certificate.BrazilianCertificate;
import abstract_factory.certificate.Certificate;
import abstract_factory.packing.BrazilianPacking;
import abstract_factory.packing.Packing;

public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory {

	public Certificate getCertificates() {
		return new BrazilianCertificate();
	}

	public Packing getPacking() {
		return new BrazilianPacking();
	}

}
