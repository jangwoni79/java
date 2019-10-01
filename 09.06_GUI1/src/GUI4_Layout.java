import javax.swing.*;
import java.awt.*;

public class GUI4_Layout {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();


        GridLayout g1 = new GridLayout(2,3);
        panel.setLayout(g1);
        /*FlowLayout f1 = new FlowLayout();
        f1.setAlignment(FlowLayout.LEFT);
        panel.setLayout(f1);*/

        for(int i = 0; i < 6; i++){
            JButton bt = new JButton("Button" + i);
            panel.add(bt);
        }

        frame.add(panel);

        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
