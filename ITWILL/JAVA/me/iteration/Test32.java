package iteration;
/*
	2. do while �ݺ���
	
		�ݺ��Ǵ� ��ɾ �ϴ� �ѹ��� ������ �ڿ�
		���ǽ��� �˻��ؼ� ���ǽ��� ����� true ���̸� ����ؼ� �ݺ��Ǵ� ��ɾ �����ϰ�
		���ǽ��� �˻��ؼ� ���ǽ��� ����� false �����̸� do while�� ��������.
		
		����
		   �ʱ��;
		   
		   do{
		   		���ǽ��� ����� ���� ���� �ݺ������� �����ϰ��� �ϴ� ��ɹ�;
		   		
		   		���ǽ��� ����� �����ϴ� ��ɹ� ������;
		   
		   }while(���ǽ�);
		   
		 
*/

public class Test32 {

	public static void main(String[] args) {
		
		int i = 1, j = 1;
		
		while(i < 1) {
			System.out.println("while���� " + i + "��° �ݺ� �������Դϴ�.");
		}
		System.out.println("while���� ����� �� ���� i�� ���� " + i + "�Դϴ�.");
		
		System.out.println("-------------------------------------------");
		
		do {
			System.out.println("do while���� " + i + "��° �ݺ� �������Դϴ�.");
			j++;
		} while (j < 1);
		System.out.println("do while���� ����� �� ���� j�� ����" + j + "�Դϴ�.");
		/*
		  	���� ������ while���̶�� �� �ѹ��� ��µ� X
		  	do while���� ���ǽ��� ����� ������� ������ �ѹ��� do{}������ �������ش�.
		  	
		*/
		
	}

}
