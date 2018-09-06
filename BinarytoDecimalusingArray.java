import java.util.Scanner;

class BinarytoDecimalusingArray{
    public static void main(String args[]){
        System.out.println("<- Converting a binary number to decimal -> ");
        int num;
        int arr[] =new int[10];
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int i=0;
        while(num>0){
            arr[i] = num%10;
            num = num/10;
            i++;
        }
        double result = 0,multiplier=0;
        for(int j=0;j<i;j++){
            result = result + arr[j]* Math.pow(2, multiplier);
            multiplier++;
        }
        System.out.println("The decimal number is -> "+ result);

    }
}