import TurtleGraphics.*;
import java.awt.Color;
import TerminalIO.KeyboardReader;

public class ShapeMaker {

    public static void main(String[] args) {
        Pen p = new StandardPen();
        AbstractShape s1 = new Circle (20,20,20);
        AbstractShape s2 = new Wheel (-20,-20,20,6);
        
        s1.draw(p);
        s2.draw(p);
        
    }
    
}
