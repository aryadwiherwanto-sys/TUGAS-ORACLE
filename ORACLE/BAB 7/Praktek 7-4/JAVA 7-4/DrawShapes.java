import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class DrawShapes extends JPanel {

    @Override
    protected void paintComponent(Graphics graph) {
        super.paintComponent(graph);

        graph.setFont(new Font("Arial", Font.ITALIC, 18));
        graph.setColor(Color.BLACK);
        graph.drawString("Draw Shapes", 90, 30);

        graph.setColor(Color.DARK_GRAY);
        graph.drawRect(120, 120, 120, 120);
        graph.fillRect(115, 115, 90, 90);

        graph.setColor(Color.RED);
        graph.fillArc(110, 110, 50, 50, 0, 360);

        graph.setColor(Color.GRAY);
        graph.drawRect(50, 50, 50, 50);
        graph.fillRect(50, 50, 60, 60);
    }

    // Bisa menjalankan DrawShapes.java secara langsung
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Draw Shapes");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 350);
            frame.setLocationRelativeTo(null);
            frame.add(new DrawShapes());
            frame.setVisible(true);
        });
    }
}
