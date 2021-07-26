import java.util.*;
class Main {  
  public static void main(String args[]) { 
	  Scanner sc = new Scanner(System.in);
	  int[][] map = new int[11][11];
	  int x=2, y=2;

	  for(int i=1; i<=10; i++){
	  	for(int j=1; j<=10; j++){
			map[i][j] = sc.nextInt();
		}
	  }

	  while(map[x][y] != 2){
		  map[x][y] = 9;
		  if(map[x][y+1] != 1) y++;
		  else if(map[x+1][y] != 1) x++;
		  else break;
	  }
	  map[x][y] = 9;
	  
	  for(int i=1; i<=10; i++){
		  for(int j=1; j<=10; j++){
			System.out.printf("%d ", map[i][j]);
		}
		System.out.println();
	  }
  } 
}