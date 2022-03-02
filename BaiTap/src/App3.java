import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ten : ");
        String name = sc.nextLine();
        System.out.print("Nhap vao tuoi : ");
        int age = sc.nextInt();

        if(age < 16){
            System.out.println("Ban " + name + " o do tuoi vi thanh nien");
        }
        if(age >= 16){ 
            System.out.println("Ban " + name + " o do tuoi truong thanh");
        }
        if(age >= 18){
            System.out.println("Ban " + name + " da gia");
        }
    }
}
