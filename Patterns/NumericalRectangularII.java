import java.util.Scanner;

class NumericalRectangularII{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Rows: ");
        int row=sc.nextInt();
        System.out.print("Enter Columns: ");
        int col=sc.nextInt();

        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}