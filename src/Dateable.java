import java.util.Scanner;
public class Dateable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age:"); // ask for age
        int age = scanner.nextInt();
        int date = (age/2)+7; //ask calculate the lowest age the person should date
        System.out.println(age + " year olds should date somebody who is at least " + date + " years old.");
    }
}
