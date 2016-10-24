import java.util.Scanner;

class LoginPage
{
private static String Username = "chaithanya";
private static String Password = "manuscript";

public static void main(String[] args)
{
    System.out.println("Enter username");
    Scanner user = new Scanner(System.in);
    String uname = user.nextLine();

    System.out.println("Enter password");
    Scanner pass = new Scanner(System.in);
    String password = pass.nextLine();

    if (uname.equals(Username) && password.equals(Password))
    {
        System.out.println("Logged In Successfuly");
    }
    else {
       System.out.println("Wrong Credentials. Try again");
    }
}
 }