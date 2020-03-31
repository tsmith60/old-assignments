
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TutListener implements ActionListener {
	
	JFrame tut = new JFrame();
	JPanel top = new JPanel(new FlowLayout());
	JPanel middle = new JPanel();
	public void actionPerformed(ActionEvent event){
		 String s = "The user must click on the questions and input the letter of the answer the user thinks is correct. "
    		+ "The way to win the game is to reach 300 points. If you answer the question correctly,you will gain the amount of points listed on the question chosen."
    		+ "the question correctly. If you amswer the question incorrectly, you will lose half the amount of points listed on the question. "
    		+ "When you are done answering questions, press the done button so you can receive your ranking.";
	        String html1 = "<html><body style='width: ";
	        String html2 = "px'>";
	
    tut.setLocation(new Point(50, 50));
    tut.setSize(new Dimension(400, 300));
    tut.setTitle("Instructions");
    tut.setLayout(new BorderLayout());
    
    
    JLabel instruct = new JLabel();
    instruct.setText(html1+"300"+html2+s);
    /*instruct.setText("The way to play the game is very simple.\n "
    		+ "The user must click on the questions and input the letter of the answer he she thinks is correct\n "
    		+ "The way to win the game is to reach 600 points. ");
    instruct.setVerticalAlignment(SwingConstants.TOP);*/
    top.add(instruct);
    
    
    
    
    
    tut.add(top, BorderLayout.NORTH);
    
    JLabel random = new JLabel();
    random.setText("Have fun!!!!");
    middle.add(random);
    tut.add(middle);
    tut.setVisible(true);
	}
}
