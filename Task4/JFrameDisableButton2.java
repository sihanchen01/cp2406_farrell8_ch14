import javax.swing.*;
import java.awt.*;

public class JFrameDisableButton2 extends JFrame {
    FlowLayout flow = new FlowLayout();
    private int count = 0;
    JLabel message = new JLabel();

    public JFrameDisableButton2() {
        super("Click to disable");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        JButton button = new JButton("Click this");
        button.addActionListener(e -> {
            count += 1;
            if (count == 8){
                button.setEnabled(false);
                message.setText("That's enough!");
            }
        });
        add(button);
        add(message);
    }


    public static void main(String[] args) {
        JFrameDisableButton2 frame = new JFrameDisableButton2();
        frame.setSize(500, 300);
        frame.setVisible(true);
    }
}
