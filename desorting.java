import java.util.Scanner;

public class desorting {
    public static void main(String[] args) {
        
               Scanner sc = new Scanner(System.in);
                 int test= sc.nextInt();
            
             while (test>0){
                int m = sc.nextInt();
                int[] a = new int[m];
                    for(int i = 0; i<m; i++) 
                    a[i]=sc.nextInt();
                    
         int d=Integer.MAX_VALUE,c=0;
         
             for(int i = 1; i<m; i++) {
                 if(a[i]>=a[i-1]){
                     c++;
                 }
             }
             if(c!=m-1){
                 System.out.println("0");
             }
             else{
             for(int i = 1; i<m; i++) {
                 if(a[i]-a[i-1]<d)
                 d=a[i]-a[i-1];
             }
             System.out.println((d/2)+1);
             test--;
             }		
                
                 
                 
                 
             
        }
}
}
