public class DecnmRec {
    public static void printDec(int n){
        if(n==1000){
            System.out.println(1);
            return;
        }
        System.out.print(n + " ");
        printDec(n+1);
    }
    public static void main(String[] args) {
        int n=900;
        printDec(n);
    }
}
