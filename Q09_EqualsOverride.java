import java.util.Scanner;

/**
 * Q09_EqualsOverride
 * equalsをオーバーライドして、内容比較ができるようにする。
 */
class Book {
    String title;
    Book(String title) {
        this.title = title;
    }

    //要確認
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book b) {
            return this.title.equals(b.title);
        }
        return false;
    }
}
public class Q09_EqualsOverride {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("本のタイトル1: ");
        String t1 = sc.nextLine();
        System.out.print("本のタイトル2: ");
        String t2 = sc.nextLine();

        Book b1 = new Book(t1);
        Book b2 = new Book(t2);

        System.out.println("equals: " + b1.equals(b2));
        System.out.println("==: " + (b1 == b2)); // false
        sc.close();
    }
}
