
import TurtleGraphics.Pen;

public class Rect implements Shape{

    private double xPos, yPos, width, height;
    
    public Rect(){
        xPos=0;
        yPos=0;
        width=1;
        height=1;
    }
    
    public Rect(double x,double y, double w, double h){
        xPos = x;
        yPos = y;
        width = w;
        height = h;
    }
    
    public double area() {
        return width * height;
    }

    public void draw(Pen p) {
        p.up();
        p.move(xPos, yPos);
        p.down();
        p.setDirection(0);
        p.move(width);
        p.turn(90);
        p.move(height);
        p.turn(90);
        p.move(width);
        p.turn(90);
        p.move(height);
    }

    @Override
    public double getXPos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getYPos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void move(double xLoc, double yLoc) {
        xPos = xLoc;
        yPos = yLoc;
    }

    public void stretchBy(double factor) {
        height *= factor;
        width *= factor;
    }
    
    public String toString(){
        String str = "This is a CIRCLE\n";
        str += "XLOC: " + xPos + "\tYLOC: " + yPos + "\n";
        str += "Width: " + width + "Height: " + height;
        return str;
    }
        
}
