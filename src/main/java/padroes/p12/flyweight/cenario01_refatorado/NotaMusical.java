package padroes.p12.flyweight.cenario01_refatorado;

import java.util.Optional;

public enum NotaMusical {
    DO("C"), RE("D"), MI("E"),
     FA("F"), SOL("G"), LA("A"), SI("B");

    private String simbolo;

    private NotaMusical(final String simbolo) {
        this.simbolo = simbolo;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public static Optional<NotaMusical> getInstance(final String nome) {
        NotaMusical notaMusicalEncontrada = null;
        String nomeEmMaiusculo = nome.toUpperCase();

        for (NotaMusical notaMusical : values()) {
            if (notaMusical.name().equals(nomeEmMaiusculo)) {
                notaMusicalEncontrada = notaMusical;
            }
        }

        return Optional.ofNullable(notaMusicalEncontrada);
    }
}
