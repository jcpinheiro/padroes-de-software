package padroes.p04.builder.cenario03_testdatabuilder;

import java.util.List;

import static padroes.p04.builder.cenario03_testdatabuilder.LocacaoBuilder.umaLocacao;
import static padroes.p04.builder.cenario03_testdatabuilder.UsuarioBuilder.umUsuario;

public class TesteDataBuilder {

    public static void main(String[] args) {
        Usuario usuario1 = umUsuario().constroi();
        Usuario usuario2 = umUsuario().comNome("Usuario 2").constroi();
        Usuario usuario3 = umUsuario().comNome("Usuario 3").constroi();
        Usuario usuario4 = umUsuario().comNome("Usuario 4").constroi();

        List<Locacao> locacoes = List.of(
                                umaLocacao().paraUsuario(usuario1).
                                        emAtraso().constroi(),

                                umaLocacao().paraUsuario(usuario2)
                                            .emAtraso()
                                            .constroi(),

                                umaLocacao().paraUsuario(usuario3)
                                        .jaFinalizada()
                                        .constroi() );
        // ...
    }
}
