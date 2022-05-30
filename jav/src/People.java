import java.util.Scanner;

public class People {
    public String name;
    public int age;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ten : ");
        name = sc.nextLine();
        System.out.print("Nhap vao tuoi : ");
        age = sc.nextInt();
    }

    public void in(){
        System.out.println("Ten : " + name);
        System.out.println("Tuoi : " + age);
    }

    // @Override
    // public String toString() {
        
    //     return "Ten : " + name + ", Tuoi: " + age;
    // }
}
