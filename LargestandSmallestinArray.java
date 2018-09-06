import java.util.Scanner;

class LargestandSmallestinArray {
    public static void main(String args[]){
        int min,max;
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("<- Finding Largest and Smallest number in a given number in an array -> ");
        for(int i =0; i<10; i++){
            System.out.println("Enter number for "+ i + " index(only number) -> ");
            arr[i] = sc.nextInt();
        }
        min = arr[0];
        max = arr[0];
        for(int i =1;i<10;i++){
            if(min>arr[i]){
                min = arr[i];
            }else if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Largest number in given set of number -> "+max);
        System.out.println("Smallest number in given set of number -> "+min);
            
    }
}