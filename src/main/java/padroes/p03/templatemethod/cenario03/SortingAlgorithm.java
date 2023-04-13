package padroes.p03.templatemethod.cenario03;

public abstract class SortingAlgorithm {

	protected int[] nums;
	
	public SortingAlgorithm(int[] nums) {
		this.nums = nums;
	}
	
	protected abstract void initialize();
	protected abstract void sorting();
	protected abstract void showResult();
	
	protected void swap(int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	
	// template pattern
	// the subclasses can not override this method !!!
	public final void sort() {
		initialize();
		sorting();
		showResult();
	}
}
