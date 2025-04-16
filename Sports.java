interface Playable {
    abstract void play();
}
class Football implements Playable{
    public void play(){
        System.out.println("Playing FootBall......");
    }
}
class Volleyball implements Playable{
    public void play(){
        System.out.println("Playing VolleyBall......");
    }
}
class Basketball implements Playable{
    public void play(){
        System.out.println("Playing BasketBall.......");
    }
}
class Sports{
    public static void main(String[] args) {
        Football f = new Football();
        Volleyball v = new Volleyball();
        Basketball b = new Basketball();
        f.play();
        v.play();
        b.play();
    }
}