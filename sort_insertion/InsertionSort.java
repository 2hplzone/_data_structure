package sort_insertion;

public class InsertionSort {
	public void setSort(int[] iArr){
		int iSize = iArr.length;
		int iKey=0;
		int k=0;
		
		for(int i=0; i<iSize; i++){
			iKey = iArr[i];
			k=i-1;
			
			System.out.println(String.format("-- %d��° ��: %d", i, iKey));
			
			//i-1,i-2,...��° ���� i��° �� ���� Ŭ ���
			while(k >=0 && iArr[k] > iKey){
				System.out.println(String.format("%d��° ��: %d", k, iArr[k]));
				
				//i��°�� i-1��° �� ����
				iArr[k+1] = iArr[k];
				k--;
			}
			
			iArr[k+1]= iKey;
			
			printArr(iArr, i);
		}
	}
	
	private void printArr(int[] iArr, int iNum){
		int iSize = iArr.length;
		for(int i=0; i<iSize; i++){
			if(i == 0)System.out.print(String.format("## %d��° ���� --> %d, ", iNum+1, iArr[i]));
			else if(i == iSize-1)System.out.println(iArr[i]);
			else System.out.print(iArr[i]+", ");
		}
	}
}
