import java.util.Arrays;
import java.util.Scanner;

class DisplayingfrequencyofdigitsinArray{
    public static void main(String args[]){
        int arr[] = new int[10];
        int fre[] = new int[10];
        System.out.println("<- Displaying the number repeated times of a number -> ");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.println("Enter the number at index "+ i);
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<10;i++){
            if(!Arrays.asList(fre).contains(arr[i])){
                int count =1;
                for(int j=1;j<10;j++){
                    if(arr[i]==arr[j]){
                        count = count +1;
                    }
                }
                fre[i] = count;
        }
        }
        for(int i=0;i<10;i++){
            System.out.println(fre[i]);
        }

    }
}