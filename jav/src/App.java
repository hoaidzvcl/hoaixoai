import java.util.LinkedList;
import java.util.Scanner;

public class App {

    public static void themthongtin(LinkedList<DDH890> data){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguoi muon nhap thong tin : ");
                int n;
                n = sc.nextInt();
                for(int i = 0;i < n;i++){
                    System.out.println("Nhap vao thong tin nguoi thu " + (i +1));
                    DDH890 DH = new DDH890();
                    DH.nhap();
                    data.add(DH);
                }
    }

    public static void suathongtin(LinkedList<DDH890> data){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ID muon sua :  ");
        String ID = sc.next();
            for(int i = 0;i < data.size();i++){
                if(data.get(i).DDH890ID.equals(ID)){
                    data.get(i).nhap();
                }
            }
    }

    public static void xoathongtin(LinkedList<DDH890> data){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ID muon xoa : ");
        String id = sc.next(); 
        for(int i = 0;i < data.size();i++){
            if(data.get(i).DDH890ID.equals(id)){
                data.remove(i);
            }
        }

    }

    public static void inthongtin(LinkedList<DDH890> data){
        System.out.println("----------------");
        System.out.println("---Thong tin cua linkedlist---");
                for(int i = 0;i < data.size();i++){
                    System.out.println("Thong tin cua nguoi thu " + (i+1));
                    data.get(i).in();
                }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------");
        System.out.println("1.Nhap vao so nguoi muon nhap thong tin");
        System.out.println("2.Sua thong tin voi ID");
        System.out.println("3.Hien thi thong tin danh sach");
        System.out.println("----------------");
    
        LinkedList<DDH890> data = new LinkedList<>();

        System.out.println("----------------");
        themthongtin(data);
        suathongtin(data);
        xoathongtin(data);
        inthongtin(data);
    }
}
