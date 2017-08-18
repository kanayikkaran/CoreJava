package pkg01;

import java.io.*;
import java.util.*;

public class Problem01 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());
        String A = in.nextLine();
        System.out.println("A="+A);
        String[] AN = new String[N];
        AN = A.split(" ");
        System.out.println("N="+N);
        System.out.println("AN.len="+AN.length);
        for(int i=N-1; i>=0; i--)
        {
           System.out.print(AN[i]+ " ");
        }
        in.close();
    }
}
