import java.util.Scanner;

public class App12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao n va m : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int maxValue = arr[0][0];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                if(arr[i][j] > arr[0][0]){
                    maxValue = arr[i][j];
                }
            }
        }
        System.out.println("MaxValue = " + maxValue);
    }
}