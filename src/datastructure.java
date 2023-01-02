import java.io.IOException;
import java.util.Scanner;

public class datastructure {

    public static void main(String[] args) throws IOException {

        // Array Example

        int[] priceOfPen= new int[5];
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Numbers of pens: ");
        for(int i=0;i<priceOfPen.length;i++)
            priceOfPen[i]=in.nextInt();

        for(int i=0;i<priceOfPen.length;i++)
            System.out.print(priceOfPen[i]+" ");


    }
}
