import java.util.Scanner;

class Selectionsort{
    public static void main(String args[]){
        int arr[] = new int[6];
        int finalarr[] = new int[6];
        for(int i=0;i<6;i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter element for " + i + " index");
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<6;i++){
            finalarr[i] = arr[i];
            for(int j=i;j<6;j++){
                if(finalarr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j] = finalarr[i];
                    finalarr[i] = temp;
                }
            }
        }
        System.out.println("The resultant array ->");
        for(int i=0;i<6;i++){
            System.out.print(finalarr[i]+ " ");
        }

    }
}