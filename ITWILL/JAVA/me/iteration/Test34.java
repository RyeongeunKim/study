package iteration;

public class Test34 {

	public static void main(String[] args) {
		
		//���� : 0�� 10������ ¦������ �ձ��ϱ�
		
		//4����Ʈ ũ���� �������� ������ sum1���� ���� �� 0 ����
		int sum1 = 0;
		
		// for�ݺ����� �̿�! �ʱ�� -> int j=0; 
					      //���ǽ��� -> j������ ���� 10���� �۰ų� ����?
	      				  //�������� -> j������ ����� ���� 2�� ����
		//�ݺ� ��°��

		for(int j=0; j<=10; j+=2) {
			sum1 += j;
			System.out.println(j + " : " + sum1);
		}
		
		//��°��
		/*
			0 j������ ����� �� ��� : 0 sum1������ ����� �� ���
			2 : 2
			4 : 6
			6 : 12
			8 : 20
			10 : 30
		*/
		
		System.out.println("------------------------------------");
		
		//���� : for���� �̿��Ͽ� "Hello World"���ڿ��� 10�� �ݺ��ؼ� ���!
		
		for(int i=0; i<10; i++) {
			System.out.println("Hello World");
		}
		
		System.out.println("for���� ��������");
		System.out.println("------------------------------------");
		
		//����: for���� �̿��Ͽ� 1���� 10���� ������ Ȧ������ ���� ���������� ���� �ѹ��� ���
		//��°��
		//�� �հ�� 25
		
		int sum2 = 0;
		
		for(int i=1; i<11; i+=2) {
			sum2 += i;
		}
		
		System.out.println("�� �հ�� " + sum2);
		System.out.println("--------------------------------------");
		
		//���� : 1���� 100������ ¦����(2550) ���
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i % 2==0) {
				sum += i;
				System.out.println(sum);
			}
		}
		
		System.out.println("--------------------------------------");
		/*
			break�� 
			break���� ���� ��ġ���� ���� ����� �ݺ����� ����µ� ����ϴ� Ű����
			�ַ� if���� �Բ� ���Ǿ� Ư�� ���ǽ��� �����ϸ� �ݺ����� ����µ� ����ϴ� Ű����
		*/
		//10���ݺ��Ͽ� i�������� ����ϵ� i������ ����Ǵ� ���� 5�� �Ǹ�, for�ݺ����� ������ ���������� �ϱ�
		for(int i=0; i<10; i++) {
			
			if(i == 5) {
				break; //for�ݺ��� {}�� ���� ������ ���������� �ϱ�
			}
			
			System.out.println(i);
		}
		
		System.out.println("----------------------------------------");
		
		//���� : for�ݺ����� �̿��Ͽ� ������ ���
		
		//�� ���� ���̱� ǥ��
		for(int i=2; i<=9; i++) {
			
			//%6d�� ���������� 6�ڸ����� ��Ÿ��
			System.out.printf("%6d��", i);
	
		}
		System.out.println();
		
			for(int i=1; i<=9; i++) {//�ٱ��� for	��(����) �ݺ�
				
				for(int j=2; j<=9; j++) {//���� for		��(����) �ݺ�		2�ܺ��� 9�ܱ���
					
					//System.out.print(j + "X" + i + "=" + (j*i) + "     ");
					System.out.printf("%d X %d = %2d  ", j,i,(j*i));
					
				}//���� for�ݴ� ��ȣ
				
				//�ϳ��� ���� �ϼ��� �� ���� �ٹٲ� ���
				System.out.println();
				
			}//�ٱ��� for�ݴ� ��ȣ
			
		
			
	System.out.println("-----------------------------------------------------");
	
	/*
	   ���� : ���� for�� ����Ͽ� �Ʒ��� ���� * ���
	 	*
	 	**
	 	***
	 	****
	 	*****
	 
	 */
	
	for(int i=0; i<5; i++) {
		for(int j=0; j<i+1; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	for(int i=1; i<=5; i++) {//5�� �ݺ�
		for(int j=1; j<=i; j++) {//i������ ����� �� ��ŭ �ݺ�
			System.out.print("*");
		}
		System.out.println();
	}
		
	}

}
