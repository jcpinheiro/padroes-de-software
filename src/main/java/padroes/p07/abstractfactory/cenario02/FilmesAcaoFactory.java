package padroes.p07.abstractfactory.cenario02;

public class FilmesAcaoFactory implements IFilmesFactory {

       public IFilmeBrasileiro getFilmeBrasileiro()
       {
             return new FilmeBrasileiroAcao();
       }

       public IFilmeAmericano getFilmeAmericano()
       {
             return new FilmeAmericanoAcao();
       }

}