package padroes.p07.abstractfactory.cenario01;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class PassagemOnibusInterestadual {

	private String origem;
	private String destino;
	private Calendar dataHoraPartida;
	
	//Formatador da data
	protected SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	
	public PassagemOnibusInterestadual(String origem, String destino, Calendar dataHoraPartida) {
		this.origem = origem;
		this.destino = destino;
		this.dataHoraPartida = dataHoraPartida;
	}
	
	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Calendar getDataHoraPartida() {
		return dataHoraPartida;
	}

	public void setDataHoraPartida(Calendar dataHoraPartida) {
		this.dataHoraPartida = dataHoraPartida;
	}
	
	public abstract void exibeDetalhes();

}
