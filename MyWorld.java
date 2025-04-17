import greenfoot.*;
//This class 
public class MyWorld extends World {
    public MyWorld() {
        
        super(600, 400, 1);
        
        Elephant elephant = new Elephant();
        addObject(elephant, 100, 100);
        
        Banana banana = new Banana();
        addObject(banana, 600, 100);
    }
}

