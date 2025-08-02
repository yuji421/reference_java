import java.util.Scanner;

/**
 * Q02_StringImmutable
 * concat() を用いて元の文字列が変わるかを確認。
 */
public class Q02_StringImmutable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("元の文字列: ");
        String original = sc.nextLine(); //不変であるためメモリ上に残る
        String modified = original.concat(" World"); //書き換えられたのではなく参照先が変わる

        System.out.println("original: " + original);
        System.out.println("modified: " + modified);
        sc.close();
    }
}

