import TurtleGraphics.*;
import java.awt.Color;
import TerminalIO.KeyboardReader;

public class ShapeMaker {

    public static void main(String[] args) {
        /*
        Pen p = new StandardPen();
        Shape s1 = new Circle (20,20,20);
        Shape s2 = new Rect (-20,-20,10,20);
        
        //draw the cricle and rectangle
        s1.draw(p);
        s2.draw(p);
        
        //display a description of the circle and rectangle
        System.out.println(s1);
        System.out.println(s2);
        //toString method called implicitly
        //pause until the user is ready to continue
        KeyboardReader reader = new KeyboardReader();
        reader.pause();
        
        //erase the circle and rectangle
        p.setColor(Color.white);
        s1.draw(p);
        s2.draw(p);
        p.setColor(Color.red);
        
        //move the circle and rectangle,
        //change their size, and redraw
        s1.move(30,30);
        s2.move(-30,-30);
        s1.stretchBy(2);
        s2.stretchBy(2);
        s1.draw(p);
        s2.draw(p);
        */
        
        /*
        Pen p = new StandardPen(new SketchPadWindow(400,400));
        Shape s1 = null;
        double r, x, y;
        double w, h;
        int choice;
        KeyboardReader k = new KeyboardReader();
        //pick circle or rect
        while(true)
        {
            choice = k.readInt("Enter 1 for rectangle, 2 for circle: ");
            if(choice==1 || choice ==2)break;
        }
        if(choice==1)
        {
            w = k.readDouble("Enter width of rectangle: ");
            h = k.readDouble("Enter heigh of rectangle: ");
            s1 = new Rect(0,0,w,h);
        }
        else if(choice==2)
        {
            r = k.readDouble("Enter radius of circle: ");
            s1 = new Circle(0,0,r);
        }
        
        while(true)
        {
            s1.draw(p);
            x = k.readDouble("New x: ");
            y = k.readDouble("New y: ");
            //erase and move
            p.setColor(Color.white);
            s1.draw(p);
            s1.move(x,y);
            p.setColor(Color.blue);
            s1.draw(p);
        }
                */
        
        
    }
    
}
