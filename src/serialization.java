import java.io.*;
import java.util.Scanner;

class student1 implements Serializable {

    String studentName;
    String studentAddress;
    int studentId;

public static void main(String[] args) {

    //Serializarion
    student1 student = new student1();
//   student.studentName="Afrah Ali";
//   student.studentAddress="Muscat, Amirat";
//   student.studentId=123;

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Student Name");
    student.studentName = sc.nextLine();

    System.out.println("Enter Student Address");
    student.studentAddress = sc.nextLine();

    System.out.println("Enter Student ID");
    student.studentId = sc.nextInt();


   try{
       FileOutputStream file = new FileOutputStream("student.txt");
       ObjectOutputStream out = new ObjectOutputStream(file);
       out.writeObject(student);
       out.close();
       file.close();
       System.out.println("serialized and saved");

   }catch (Exception e){
     e.printStackTrace();

   }

    student1 object1 = null;

    // Deserialization
    try
    {
        // Reading the object from a file
        FileInputStream file = new FileInputStream("student.txt");
        ObjectInputStream in = new ObjectInputStream(file);

        // Method for deserialization of object
        object1 = (student1) in.readObject();

        in.close();
        file.close();

        System.out.println("Object has been deserialized ");
        System.out.println("Student Name:  " + object1.studentName);
        System.out.println("Student Address:  " + object1.studentAddress);
        System.out.println("Student ID:  " + object1.studentId);
    }

    catch(IOException ex)
    {
        System.out.println("IOException is caught");
    }

    catch(ClassNotFoundException ex)
    {
        System.out.println("ClassNotFoundException is caught");
    }

}
}



