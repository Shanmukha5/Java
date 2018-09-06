import java.util.Scanner;

class DisplayingMaximumrepeatedDigitinNumber{
    public static void main(String args[]){
        System.out.println("<- Displays the max number of repeated digit in a number(occured last) ->");
        int num;
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int j=0,count,maxcount=0,maxelement=0;
        while(num>0){
            arr[j]=num%10;
            num = num/10;
            j++;
        }
        for(int i=0;i<j;i++){
            count =1;
            for(int k=i+1;k<j;k++){
                if(arr[k]==arr[i]){
                    count++;
                    if(count>maxcount){
                        maxcount = count;
                        maxelement = arr[k];
                    }
            }
            }
        }
        System.out.println("The maximum repeated digit in the given number is -> ");
        System.out.print(maxelement + " -> " + maxcount + " this times.");
    }
}