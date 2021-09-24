package padroes.p10.composite.cenario01.teste;

import padroes.p10.composite.cenario01.Gerente;
import padroes.p10.composite.cenario01.Programador;

public class MinhaApp {

	public static void main(String[] args) {
		//Cria programadores (folhas)
		Programador pEstagiario = new Programador("José", 900);
		Programador pJunior = new Programador("Pedro", 2900);
		Programador pSenior = new Programador("Ricardo", 3900);



		//Gerentes
		Gerente g3 = new Gerente("João", 15000);
        Gerente g2 = new Gerente("Maria", 10000);
        Gerente g1 = new Gerente("Carlos", 5000);
        
        //Montar a estrutura em árvore
        
        //Carlos superviosiona os programadores José e Pedro
        g1.supervisiona(pEstagiario);
        g1.supervisiona(pJunior);
        
        //Maria superviosiona o programador Ricardo
        g2.supervisiona(pSenior);
        
        //João é raiz da estrutura em árvore
        g3.supervisiona(g1);
        g3.supervisiona(g2);
        
        g3.exibeInformacoes();
	}
}
