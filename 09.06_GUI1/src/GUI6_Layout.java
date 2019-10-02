import javax.swing.*;
import java.awt.*;

public class GUI6_Layout {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();


        BorderLayout b1 = new BorderLayout();
        panel.setLayout(b1);

        JLabel lbltitle = new JLabel("아 마 스 빈");
        JTextArea taList = new JTextArea(1, 30);
        JPanel eastPanel = new JPanel();
        int sum = 10000;
        JLabel lbSum = new JLabel("총금액 : " + sum);
        JButton btPayment = new JButton("결제하기");

        eastPanel.add(lbSum);
        eastPanel.add(btPayment);
        panel.add(btPayment);
        panel.add(taList, BorderLayout.NORTH);
        panel.add(taList, BorderLayout.CENTER);
        panel.add(taList, BorderLayout.EAST);
        /*FlowLayout f1 = new FlowLayout();
        f1.setAlignment(FlowLayout.LEFT);
        panel.setLayout(f1);*/

        frame.add(panel);

        /*JButton bt0 = new JButton("Button" + 0);
        JButton bt1 = new JButton("Button" + 1);
        JButton bt2 = new JButton("Button" + 2);
        JButton bt3 = new JButton("Button" + 3);
        JButton bt4 = new JButton("Button" + 4);
        JButton bt5 = new JButton("Button" + 5);
        panel.add(bt0, BorderLayout.NORTH);
        panel.add(bt1, BorderLayout.WEST);
        panel.add(bt2, BorderLayout.CENTER);
        panel.add(bt3, BorderLayout.EAST);
        panel.add(bt4, BorderLayout.SOUTH);
        panel.add(bt5, BorderLayout.NORTH);*/



        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
