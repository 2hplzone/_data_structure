package sort_merge;

public class MergeSortMain {
	public static void main(String[] args){
		MergeSort ms = new MergeSort();
		int[] iArr = {38,27,43,3,9,82,10};
		ms.setMerge(iArr, 0, iArr.length-1);
	}
}
