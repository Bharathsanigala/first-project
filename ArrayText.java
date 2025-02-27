import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ArrayText  extends JFrame implements ActionListener{
    JTextField textField;
    JButton button;
    JPanel panel;
    ArrayText(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        button = new JButton("SUBMIT");
        button.addActionListener(this);
        button.setFocusable(false);
        button.setBounds(50,430,145,50);

       // panel = new JPanel();
        //panel.setLayout(new FlowLayout());
       //panel.setBounds(0, 100, 420, 420);;
        
       

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,50));
        textField.setBounds(0, 100, 500, 500);;
        textField.setBackground(Color.BLACK);
        textField.setForeground(Color.white);
        textField.setCaretColor(Color.white);
        textField.setFont(new Font("Consolas", Font.BOLD,25));

        this.add(textField);
        this.add(button);
       // this.add(panel);

        
        this.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            textField.getText();
            System.out.println("HELLO " + textField.getText());
        }
    }
    public static void main(String[] args) {
        ArrayText arrayText = new ArrayText();
    }
   
}

    


