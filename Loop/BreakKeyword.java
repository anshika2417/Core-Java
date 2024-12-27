class BreakKeyword{
    public static void main(String []args){
        int n=1;
        while(true){
            if((n%5 == 0) && (n%7 == 0)){
                System.out.println(n);
                break;
            }
            n++;
        }
    }
}