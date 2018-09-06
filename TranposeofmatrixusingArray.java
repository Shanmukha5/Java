import java.util.Scanner;

class TransposeofmatrixusingArray{
    public static void main(String args[]){
        int a,b;
        System.out.println("Enter number of rows -> ");
        Scanner q = new Scanner(System.in);
        a = q.nextInt();
        System.out.println("Enter number of columns -> ");
        Scanner n = new Scanner(System.in);
        b = n.nextInt();
        int mat1[][] = new int[a][b];
        int mat2[][] = new int[b][a];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter number at " + i +j + " index");
                mat1[i][j]=sc.nextInt();
                mat2[j][i] = mat1[i][j];
            }
        }
        for(int i=0;i<b;i++){
            for(int j =0;j<a;j++){
                System.out.print(mat2[i][j] + " ");
            } 
            System.out.println();
        }
    }
}