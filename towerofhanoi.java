public class towerofhanoi {
    public static void towerofhanoi(int n,char src,char hplr,char dest){
        if(n==1){
            System.out.println("move disk " + n + " from " + src + " to " + dest);
            return;
        }
        towerofhanoi(n-1, src, dest, hplr);
        System.out.println("move disk " + n + " from " + src + " to " + dest);
        towerofhanoi(n-1, hplr,src,dest);
    }
    public static void main(String[] args) {
        
        towerofhanoi(3,'A','B','C');
    }
    
}
