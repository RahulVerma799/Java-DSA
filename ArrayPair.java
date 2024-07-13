public class ArrayPair {
    public static void printpair(int num[]){

        for(int i=0;i<num.length;i++){
            int curr=num[i];
            for(int j=i+1;j<num.length;j++){
                System.out.print("("+curr + "," +num[j] +")"+",");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int num[]={23,45,67,98,11,23,56,43,56,76,89,7,76,54,34};
        printpair(num);
    }
    
}
