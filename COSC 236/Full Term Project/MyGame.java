import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGame implements ActionListener {
static int scorecount = 0;
static JFrame frame = new JFrame();
static JPanel questions = new JPanel(new GridLayout(3,3));
static JPanel score = new JPanel(new FlowLayout());//counter
static JTextField tf = new JTextField(12);
static String userName;
static JFrame tut = new JFrame();
static JPanel tutorial = new JPanel(new BorderLayout());
   
     public static void main(String[]args){
	 
	 
	  
     
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setLocation(new Point(500, 50));
     frame.setSize(new Dimension(600, 500));
     frame.setTitle("Ted's Game");
     
     frame.setLayout(new BorderLayout());
     JOptionPane.showMessageDialog(null,
             "Hi the name of the game you will playing today is called Java Trivia!!");
      userName = JOptionPane.showInputDialog(null,"What is your first name?");
      
     for (int i = 1; i <= 9; i++) {// buttons
   	  if (i <= 3){
   	  JButton q1 = new JButton();
   	  q1.setText("25 points : Question " + i);
   	  q1.setBackground(Color.BLUE);
   	  MyGame listener = new MyGame();
   	  q1.addActionListener(listener);

   	 
         questions.add(q1);}
   	  if(i <= 6 && i >3){
   		JButton q1 = new JButton();
     	  q1.setText("50 points : Question " + i);
     	  q1.setBackground(Color.BLUE);
     	  MyGame listener = new MyGame();
     	  q1.addActionListener(listener);

     	 
           questions.add(q1);
           
   	  }
   	  if(i <= 9 && i > 6){
   		JButton q1 = new JButton();
     	  q1.setText("100 points: Question " + i);
     	  q1.setBackground(Color.BLUE);
     	  MyGame listener = new MyGame();
     	  q1.addActionListener(listener);

     	 
           questions.add(q1);
           
   	  }
         
     }
     
     
         frame.add(questions, BorderLayout.CENTER);
         
         
         tf.setText(""+userName +"'s Score: " +scorecount);
         score.add(tf);
         
         
         frame.add(score, BorderLayout.NORTH);

         
         JPanel answers = new JPanel(new GridLayout(4,3));
         /*for (int i1 = 1; i1 <= 9; i1++) {
       	  
       	  
       	  
       	  answers.add(new JLabel(letters[i1-1]));//answers
       ;
             //questions.add(new JButton("p"+3));
         }*/
         
         JLabel a1 = new JLabel("a. true");
         answers.add(a1);
         JLabel a2 = new JLabel("b. primitive type");
         answers.add(a2);
         JLabel a3 = new JLabel("c.  a hierarchical connection");
         answers.add(a3);
         JLabel a4 = new JLabel("d. wrapper class");
         answers.add(a4);
         JLabel a5 = new JLabel("e. inheritance");
         answers.add(a5);
         JLabel a6 = new JLabel("f. interface");
         answers.add(a6);
         JLabel a7 = new JLabel("g. 'a'");
         answers.add(a7);
         JLabel a8 = new JLabel("h.   3");
         answers.add(a8);
         JLabel a9 = new JLabel("i.  \"a\"");
         answers.add(a9);
        /* JLabel a10 = new JLabel("j.  double is to 1.66");
         answers.add(a10);
         JLabel a11 = new JLabel("k.  implement is to interface");
         answers.add(a11);
         JLabel a12 = new JLabel("l.   .size() is to ArrayList");
         answers.add(a12);*/
         frame.add(answers, BorderLayout.SOUTH);
         
         JButton tuto = new JButton();
         tuto.setText("Help!!");
         TutListener tL = new TutListener();
         tuto.addActionListener(tL);
         tutorial.add(tuto,BorderLayout.NORTH);
         
         JButton done = new JButton();
         done.setText("I'm done!!");
         DoubDig end = new DoubDig(scorecount);
         done.addActionListener(end);
         
         tutorial.add(done,BorderLayout.SOUTH);
         frame.add(tutorial,BorderLayout.WEST);
         
          frame.setVisible(true);
     } 

public void actionPerformed(ActionEvent event){////////////////////////////////////////
	JButton o = (JButton)event.getSource();
	String name = o.getText();
	String name2 = name.substring(name.length()-1);
	
	int number = Integer.parseInt(name2);
	

	if (number == 1){
		 String nameinf = JOptionPane.showInputDialog(null,
                 "What is an example of a boolean value?");

		 char c = nameinf.charAt(0);
		 if(c == 'a'){
			 JOptionPane.showMessageDialog(null,
	                    "You are correct!!");
			 
			 scorecount += 25;
			 
			 changeScore(scorecount);
			
			 questions.remove(o);
			 
		  }
		 
		 else{
			 JOptionPane.showMessageDialog(null,
	                    "You are wrong!!");
            scorecount -= 12.5;
            JOptionPane.showMessageDialog(null,
                    "The correct answer is a. true ");
			 changeScore(scorecount);
			 questions.remove(o);
			 
		  }
		 
		
	}
	if(number == 2){
		String nameinf = JOptionPane.showInputDialog(null,
                "What is a is-a relationship?");
		 char c = nameinf.charAt(0);
		 
		 if(c == 'c'){
			 JOptionPane.showMessageDialog(null,
	                    "You are correct!!");
			 
			 scorecount += 25;
			 
			 changeScore(scorecount);
			
			 questions.remove(o);
			 
		  }
		 
		 else{
			 JOptionPane.showMessageDialog(null,
	                    "You are wrong!!");
            scorecount -= 12.5;
            JOptionPane.showMessageDialog(null,
                    "The correct answer is c. a hierarchical connection ");
			 changeScore(scorecount);
			 questions.remove(o);
		  }
	}
	if(number == 3){
		String nameinf = JOptionPane.showInputDialog(null,
                "What type is int?");
		 char c = nameinf.charAt(0);
		 
		 if(c == 'b'){
			 JOptionPane.showMessageDialog(null,
	                    "You are correct!!");
			 
			 scorecount += 25;
			 
			 changeScore(scorecount);
			
			 questions.remove(o);
			 
		  }
		 
		 else{
			 JOptionPane.showMessageDialog(null,
	                    "You are wrong!!");
            scorecount -= 12.5;
            JOptionPane.showMessageDialog(null,
                    "The correct answer is b. primitive type ");
			 changeScore(scorecount);
			 questions.remove(o);
		  }
	}
	if(number == 4){///////////////////////////Start here to make changes
		String nameinf = JOptionPane.showInputDialog(null,
                "An example of a string.");
		 char c = nameinf.charAt(0);
		 
		 if(c == 'i'){
			 JOptionPane.showMessageDialog(null,
	                    "You are correct!!");
			 
			 scorecount += 50;
			 
			 changeScore(scorecount);
			
			 questions.remove(o);
			 
		  }
		 
		 else{
			 JOptionPane.showMessageDialog(null,
	                    "You are wrong!!");
            scorecount -= 25;
            JOptionPane.showMessageDialog(null,
                    "The correct answer is i. \"a\" ");
			 changeScore(scorecount);
			 questions.remove(o);
		  }
	}
	if(number == 5){
		String nameinf = JOptionPane.showInputDialog(null,
                "An example of an int?");
		 char c = nameinf.charAt(0);
		 
		 if(c == 'h'){
			 JOptionPane.showMessageDialog(null,
	                    "You are correct!!");
			 
			 scorecount += 50;
			 
			 changeScore(scorecount);
			
			 questions.remove(o);
			 
		  }
		 
		 else{
			 JOptionPane.showMessageDialog(null,
	                    "You are wrong!!");
            scorecount -= 25;
            JOptionPane.showMessageDialog(null,
                    "The correct answer is h. 3 ");
			 changeScore(scorecount);
			 questions.remove(o);
		  }
	}
	if(number == 6){
		String nameinf = JOptionPane.showInputDialog(null,
                "What type of class is Integer?");
		 char c = nameinf.charAt(0);
		 
		 if(c == 'd'){
			 JOptionPane.showMessageDialog(null,
	                    "You are correct!!");
			 
			 scorecount += 50;
			 
			 changeScore(scorecount);
			
			 questions.remove(o);
			 
		  }
		 
		 else{
			 JOptionPane.showMessageDialog(null,
	                    "You are wrong!!");
            scorecount -= 25;
            JOptionPane.showMessageDialog(null,
                    "The correct answer is d. wrapper class ");
			 changeScore(scorecount);
			 questions.remove(o);
		  }
	}
	if(number == 7){
		String nameinf = JOptionPane.showInputDialog(null,
                "What gives you an is-a relationship without code sharing?");
		 char c = nameinf.charAt(0);
		 
		 if(c == 'f'){
			 JOptionPane.showMessageDialog(null,
	                    "You are correct!!");
			 
			 scorecount += 100;
			 
			 changeScore(scorecount);
			
			 questions.remove(o);
			 
		  }
		 
		 else{
			 JOptionPane.showMessageDialog(null,
	                    "You are wrong!!");
            scorecount -= 50;
            JOptionPane.showMessageDialog(null,
                    "The correct answer is f. interface ");
			 changeScore(scorecount);
			 questions.remove(o);
		  }
	}
	if(number == 8){
		String nameinf = JOptionPane.showInputDialog(null,
                "What gives you an is-a relationship with code sharing?");
		 char c = nameinf.charAt(0);
		 
		 if(c == 'e'){
			 JOptionPane.showMessageDialog(null,
	                    "You are correct!!");
			 
			 scorecount += 100;
			 
			 changeScore(scorecount);
			
			 questions.remove(o);
			 
		  }
		 
		 else{
			 JOptionPane.showMessageDialog(null,
	                    "You are wrong!!");
            scorecount -= 50;
            JOptionPane.showMessageDialog(null,
                    "The correct answer is e. inheritance ");
			 changeScore(scorecount);
			 questions.remove(o);
		  }
	}
	if(number == 9){
		String nameinf = JOptionPane.showInputDialog(null,
                "What is an example of a character?");
		 char c = nameinf.charAt(0);
		 
		 if(c == 'g'){
			 JOptionPane.showMessageDialog(null,
	                    "You are correct!!");
			 
			 scorecount += 100;
			 
			 changeScore(scorecount);
			
			 questions.remove(o);
			 
			 
		  }
		 
		 else{
			 JOptionPane.showMessageDialog(null,
	                    "You are wrong!!");
            scorecount -= 50;
            JOptionPane.showMessageDialog(null,
                    "The correct answer is g. 'a' ");
			 changeScore(scorecount);
			 questions.remove(o);
		  }
	}
	

	
	else{
    
 }
}


public void changeScore(int scorecount){
	
	tf.setText(""+userName +"'s Score: " +scorecount);
	
}



}

