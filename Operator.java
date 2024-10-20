class Operator{
    public static void main(String []args){
    //Arithmetic Operators 
        int n1=7;
        int n2=5;

        int res=n1+n2; //Addition
        System.out.println(res);

        int res1=n1-n2; //Subtraction
        System.out.println(res1);

        int res2=n1*n2; //Multiplication
        System.out.println(res2);

        int res3=n1/n2; //Division
        System.out.println(res3);

        int res4=n1%n2; //Module
        System.out.println(res4);

        int num=8;  //shorthand
        //num=num+2;
        num+=2;
        System.out.println(num);

        int num1=9; //increment
        num1++; 
        System.out.println(num1);

        int num2=9;
        int r=++num2; // pre-increment
        System.out.println(r);

        int num3=7;
        int r1=num3++; // post-increment
        System.out.println(r1);

    //Relational Operators
        
        boolean result= num1==num2;
        System.out.println(result);

    //Logical Operators
        int x=7;
        int y=5;

        int a=5;
        int b=9;

        // boolean results= x > y && a < b;
        boolean results= x > y || a > b;
        System.out.println(!results);
    }
}