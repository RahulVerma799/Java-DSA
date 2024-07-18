public class SumRecNnatral {
    public static void main(String[] args) {
        int n=5;
        System.out.print(sumOfN(n));

    }
    public static int sumOfN(int n){
        if(n==1){
            return 1;
        }
        int x=sumOfN(n-1);
        int y=n+x;
        return y;
    }
}
