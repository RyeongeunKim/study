//����3
/*���ڿ��� ������ ��ȯ�ҋ� �߻��ϴ�..
 *  NumberFormatException�� ó���ϴ� ���α׷��� �ۼ��϶�.*/
public class Test3 {
	public static void main(String[] args) {

		String[] stringNumber = { "23", "12", "998", "3.141592" };

		for (int i = 0; i < stringNumber.length; i++) {

			int j = Integer.parseInt(stringNumber[i]);
			
			System.out.println("���ڷ� ��ȯ�� ����  " + j);
		}

	}

}
//������
//���ڷ� ��ȯ�� ���� 23
//���ڷ� ��ȯ�� ���� 12
//���ڷ� ��ȯ�� ���� 998
//������ ��ȯ�� �� �����ϴ�.