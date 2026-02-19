import java.util.Scanner;
public class string_methods {
   public static void main(String[] args){  
    Scanner sc=new Scanner(System.in);
    // System.out.println("enter name :");
    // String name=sc.nextLine();
    // System.out.println("length of name :" + name.length()); 
    // String name1="thambake";
    // String name2="manoj";
    // String fullname=name1 + name2;
    // for(int i=0;i<fullname.length();i++){
    //     System.out.println(fullname.charAt(i));
    // }
    // if(name1.equals(name2)){
    //     System.out.println("they are equal");
    // }else{
    //     System.out.println("not equal");
    // }
    // System.out.println("enter full name :");
    // String name=sc.nextLine();
    // System.out.println(name.substring(0,5));
    // String str="1234";
    // int number=Integer.parseInt(str);
    // System.out.println(number);
    // System.out.println(((Object)number).getClass().getName());
    // int number=123;
    // String str=Integer.toString(number);
    // System.out.println(str);
    // System.out.println(((Object)str).getClass().getName());
// System.out.println("enter array size :");
// int n=sc.nextInt();
// String array[]=new String[n];
// int totlength=0;
// System.out.println("enter strings:");
// for(int i=0;i<n;i++){
//     array[i]=sc.next();
//     totlength+=array[i].length();
// }System.out.println("total length :" + totlength);
// System.out.println("enter string");
// String name=sc.next();
// String result=" ";
// for(int i=0;i<name.length();i++){
//     if(name.charAt(i) =='e'){
//         result+='i';

//     }else{
//         result+=name.charAt(i);
//     }

// }System.out.println(result);
System.out.println("enter email :");
String email=sc.nextLine();
String username=" ";
for(int i=0;i<email.length();i++){
    if(email.charAt(i)=='@'){
        break;
    }else{
        username+=email.charAt(i);
    }
}System.out.println(username);







    

        
    }
    
}
