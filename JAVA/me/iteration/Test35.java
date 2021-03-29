package iteration;
public class Test35 {

	public static void main(String[] args) {
		//���� ��������1 : 1���� 20������ ���� �߿���.. 2 �Ǵ� 3�� ����� �ƴ� ���� ������ ���Ͻÿ�.
		
		//1. ����(����)�� ������ sum���� ����
		
		int sum = 0;
		
		//2. for�ݺ����� �̿��Ͽ� 1���� 20���� �ݺ�
		//   i�� 2�Ǵ� 3�� ����� �ƴ� ���� sum������ i������ ����� �� ����
		
		for(int i=1; i<=20; i++) {
			if(i % 2 != 0 && i % 3 != 0) {
				sum += i;
			}
		}
		
		//3. sum������ ����� �� ���
		//��°��
		//73
		
		System.out.println(sum);
		
		System.out.println("---------------------------------------------------");
		
		//���� ��������2 : �ΰ��� �ֻ����� ������ �� ���� ���� 6�� �Ǵ� ��� ����� ���� ����ϴ� ���α׷� �ۼ�
		//��Ʈ) for�ݺ����� ��ø�ؼ� 1���� 6���� �ݺ��ϸ鼭 �� ���� ���� 6�� ��츦 ȭ�鿡 ���
		// ��°�� 
//		1 + 5 = 6
//		2 + 4 = 6 
//		3 + 3 = 6
//		4 + 2 = 6
//		5 + 1 = 6
		
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				if(i + j == 6) {
					System.out.println(i + "+" + j + "=" + (i+j));
				}
			}
		}
		
		System.out.println("--------------------------------------------------------");
		
		//���� ��������3 : ������ 2x + 4y = 10�� ��� �ظ� ���Ͻÿ�
		//	  			��, x�� y�� �����̰� ������ ������
		// 				0 <= x <= 10
		//				0 <= y <= 10 �̴�.
		
		//������
		// x = 1, y = 2
		// x = 3, y = 1
		// x = 5, y = 0
		
		// ��Ʈ) for�ݺ����� ��ø�ؼ� 0���� 10���� 1�� ������Ű�鼭 ������.
		//		�ݺ��������� ������ 2x + 4y = 10�� ������Ű�� ��쿡�� x�� y�� ���� ����ϸ� �ȴ�.
		
		for(int x=0; x<=10; x++) {
			for(int y=0; y<=10; y++) {
				if(2 * x + 4 * y == 10) {
					System.out.println("x = " + x + ", y = " + y);
				}
			}
		}
		

		
	
		

	}

}