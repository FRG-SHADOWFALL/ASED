import java.util.Date;
import java.util.Scanner;
public class Main {
    public static int x = 5;
    public static Date now= new Date();
    
    public static void main(String[] args){
        Scanner INP = new Scanner(System.in);
        //String name = INP.next();
        //System.out.println("Hello World");
        while(x==5){
        System.out.print("Enter Name: ");
        String name = INP.nextLine();
        System.out.println("Your Name is "+name);
        }   
    }
    
}
