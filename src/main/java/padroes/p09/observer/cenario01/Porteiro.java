package padroes.p09.observer.cenario01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Porteiro extends Thread {

    private List<ChegadaAniversarianteObserver> observadores = new ArrayList<>();

    public void adicionaObservador(ChegadaAniversarianteObserver observer ) {
        observadores.add(observer );
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in );

        while (true ) {
            int valor = scanner.nextInt();

            if(valor == 1) {
                ChegadaAniversarioEvent event = new ChegadaAniversarioEvent(LocalDateTime.now() );

                // Notifica os observadores
                observadores.forEach(observer -> observer.chegou(event ) );

            } else {
                System.out.println("Alarme falso ...");
            }
        }

    }
}
