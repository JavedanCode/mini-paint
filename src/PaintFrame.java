import javax.swing.*;
import java.awt.*;

public class PaintFrame extends JFrame {

    private JButton createColorButton(String name, Color color, CanvasPanel canvas){
        JButton btn = new JButton(name);
        btn.setPreferredSize(new Dimension(40,40));
        btn.setBackground(color);

        btn.addActionListener(e -> canvas.setColor(color));
        return btn;
    }

    private JPanel createToolbar(CanvasPanel canvas){
        JPanel panel = new JPanel();

        //Add color buttons to toolbar
        panel.add(createColorButton("", Color.BLACK, canvas));
        panel.add(createColorButton("", Color.RED, canvas));
        panel.add(createColorButton("", Color.BLUE, canvas));
        panel.add(createColorButton("", Color.GREEN, canvas));
        panel.add(createColorButton("", Color.YELLOW, canvas));
        panel.add(createColorButton("", Color.WHITE, canvas));

        panel.add(new JLabel("Brush Size:"));

        JButton small = new JButton("Small");
        small.addActionListener(e -> canvas.setThickness(2));

        JButton medium = new JButton("Medium");
        medium.addActionListener(e -> canvas.setThickness(5));

        JButton large = new JButton("Large");
        large.addActionListener(e -> canvas.setThickness(10));

        panel.add(small);
        panel.add(medium);
        panel.add(large);

        //Clear
        JButton clear = new JButton("Clear");
        clear.addActionListener(e -> canvas.clear());
        panel.add(clear);

        return panel;
    }

    public PaintFrame(){
        setTitle("Mini Paint");
        setSize(1080, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        CanvasPanel canvas = new CanvasPanel();
        add(canvas, BorderLayout.CENTER);

        add(createToolbar(canvas), BorderLayout.NORTH);

        setVisible(true);
    }
}
