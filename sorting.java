import java.util.Scanner;
public class sorting {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("array size:");
        int n =sc.nextInt();
        System.out.println("enter elements of given size:");
        int myarray[]=new int[n];
        for(int i=0;i<n;i++){
            myarray[i]=sc.nextInt();

        }
        for(int i=0;i<myarray.length-1;i++){
            for(int j=0;j<myarray.length-i-1;j++){
                if(myarray[j]<myarray[j+1]){
                    int temp=myarray[j];
                    myarray[j]=myarray[j+1];
                    myarray[j+1]=temp;
                }
            }
        }System.out.println("sorted array:");
        for(int i=0;i<myarray.length;i++){
            System.out.println(myarray[i] +  " ");
        }
        

        
        
    }

    
}
