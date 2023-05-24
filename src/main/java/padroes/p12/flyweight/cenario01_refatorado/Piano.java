package padroes.p12.flyweight.cenario01_refatorado;

import java.util.List;
import java.util.stream.Collectors;

import org.jfugue.player.Player;

public class Piano {

    public void tocar(List<NotaMusical> musica){

        String simbolosNotasMusicais = musica.stream()
            .map(NotaMusical::getSimbolo)
            .collect(Collectors.joining(" "));

        Player player = new Player();
        player.play(simbolosNotasMusicais);
    }
}