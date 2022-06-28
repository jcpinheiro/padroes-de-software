package padroes.p15.facade.cenario01;

/**
 *  This pattern provides a unified interface to a
 *   set of interfaces in a system 
 *   
 *   		It defines a high level interface 
 *   		that makes the subsystem easier to use 
 * 
 */

public class App {

	public static void main(String[] args) {
		
		SortingManager manager = new SortingManager();
		
		manager.bubbleSort();
		manager.mergeSort();
		manager.heapSort();
		
	}
}
