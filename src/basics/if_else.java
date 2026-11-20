package basics;
import java.util.Scanner;

public class if_else {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to check: ");
    int a = sc.nextInt();
    if(a>=0){
        System.out.println("Number is positive");
    }
    else{
        System.out.println("Number is negative");
    }


    }
}
