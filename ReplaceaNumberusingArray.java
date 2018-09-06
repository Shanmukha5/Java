import java.util.Scanner;

class ReplaceaNumberusingArray{
    public static void main(String args[]){
        System.out.println("<- Replacing a number at a given index in Array ->");
        int arr[] = new int[10];
        int ind,repl;
        for(int i =0;i<arr.length;i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number at index "+i);
            arr[i] = sc.nextInt();
        }
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the index to change -> ");
        ind = i.nextInt();
        Scanner r = new Scanner(System.in);
        System.out.println("Enter the number to replace in that place ->");
        repl = r.nextInt();
        arr[ind] = repl;
        for(int j =0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }
}