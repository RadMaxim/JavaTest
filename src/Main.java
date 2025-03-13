import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main implements CheckEmail {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please, enter your data....");
            String data = scanner.nextLine();
    }

    @Override
    public String checkEmail(String data) {
        if (!data.endsWith("mail.ru"))return "Error";
        return "";
    }
}