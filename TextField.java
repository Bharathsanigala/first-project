import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TextField implements ActionListener {
    JTextField textField1;
    JTextField textField2;
    JButton button;
    JPanel panel;
    JFrame frame;
    Font myFont = new Font("Ink Free", Font.BOLD, 30);

    TextField (){
        
        frame = new JFrame("TEXT CHECKING.!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,550);
        frame.setLayout(null);
        

        textField1 = new JTextField();
        textField1.setBounds(50, 430, 250, 50);
        textField1.setBackground(Color.BLACK);
        textField1.setForeground(Color.white);
        textField1.setCaretColor(Color.white);
        textField1.setFont(myFont);

        button = new JButton("SUBMIT");
        button.setBounds(300,430,200,50);
        button.setFocusable(false);
        button.setFont(myFont);
        button.addActionListener(this);

        // panel = new JPanel();
        // panel.setBounds(0,0,320,350);
        // panel.setBackground(Color.BLACK);
        // panel.setForeground(Color.white);
        // panel.setFont(myFont);
        // panel.setLayout(null);

        textField2 = new JTextField();
        textField2.setBounds(0,0,320,350);
        textField2.setBackground(Color.BLACK);
        textField2.setForeground(Color.white);
        textField2.setFont(myFont);
        textField2.setEditable(false);
        textField2.setHorizontalAlignment(textField2.CENTER);

        frame.add(textField2);
        frame.add(button);
        frame.add(textField1);
        frame.setVisible(true);


    }
    public static void main(String[] args) {
        TextField text = new TextField();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            String inputText = textField1.getText();  
            textField2.setText(inputText); 
            textField1.setText("");  
        }
    }
}
