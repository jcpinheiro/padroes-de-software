package padroes.p07.abstractfactory.cenario02;

public class FilmesComediaFactory implements IFilmesFactory {

       public IFilmeBrasileiro getFilmeBrasileiro()
       {
             return new FilmeBrasileiroComedia();
       }

       public IFilmeAmericano getFilmeAmericano()
       {
             return new FilmeAmericanoComedia();
       }

}