import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    // Step 2: Create an object of this class in the main method
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }

    // Step 3: Set appropriate frame properties in the constructor
    public MyFrame() {
        setTitle("My Swing Application");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Step 4: Create GUI components and add them to the frame
        JButton myButton = new JButton("Click Me");
        JTextField myTextField = new JTextField(10);

        // Step 5: Create content pane and add components
        Container contentPane = getContentPane();
        contentPane.add(myButton);
        contentPane.add(myTextField);

        // Step 6: Handle events (if necessary)
        myButton.addActionListener(e -> {
            // Task to be performed when the button is clicked
            String text = myTextField.getText();
            JOptionPane.showMessageDialog(this, "You entered: " + text);
        });

        // Step 7: Make the frame visible
        setVisible(true);
    }
}