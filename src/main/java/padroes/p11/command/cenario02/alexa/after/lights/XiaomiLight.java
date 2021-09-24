package padroes.p11.command.cenario02.alexa.after.lights;

public class XiaomiLight implements GenericLight {
	
	public void turnOn() {
		System.out.println("The XiaomiLight is On");
	}
	
	public void turnOff() {
		System.out.println("The XiaomiLight is Off");
	}
}
