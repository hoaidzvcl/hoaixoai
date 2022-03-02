import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so tu 1-12 : ");
        int x = sc.nextInt();

        switch(x){
            case 1:
                System.out.println("Day la thang 1");
                break;
            case 2:
                System.out.println("Day la thang 2");
                break;
            case 3:
                System.out.println("Day la thang 3");
                break;
            case 4:
                System.out.println("Day la thang 4");
                break;
            case 5:
                System.out.println("Day la thang 5");
                break;
            case 6:
                System.out.println("Day la thang 6");
                break;
            case 7:
                System.out.println("Day la thang 7");
                break;
            case 8:
                System.out.println("Day la thang 8");
                break;
            case 9:
                System.out.println("Day la thang 9");
                break;
            case 10:
                System.out.println("Day la thang 10");
                break;
            case 11:
                System.out.println("Day la thang 11");
                break;
            case 12:
                System.out.println("Day la thang 12");
                break;
            default:
                System.out.println("So khong hop le");
        }
    }
}