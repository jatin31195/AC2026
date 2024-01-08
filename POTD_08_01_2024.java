import java.util.*;

public class POTD_08_01_2024 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            String s;
            s=sc.next();
            char max=s.charAt(0);
            if (s.length() == 2) {
                    char digit1 = s.charAt(0);
                    char digit2 = s.charAt(1);
    
                    if (digit1 > digit2) {
                        max=digit1;
                    } else {
                        max=digit2;
                    }
                }
                else{
            
            
            for(int j=1;j<s.length()-1;j++){
                
                if(s.charAt(j)<max){
                    max=s.charAt(j);
                }
            }}
            System.out.println(max);
        }
    }
}
