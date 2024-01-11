//https://codeforces.com/problemset/problem/1768/B
//TC: O(n)
//SC: O(1)

//
import java.util.*;

public class quick_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cases=sc.nextInt();
        for(int i=0;i<cases;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int count=0;
            for(int j=0;j<x;j++){
            if(sc.nextInt()==count+1)
            count++;}
            System.out.println(Math.ceilDiv(x-count, y));
        }
    }
}
