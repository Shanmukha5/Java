import java.util.Scanner;

class InterchangingDigitsinArray{
    public static void main(String args[]){
        int arr[] = new int[10];
        int ans[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.println("Enter the value at "+ i + " index -> ");
            arr[i] = sc.nextInt();
            int num = arr[i];
            int result =0;
            while(num > 0){
                int dig = num%10;
                result = result *10 +dig;
                num = num/10;
            }
            ans[i] = result;
        }
        for(int j=0;j<10;j++){
            System.out.println(ans[j]);
        }
        
    }
}


