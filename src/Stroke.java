import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Stroke {

    //Variables
    private List<Point> points = new ArrayList<>();
    private Color color;
    private int thickness;

    //Constructor
    public Stroke(Color color, int thickness){
        this.color = color;
        this.thickness = thickness;
    }
    //Getters and Setters
    public void addPoint(Point p){
        points.add(p);
    }
    public List<Point> getPoints(){
        return points;
    }

    public Color getColor(){
        return color;
    }

    public int getThickness(){
        return thickness;
    }


}
