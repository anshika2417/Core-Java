import java.util.Scanner;

class SumOfDigits{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");

        int n=sc.nextInt();
        int sum=0; 

        while(n>0){
            int r = n%10;
            sum += r;
            n=n/10;
        }
        System.out.print("Sum of Digits: "+sum);
    }
}