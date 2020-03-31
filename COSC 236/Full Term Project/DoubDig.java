import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class DoubDig implements ActionListener {

	
	int scorecount;
	JFrame end = new JFrame();
	JPanel top = new JPanel(new FlowLayout());
	JPanel middle = new JPanel();
	public DoubDig(int scorecount1){
		scorecount = scorecount1;
		
	}
	
	
	public void actionPerformed(ActionEvent event){
		if(scorecount >=300){
		end.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     end.setLocation(new Point(500, 50));
	     end.setSize(new Dimension(300, 300));
	     end.setTitle("Your Progress!!");
	     
	     end.setLayout(new BorderLayout());
	     
	     
	     JLabel results = new JLabel();
	     results.setText("You Won!!!");
	     middle.add(results);
	     end.add(middle,BorderLayout.CENTER);
	     end.setVisible(true);
		}
		else{
			end.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		     end.setLocation(new Point(500, 50));
		     end.setSize(new Dimension(300, 300));
		     end.setTitle("Your Progress!!");
		     
		     end.setLayout(new BorderLayout());
		     
		     
		     JLabel results = new JLabel();
		     results.setText("):  You Lost. Study harder!! :(");
		     middle.add(results);
		     end.add(middle,BorderLayout.CENTER);
		     end.setVisible(true);
			}
	}
}