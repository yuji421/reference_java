import java.util.Scanner;

/**
 * Q06_StringBuilder
 * StringBuilderは可変なので、メソッドで変更した内容が本体に反映される。
 */
public class Q06_StringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("文字列を入力: ");
        String input = sc.nextLine();

        StringBuilder sb = new StringBuilder(input);
        appendText(sb);
        System.out.println("変更後: " + sb.toString());
        sc.close();
    }

    public static void appendText(StringBuilder sb) {
        sb.append(" - appended");
    }
}
