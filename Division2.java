import java.util.Scanner;

public class Division2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть к-лво школярів:");
        int n =in.nextInt();
        System.out.print("Введіть к-лво яблук:");
        int k = in.nextInt();
        int a = k%n;
        System.out.print(a);

    }

}
