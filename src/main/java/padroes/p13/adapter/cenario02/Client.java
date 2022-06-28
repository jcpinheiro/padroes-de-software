package padroes.p13.adapter.cenario02;

import padroes.p13.adapter.cenario02.adapters.HDMIToOldMonitorAdapter;
import padroes.p13.adapter.cenario02.adapters.HDMIToVGAAdapter;
import padroes.p13.adapter.cenario02.devices.Computer;
import padroes.p13.adapter.cenario02.devices.OldMonitor;
import padroes.p13.adapter.cenario02.devices.TV;

public class Client {

	public static void main(String[] args) {
		Computer pc = new Computer();
		TV tv = new TV();
		pc.connectPort(tv);
		pc.sendImageAndSound("Cat and rainbow", "Nyan cat song");
		
		System.out.println("------ Monitor Object Adapter ----------");
		
		Computer pc2 = new Computer();
		OldMonitor monitor = new OldMonitor();
		//pc2.connectPort(monitor.getConnector());
		// Don't work! That's the reason why we create the adapter
		pc2.connectPort(new HDMIToVGAAdapter(monitor));
		pc2.sendImageAndSound("Cat and rainbow", "Nyan cat song");

		System.out.println("------ Monitor Class Adapter ----------");
		
		Computer pc3 = new Computer();
		HDMIToOldMonitorAdapter monitorAdaptee = new HDMIToOldMonitorAdapter();
		pc3.connectPort(monitorAdaptee);
		pc3.sendImageAndSound("Cat and rainbow", "Nyan cat song");
	}
}
