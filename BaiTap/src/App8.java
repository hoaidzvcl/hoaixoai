import java.util.Scanner;

public class App8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so n : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }

        int tbc = 0;
        for(int i= 0;i < n;i++){
            tbc += arr[i];
        }
        System.out.println("Trung binh cong cua " + n + " so la : " + (tbc = tbc / n));
    }
}