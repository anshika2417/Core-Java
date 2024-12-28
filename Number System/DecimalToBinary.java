import java.util.Scanner;

class DecimalToBinary{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Decimal Number: ");
        int n=sc.nextInt();
        int ans=0,pw=1;

        while(n>0){
            int unit=n%2;
            ans+=unit*pw;
            pw=pw*10;
            n=n/2;
        }
        System.out.println(ans);
    }
}