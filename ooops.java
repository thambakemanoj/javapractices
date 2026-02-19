// // Parent class
// class Animal {
//     void sound() {
//         System.out.println("Animal makes a sound");
//     }
// }

// // Child class
// class Dog extends Animal {
    
//     void sound() {
//         System.out.println("Dog barks");
//     }
// }
// class pig extends Animal{
//     void sound(){
//         System.out.println("Pig barks");
//     }
// }

// // Main class
// public class ooops {
//     public static void main(String[] args) {
//         Animal a = new Dog(); // polymorphism
//         a.sound(); 
//         Animal b= new pig();
//         b.sound();           // calls Dog's sound()
//     }
// }
// inheritance is defined as taking other class propertiess and methods eg
class shape{
    String color;
    String type;
}
class circle extends shape{
    void color(){
        System.out.println("My color is : " + this.color);
    }

}
public class ooops{
    public static void main(String[] args) {
        circle c1=new circle();
        c1.color="orange";
        c1.color();
        c1.type="pencil";
        System.out.println(c1.type);
    }
    

}




