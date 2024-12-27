import java.util.Scanner;

class NumericalRectangularIII{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rows: ");
        int row=sc.nextInt();
        System.out.print("Enter Columns: ");
        int col=sc.nextInt();

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if((i+j)%2 == 0){
                    System.out.print("1");
                }
                else{
                    System.out.print("2");
                }
            }
            System.out.println();
        }
    }
}