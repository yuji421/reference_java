import java.util.Scanner;

/**
 * Q4_RefMethod
 * メソッドにオブジェクトを渡すと、その中身が変更されることを確認。
 */

//同一ファイル内なのでpublic不要
class User {
    String name;
}

public class Q04_RefMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User u = new User();

        System.out.print("名前を入力: ");
        u.name = sc.nextLine();

        changeName(u);

        System.out.println("変更後の名前: " + u.name);
        sc.close();
    }

    // publicは同クラス内なのであってもなくても
    public static void changeName(User user) {
        user.name = "変更されました";
    }
}
