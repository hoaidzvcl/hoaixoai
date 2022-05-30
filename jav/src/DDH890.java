import java.util.LinkedList;
import java.util.Scanner;

public class DDH890 extends People{
    public String DDH890ID;
    public float DDH890Score;

    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ID : ");
        DDH890ID = sc.nextLine();
        System.out.print("Nhap vao Score : ");
        DDH890Score = sc.nextFloat();
    }

    @Override
    public void in(){
        System.out.println("ID : " + DDH890ID);
        System.out.println("Score: " + DDH890Score);
    }
    

    // @Override
    // public String toString() {
    //     return super.toString() + "DDH890ID" + DDH890ID + ", DDHScore: " + DDH890Score;
    // }
    
}