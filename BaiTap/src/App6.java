import java.util.Scanner;

public class App6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so bat ki : ");
        int number = sc.nextInt();
        int giaiThua = number;
        for(int i = 1;i < number;i++){
            giaiThua *= i;
        }
        System.out.println("Giai thua cua " + number + " la : " + giaiThua);
    }
}