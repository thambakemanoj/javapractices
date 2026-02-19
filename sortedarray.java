public class sortedarray {
    public static boolean incrarry(int arr[],int idx){
        if(arr[idx]==arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            
            return incrarry(arr, idx+1);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,6};
      
        System.out.println(incrarry(arr, 0));
       
    }
    
}
