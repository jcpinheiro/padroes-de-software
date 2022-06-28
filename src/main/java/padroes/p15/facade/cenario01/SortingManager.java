package padroes.p15.facade.cenario01;

public class SortingManager {

	private Algorithm bubbleSort;
	private Algorithm mergeSort;
	private Algorithm heapSort;
	
	public SortingManager(){
		this.bubbleSort = new BubbleSort();
		this.mergeSort = new MergeSort();
		this.heapSort = new HeapSort();
	}
	
	public void mergeSort(){
		this.mergeSort.sort();
	}
	
	public void bubbleSort(){
		this.bubbleSort.sort();
	}
	
	public void heapSort(){
		this.heapSort.sort();
	}
}
