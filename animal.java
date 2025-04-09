abstract class Animal {
    abstract void sound();
}
class Tiger extends Animal{
    void sound(){
        System.out.println("Tiger roars....");
    }
}
class Lion extends Animal{
    void sound(){
        System.out.println("Lion roars......");  
    }
}
class main{
    public static void main(String[] args){
        Tiger t=new Tiger();
        t.sound();
        Lion l=new Lion();
        l.sound();
    }
}