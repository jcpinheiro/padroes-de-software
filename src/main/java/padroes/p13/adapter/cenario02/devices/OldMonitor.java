package padroes.p13.adapter.cenario02.devices;

import padroes.p13.adapter.cenario02.intefaces.VGA;

public class OldMonitor implements VGA {

	@Override
	public void setImage(String image) {
		System.out.println(">>> This is your video: " + image);
	}
	
}
