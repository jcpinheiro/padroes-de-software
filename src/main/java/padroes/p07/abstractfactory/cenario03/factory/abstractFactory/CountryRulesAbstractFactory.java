package padroes.p07.abstractfactory.cenario03.factory.abstractFactory;


import padroes.p07.abstractfactory.cenario03.model.certificate.Certificate;
import padroes.p07.abstractfactory.cenario03.model.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	Packing getPacking();
}
