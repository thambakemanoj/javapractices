public class recursion {
    // static void fib(int a,int b,int n ){
    //     if (n==0) {
    //         return;
            
    //     }
    //     int c=a+b;
    //     System.out.print(c + " ");
    //     fib(b,c,n-1);
    // }
    // public static void main(String[] args) {
    //    int n=7;
    //    int a =1;
    //    int b=0;
    //    System.out.print(a+ " ");
    //    System.out.print(b+ " ");
    //    fib(a,b,n-2);

    // }
    // static void nums(int n){
    //     if(n==6){
    //         return;
            
    //     }
    //     System.out.println(n);
    //     nums(n+1);

    // }
    // public static void main(String[] args) {
    //     int n=1;
    //     nums(n);
    // }
    // static void sumofn(int n,int sum){
    //     if(n==10){
    //         System.out.println(sum);
    //         return;
    //     }
    //     sum+=n;
    //     sumofn(n+1, sum);
    // }
    // public static void main(String[] args) {
        
    //     sumofn(5,0);
    // }
    static void factofn(int n,int fact){
        if(n==0){
            System.out.println(fact);
            return;
        }
        fact*=n;
       
        factofn(n-1, fact);
    }
    public static void main(String[] args) {
        factofn(5, 1);
    }
}
        
            
        

    
    


    
    


    




    

