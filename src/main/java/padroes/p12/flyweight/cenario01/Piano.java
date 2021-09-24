package padroes.p12.flyweight.cenario01;

import java.util.List;

import org.jfugue.player.Player;
import padroes.p12.flyweight.cenario01.notasmusicais.Nota;

public class Piano {
	public void toca(List<Nota> musica){
		Player player = new Player();
		
		StringBuilder musicaEmNotas = new StringBuilder();
		
		for(Nota nota : musica){
			musicaEmNotas.append(nota.simbolo()+" ");
		}
		
		player.play(musicaEmNotas.toString() );
	}
}
