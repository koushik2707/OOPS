abstract class shape3D {
    abstract void calculateVolume();
    abstract void calculateSurfaceArea();
}
class Circle extends shape3D{
    int r;
    void calculateVolume(){
        System.out.println("Volume:" + (4/3)*Math.PI*Math.pow(r, 3));
    }
    void calculateSurfaceArea(){
        System.out.println("Surface Area:" + (4)*Math.PI*Math.pow(r, 2));
    }
}
class Square extends shape3D{
    int a;
    void calculateVolume(){
        System.out.println("Volume:" + Math.pow(a, 3));
    }
    void calculateSurfaceArea(){
        System.out.println("Surface Area:" + (6)*Math.pow(a, 2));
    }
}
class Main{
    public static void main(String[] args) {
        Circle c = new Circle();
        c.calculateSurfaceArea(5);
        c.calculateVolume(5);
        Square s = new Square();
        s.calculateSurfaceArea(5);
        s.calculateVolume(5);
    }
}
