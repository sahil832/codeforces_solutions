import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.*;
import java.lang.*;
import java.io.*;
public class codeforces_round_786_C {

  static BufferedReader br;
  static PrintWriter out;
  static StringTokenizer st;
  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    out = new PrintWriter(new OutputStreamWriter(System.out));
    int z=nextInt();
    while(z-->0){
        String s=next();
        String t=next();
        double sa=0;
        int ta=0;
        for(int i=0;i<s.length();i++){
             if(s.charAt(i)=='a'){
                 sa++;
             }
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='a'){
                ta++;
            }
       }
       if(ta>1||(ta==1&&t.length()>1)){
           System.out.println(-1);
           continue;
       }
       if(ta==1){
               System.out.println(1);
               continue;
           
       }
       if(ta==0){
           long ans=(long)Math.pow(2, sa);
           System.out.println(ans);
       }
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








