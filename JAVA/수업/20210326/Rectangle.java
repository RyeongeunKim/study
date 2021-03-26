
/*
������ ���� ���(private����,public�޼ҵ�)�� ������ ���簢���� ǥ���ϴ� Rectangle Ŭ������ �ۼ��϶�.

-int Ÿ���� x1,y1, x2,y2(�ʵ�) : �簢���� �����ϴ� ������ ��ǥ
-������ 2�� : �⺻�����ڿ� x1,y1,x2,y2�� ���� �����ϴ� ������
-void set(int x1, int y1, int x2, int y2) : x1,y1,x2,y2��ǥ ����
-int square() : �簢�� ���� ����
-void show() : ��ǥ�� ���� �� ���簢�� ������ ȭ�� ���
-boolean equals(Rectangle r) : ���ڷ� ���޵� ��ü r�� �� ��ü�� ������ ���簢���̸� true ����


//Rectangle�� �̿��� main()�޼ҵ�� ������ ������ ��main()�޼ҵ尡 �� �۵��ϵ����϶�.

public class RectManager {
	public static void main(String args[]) {
				
		Rectangle r = new Rectangle();
	
		System.out.println("�簢��r");
		r.show();
		System.out.println();
	
		System.out.println("�簢��s");
	
		Rectangle s = new Rectangle(1, 1, 2, 3);
		s.show();
	
		System.out.println("�簢��s�� ���� : " + s.square());
		System.out.println();
		System.out.println("�簢��r�� ��ǥ�� (-2,2), (-1,4)�� ����");
		System.out.println();
	
		System.out.println("�簢��r");
	
		r.set(-2, 2, -1, 4);
	
		r.show();
	
		System.out.println("�簢��r�� ���� : " + r.square());
	
		if (r.equals(s)) {
			System.out.println("�� �簢���� ���̴� �����ϴ�.");
		}
	}
}

Ŭ���� ���� 2������  Rectangle.java   RectManager.java

*/



public class Rectangle {
	
	//int Ÿ���� x1,y1, x2,y2(�ʵ�) : �簢���� �����ϴ� ������ ��ǥ
	int x1, y1, x2, y2;
	
	//�⺻������
	public Rectangle() {
		x1 = x2 = y1 = y2 = 0;
	}
	
	//x1,y1,x2,y2�� ������ ���� �����ϴ� ������
	public Rectangle(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
//�޼ҵ�-void set(int x1, int y1, int x2, int y2) : x1, y1, x2, y2 ��ǥ ����
	void set(int n_x1, int n_y1, int n_x2, int n_y2) {
		x1 = n_x1;
		y1 = n_y1;
		x2 = n_x2;
		y2 = n_y2;
	}
	
	//-int square() : �簢�� ���� ����
	public int square() {
		int size = (x1-x2) * (y1-y2); //�������
		if(size < 0) { //������ ������ ��� ����� ����� ��
			size = -size;
		}
		return size;
	}
	//-void show() : ��ǥ�� ���� �� ���簢�� ������ ȭ�� ���
	public void show() {
		System.out.print("�簢���� ��ǥ��(");
		System.out.print(x1 + "," + y1 + "),(");
		System.out.println(x2 + "," + y2 + ")�Դϴ�.");
	}
	//-boolean equals(Rectangle r) : 
	//���ڷ� ���޵� ��ü r�� �� ��ü�� ������ ���簢���̸� true ����
	public boolean equals(Rectangle x) {
		
		//x�Ű������� ���޹޴� �簢�� s��ü�� ���α���
		int width1 = (x.x1>x.x2?(x.x1-x.x2):x.x2-x.x1); 
		//this(�簢�� r��ü)�� ���α���
		int width2 = (x1>x2?(x1-x2):(x2-x1));
		
		//x�Ű������� ���޹޴� �簢�� s��ü�� ���α���
		int height1 = (x.y1>x.y2?(x.y1-x.y2):x.y2-x.y1); 
		//this(����� r��ü)�� ���α���
		int height2 = (y1>y2?(y1-y2):(y2-y1));
		
		//width1(�簢��s) ���α��̿� width2(�簢��r) ���α��̰� ����,
		//height1(�簢��r) ���α��̿� height2(�簢��s) ���α��̰� ��� ���� ��
		//�λ簢���� ���̰� ������?
		if(width1 == width2 && height1 == height2) {
			return true;
		}
		//�ٸ���?
		return false;
	}//equals�޼ҵ� ��

}//RectangleŬ���� ��
	

