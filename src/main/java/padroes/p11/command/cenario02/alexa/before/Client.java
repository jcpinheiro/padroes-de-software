package padroes.p11.command.cenario02.alexa.before;


import padroes.p11.command.cenario02.alexa.before.alexa.Alexa;

public class Client {

	public static void main(String[] args) {
		Alexa alexa = new Alexa();
		alexa.sendRequest("Turn on the Living room light");
		alexa.sendRequest("Turn off the Kitchen light");
	}
}
