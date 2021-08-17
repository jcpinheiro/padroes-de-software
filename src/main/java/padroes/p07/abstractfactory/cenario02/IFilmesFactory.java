package padroes.p07.abstractfactory.cenario02;

public interface IFilmesFactory {
       IFilmeBrasileiro getFilmeBrasileiro();
       IFilmeAmericano  getFilmeAmericano();
}