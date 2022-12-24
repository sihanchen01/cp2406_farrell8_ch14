// User selects pizza topping and sees price
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DebugFourteen3 extends JFrame implements ItemListener
{
   FlowLayout flow = new FlowLayout();
   JComboBox<String> pizzaBox = new JComboBox<String>();
   JLabel toppingList = new JLabel("Topping List");
   JLabel aLabel = new JLabel("Paulos's American Pie");
   JTextField totPrice = new JTextField(10);
   int[] pizzaPrice = {7, 10, 10, 8, 8, 8, 8};
   int totalPrice = 0;
   String output;
   int pizzaNum;
   public DebugFourteen3() {
       super("Pizza List");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLayout(flow);
       pizzaBox.addItemListener(this);
       add(toppingList);
       add(pizzaBox);
       pizzaBox.addItem("cheese");
       pizzaBox.addItem("sausage");
       pizzaBox.addItem("pepperoni");
       pizzaBox.addItem("onion");
       pizzaBox.addItem("green pepper");
       pizzaBox.addItem("green olive");
       pizzaBox.addItem("black olive");
       add(aLabel);
       add(totPrice);
   }
   public static void main(String[] arguments) {
      JFrame frame = new DebugFourteen3();
      frame.setSize(400, 200);
      frame.setVisible(true);
   }

   @Override
   public void itemStateChanged(ItemEvent e) {
     Object source = e.getSource();
     if(source == pizzaBox) {
        int pizzaNum = pizzaBox.getSelectedIndex();
        totalPrice = pizzaPrice[pizzaNum];
        output = "Pizza Price $" + totalPrice;
        totPrice.setText(output);
     }
   }
}