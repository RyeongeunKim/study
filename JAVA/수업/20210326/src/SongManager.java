
public class SongManager {
	public static void main(String args[]) {
		
		//ABBA의 "Dancint Queen" 노래를 Song객체로 생성하고
		String[] a = {"Benny Andersson", "Bjorn Ulvaeus"};

		Song s = new Song("Dansing Queen", "ABBA", "Arrival", a, 1977, 2);
		
//		Song s = new Song("Dansing Queen", 
//							"ABBA", 
//							"Arrival", 
//							new String[] {"Benny Andersson", "Bjorn Ulvaeus"},  
//							1977, 
//							2);
		
		//show()를 이용하여 이노래의 정보를 출력하는 프로그램을 작성하라.
		s.show();
		
	}
}
