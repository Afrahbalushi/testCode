import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;


public class first {

    public static void main(String[] args) throws IOException {


int number1 , number, sum;
String name;
int age;
Scanner sr = new Scanner(System.in);

String[] array = new String[5];
      Stack<Integer> st = new Stack();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());

        for(int i=0; i< array.length; i++){
            System.out.println("please enter your name "+ i );
            array[i]= sr.nextLine();
        }
        for(int i=0; i< array.length; i++){
            System.out.println(array[i]);

        }









    }
}
