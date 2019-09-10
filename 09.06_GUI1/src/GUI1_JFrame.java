import javax.swing.*;

public class GUI1_JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("창이름");
        JPanel panel = new JPanel(); //요소를 만들어준다 //panel은 수평으로 가운데 정렬
        JLabel label = new JLabel("아싸 어쩌다 금요일");
        JButton button = new JButton("오예!"); //창에는 하나만 넣을 수 있다



        panel.add(label);
        panel.add(button);
        frame.add(panel);

        frame.pack(); //구성요소가 있으면 그 구성요소 만큼 창 크기가 변한다
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //X버튼 -> 끝
    }
}
