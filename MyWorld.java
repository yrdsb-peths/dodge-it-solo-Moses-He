import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Character man = new Character();
        addObject(man , 100 , 100 );
        
        Bullets ball = new Bullets();
        addObject(ball , 600 , 100);
        
        
        
    }
}
