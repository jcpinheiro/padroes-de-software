package padroes.p05.factorymethod.cenario02refatorado.factory;

import padroes.p05.factorymethod.cenario02refatorado.database.DataBase;

public interface DBFactory {
	DataBase getDatabase();
}
