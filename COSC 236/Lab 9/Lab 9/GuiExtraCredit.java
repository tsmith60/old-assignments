// Ted Smith III   Cosc 236 Section 003
//Lab 9 Extra Credit Gui


import java.awt.*;
import java.awt.event.*;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
public class GuiExtraCredit extends Frame implements WindowListener {
	
	JTextField text = new JTextField(20);
    JLabel label1 = new JLabel("User's ID");
    
    
    JLabel label2 = new JLabel("Password");
    JTextField input = new JTextField(20);
    
    JButton bSubmit;
    JTextArea authorize;
    
   
    
	public static void main(String[] args){
		
		GuiExtraCredit yay = new GuiExtraCredit("Lab 9 Extra Credit");
		yay.setSize(300,200);
		yay.setLayout(new FlowLayout());
		yay.setVisible(true);
	}
	public GuiExtraCredit(String title) {
        super(title);
        setLayout(new FlowLayout());
        addWindowListener(this);
        
        bSubmit = new JButton("Submit"); 
        authorize = new JTextArea(20,20);
        add(label1);
        
        add(text);
        add(label2);
        add(input);
        add(bSubmit);
        
        add(authorize);
        
        MyActionHandler authHandler = new MyActionHandler();
        bSubmit.addActionListener(authHandler);
}
	 public void actionPerformed(ActionEvent e) {
        
         
        

        
 }
	public class MyActionHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {//Authentication Method

           String inputTextFieldValue = text.getText();
                     
           
        
           authorize.setText("Hey "+ inputTextFieldValue + " your login was successful!!");
            
           

       }
	}
	public void windowClosing(WindowEvent e) {
        
        System.exit(0);
}
	public void windowOpened(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
}
