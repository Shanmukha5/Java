import java.util.Scanner;

class DeleteanyNumberatanyPositioninArray{
    public static void main(String args[]){
        int arr[] = new int[10];
        int ind;
        for(int i=0;i<arr.length;i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number at index -> ");
            arr[i] = sc.nextInt();
        }
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the index of a number to be deleted -> ");
        ind = i.nextInt();
        for(int j=ind;j<arr.length-1;j++){
            arr[j] = arr[j+1];
        }
        arr[arr.length-1] = 0;
        System.out.println("Resultant array ->");
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+",");
        }
    }
}