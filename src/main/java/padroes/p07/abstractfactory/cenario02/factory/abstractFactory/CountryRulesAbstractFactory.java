package padroes.p07.abstractfactory.cenario02.factory.abstractFactory;


import padroes.p07.abstractfactory.cenario02.model.certificate.Certificate;
import padroes.p07.abstractfactory.cenario02.model.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	Packing getPacking();
}
