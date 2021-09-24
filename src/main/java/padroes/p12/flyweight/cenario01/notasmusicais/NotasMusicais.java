package padroes.p12.flyweight.cenario01.notasmusicais;

import java.util.HashMap;
import java.util.Map;

public class NotasMusicais {
	private static final Map<String,Nota> notas = new HashMap<>();
	
	static {
		notas.put("do", new Do());
		notas.put("doSustenido", new DoSustenido());
		notas.put("re", new Re());
		notas.put("reSustenido", new ReSustenido());
		notas.put("mi", new Mi());
		notas.put("miSustenido", new MiSustenido());
		notas.put("fa", new Fa());
		notas.put("faSustenido", new FaSustenido());
		notas.put("sol", new Sol());
		notas.put("solSustenido", new SolSustenido());
		notas.put("la", new La());
		notas.put("laSustenido", new LaSustenido());
		notas.put("si", new Si());
		notas.put("siSustenido", new SiSustenido());
	}
	
	public Nota busca(String nome){
		return notas.get(nome);
	}
}
