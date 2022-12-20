import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class numberGenerator implements ActionListener{
    private JLabel label;
    private JFrame frame;
    private JPanel panel;
 

    public numberGenerator(){
        label = new JLabel("Click on the button to generate a random number!");

        //Setting up the button
        JButton button = new JButton();
        button = new JButton("Click here");
        button.addActionListener((ActionListener) this);

        panel = new JPanel(); // Creating a new panel
        frame = new JFrame(); // Creating a new frame 
        panel.setBorder(BorderFactory.createEmptyBorder(60, 30, 30, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        // Setting up the layout of the frame
        frame.setTitle("My Frame");
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 240);
        frame.setResizable(true);
        frame.setVisible(true);
    }
    // Generating random number everytime the button is clicked on
    @Override
    public void actionPerformed(ActionEvent e) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        label.setText("Number Generated: " + randomNumber);
    }

    public static void main(String[] args) {
        {
            new numberGenerator();  // Invoking the numberGenerator Constructor   
        }
    }
}