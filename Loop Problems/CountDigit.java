import java.util.Scanner;

class CountDigit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any Number");
        int n = sc.nextInt();
        int cnt=0;
        while(n>0){
            n=n/10;
            cnt++;
        }
        System.out.println(cnt);
    }
}