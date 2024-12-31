class StaticMain{
    public static void main(String[] args){
        //Either access by class name or by object
        Static st1=new Static();
        System.out.println(Static.color);
        st1.color="white"; 
        System.out.println(Static.color);

        Static st2=new Static();
        System.out.print(Static.color);

//Static memory is sharable     
        
    }
}