import java.util.Scanner;
public class Pages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your age:");
        int age = scanner.nextInt();
        int pages = 100 - age;
        System.out.println(age + " year olds should read at least " + pages + " page(s) before giving up on a book.");

    }
}
