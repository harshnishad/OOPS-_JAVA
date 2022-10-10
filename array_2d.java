import java.util.*;
public class array_2d {
    public static void main(String[] args){
        int[][] harsh = new int[10][10];
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        for(int i =0 ; i <limit ; i ++){
            for(int j = 0 ; j< limit ; j++){
            int n = sc.nextInt();
           harsh[i][j]=n;
        }
        
    }
         for(int i =0 ; i < limit ; i ++){
              for(int j =0 ; j<limit;j++){
            
            System.out.print(harsh[i] [j]);
        }
        System.out.println(" ");
    
         }
    }
}
