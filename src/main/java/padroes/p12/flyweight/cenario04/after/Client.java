package padroes.p12.flyweight.cenario04.after;

import padroes.p12.flyweight.cenario04.after.service.MusicService;

public class Client {

	public static void main(String[] args) {
		MusicService player = new MusicService();
		player.listenMusic("User A", "The Unfforgiven;Mettalica;300");
		player.listenMusic("User A", "The Unfforgiven;Mettalica;300");
		player.listenMusic("User A", "The Unfforgiven;Mettalica;300");
		player.listenMusic("User A", "Be Yourself;Audioslave;200");
		player.listenMusic("User B", "The Unfforgiven;Mettalica;300");
		player.listenMusic("User B", "Be Yourself;Audioslave;200");
		
		player.report();
	}
}
