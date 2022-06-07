package padroes.p09.observer.cenario01;

public class Namorada implements ChegadaAniversarianteObserver {


    @Override
    public void chegou(ChegadaAniversarioEvent event) {
        System.out.println(event.getHoraDaChegada() );
        System.out.println("Apagar as Luzes...");
        System.out.println("Fazer Silêncio...");
        System.out.println("Surpresa!!!");
    }
}
