class vehicle{
    void displayInfo(){
        System.out.println("this is a vehicle");
    }
}
class car extends vehicle{
        void dispayInfo(){   
            String company = "ferrari";
            String fuel_type = "petrol";
            String numberplate = "AP2307K2007";
            System.out.println("Brand:" + company);
            System.out.println("Fuel type:" + fuel_type);
            System.out.println("Number Plate:" + numberplate);
    }
}
class vehicledemo {
    public static void main (Strings [] args){
        vehicle v = new vehicle();
        v.displayInfo();
        car c = new car();
        c.dispayInfo();
    }
}