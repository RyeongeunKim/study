
public class Test38 {

	public static void main(String[] args) {
		//�迭 ����1
		
		//4����Ʈ ũ���� ���������� ������ �迭 �޸� ���� ��
		//������ �迭�޸��� �ּҰ��� ������ score��� �̸��� ���������
		
		int[] score = new int[5];
		
		//score������ ����� �迭�� �� �ε��� ��ġ�� �����Ͽ� ������ ���� ����
		//0�ε�����ġ -> 95����
		//1�ε�����ġ -> 70����
		//2�ε�����ġ -> 80����
		//3�ε�����ġ -> 75����
		//4�ε�����ġ -> 100����
		
		score[0] = 95;
		score[1] = 70;
		score[2] = 80;
		score[3] = 75;
		score[4] = 100;
		
		//for�ݺ��� �̿��Ͽ� score������ ����� �迭�޸��� ũ�⸸ŭ �ݺ��ؼ�
		//������ �ε��� ��ġ�� ����� �����͵��� ��� ���
		
		for(int i=0; i<5; i++) {
			System.out.println((i+1) + "���л� score[" + i + "] = " + score[i]);
		}
		
		//�������
//		
//		1���л� score[0] = 95
//		2���л� score[1] = 70
//		3���л� score[2] = 80
//		4���л� score[3] = 75
//		5���л� score[4] = 100
		
		
		
		

	}

}