//����2
/*�迭�� �ε����� ������ ��� �� �߻��ϴ�..
 * ArrayIndexOutOfBoundsException�� ó���ϴ� ���α׷��� �ۼ��϶�.
 */

public class Test2 {
	public static void main(String[] args) {
		//������(4) intArray �迭 ����� ũ�� 5
		int[] intArray = new int[5];
		
		//0��° �ε��� 0���� �ʱ�ȭ
		intArray[0] = 0;
		
		for(int i=0; i<5; i++) {
			intArray[i+1] = i+1 + intArray[i]; 
			System.out.println("intArray[" + i + "]=" + intArray[i]);
		} 
		
//��°��
//		intArray[0]=0
//		intArray[1]=1
//		intArray[2]=3
//		intArray[3]=6
//		�迭�� �ε����� ������ ���� �����ϴ�.
		
		
	}

}
