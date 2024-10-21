class UpdatedSwitch{
    public static void main(String []args){
         String day = "Sunday";
         String result="";
        //  switch(day){
            // case "Sunday","Saturday" -> result = "6am";
            // case "Monday" -> result = "8am";
            // default -> result = "7am";
            
            
            result = switch(day){
            case "Sunday","Saturday" -> "6am";
            case "Monday" ->  "8am";
            default -> "7am";


            // case "Sunday","Saturday" : yield "6am";
            // case "Monday" : yield  "8am";
            // default : yield "7am";
         };

         System.out.println(result);
    }
}