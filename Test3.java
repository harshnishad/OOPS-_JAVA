import java.util.*;
public class Test3 {
public static void main(String[] args){
	int[][] A = new int [4][0];
	A[0]=new int [712];
	A[1]=new int [71];
	A[2]=new int [7];
	A[3]=A[2];
	A[2][0]=67;
	A[2][1]=100;
	System.out.println(Arrays.toString(A[3]));
	}

}
