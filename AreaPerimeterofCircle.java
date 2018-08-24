import java.util.Scanner;

class AreaPerimeterofCircle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the circle ->  ");
        int num = sc.nextInt();
        double pi =3.14;
        System.out.println("Area of Circle with given radius is -> " + pi*num*num);
        System.out.println("Perimeter of Circle with given radius is -> "+ 2*pi*num);
    }
}
