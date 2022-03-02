import java.util.Scanner;

public class App10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao chuoi ki tu : ");
        String s = sc.next();
        System.out.print("Nhap vao ki tu : ");
        char c = sc.next().charAt(0);

        if(s.length() <= 80){
            int sum = 0;
            for(int i = 0;i < s.length();i++){
                if(s.charAt(i) == c){
                   sum++; 
                }
            }
            System.out.println("So lan xuat hien cua ki tu " + c + " trong chuoi la : " + sum);
        }
    }
}