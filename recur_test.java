public class recur_test {
    public staic void recur(int i){
        System.out.println("rrecursiv fun is running ...." +i);
        if(i>0)
        recur(i-1);
    }
    public static void main(String args[]){
    recur(6);
   }
}
