import java.util.Scanner;

class DisplayingNumberofdigitsinArray{
    public static void main(String args[]){
        int arr[] = new int[10];
        int fre[] = new int[10];
        System.out.println("Displaying the frequency of digits of numbers in an array");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.println("Enter the number at " +i + " index(integer only)");
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<10;i++){
            int freq =0;
            int num = arr[i];
            while(arr[i]>0){
                freq = freq+1;
                arr[i] = arr[i]/10;
            }
            System.out.println(num + " has a frequency of "+ freq);
        }
    }
}