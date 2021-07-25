import java.util.*;
class Main {  
  public static void main(String args[]) { 
	  Scanner sc = new Scanner(System.in);
	  int h = sc.nextInt();
	  int w = sc.nextInt();
	  int[][] map = new int[h+1][w+1];
	  int n = sc.nextInt();

	  for(int i=0; i<n; i++){
		  int l = sc.nextInt();
		  int d = sc.nextInt();
		  int x = sc.nextInt();
		  int y = sc.nextInt();
		  
		  if(d==0) // 가로
		  {
			  for(int j=0; j<l; j++){
				  map[x][y+j]=1;
			  }
		  }
		  else // 세로
		  {
			  for(int j=0; j<l; j++){
				  map[x+j][y]=1;
			  }
		  }
	  }

	  for(int i=1; i<=h; i++){
		  for(int j=1; j<=w; j++){
			  System.out.print(map[i][j] + " ");
		  }
		  System.out.println();
	  }
  } 
}