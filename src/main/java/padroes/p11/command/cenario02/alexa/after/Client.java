package padroes.p11.command.cenario02.alexa.after;

import padroes.p11.command.cenario02.alexa.after.commands.TurnLightOffCommand;
import padroes.p11.command.cenario02.alexa.after.commands.TurnLightOnCommand;
import padroes.p11.command.cenario02.alexa.after.lights.PhillipsHueLight;
import padroes.p11.command.cenario02.alexa.after.lights.XiaomiLight;
import padroes.p11.command.cenario02.alexa.after.alexa.Alexa;

public class Client {

	public static void configureAlexa(Alexa alexa) {
		PhillipsHueLight livingRoom = new PhillipsHueLight();
		XiaomiLight kitchen = new XiaomiLight();
		
		alexa.addIntegration("Turn on the Living room light", new TurnLightOnCommand(livingRoom), "on", "Living room", "light");
		alexa.addIntegration("Turn off the Living room light", new TurnLightOffCommand(livingRoom), "off", "Living room", "light");
		alexa.addIntegration("Turn on the Kitchen light", new TurnLightOnCommand(kitchen), "on", "Kitchen", "light");
		alexa.addIntegration("Turn off the Kitchen light", new TurnLightOffCommand(kitchen), "off", "Kitchen", "light");
	}
	
	public static void main(String[] args) {
		Alexa alexa = new Alexa();
		configureAlexa(alexa);
		
		alexa.sendRequest("Turn on the Living room light");
		alexa.sendRequest("Turn off the Kitchen light");
		
		alexa.sendRequest("Please, could you Turn off the Living room light?");
	}
}
