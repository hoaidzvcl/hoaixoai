import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so thu nhat : ");
        int a = sc.nextInt();
        System.out.print("Nhap vao so thu hai : ");
        int b = sc.nextInt();

        System.out.println("Tong cua a va b la : " + (a + b));
        System.out.println("Hieu cua a va b la : " + (a - b));
        System.out.println("Tich cua a va b la : " + (a * b));
        System.out.println("Thuong cua a va b la : " + (a / b));
        System.out.println("Du cua thuong a va b la : " + (a % b));

        if(a > b){
            System.out.println("a lon hon b");
        }
        else if(a == b){
            System.out.print("a bang b");
        }
        else{
            System.out.println("b lon hon a");  
        }
    }
}