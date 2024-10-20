class Literals{
    public static void main(String []args){

        int num = 0b101; //binary format
        System.out.println(num);

        int hex = 0x7E; // Hexadecimal format
        System.out.println(hex);

        int zer = 10_00_00_000; //special feature to count no. of zeros
        System.out.println(zer);

        double d = 12e10; // Storing very big value
        System.out.println(d);

        boolean b = 1; //in boolean it only stores ture and false (not even 1 and 0)
        System.out.println(b);

        char ch = 'a'; 
        ch++; //Increment
        System.out.println(ch);
    }
}