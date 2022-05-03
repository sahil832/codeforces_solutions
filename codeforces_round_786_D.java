import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.*;
import java.lang.*;
import java.io.*;
public class codeforces_round_786_D {

  static BufferedReader br;
  static PrintWriter out;
  static StringTokenizer st;
  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    out = new PrintWriter(new OutputStreamWriter(System.out));
    int t=nextInt();
    while(t-->0){
        int n=nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=nextInt();
        }
        boolean mood=false;
        if(n%2==1){
            int min=arr[0];
            int max=min;
            for(int i=1;i<n;i=+2){
                int a=arr[i];
                int b=arr[i+1];
                if(min>=Math.min(a,b)||max>=Math.max(a,b)){
                    mood=true;
                    break;
                }
                else{
                    min=Math.min(a,b);
                    max=Math.max(a,b);
                }
            }
        }
        if(n%2==0){
            int min=Math.min(arr[0],arr[1]);
            int max=Math.max(arr[0],arr[1]);
            for(int i=2;i<n;i=+2){
                int a=arr[i];
                int b=arr[i+1];
                if(min>=Math.min(a,b)||max>=Math.max(a,b)){
                    mood=true;
                    break;
                }
                else{
                    min=Math.min(a,b);
                    max=Math.max(a,b);
                }
            }
        }
        if(mood)System.out.println("no");
        if(!mood)System.out.println("yes");
    }
    out.close();
  }

  static String next() throws IOException {
    while (st == null || !st.hasMoreTokens())
      st = new StringTokenizer(br.readLine().trim());
    return st.nextToken();
  }

  static long nextLong() throws IOException {
    return Long.parseLong(next());
  }

  static int nextInt() throws IOException {
    return Integer.parseInt(next());
  }

  static double nextDouble() throws IOException {
    return Double.parseDouble(next());
  }

  static char nextCharacter() throws IOException {
    return next().charAt(0);
  }

  static String nextLine() throws IOException {
    return br.readLine().trim();
  }
}








