import java.util.Scanner;
public class arrays {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter size :");
    int n=sc.nextInt();
    System.out.println("enter elements of given size ");
   int numbers[]=new int[n];
   
    for(int i=0;i<n;i++){
        numbers[i]=sc.nextInt();
    }
    System.out.println("enter a element to find:");
    int x=sc.nextInt();
    for(int i=0;i<numbers.length;i++){
        if(numbers[i]==x){
            System.out.println("element found at index :" +i);
        }
        
    }
// System.out.println("enter number of names:");
// int n=sc.nextInt();
// sc.nextLine();
// System.out.println("enter names of given size:");
// String names[]=new String[n];
// for(int i=0;i<n;i++){
//     names[i]=sc.nextLine();
// }
// for(int i=0;i<names.length;i++){
//     System.out.println(names[i] +" at index :" +i);
    
// };
// System.out.println("enter number of rows :");
// int rows=sc.nextInt();
// System.out.println("enter number of coloums:");
// int coloums=sc.nextInt();
// System.out.println("enter elements :");
// int[][] numbers=new int[rows][coloums];



// for(int i=0;i<rows;i++){
//     for(int j=0;j<coloums;j++){
//         numbers[i][j]=sc.nextInt();
//     }
// }
// System.out.println("enter element to search:");
// int x=sc.nextInt();

// for(int i=0;i<rows;i++){
//     for(int j=0;j<coloums;j++){
//         if(numbers[i][j]==x){
//             System.out.println("element found at index:" + i + " "+ j + " ");
//         }
//     }




    

    // }
    
}
}