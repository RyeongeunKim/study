
public class Test {
	
	public static void main(String[] args){
		String str = "a";
		System.out.println("변경전 : "+str);
		
		System.out.println(str.toUpperCase());
		
		System.out.println("변경후 :"+str);
		
		StringBuffer strBuf = new StringBuffer();
		
		strBuf.append("1234");
		System.out.println(" 변경전  : "+strBuf);
		
		System.out.println( strBuf.reverse() );
		
		System.out.println(" 변경후  : "+strBuf);
		
		
	}
   
}
