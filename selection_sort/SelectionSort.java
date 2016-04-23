package selection_sort;

public class SelectionSort {
	private int m_iCount;
	  
	//iArr: ������ �迭
    public void sort(int[] iArr){
    	int iResult = 0;
    	int iSize = iArr.length;
    	
        for(int i=0; i<iSize-1; i++){
        	for(int k=i+1; k<iSize; k++){
        		//�迭�� i��° ���� i+i ���� ���Ͽ�
        		//�������� ū�� ��ġ�� �̵�,
        		//ū���� ������ ��ġ�� �̵�.
        		if(iArr[i]>iArr[k]){
        			changeValue(iArr, k, i);
        		}
        	}
        }
    }
    
    //iArr: ������ ������ �迭
    //iSmal: ���� ���� �迭�� ��ġ
    //iBic: ���� ū �迭�� ��ġ
    private void changeValue(int[] iArr, int iSmall, int iBig){
    	int iTemp = 0;
    	
    	iTemp = iArr[iSmall];
    	iArr[iSmall] = iArr[iBig];
    	iArr[iBig] = iTemp;
    	
    	if(m_iCount<9)System.out.print(String.format("0%d ��° ����: ", ++m_iCount));
    	else System.out.print(String.format("%d ��° ����: ", ++m_iCount));
    	
    	printArray(iArr);
    }
    
    //iArr: ����� �迭
    public void printArray(int[] iArr){
    	int iSize = iArr.length;
    	for(int i=0; i<iSize; i++){
    		System.out.print(String.valueOf(iArr[i]));
    		if(i<iSize-1)System.out.print(", ");
    	}
    	System.out.println();
    }
}
