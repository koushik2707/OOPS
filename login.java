interface loginportal {
    boolean login(String id,String pass);
}
class Universityportal implements loginportal{
    public boolean login(String id,String pass){
    if ((id == "Balu") && (pass == "2707")){
        System.out.println("Login success......");
        return true;
    }
    else{
        System.out.println("Invalid Credentials..??");
        return false;
    }
}
}
class login{
    public static void main(String [] args){
        Universityportal l = new Universityportal();
        l.login("Balu", "2707");
    }
}
