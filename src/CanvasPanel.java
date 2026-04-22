import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class CanvasPanel extends JPanel {


    //Variables
    private List<Stroke> strokes = new ArrayList<>();
    private Stroke currentStroke;
    private Color currentColor = Color.BLACK;
    private int currentThickness = 3;


    //Helpers
    public void setColor(Color color){
        this.currentColor = color;
    }
    public void clear(){
        strokes.clear();
        repaint();
    }

    public void setThickness(int thickness){
        this.currentThickness = thickness;
    }

    //Constructor
    public CanvasPanel(){
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e){
                currentStroke = new Stroke(currentColor, currentThickness);
                currentStroke.addPoint(e.getPoint());
                strokes.add(currentStroke);
            }
        });

        addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e){
                currentStroke.addPoint(e.getPoint());
                repaint();
            }
        });

        setBackground(Color.WHITE);
    }

    //Paint Component
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        for(Stroke stroke : strokes){
            g2.setColor(stroke.getColor());
            g2.setStroke(new BasicStroke(stroke.getThickness()));

            List<Point> points = stroke.getPoints();
            for(int i = 1; i < points.size(); i++){
                Point p1 = points.get(i-1);
                Point p2 = points.get(i);
                g2.drawLine(p1.x, p1.y, p2.x, p2.y);
            }
        }
    }


}
