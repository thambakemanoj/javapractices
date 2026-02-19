// class pen {
//     String color;
//     String type;
//     public void property(){
//         System.out.println("Iam writing with " + this.color  + " pen " + "it is " + this.type +" pen ");

//     }

// }
// public class oops{
//     public static void main(String[] args) {
//     pen p1=new pen();
//     p1.color="Red";
//     p1.type="Gel";
//     p1.property();

        
//     }

// }
class student{
    String name;
    int age;
    float gpa;
    public void details(){
        System.out.println("MY name is :" + this.name);
        System.out.println("My age is : " + this.age);
        System.out.println("My gpa is : " + this.gpa);
    }
    // constructor with parameters 
    // student(String name,int age,float gpa){
    //     this.name=name;
    //     this.age=age;
    //     this.gpa=gpa;

    // }
    // copy constructor 
    student(student s2){
        this.name=s2.name;
        this.age=s2.age;
        this.gpa=s2.gpa;
    }
    student(){

    }
    
}
 public class oops{
    public static void main(String[] args) {
        // student s1=new student("manoj",19,9);
        // s1.details();
        // s1.name="manoj";
        // s1.age=19;
        // s1.gpa=9;
        // s1.details();
        // student n=new student();
        // n.name="n student";
        // n.age=0;
        // n.gpa=9;
        // n.details();
        // coppy parameter assigning one object to another 
        student s1=new student();
        s1.name="manoj";
        s1.age=19;
        s1.gpa=9;
        s1.details();
        student s2=new student(s1);
        s2.details();

    }
}
