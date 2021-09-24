package padroes.p12.flyweight.cenario01;

import padroes.p12.flyweight.cenario01.notasmusicais.Nota;
import padroes.p12.flyweight.cenario01.notasmusicais.NotasMusicais;

import java.util.List;

public class Programa {

    public static void main(String[] args) {

        NotasMusicais notas = new NotasMusicais();

        List<Nota> doReMiFa = List.of(
            notas.busca("do"),
            notas.busca("re"),
            notas.busca("mi"),
            notas.busca("fa"),
            notas.busca("fa"),
            notas.busca("fa"),

            notas.busca("do"),
            notas.busca("re"),
            notas.busca("do"),
            notas.busca("re"),
            notas.busca("re"),
            notas.busca("re"),

            notas.busca("do"),
            notas.busca("sol"),
            notas.busca("fa"),
            notas.busca("mi"),
            notas.busca("mi"),
            notas.busca("mi")


        );
        
        Piano piano = new Piano();
        piano.toca(doReMiFa);
        
        List<Nota> todasAsNotas = List.of(
                notas.busca("do"),
                notas.busca("doSustenido"),
                notas.busca("re"),
                notas.busca("reSustenido"),
                notas.busca("mi"),
                notas.busca("miSustenido"),
                notas.busca("fa"),
                notas.busca("faSustenido"),
                notas.busca("sol"),
                notas.busca("solSustenido"),
                notas.busca("la"),
                notas.busca("laSustenido"),
                notas.busca("si"),
                notas.busca("siSustenido")
            );

        piano.toca(todasAsNotas);
    }
}
