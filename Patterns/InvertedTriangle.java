import java.util.Scanner;

class InvertedTriangle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Number of Rows: ");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}