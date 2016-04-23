package sort_merge;

public class MergeSort {
	private void printLn(String str){
		System.out.println(str);
	}
	
	private void print(String str){
		System.out.print(str);
	}
	
	private void printArray(int[] iArr){
		int iSize = iArr.length;
		for(int i=0; i<iSize; i++){
			if(i == 0)System.out.print("==>"+iArr[i]+", ");
			else if(i == iSize-1){
				System.out.println(iArr[i]);
			}else{
				System.out.print(iArr[i]+", ");
			}
		}
	}
	
	public void setMerge(int[] iArr, int iFirst, int iLast){
		if(iFirst >= iLast) return;
		
		if(iFirst < iLast){
			int iMid = iFirst +(iLast - iFirst)/2;
			
			printLn(String.format("setMerge1--> iFirst: %d, iMid: %d, iLast: %d", iFirst, iMid, iLast));
			setMerge(iArr,iFirst,iMid);
			setMerge(iArr,iMid+1,iLast);
			setMerge(iArr, iFirst,iMid,iLast);
		}
	}
	
	private void setMerge(int[] iArr, int iFirst, int iMid, int iLast){
		int i=0, j=0, k=0;
		int iNum1 = iMid - iFirst + 1;
		int iNum2 = iLast - iMid;
		
		printLn(String.format("setMerge2--> iFirst: %d, iMid: %d, iLast: %d, iNum1: %d, iNum2: %d", iFirst, iMid, iLast, iNum1, iNum2));
		
		int[] iArrLeft = new int[iNum1];
		int[] iArrRight = new int[iNum2];
		
		for(int a=0; a<iNum1; a++){
			iArrLeft[a] = iArr[iFirst+i];
			printLn(String.format("setMerge2--> a: %d, iFirst+i: %d, iArr[iFirst+i]: %d", a, iFirst+i, iArr[iFirst+i]));
		}
		for(int b=0; b<iNum2; b++){
			//Error ¹ß»ý...¿Ö???
			iArrRight[b] = iArr[1 + iMid + b];
			printLn(String.format("setMerge2--> b: %d, 1 + iMid + b: %d, iArr[1 + iMid + b]: %d", b,1 + iMid + b, iArr[1 + iMid + b]));
		}
		
		k = iFirst;
		
		while(i<iNum1 && j < iNum2){
			printLn(String.format("setMerge2--> iArrLeft[%d](%d)<=iArrRight[%d](%d)", i,iArrLeft[i],j,iArrRight[j]));
			if(iArrLeft[i]<=iArrRight[j]){
				iArr[k] = iArrLeft[i];
				i++;
				printLn(String.format("setMerge2--> i: %d, k: %d, iArr[k]: %d", i,k,iArr[k]));
			}else{
				iArr[k] = iArrRight[j];
				j++;
				printLn(String.format("setMerge2--> j: %d, k: %d, iArr[k]: %d", j,k,iArr[k]));
			}
		}
		
		while(i < iNum1){
			printLn(String.format("iNum1: %d, i: %d, k: %d, iArr[k]: %d",iNum1, i, k, iArr[k]));
			
			iArr[k] = iArrLeft[i];
			i++;
			k++;
		}
		
		while(j < iNum2){
			printLn(String.format("iNum2: %d, i: %d, j: %d, iArr[j]: %d",iNum2, i, j, iArr[j]));
			iArr[k] = iArrRight[j];
			j++;
			k++;
		}
		printArray(iArr);
	}
	
}
