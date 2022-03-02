import java.util.Scanner;

public class App11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so n : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Mang ban dau la : ");
        for(int i = 0;i < n;i++){
            System.out.print(" " + arr[i]);
        }

        System.out.println();

    
        System.out.print("Mang sap xep theo thu tu tang dan : ");
        for(int i = 0;i < n;i++){
            for(int j = i+1;j < n;j++){
                if(arr[j] < arr[i]){
                    int maxValue = arr[i];
                    arr[i] = arr[j];
                    arr[j] = maxValue;
                }
            }
        }

        for(int i = 0;i < n;i++){
            System.out.print(" " + arr[i]);
        }
    }
}