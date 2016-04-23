package selection_sort;

public class SelectionSort {
	private int m_iCount;
	  
	//iArr: 정렬할 배열
    public void sort(int[] iArr){
    	int iResult = 0;
    	int iSize = iArr.length;
    	
        for(int i=0; i<iSize-1; i++){
        	for(int k=i+1; k<iSize; k++){
        		//배열의 i번째 값과 i+i 값을 비교하여
        		//작은값을 큰값 위치로 이동,
        		//큰값은 작은값 위치로 이동.
        		if(iArr[i]>iArr[k]){
        			changeValue(iArr, k, i);
        		}
        	}
        }
    }
    
    //iArr: 정렬을 적용할 배열
    //iSmal: 값이 작은 배열의 위치
    //iBic: 값이 큰 배열의 위치
    private void changeValue(int[] iArr, int iSmall, int iBig){
    	int iTemp = 0;
    	
    	iTemp = iArr[iSmall];
    	iArr[iSmall] = iArr[iBig];
    	iArr[iBig] = iTemp;
    	
    	if(m_iCount<9)System.out.print(String.format("0%d 번째 정렬: ", ++m_iCount));
    	else System.out.print(String.format("%d 번째 정렬: ", ++m_iCount));
    	
    	printArray(iArr);
    }
    
    //iArr: 출력할 배열
    public void printArray(int[] iArr){
    	int iSize = iArr.length;
    	for(int i=0; i<iSize; i++){
    		System.out.print(String.valueOf(iArr[i]));
    		if(i<iSize-1)System.out.print(", ");
    	}
    	System.out.println();
    }
}
