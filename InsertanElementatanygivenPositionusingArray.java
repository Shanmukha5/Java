import java.util.Scanner;

class InsertanElementatanygivenPositionusingArray{
    public static void main(String args[]){
        System.out.println("<- Inserting any element at any given position in Array ->");
        int arr[] = new int[10];
        int ind,repl;
        for(int i=0;i<arr.length-1;i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number at index "+ i );
            arr[i] = sc.nextInt();
        }
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the index where you want to insert -> ");
        ind = i.nextInt();
        Scanner r = new Scanner(System.in);
        System.out.println("Enter the number to insert -> ");
        repl = r.nextInt();
        for(int j=arr.length-2;j>=ind;j--){
            arr[j+1] = arr[j];
        }
        arr[ind] = repl;
        System.out.println("The resultant array will be -> ");
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+",");
        }
    }
}