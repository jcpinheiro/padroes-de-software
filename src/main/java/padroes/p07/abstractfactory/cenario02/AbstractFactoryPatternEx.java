package padroes.p07.abstractfactory.cenario02;

/*
Este padrão é utilizado quando o sistema não precisa se preocupar sobre como os produtos
devem ser criados ou compostos, quando queremos lidar com várias fábricas mais facilmente,
separar classes concretas e fazer a troca de produtos mais facilmente.
 */

public class AbstractFactoryPatternEx {

    public static void main(String[] args) {

      System.out.println("***Exemplo do padrão Abstract Factory***");
      FilmesAcaoFactory filmeAcao = new FilmesAcaoFactory();
      IFilmeBrasileiro filmeAcaoBR = filmeAcao.getFilmeBrasileiro();
      IFilmeAmericano filmeAcaoUS = filmeAcao.getFilmeAmericano();

      System.out.println("\nOs filmes de Ação catalogados são:");
      System.out.println(filmeAcaoBR.nomeFilme());
      System.out.println(filmeAcaoUS.nomeFilme());

      FilmesComediaFactory filmeComedia = new FilmesComediaFactory();
      IFilmeBrasileiro filmeComediaBR = filmeComedia.getFilmeBrasileiro();
      IFilmeAmericano filmeComediaUS = filmeComedia.getFilmeAmericano();

      System.out.println("\nOs filmes de Comédia catalogados são::");
      System.out.println(filmeComediaBR.nomeFilme());
      System.out.println(filmeComediaUS.nomeFilme());
  }

}