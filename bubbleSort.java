public class bubblesort {
    public static void bubblesort(int num[]){
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length-1-i;j++){
                if(num[i]>num[i+1]){
                    int temp=num[i];
                    num[i]=num[i+1];
                    num[i+1]=temp;
                }
            }
        }
    }

    public static void main(String args[]){
        int num[]={21,43,56,76,43,76};
    }
}
