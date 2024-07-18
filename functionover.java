public class functionover {
    public static void main(String args[]){
        calculator c1=new calculator();
        System.out.println(c1.sum(23, 12));
        System.out.println(c1.sum((float)23.4,(float) 44.5));
        System.out.println(c1.sum(12, 45, 98));
    }
}
class calculator{
    int sum(int a,int b){
        return a+b;
    }

    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}
