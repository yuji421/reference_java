import java.util.Scanner;

/**
 * Q07_EqualsDefault
 * equalsをオーバーライドしていない場合は参照比較になる。
 */
class Item {
    String name;
    Item(String name) {
        this.name = name;
    }
}
public class Q07_EqualsDefault {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("アイテム名1: ");
        String name1 = sc.nextLine();
        System.out.print("アイテム名2: ");
        String name2 = sc.nextLine();

        Item i1 = new Item(name1);
        Item i2 = new Item(name2);
        
        System.out.println("equals結果: " + i1.equals(i2)); // false

        /**
         * 自作クラスはequals()をオーバーライドしていないので参照比較になる
         */
        sc.close();
    }
}
