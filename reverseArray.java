public class reverseArray {

    public static void ReverseArr(int num[]){
        int first=0;
        int last=num.length-1;

        while(first<=last){
            int temp=num[last];
            num[last]=num[first];
            num[first]=temp;

            first++;
            last--;
        }
    }

    public static void main(String args[]){
        int num[]={23,54,65,89,77,12};
        ReverseArr(num);

        for(int i=0;i<=num.length;i++){
            System.out.print (num[i] + " ");
        }
        System.err.println();
    }
    
}
