import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI9_SmallWindow {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton bt0 = new JButton("작은 창 1");
        JButton bt1 = new JButton("작은 창 2");

        JDialog dialog = new JDialog(frame, "다이얼로그", true);
        JLabel lb = new JLabel("레이블");
        dialog.add(lb);


        bt0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                /*JOptionPane.showMessageDialog(frame, "메세지", "제목", JOptionPane.WARNING_MESSAGE);*/
                /*int select = JOptionPane.showConfirmDialog(null, "저장할까요?");
                System.out.println(select);*/
                String luckyNumber = JOptionPane.showInputDialog(frame, "너의 행운의 번호는?");
                System.out.println(luckyNumber);
            }
        });

        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });

        panel.add(bt0);
        panel.add(bt1);
        frame.add(panel);

        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
