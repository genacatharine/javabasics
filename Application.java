// public class Application {
//
//   public static void main(String [] args){
//     int myNumber;
//     myNumber = 88;
//
//     double myDouble=3.1452;
//     float myFloat =324.4f; //take up less memory and are faster than double
//
//     char myChar = 'y';
//     boolean myBoolean = true;
//
//     byte myByte = 127; //space it will take up
//
//     String s1 = new String("Who let the dogs out?");
//
//     System.out.println(myNumber);
//     System.out.println(myDouble);
//     System.out.println(myFloat);
//     System.out.println(myChar);
//     System.out.println(myBoolean);
//     System.out.println(myByte);
//     System.out.println(s1);
//   }
// }
// public class Application {
//   public static void main(String[] args) {
//     String text = "Hello";
//     String blank = " ";
//     String name= "Bob";
//     String greeting = text + blank + name; //you can concatenate Strings
//     System.out.println(greeting); //semicolons are important!
//   }
// }
public class Application {
  public static void main(String[] args) {
    int value = 0;

    while(value < 10){
          System.out.println("Hello"+ value);
          value = value + 1;
    }

  }
}
