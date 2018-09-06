import java.util.Scanner;

class SecondlargestinArray{
    public static void main(String args[]){
        int arr[] = new int[10];
        System.out.println("<- Second Largest element in an Array ->");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.println("Enter the number at " + i + " index(only an integer) -> ");
            arr[i] = sc.nextInt();
        }

        int first = arr[0],second= arr[0];
        for(int i=1;i<10;i++){
            if(first<arr[i]){
                second = first;
                first= arr[i];
            }
        }
        System.out.println("The second largest element in the array -> "+ second);
    }
}