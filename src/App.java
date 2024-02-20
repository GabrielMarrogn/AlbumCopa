import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int espacos = sc.nextInt();
        int compradas = sc.nextInt();
        int[] arr = new int[compradas];
        int end = arr.length;
        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }


        for (int i = 0; i < end; i++) {
            set.add(arr[i]);
        }

        int tamanho = set.size();

        System.out.println(espacos - tamanho);

        sc.close();
    }

}
