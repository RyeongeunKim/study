
public class SongManager {
	public static void main(String args[]) {
		
		//ABBA�� "Dancint Queen" �뷡�� Song��ü�� �����ϰ�
		String[] a = {"Benny Andersson", "Bjorn Ulvaeus"};

		Song s = new Song("Dansing Queen", "ABBA", "Arrival", a, 1977, 2);
		
//		Song s = new Song("Dansing Queen", 
//							"ABBA", 
//							"Arrival", 
//							new String[] {"Benny Andersson", "Bjorn Ulvaeus"},  
//							1977, 
//							2);
		
		//show()�� �̿��Ͽ� �̳뷡�� ������ ����ϴ� ���α׷��� �ۼ��϶�.
		s.show();
		
	}
}
