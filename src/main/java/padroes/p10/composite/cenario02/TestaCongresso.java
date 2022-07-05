package padroes.p10.composite.cenario02;

public class TestaCongresso {

    public static void main(String[] args) {
            Congresso congresso = new Congresso("Congresso de Informática", 5);
            Participante bruno = new Individuo("Bruno Garcia", 1);
            Participante joao = new Individuo("João da Silva", 2);

            congresso.adicionarParticipante(bruno);
            congresso.adicionarParticipante(joao);

            Participante pedro = new Individuo("Pedro de Souza", 3);
            Participante antonio = new Individuo("Antonio Carlos", 4);

            Participante dcomp = new Instituicao("DCOMP-IFMA");
            dcomp.adicionar(pedro );
            dcomp.adicionar(antonio );

            congresso.adicionarParticipante(dcomp);
            System.out.println(congresso);

            congresso.imprimeParticipantes();
   }
}

