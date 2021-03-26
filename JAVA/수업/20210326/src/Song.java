/*
�뷡�� ��Ÿ���� Song�̶�� Ŭ������ �����϶�. 

Song Ŭ������ ������ ���� �������(�ν��Ͻ�����) �����´�
��� ���������к����� �����
-�뷡�� ������ ��Ÿ���� title
-������ ��Ÿ���� artist
-�뷡�� ���� �ٹ� ������ ��Ÿ���� album
-�뷡�� �۰�� ��Ÿ���� composer,�۰�� ������ �������ִ�.<-�迭��������
-�뷡�� ��ǥ�� ������ ��Ÿ���� year
-�뷡�� ���� �ٹ������� Ʈ����ȣ�� ��Ÿ���� track

�����ڴ� �⺻�����ڿ� ����ʵ带 �ʱ�ȭ�ϴ� �����ڸ� �ۼ��ϰ�,
�뷡�� ������ ȭ�鿡 ����ϴ� show()�޼ҵ嵵 �ۼ��϶�.

ABBA�� "Dancint Queen" �뷡�� Song��ü�� �����ϰ�
show()�� �̿��Ͽ� �̳뷡�� ������ ����ϴ� ���α׷��� �ۼ��϶�.

Ŭ����2��(Song.java , SongManger.java)

*/

public class Song {
	
	private String title;
	private String artist;
	private String album;
	private String[] composer; //�۰�� ������ ���� �� �ִ�. �迭��������
	private int year;
	private int track;
	
	//�⺻������
	public Song() {
		title = null;
		artist = null;
		album = null;
		composer = null;
		year = 0;
		track = 0;
	}
	
	//����ʵ带 �ʱ�ȭ�ϴ� ������
	public Song(String title, String artist, String album, String[] composer, int year, int track) {
		
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	
	void show() {
//		
//		-��°��-
//		�뷡 ����:Dansing Queen
//		����:ABBA
//		�ٹ�:Arrival
//		�۰:Benny Andersson,Bjorn Ulvaeus
//		�⵵:1977
//		Ʈ�� ��ȣ:2
//		
		System.out.println("�뷡 ����: " + title);
		System.out.println("����: " + artist);
		System.out.println("�ٹ�: " + album);
		System.out.print("�۰: ");
		//�۰ ��ŭ �ݺ�
		for(int i =0 ; i < composer.length; i++) {
			System.out.print(composer[i]);
			//�۰ ���� ������ ������ �����ٷ�..
			if(i+1 == composer.length) 
				System.out.println();
			else //�۰�� ������
				System.out.print(",");
		}//for
		System.out.println("�⵵: " + year);
		System.out.println("Ʈ�� ��ȣ: " + track);
		
	}
	
}


