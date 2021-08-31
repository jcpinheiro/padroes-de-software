package padroes.p09.observer.cenario01.subject;

public class Doorman extends Subject {
	private boolean status = false;
	
	public boolean getStatus() {
		return this.status;
	}
	
	public void setStatus(boolean newStatus) {
		this.status = newStatus;
		notifyObservers(newStatus);
	}
}
