import javax.swing.*;
import java.awt.*;

public class JBookQuote extends JFrame {
    public static final String QUOTE_A_TALE_OF_TWO_CITIES = """
                <html><body>
                It was the best of times,
                it was worst of times;
                <br>
                <br>
                It was the age of wisdom,
                it was the age of foolishness;
                <br>
                <br>
                It was the epoch of belief,
                it was the epoch of incredulity
                ...
                </body></html>
                """;
    public static final String BOOK_NAME = "A Tale of Two Cities -by Charles Dickens";
    FlowLayout flow = new FlowLayout();
    JPanel headingPanel = new JPanel(new FlowLayout());
    JLabel headingLabel = new JLabel("Quote: ");

    JPanel textPanel = new JPanel(new FlowLayout());
    JLabel quoteLabel = new JLabel(QUOTE_A_TALE_OF_TWO_CITIES);
    JPanel bookPanel = new JPanel(new FlowLayout());
    JLabel bookLabel = new JLabel();
    JPanel container = new JPanel(new BorderLayout());
    private boolean toggleOn = false;

    public JBookQuote() {
        super("Opening sentence from my favorite book");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        headingPanel.add(headingLabel);
        textPanel.add(quoteLabel);
        bookPanel.add(bookLabel);
        container.add(headingPanel, BorderLayout.NORTH);
        container.add(textPanel, BorderLayout.CENTER);

        JButton buttonShowBook = new JButton("Reveal");
        buttonShowBook.addActionListener(e -> {
            if (toggleOn){
                buttonShowBook.setText("Reveal");
                bookLabel.setText("");
                toggleOn = false;
            } else {
                bookLabel.setText(BOOK_NAME);
                toggleOn = true;
                buttonShowBook.setText("Hide");
            }
        });
        bookPanel.add(buttonShowBook);
        container.add(bookPanel, BorderLayout.SOUTH);
        add(container);
    }

    public static void main(String[] args) {
        JBookQuote bookFrame = new JBookQuote();
        bookFrame.setSize(500, 300);
        bookFrame.setVisible(true);
    }
}
