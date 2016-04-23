package selection_sort;

public class SelectionSortMain {
	public static int m_iCount;
	
    public static void main(String[] args){
        int[] iArrSelect={6,1,7,2,5,3,4};
        SelectionSort ss = new SelectionSort();
        System.out.print("원래 배열값   : ");
        ss.printArray(iArrSelect);
        System.out.println();
        
        ss.sort(iArrSelect);
        
        System.out.println();
        System.out.print("정렬 후 배열값: ");
        ss.printArray(iArrSelect);
    }
}
