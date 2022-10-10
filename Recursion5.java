public class Recursion5 {
    public static int calcPower(int x, int n){
     if (n == 0){
        return 1;

     }
     if(x == 0){
      
      
        return 1;
     }
     
        int xpow1 = calcPower(x, n-1);
        int xpow =x * xpow1;
        return xpow;
    }
    public static void main(String args[]){
     int x = 2, n = 5;
     int ans = calcPower(x ,n);
    System.out.println(ans );
    }
    
}
