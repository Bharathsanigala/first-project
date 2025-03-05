import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

import javax.swing.*;

public class TextField implements ActionListener {
    JTextField textField1;
    JTextField textField2;
    JTextField textField3;
    JButton button;
    JPanel panel;
    JFrame frame;
    Font myFont = new Font("Ink Free", Font.BOLD, 30);
    String[] arr = {
        "Hello there!", 
        "Have a great day! 🙂", 
        "Keep shining like a star! 🌟", 
        "You're awesome! 😎", 
        "Stay positive, stay happy! 😃", 
        "Believe in yourself! 💪", 
        "Good vibes only! ✨", 
        "You got this! 💖", 
        "Stay strong! 💪", 
        "Dream big and never stop! 🎉", 
        "Make today amazing! 💫", 
        "Let's keep pushing forward! 🔥", 
        "Be kind, be brave! ❤️", 
        "Celebrate life! 🎈", 
        "Laugh like there's no tomorrow! 😂", 
        "The sky's the limit! ☁️", 
        "Spread love everywhere you go! ❤️", 
        "Every day is a new adventure! 🌍", 
        "Let’s enjoy the journey! 🦄", 
        "Life is a beautiful ride! 🎠", 
        "Never stop exploring! 🌍", 
        "Keep calm and carry on! 🧘‍♂️", 
        "Smiles are contagious! 😁", 
        "Stay humble, work hard, be kind! 🌸"
    };
    String arrayString = Arrays.toString(arr);
    

    TextField (){
        
        frame = new JFrame("TEXT CHECKING.!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,550);
        frame.setLayout(null);
        

        textField1 = new JTextField();
        textField1.setBounds(600, 700, 250, 50);
        textField1.setBackground(Color.BLACK);
        textField1.setForeground(Color.white);
        textField1.setCaretColor(Color.white);
        textField1.setFont(myFont);

        button = new JButton("SUBMIT");
        button.setBounds(850,700,200,50);
        button.setFocusable(false);
        button.setFont(myFont);
        button.addActionListener(this);

        textField2 = new JTextField();
        textField2.setBounds(0,0,800,350);
        textField2.setBackground(Color.BLACK);
        textField2.setForeground(Color.white);
        textField2.setFont(myFont);
        textField2.setEditable(false);
        textField2.setHorizontalAlignment(textField2.CENTER);


        textfieldRunner();

        frame.add(textField2);
        frame.add(button);
        frame.add(textField1);
        frame.setVisible(true);
       

    }
    public void textfieldRunner(){
        textField3 = new JTextField();
        textField3.setBounds(350,0,800,350);
        textField3.setBackground(Color.BLACK);
        textField3.setForeground(Color.white);
        textField3.setFont(myFont);
        textField3.setEditable(false);
       

        
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
            if (e.getSource()==button) {
                frame.add(textField3);
                textField2.setBounds(0,0,320,350);
            }

            Random random = new Random();
           int randomIndex = random.nextInt(arr.length);
           String randomElement = arr[randomIndex];
           textField3.setText(randomElement);
        }
        
}
}