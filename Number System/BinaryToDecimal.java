import java.util.Scanner;


class BinaryToDecimal{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Binary Number: ");
        int n=sc.nextInt();

        int ans=0,pw=1;
        while(n>0){
            int unit = n%10;
            ans += unit*pw;
            n=n/10;
            pw = pw*2;
        }

        System.out.print(ans);

    }
}