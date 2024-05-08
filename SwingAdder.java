import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SwingAdder extends JFrame {

    private JLabel sumLabel;
    private JTextField firstTextField;
    private JTextField secondTextField;

    public SwingAdder() {
        setTitle("Swing Adder");
        setSize(300, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        sumLabel = new JLabel("The sum of the two integers is: ");
        firstTextField = new JTextField(10);
        secondTextField = new JTextField(10);

        // Add key listener to the second text field
        secondTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {}

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    calculateSum();
                }
            }
        });

        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.add(new JLabel("First Integer: "));
        contentPane.add(firstTextField);
        contentPane.add(new JLabel("Second Integer: "));
        contentPane.add(secondTextField);
        contentPane.add(sumLabel);

        setVisible(true);
    }

    private void calculateSum() {
        try {
            int firstInt = Integer.parseInt(firstTextField.getText());
            int secondInt = Integer.parseInt(secondTextField.getText());
            int sum = firstInt + secondInt;
            sumLabel.setText("The sum of the two integers is: " + sum);
        } catch (NumberFormatException ex) {
            sumLabel.setText("Invalid input!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SwingAdder::new);
    }
}
