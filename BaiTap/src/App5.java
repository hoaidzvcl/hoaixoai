import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(sum <= 100){
            System.out.print("Nhap vao so nguyen n : ");
            int n = sc.nextInt();
            sum += n;
        }
        System.out.println("Tong cua cac so vua nhap la : " + sum);
    }
}