package sort_buble;

public class BubleSort {
	
	public void setSort(int[] iArr){
		if(iArr == null){
			System.out.println("Array == Null");
			return;
		}
		
		int iSizeMin1 = iArr.length-1;
		if(iSizeMin1<0){
			System.out.println("ArrayList.Size < 2");
			return;
		}
		
		int iNum1=0, iNum2=0;
		String sArr = "";
				
		for(int i=0;i<iSizeMin1; i++){
			sArr = getArray(iArr);
			System.out.println(String.format("=== %d 번째 정렬(%s) ===", i+1, sArr));
			for(int k=0; k<iSizeMin1-i; k++){
				iNum1 = iArr[k];
				iNum2 = iArr[k+1];
				//System.out.println(String.format("iNum1: %d, iNum2: %d", iNum1,iNum2));
				//배열의 i번째 값과 i+1 비교
				//i번째 값이 i+1번째 값보다 크면
				if(iNum1 > iNum2){
					//i번째와 i+1번째 값 바꾸기
					iArr[k+1]=iNum1;
					iArr[k]=iNum2;
				}
				print(iArr, k+1);
			}
		}
	} 
	
	private String getArray(int[] iArr){
		int iSize = iArr.length;
		String sResult = "";
		for(int i=0; i<iSize; i++){
			if(i<iSize-1){
				sResult = sResult + iArr[i]+", ";
			}else{
				sResult = sResult + iArr[i];
			}
		}
		return sResult;
	}
	
	private void print(int[] iArr, int iCount){
		int iSize = iArr.length;

		System.out.print(String.format("%d --> ", iCount));
		for(int i=0; i<iSize; i++){
			System.out.print(iArr[i]);
			if(i<iSize-1){
				System.out.print(", ");
			}
		}
		System.out.println();
	}
}
