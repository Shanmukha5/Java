import java.util.Scanner;

class CalculatingInterest{
    public static void main(String args[]){
        Scanner p =new Scanner(System.in);
        System.out.println("Enter principal -> ");
        int principal = p.nextInt();
        Scanner r = new Scanner(System.in);
        System.out.println("Enter rate(in float like 0.3) -> ");
        float rate = r.nextFloat();
        Scanner t = new Scanner(System.in);
        System.out.println("Enter time in years(should be an integer) -> ");
        int time = t.nextInt();
        System.out.println("The value of Interest as per given values is -> "+principal*(1+rate*time) );

    }
}
