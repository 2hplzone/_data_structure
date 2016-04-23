package sort_insertion;

public class InsertionSort {
	public void setSort(int[] iArr){
		int iSize = iArr.length;
		int iKey=0;
		int k=0;
		
		for(int i=0; i<iSize; i++){
			iKey = iArr[i];
			k=i-1;
			
			System.out.println(String.format("-- %d번째 값: %d", i, iKey));
			
			//i-1,i-2,...번째 값이 i번째 값 보다 클 경우
			while(k >=0 && iArr[k] > iKey){
				System.out.println(String.format("%d번째 값: %d", k, iArr[k]));
				
				//i번째에 i-1번째 값 저장
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
			if(i == 0)System.out.print(String.format("## %d번째 정렬 --> %d, ", iNum+1, iArr[i]));
			else if(i == iSize-1)System.out.println(iArr[i]);
			else System.out.print(iArr[i]+", ");
		}
	}
}
