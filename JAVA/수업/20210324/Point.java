
//Ŭ���� ���赵
public class Point {
	
	//����
	int x, y;
	
	//�⺻������
	Point() {
		System.out.println("Point�⺻������ ȣ���");
		x = 2;
		y = 2;
	}
	//x������ ���� �Ű������� ���޹޾� �ʱ�ȭ�� ������
	Point(int n_x) {
		x = n_x;
	}
	//x,y������ ���� �Ű������� ���޹޾� �ʱ�ȭ�� ������
	Point(int n_x, int n_y){
		x = n_x;
		y = n_y;
	}
	//x������ ���� �Ű������� ���޹޾� �ʱ�ȭ�� �޼ҵ�
	void setX(int n_x) {
		x = n_x;
	}
	//y������ ���� �Ű������� ���޹޾� �ʱ�ȭ��(������) �޼ҵ�
	void setY(int n_y) {
		y = n_y;
	}
	//x������ ����� ���� ����(��ȯ,����)���ִ� �޼ҵ�
	int getX() {
		return x;
	}
	//y������ ����� ���� ����(��ȯ,����)���ִ� �޼ҵ�
	int getY() {
		return y;
	}
	//x����, y������ ���� ����� ���� ������ִ� ����� �޼ҵ�
	void prn() {
		System.out.println("��� x, y : " + x + ", " + y);
	}
	
}//PointŬ���� ��
