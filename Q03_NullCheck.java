import java.util.Scanner;

/**
 * Q3_NullCheck
 * nullが代入された場合、length() を呼ぶと例外が出ることを確認。
 */
public class Q03_NullCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = null;

        System.out.print("文字列を入力（空欄でEnterするとnull扱い）: ");
        String temp = sc.nextLine();
        if (!temp.isBlank()) {
            input = temp;
        }

        try {
            System.out.println("文字数: " + input.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException 発生！"); //null.length()は参照先がないためエラーが出る
        }
        sc.close();
    }
}

