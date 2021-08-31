package padroes.p09.observer.cenario01;

import java.time.LocalDateTime;

public class ChegadaAniversarioEvent {

    private final LocalDateTime horaDaChegada;

    public ChegadaAniversarioEvent(LocalDateTime horaDaChegada) {
        this.horaDaChegada = horaDaChegada;
    }

    public LocalDateTime getHoraDaChegada() {
        return horaDaChegada;
    }
}
