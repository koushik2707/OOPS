class vehicle{
    void displayInfo(){
        System.out.println("This is a vehicle");
    }
}
class car extends vehicle{
        void dispayInfo(String company,String fuel_type,String numberplate){  
            System.out.println("This is my car");
            System.out.println("Brand:" + company);
            System.out.println("Fuel type:" + fuel_type);
            System.out.println("Number Plate:" + numberplate);
    }
}
class vehicledemo {
    public static void main (String[] args){
        vehicle v = new vehicle();
        v.displayInfo();
        car c = new car();
        c.dispayInfo("Ferrari","Petrol","TS15K2707");
    }
}