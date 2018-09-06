import java.util.Scanner;

class FindingprimeinArray{
    public static void main(String args[]){
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("<- Finding the primes in an array ->");
        for(int i=0;i<10;i++){
            System.out.println("Enter the number at "+ i + " index(integer only)");
            arr[i] = sc.nextInt();
        }
        for(int j=0;j<arr.length;j++){
            int flag=0;
            for(int i=2;i<arr[j];i++){
                if(arr[j]%i==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(arr[j] + " is a prime number");
            }else{
                System.out.println(arr[j] + " is not a prime number");
            }
    }
    }
}