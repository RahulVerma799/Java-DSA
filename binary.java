public class binary {
    public static void main(String args[]){
        int num[]={12,43,54,21,76,85,23,55};
        int key=23;
        System.out.println(binarySearch( num,key));

    }
    public static int binarySearch(int num[],int key){
       int start=0;
       int end=num.length-1;

       while(start<=end){
        int mid=(start+end)/2;

          if(num[mid]==key){
            return mid;
          }
          if(num[mid]<key){
            start = mid+1;
          }
          else {
            end =mid-1;
          }
       }
       return -1;

    }
    
}
