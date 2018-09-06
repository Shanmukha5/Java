import java.util.Scanner;

class ConvertingDecimaltoBinaryusingArray{
    public static void main(String args[]){
        int number=0,i=0;
        int rem[] = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number which you want to convert into binary(number should be positive) -> ");
        number = sc.nextInt();
        while(number>0){
            rem[i] = number%2;
            number = number/2;
            i++;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(rem[j]);
        }

    }
}