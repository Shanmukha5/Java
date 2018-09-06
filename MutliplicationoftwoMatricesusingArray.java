import java.util.Scanner;

class MultiplicationoftwoMatricesusingArray{
    public static void main(String args[]){
        int a=0,b=0,x=0,y=0;
        Scanner r1 = new Scanner(System.in);
        Scanner c1 = new Scanner(System.in);
        Scanner r2 = new Scanner(System.in);
        Scanner c2 = new Scanner(System.in);
        System.out.println("Enter the number of rows for 1st matrix -> ");
        a = r1.nextInt();
        System.out.println("Enter the number of columns for 1st matrix -> ");
        b = c1.nextInt();
        System.out.println("Enter the number of rows for 2nd matrix -> ");
        x = r2.nextInt();
        System.out.println("Enter the number for columns for 2nd matrix -> ");
        y = c2.nextInt();
        int mat1[][]= new int[a][b];
        int mat2[][] = new int[x][y];
        int result[][] =new int[a][y];
        if(b==x){
            for(int i=0;i<a;i++){
                for(int j=0;j<b;j++){
                    Scanner in = new Scanner(System.in);
                    System.out.println("Enter number for " + i + " "+ j);
                    mat1[i][j] = in.nextInt();
                }
            }
            for(int i=0;i<x;i++){
                for(int j=0;j<y;j++){
                    Scanner s = new Scanner(System.in);
                    System.out.println("Enter number for " + i + " "+ j);
                    mat2[i][j] = s.nextInt();
                }
            }

            System.out.println("The resultant matrix -> ");

            for(int i=0;i<b;i++){
                for(int j=0;j<b;j++){
                    for(int k=0;k<b;k++){
                        result[i][j] = result[i][j] + mat1[i][k] * mat2[k][j];
                    }
                }
            }
        }

        for(int i=0;i<a;i++){
            for(int j=0;j<y;j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}