import java.util.*;

public class gasoline1 {

    public static void main(String[] args) {

        System.out.print("請輸入目前所剩油量 (單位:公升):");

        Scanner sc = new Scanner(System.in);
        int liter = sc.nextInt();

        if((liter >=2)||(liter <5)) {
            System.out.println("油量尚足, 提醒你注意油表");
        }

        System.out.println("祝你行車愉快");
    }
}
