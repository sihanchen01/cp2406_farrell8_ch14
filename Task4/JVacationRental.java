import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JVacationRental extends JFrame implements ItemListener {
    ButtonGroup roomGroup = new ButtonGroup();
    JLabel roomLabel = new JLabel("Room type: ");
    JCheckBox roomParkSide = new JCheckBox("Parkside room", false);
    JCheckBox roomPoolSide = new JCheckBox("Poolside room", false);
    JCheckBox roomLakeSide = new JCheckBox("Lakeside room", false);

    ButtonGroup bedroomGroup = new ButtonGroup();
    JLabel bedroomLabel = new JLabel("# of bedrooms: ");
    JCheckBox bedroom1 = new JCheckBox("1 bedroom", false);
    JCheckBox bedroom2 = new JCheckBox("2 bedroom", false);
    JCheckBox bedroom3 = new JCheckBox("3 bedroom", false);

    ButtonGroup mealGroup = new ButtonGroup();
    JLabel mealLabel = new JLabel("Need meal? ");
    JCheckBox yes = new JCheckBox("yes", false);
    JCheckBox no = new JCheckBox("no", false);
    JLabel totalPriceLabel = new JLabel("Total price: 0");
    private int totalPrice = 0;

    public JVacationRental() {
        super("Custom your vacation rental!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(roomLabel);
        add(roomParkSide);
        roomParkSide.addItemListener(this);
        add(roomPoolSide);
        roomPoolSide.addItemListener(this);
        add(roomLakeSide);
        roomLakeSide.addItemListener(this);
        bedroomGroup.add(roomParkSide);
        bedroomGroup.add(roomLakeSide);
        bedroomGroup.add(roomPoolSide);

        add(bedroomLabel);
        add(bedroom1);
        bedroom1.addItemListener(this);
        add(bedroom2);
        bedroom2.addItemListener(this);
        add(bedroom3);
        bedroom3.addItemListener(this);
        bedroomGroup.add(bedroom1);
        bedroomGroup.add(bedroom2);
        bedroomGroup.add(bedroom3);

        add(mealLabel);
        add(yes);
        yes.addItemListener(this);
        add(no);
        no.addItemListener(this);
        mealGroup.add(yes);
        mealGroup.add(no);

        add(totalPriceLabel);
    }

    public static void main(String[] args) {
        JVacationRental frame = new JVacationRental();
        frame.setSize(600, 400);
        frame.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        Object source = e.getSource();
        if (source == roomParkSide) {
            totalPrice += 600;
        } else if (source == roomPoolSide) {
            totalPrice += 750;
        } else if (source == roomLakeSide) {
            totalPrice += 825;
        } else if (source == yes) {
            totalPrice += 200;
        } else if (source == bedroom1) {
            totalPrice += 75;
        } else if (source == bedroom2) {
            totalPrice += 150;
        } else if (source == bedroom3) {
            totalPrice += 225;
        }
        totalPriceLabel.setText("Total price: " + totalPrice);
    }
}
