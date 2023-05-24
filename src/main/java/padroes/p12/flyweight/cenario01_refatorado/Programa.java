package padroes.p12.flyweight.cenario01_refatorado;

import java.util.List;

public class Programa {

    public static void main(final String[] args) {

        List<NotaMusical> musica = List.of(
                NotaMusical.getInstance("do").get(),
                NotaMusical.getInstance("re").get(), NotaMusical.getInstance("mi").get(),
                NotaMusical.getInstance("fa").get(), NotaMusical.getInstance("fa").get(),
                NotaMusical.getInstance("fa").get(), NotaMusical.getInstance("do").get(),
                NotaMusical.getInstance("re").get(), NotaMusical.getInstance("do").get(),
                NotaMusical.getInstance("re").get(), NotaMusical.getInstance("re").get(),
                NotaMusical.getInstance("re").get(), NotaMusical.getInstance("do").get(),
                NotaMusical.getInstance("sol").get(), NotaMusical.getInstance("fa").get(),
                NotaMusical.getInstance("mi").get(), NotaMusical.getInstance("mi").get(),
                NotaMusical.getInstance("mi").get(), NotaMusical.getInstance("do").get(),
                NotaMusical.getInstance("re").get(), NotaMusical.getInstance("mi").get(),
                NotaMusical.getInstance("fa").get(), NotaMusical.getInstance("fa").get(),
                NotaMusical.getInstance("fa").get());

        Piano piano = new Piano();
        piano.tocar(musica);
    }
}


