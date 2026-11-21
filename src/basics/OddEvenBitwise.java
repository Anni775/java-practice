package basics;
import java.util.Scanner;
public class OddEvenBitwise {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a number to check: ");
    int num = sc.nextInt();
    if((num & 1) == 1){
        System.out.println("number is odd");
    }
    else{
        System.out.println("number is even");
    }
    }
}
