import TurtleGraphics.*;

public class Triangle extends AbstractShape{
    private double x2 , y2, x3, y3;
        
    public Triangle()
    {
        super();
        x2 = 50;
        y2 = 50;
        x3 = 100;
        y3 = 0;
    }
    
    public double area() {
        return Math.abs((xPos*y2-x2*yPos)+(x2*y3-x3*y2)+(x3*yPos-xPos*y3))/2;
    }

    public void move(double xLoc, double yLoc){
        double xd = 0;
        double yd = 0;
        xd = xLoc - xPos;
        yd = yLoc - yPos;
        xPos = xLoc;
        yPos = yLoc;
        x2 = x2 + xd;
        y2 = y2 + yd;
        x3 = x3 + xd;
        y3 = y3 + yd;
    }    
    
    public void draw(Pen p) {
        p.up();
        p.move(xPos,yPos);
        p.down();
        p.move(x2,y2);
        p.move(x3,y3);
        p.move(xPos,yPos);
    }

    public void stretchBy(double factor) {
        x2 = (x2-xPos)*factor + xPos;
        y2 = (y2-yPos)*factor + yPos;
        x3 = (x3-xPos)*factor + xPos;
        y3 = (y3-yPos)*factor + yPos;
    }

    public double perimeter() {
        return Math.sqrt((xPos-x2)*(xPos-x2)+(yPos-y2)*(yPos-y2));
    }
    
    public String toString(){
        String str = "Triangle\n";
        str += "X-Y(1): " + xPos + "," + yPos;
        str += "\nX-Y(2): " + x2 + "," + y2;
        str += "\nX-Y(3): " + x3 + "," + y3;
        str += "\nArea: " + area();
        str += "\nPerimeterL " + perimeter();
        return str;
    }
    
}
