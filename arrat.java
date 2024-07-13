public class arrat {

    public static int linearSearch(int num[], int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String args[]){

        int num[]={23,12,43,54,34};
        int key=54;
        int index=linearSearch(num, key);

        if(index==-1){
            System.out.println("not found");
            
        }else {
            System.out.println("index found at =>"+index);
        }
    }
}
