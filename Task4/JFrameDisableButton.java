import javax.swing.*;
import java.awt.*;

public class JFrameDisableButton extends JFrame {
    FlowLayout flow = new FlowLayout();

    public JFrameDisableButton() {
        super("Click to disable");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        JButton button = new JButton("Click this");
        button.addActionListener(e -> {
            button.setEnabled(false);
        });
        add(button);
    }

    public static void main(String[] args) {
        JFrameDisableButton frame = new JFrameDisableButton();
        frame.setSize(500, 300);
        frame.setVisible(true);
    }
}
