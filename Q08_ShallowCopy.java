import java.util.Scanner;

/**
 * Q08_ShallowCopy
 * 同じ配列参照を持つと、片方の変更がもう片方にも影響する。
 */
class Container {
    int[] data;
}
public class Q08_ShallowCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Container c1 = new Container();
        c1.data = new int[3];

        System.out.print("0番目の値を入力: ");
        c1.data[0] = sc.nextInt();

        Container c2 = c1;
        c2.data[0] = 999;

        //同じ参照先を指し示すから変更内容が両方に反映される
        System.out.println("c1.data[0] = " + c1.data[0]); // 999
        sc.close();
    }
}
