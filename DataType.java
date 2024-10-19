class DataType{
    public static void main(String a[]){
        int num = 3; //(4 Bytes)
        long num1 = 2l; // (8 Bytes)
        short sh = 558; //(2 Bytes)
        System.out.println(num1);

        byte b= 127; //range -128 to 127 (1 Byte)
        System.out.println(b);

        float marks = 3.7f; // (4 Bytes)
        double marks1= 3.7; // (8 Bytes) By default double

        char ch='k'; // Accept only simgle character (2 Bytes)
        System.out.println(ch);

        boolean bl=false; // (1 Byte)
        System.out.println(bl);

    }
}