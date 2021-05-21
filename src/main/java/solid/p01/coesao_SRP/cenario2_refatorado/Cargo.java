package solid.p01.coesao_SRP.cenario2_refatorado;

public enum Cargo {

    DESENVOLVEDOR (new GratificaoDeDezOuVintePorcento()),
    DBA( new GratificaoDeQuinzeOuVinteCincoPorcento() ) ,
    ANALISTA(new GratificaoDeQuinzeOuVinteCincoPorcento());


    private Gratificacao gratificao;

    private Cargo(Gratificacao gratificao) {
        this.gratificao = gratificao;
    }

    public Gratificacao getGratificao() {
        return gratificao;
    }
}

