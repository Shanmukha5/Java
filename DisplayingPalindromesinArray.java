import java.util.Scanner;

class DisplayingPalindromesinArray{
    public static void main(String args[]){
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("<- Displaying Palindrome number in an array -> ");
        for(int i=0;i<10;i++){
            System.out.println("Enter the number at "+ i + " index(integer only) -> ");
            arr[i] = sc.nextInt();
        }
        for(int i =0;i<10;i++){
            int number = arr[i];
            int reversednumber = 0;
            int temp = 0;
            while(number>0){
                temp = number%10;
                number = number/10;
                reversednumber = reversednumber*10+temp;

            }
            if(arr[i]==reversednumber){
                System.out.println(arr[i] +" is a palindrome");
            }
            else{
                System.out.println(arr[i] + " is not a palindrome");
            }
        }

    }
}