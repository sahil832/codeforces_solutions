import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.*;
import java.lang.*;
import java.io.*;
public class codeforces_round_786_B {

  static BufferedReader br;
  static PrintWriter out;
  static StringTokenizer st;
  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    out = new PrintWriter(new OutputStreamWriter(System.out));
    int t=nextInt();
    while(t-->0){
        String s=next();
        int n=s.charAt(0)-'a';
        int ans=n*25;
        int m=s.charAt(1)-'a'+1;
        n=n+1;
        if(m>n){
            ans=ans+m-1;
        }
        else{
            ans=ans+m;
        }
        System.out.println(ans);
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








