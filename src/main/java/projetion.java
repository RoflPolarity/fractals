import org.math.plot.Plot3DPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class projetion {
    public static void main(String[] args) {
        Terrain terrain = new Terrain();
        double[][] map = terrain.getMap();
        double[] x = new double[map.length];
        for (int i = 0; i < x.length; i++) {
            x[i] = i;
        }
        double[] y = new double[map[1].length];
        for (int i = 0; i < y.length; i++) {
            y[i] = i;
        }
        Plot3DPanel projction = new Plot3DPanel("SOUTH");
        projction.addGridPlot("Terrain",x,y,map);
        JFrame frame = new JFrame();
        frame.setSize(800,600);
        frame.setContentPane(projction);
        Button btn = new Button();
        btn.setLabel("Параметры поверхности");
        btn.setEnabled(true);
        btn.setVisible(true);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
