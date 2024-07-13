public class LargestSmallest {
    public static int getLargest(int number[]){
        int largest=Integer.MIN_VALUE;  //-infinity
        int smallest=Integer.MAX_VALUE;

        for(int i=0;i<number.length;i++){
            if(largest<number[i]){
                largest=number[i];
            }

            if(smallest>number[i]){
                smallest=number[i];
            }
        }
        System.out.println("smalles" + smallest);
        return largest;

    }

    public static void main(String args[]){
        int number[]={32,43,65,12,54,51};
        System.out.println("number"+ getLargest(number));

    }
    
}
