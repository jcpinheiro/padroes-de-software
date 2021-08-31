package padroes.p09.observer.cenario01.observers;

public class Wife implements Observer {
	
	public void partyTime() {
		System.out.println("Let´s Party! :D");
	}

	@Override
	public void update(boolean status) {
		if(status) {
			partyTime();
		} else {
			System.out.println("Hold!");
		}
	}
}
