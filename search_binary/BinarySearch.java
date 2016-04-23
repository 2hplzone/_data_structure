package search_binary;

public class BinarySearch {
	//�˻� ������ �߾� ���Ұ��� �˻��ϰ��� �ϰ��� �ϴ� ���� ����
	private int m_iCount;		
    
    public void print(String str){
        System.out.println(String.format("(%d)--> %s",++m_iCount, str));
    }
    
    //iArr: �˻� ����
    //iFirst: �˻� ���� �� ���� ����
    //iLast: �˻� ���� �� ������ ����
    //iValue: �˻� �ϰ��� �ϴ� ��
    public int search(int[] iArr, int iFirst, int iLast, int iValue){
        if(iLast >= iFirst){
        	//�˻� ���� �߾� ����
        	int iMiddle = iFirst+((iLast - iFirst)/2);
        	
            //�߾� ���ҿ� �ش�Ǵ� �� 
            int iArrResult = iArr[iMiddle];
            print(String.format("iFirst: %d, iMiddle: %d, iLast: %d, iArrResult: %d, iValue: %d",iFirst, iMiddle, iLast, iArrResult, iValue));
            
            if( iArrResult == iValue){
            	//�߾� ���ҿ� �ش�Ǵ� ���� �˻��ϰ��� �ϴ� ����  
            	//�����ϸ� ��� ��ȯ��.
            	return iMiddle;
            }else if(iArrResult > iValue){
            	//�߾� ���ҿ� �ش�Ǵ� ���� �˻��ϰ��� �ϴ� �� ����
            	//������ �߾ӿ��Һ��� ���� ���ҵ��� �������� ��˻�
                return search(iArr, 0, iMiddle-1, iValue);
            }else if(iArrResult < iValue){
            	//�˻����� �߾ӿ� ��ġ�� ������ �˻� �ϰ��� �ϴ� ����
            	//ũ�� �߾ӿ��� ���� ū ���ҵ��� �������� ��˻�
                return search(iArr, iMiddle+1, iLast, iValue);
            }      
        }
        
        //�˻� �������� ������ -1�� ��ȯ��.
    	return -1;
    }
}
