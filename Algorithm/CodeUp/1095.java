import java.util.*;

class Main {  
  public static void main(String args[]) { 
    Scanner sc = new Scanner(System.in);

    int min=0;
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
      arr[i] = sc.nextInt();
      if(i == 0){
        min = arr[i];
      } else if(min>arr[i]){
        min = arr[i];
      }
    }
    System.out.print(min);
  } 
}