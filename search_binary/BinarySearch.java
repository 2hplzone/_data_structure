package search_binary;

public class BinarySearch {
	//검색 범위의 중앙 원소값과 검색하고자 하고자 하는 값을 비교함
	private int m_iCount;		
    
    public void print(String str){
        System.out.println(String.format("(%d)--> %s",++m_iCount, str));
    }
    
    //iArr: 검색 범위
    //iFirst: 검색 범위 맨 왼쪽 원소
    //iLast: 검색 범위 맨 오늘쪽 원소
    //iValue: 검색 하고자 하는 값
    public int search(int[] iArr, int iFirst, int iLast, int iValue){
        if(iLast >= iFirst){
        	//검색 범위 중앙 원소
        	int iMiddle = iFirst+((iLast - iFirst)/2);
        	
            //중앙 원소에 해당되는 값 
            int iArrResult = iArr[iMiddle];
            print(String.format("iFirst: %d, iMiddle: %d, iLast: %d, iArrResult: %d, iValue: %d",iFirst, iMiddle, iLast, iArrResult, iValue));
            
            if( iArrResult == iValue){
            	//중앙 원소에 해당되는 값이 검색하고자 하는 값과  
            	//동일하면 결과 반환함.
            	return iMiddle;
            }else if(iArrResult > iValue){
            	//중앙 원소에 해당되는 값이 검색하고자 하는 값 보다
            	//작으면 중앙원소보다 작은 원소들의 범위에서 재검색
                return search(iArr, 0, iMiddle-1, iValue);
            }else if(iArrResult < iValue){
            	//검색범위 중앙에 위치한 값보다 검색 하고자 하는 값이
            	//크면 중앙원소 보다 큰 원소들의 범위에서 재검색
                return search(iArr, iMiddle+1, iLast, iValue);
            }      
        }
        
        //검색 범위내에 없으면 -1을 반환함.
    	return -1;
    }
}
