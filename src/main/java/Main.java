import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the input string?");
        String string = scanner.nextLine();
        int length = string.length();
        System.out.println(string+" has "+length+" characters.");



    }
}
