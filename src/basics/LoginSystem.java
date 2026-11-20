package basics;
import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        String correctUser = "aniket";
        String correctPass = "java123";

        Scanner sc = new Scanner(System.in);
        System.out.print("Username: ");
        String user = sc.nextLine();
        System.out.print("Password: ");
        String pass = sc.nextLine();

        boolean userOk = user.equals(correctUser);
        boolean passOk = pass.equals(correctPass);

        if (userOk && passOk) {
            System.out.println("Login successful");
        } else if (userOk) {
            System.out.println("Password is not correct");
        } else if (passOk) {
            System.out.println("Username is not correct");
        } else {
            System.out.println("Invalid credentials");
        }
        sc.close();
    }
}
