import java.util.Scanner;

public class App9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao chuoi ki tu : ");
        String s = sc.next();
        int a = 0; //tong ki tu thuong
        int b = 0; //tong ki tu hoa
        int c = 0; //tong ki tu so

        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                a++;
            }
            else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                b++;
            }
            else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                c++;
            }
        }   
        System.out.println("Chuoi " + s + " co " + a + " so, " + b + " ki tu thuong, " + c + " ki tu hoa ");
    }
}