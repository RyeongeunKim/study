import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {  
  public static void main(String args[]) throws IOException { 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String cycle[] = br.readLine().split(" ");
    int a = Integer.parseInt(cycle[0]);
    int b = Integer.parseInt(cycle[1]);
    int c = Integer.parseInt(cycle[2]);
    int day = 1;

    while(day%a!=0||day%b!=0||day%c!=0){
      day++;
    }

    bw.write(day+"\n");

    bw.flush();
    bw.close();
    br.close();

  } 
}