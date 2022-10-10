import java.util.*;
public class Recursion3 {
    public static int facto(int n){
if(n == 1 || n == 0){
    return 1;
}
int fact_nm1 = facto(n-1);
int fact_n =fact_nm1*n;
return fact_n;

}
    public static void main(String args[]){
    int n = 5;
    int ans = facto(n);
    System.out.println(ans);
    }
    
} 
