import java.util.*;

public class BitoddorEven {
    public static void oddeven(int n){
        int bitt=1;
        if((n & bitt)==0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
    }

    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the nummber");
        int n=obj.nextInt();
        oddeven(n);
    }
}
