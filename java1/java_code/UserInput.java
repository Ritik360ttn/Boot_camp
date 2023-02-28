import java.util.Scanner;

public class UserInput {

    public UserInput() {

        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String s;
        System.out.println("Enter a Text and Types XDONEcto quit:");

        while (true) {

            s = scan.nextLine();

            if (s.equalsIgnoreCase("XDONE")) {
                break;
            }
            sb.append(s);
            sb.append("\n");
        }

        System.out.println("Enter tetxt is :" + sb);

    }

    public static void main(String[] args) {


        UserInput u = new UserInput();

    }
}
