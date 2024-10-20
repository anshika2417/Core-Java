class TypeConversionAndCasting{
    public static void main(String []args){
        byte b=127;
        int a=b; //implicit conversion
        System.out.println(a);

        int a1=257;
        byte k=(byte)a1; //explicit conversion
        System.out.println(k);

        float f=5.6f;
        int n=(int)f; //here data is loss
        System.out.println(n);

        //Type promotion
        byte l = 10;
        byte m = 30;
        int res=l*m;
        System.out.println(res);

    }
}