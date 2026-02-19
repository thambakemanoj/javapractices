public class reversestring {
    public static void revstring(String str,int idx){
        if(idx==0){
            System.out.println(str.charAt(idx));
            return;
        }System.out.println(str.charAt(idx));
        revstring(str, idx-1);
    }
    public static void main(String[] args) {
        String str="manoj";
        
        revstring(str,str.length()-1);
    }
    
}
