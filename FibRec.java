public class FibRec {
    public static void main(String[] args) {
        int n=4;
        System.out.print(fib(n));
    }
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }

        int fn1=fib(n-1);
        int fn2=fib(n-2);
        int n2=fn1+fn2;
        return n2;
    }
}
