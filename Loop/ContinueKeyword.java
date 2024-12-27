class ContinueKeyword{
    public static void main(String[] args){
        int n=1;
        while(n<=50){
            if(n%3 == 0){
                n++;
                continue;
            }
            System.out.println(n);
            n++;
        }
    }
}