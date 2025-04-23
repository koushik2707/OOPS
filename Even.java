class EvenException{
    public static void checknumber(int number)throws Exception{
        if (number %2 == 0){
            throw new Exception("Even number not allowed : " + number);
        }
        else{
            System.out.println("valid odd number : " + number);
        }
    }
}
class Even{
    public static void main(String [] args){
        try{
            EvenException.checknumber(7);
        }
        catch(Exception e){
            System.out.println("Exception caught : " + e.getMessage());
        }
    }
}