// import java.util.Scanner;
// public class sample {

//    public static void main(String[] args) {
//       Scanner myobj=new Scanner(System.in);
//       String username;
//       System.out.println("enter username:");
//       username=myobj.nextLine();
//       System.out.println("username is : " + username);
//    }
// }
import java.util.Scanner;
public class input{
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter your age : ");
      int age=sc.nextInt();
      System.out.println("enter your gpa :");
      float gpa= sc.nextFloat();
      sc.nextLine();
      
      System.out.println("enter your name :");
      String name=sc.nextLine();
      
      System.out.println("gpa is : " +gpa);
      System.out.println("age is : " +age);
      System.out.println("name is : " +name);
      sc.close();
   }

}