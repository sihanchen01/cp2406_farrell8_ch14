import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow;

public class JHistoricalFacts extends JFrame {
    static final String[] FACTS = {
            "American was founded in 4th July, 1776.",
            "China was founded in 1st October, 1949.",
            "EU has 27 countries.",
            "Qin dynasty was founded in 221 BC.",
            "Homo species originated back to 2.5 million years ago."
    };

    JLabel fact = new JLabel();
    FlowLayout flow = new FlowLayout();

    public JHistoricalFacts() {
        super("Historical facts");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton shuffle = new JButton("Shuffle");
        shuffle.addActionListener(e -> {
            int i = (int) Math.floor(Math.random() * 4);
            fact.setText(FACTS[i]);
        });
        setLayout(flow);
        add(fact);
        add(shuffle);
    }

    public static void main(String[] args) {
        JHistoricalFacts frame = new JHistoricalFacts();
        frame.setSize(500, 300);
        frame.setVisible(true);
    }
}
