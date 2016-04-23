package search_binary;

public class BinarySearchMain {
	public static void main(String[] args){
        int[] iArrBinary={20,35,37,40,45,50,51,55,67};
        BinarySearch bs = new BinarySearch();        
        int iResult = bs.search(iArrBinary, 0, iArrBinary.length-1, 37);
        bs.print(String.format("iResult = %d", iResult));
    }
}
