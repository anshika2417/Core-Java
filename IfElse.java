class IfElse{
    public static void main(String []args){
        int x = 8;
        int y = 7;
        int z = 6;
        if(x>y && x>y){
            System.out.println(x);
        }
        else if(y>z){
            System.out.println(y);
        }
        else{
            System.out.println(z);
        }
        
        //Ternary Operator

        int n=4;
        int result = 0;

        // if(n%2==0){
        //     result=10;
        // }
        // else{
        //     result=20;
        // }

        result = n%2==0 ? 10 : 20;
        System.out.println(result);
    }
}