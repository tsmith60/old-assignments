// Ted Smith III Cosc 236-003
// Programming Assignment 3

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class TestClimate {
 public static void main (String [] args)
 throws FileNotFoundException{
	 
	 Scanner input = new Scanner(new File("/Users/Teddy2FastHB/Documents/Text Files for lab/data.txt"));
	    ArrayList<String> ted = new ArrayList<String>();
	    
	   
	    build(ted,input);// Method for Question 1/ Method for Building
	    System.out.println();
	    System.out.println();
	    System.out.println();
	    
	   
	   spaceon();
	    ArrayList<Climate> ClimateLog = new ArrayList<Climate>();
	    
	    decompose(ted,ClimateLog);//Method for Question2/ Method for Decomposing
	   
	    	
     spaceon();
     
     ArrayList<YearTemp> comeon = new ArrayList<YearTemp>();
     
     
     map(ClimateLog,comeon);// Method for Question 3/ Mapping
     System.out.println();
     System.out.println();
     System.out.println();
    AllInOne aio = new AllInOne();
    
    spaceon();
    
     shuffle(comeon,aio);// Method for Question 4/ Method for Shuffling
     
    spaceon();
    
     reduce(aio); // Method for Question 5/ Method for Reducing
     
 }
 public static void build(ArrayList<String>ted, Scanner input){//Start of the creation of method for
	 //Question 1 (Method for Building)
	 while (input.hasNextLine()){
	      ted.add(input.nextLine());
	    }
	    String[] mine = ted.toArray(new String[ted.size()]);
	    for(int i = 0; i < ted.size(); i++){
	      mine[i]=ted.get(i);
	      
	    
	      System.out.println(ted.get(i));
	    }
 }
 public static void decompose(ArrayList<String> ted, ArrayList<Climate> ClimateLog){// Start of the Creation 
	// of method for Question 2  (Method for Decomposing)
	 
	 String tempor = ted.get(0);
 	String kid = "1";
 	int year1 = Integer.parseInt(tempor.substring(7,11));
 	
 	String code1 = tempor.substring(11,14);
 double	 temp1 = (double) Integer.parseInt(tempor.substring(19,21));
 System.out.println(kid+" "+ year1+ " " + code1 + " " + temp1);
 
 Climate tempClimate = new Climate(kid,year1,code1,temp1);
 
 ClimateLog.add(tempClimate);
 // First set
 
 String tempor2 = ted.get(1);
	String kid1 = "2";
	int year2 = Integer.parseInt(tempor2.substring(7,11));
	
	String code2 = tempor2.substring(11,15);
	double temp2 = (double) Integer.parseInt(tempor2.substring(20,22));
 
	 Climate tempClimate1 = new Climate(kid1,year2,code2,temp2);
ClimateLog.add(tempClimate1);
System.out.println( kid1 + " " +year2+ " " + code2 + " " + temp2);
 // Second Set


String tempor3 = ted.get(2);
String kid2 = "3";
int year3 = Integer.parseInt(tempor3.substring(7,11));

String code3 = tempor3.substring(11,15);
double temp3 = (double) Integer.parseInt(tempor3.substring(19,21));
 
 Climate tempClimate2 = new Climate(kid2,year3,code3,temp3);
ClimateLog.add(tempClimate2);


System.out.println( kid2 + " " +year3+ " " + code3 + " " + temp3);
 // Third Set

for (int i = 3; i <= 6; i++){
	   

String tempor4 = ted.get(i);
	String kid3 = ""+(i+1);
	int year4 = Integer.parseInt(tempor4.substring(7,11));
	
	String code4 = tempor4.substring(11,15);
	double temp4 = (double) Integer.parseInt(tempor4.substring(18,22));
	    System.out.println(kid3+ " "+year4 + " "+ code4 + " "+ " " + temp4);
	 Climate tempClimate3 = new Climate(kid3,year4,code4,temp4);
	   ClimateLog.add(tempClimate3);
	   // first loop with 4 code
}  
for (int i = 7; i <= 8; i++){
	   
	   
	   String tempor4 = ted.get(i);
	   	String kid3 = ""+(i+1);
	 int  year4 =  Integer.parseInt(tempor4.substring(7,11));
	   	
	String  code4 = tempor4.substring(11,15);
	   double temp4 =(double) Integer.parseInt(tempor4.substring(18,21));
		    System.out.println(kid3+ " "+year4 + " "+ code4 + " "+ " " + temp4);
		  Climate tempClimate3 = new Climate(kid3,year4,code4,temp4);
		   ClimateLog.add(tempClimate3);
		   
		   
 	
}
// 8-9
for (int i = 9; i <= 10; i++){
	   
	   
	   String tempor4 = ted.get(i);
	   	String kid3 = ""+(i+1);
	int   year4 =  Integer.parseInt(tempor4.substring(8,12));
	   	
	String   	code4 = tempor4.substring(12,15);
	double   	 temp4 = (double) Integer.parseInt(tempor4.substring(19,22));
		    System.out.println(kid3+ " "+year4 + " "+ code4 + " "+ " " + temp4);
  Climate tempClimate3 = new Climate(kid3,year4,code4,temp4);
	 ClimateLog.add(tempClimate3);

// 10 - 11
}
for (int i = 11; i <= 11; i++){
	   
	   
	   String tempor4 = ted.get(i);
	   	String kid3 = ""+(i+1);
	  int year4 =  Integer.parseInt(tempor4.substring(8,12));
	   	
	 String  	code4 = tempor4.substring(12,16);
	double   	 temp4 = (double) Integer.parseInt(tempor4.substring(19,23));
		    System.out.println(kid3+ " "+year4 + " "+ code4 + " "+ " " + temp4);
	 Climate tempClimate3 = new Climate(kid3,year4,code4,temp4);
	 ClimateLog.add(tempClimate3);
}//4 Character long one
for (int i = 12; i <= 12; i++){
	   
	   
	   String tempor4 = ted.get(i);
	   	String kid3 = ""+(i+1);
	int   year4 =  Integer.parseInt(tempor4.substring(8,12));
	   	
	 String  	code4 = tempor4.substring(12,16);
	 double  	 temp4 = (double) Integer.parseInt(tempor4.substring(19,22));
		    System.out.println(kid3+ " "+year4 + " "+ code4 + " "+ " " + temp4);
	 Climate tempClimate3 = new Climate(kid3,year4,code4,temp4);
	 ClimateLog.add(tempClimate3);
}//3 character long one
for (int i = 13; i < 14; i++){
	   
	   
	   String tempor4 = ted.get(i);
	   	String kid3 = ""+(i+1);
	 int  year4 =  Integer.parseInt(tempor4.substring(8,12));
	   	
	String   	code4 = tempor4.substring(12,16);
	double   	 temp4 = (double) Integer.parseInt(tempor4.substring(19,23));
		    System.out.println(kid3+ " "+year4 + " "+ code4 + " "+ " " + temp4);
	  Climate tempClimate3 = new Climate(kid3,year4,code4,temp4);
	 ClimateLog.add(tempClimate3);
}// 4 character long code rep
for (int i = 14; i < 15; i++){
	   
	   
	   String tempor4 = ted.get(i);
	   	String kid3 = ""+(i+1);
	int   year4 =  Integer.parseInt(tempor4.substring(8,12));
	   	
	String   	code4 = tempor4.substring(12,16);
	double   	 temp4 = (double) Integer.parseInt(tempor4.substring(20,24));
		    System.out.println(kid3+ " "+year4 + " "+ code4 + " "+ " " + temp4);
	  Climate tempClimate3 = new Climate(kid3,year4,code4,temp4);
	 ClimateLog.add(tempClimate3);
}// 4 character long code rep
for (int i = 15; i <= 16; i++){
	   
	   
	   String tempor4 = ted.get(i);
	   	String kid3 = ""+(i+1);
	int   year4 =  Integer.parseInt(tempor4.substring(8,12));
	   	
	String   	code4 = tempor4.substring(12,16);
	double   	 temp4 = (double) Integer.parseInt(tempor4.substring(20,23));
		    System.out.println(kid3+ " "+year4 + " "+ code4 + " "+ " " + temp4);
	  Climate tempClimate3 = new Climate(kid3,year4,code4,temp4);
	 ClimateLog.add(tempClimate3);
}// 4 character long code rep again
for (int i = 17; i <= 20; i++){
	   
	   
	   String tempor4 = ted.get(i);
	   	String kid3 = ""+(i+1);
	int   year4 =  Integer.parseInt(tempor4.substring(8,12));
	   	
	String   	code4 = tempor4.substring(12,16);
	double   	 temp4 = (double) Integer.parseInt(tempor4.substring(19,22));
		    System.out.println(kid3+ " "+year4 + " "+ code4 + " "+ " " + temp4);
	 Climate tempClimate3 = new Climate(kid3,year4,code4,temp4);
	 ClimateLog.add(tempClimate3);
}// 3 character wide section rep
for (int i = 21; i <= 21; i++){
	   
	   
	   String tempor4 = ted.get(i);
	   	String kid3 = ""+(i+1);
	  int year4 =  Integer.parseInt(tempor4.substring(8,12));
	   	
	 String  	code4 = tempor4.substring(12,16);
	 double  	 temp4 =(double) Integer.parseInt(tempor4.substring(19,23));
		    System.out.println(kid3+ " "+year4 + " "+ code4 + " "+ " " + temp4);
	  Climate tempClimate3 = new Climate(kid3,year4,code4,temp4);
	 ClimateLog.add(tempClimate3);
}//4 Character long one
for (int i = 22; i <= 22; i++){
	   
	   
	   String tempor4 = ted.get(i);
	   	String kid3 = ""+(i+1);
	 int  year4 =  Integer.parseInt(tempor4.substring(8,12));
	   	
	 String  	code4 = tempor4.substring(12,16);
	 double  	 temp4 = (double) Integer.parseInt(tempor4.substring(19,22));
		    System.out.println(kid3+ " "+year4 + " "+ code4 + " "+ " " + temp4);
	  Climate tempClimate3 = new Climate(kid3,year4,code4,temp4);
	 ClimateLog.add(tempClimate3);
}//3 character long one
for (int i = 23; i < 24; i++){
	   
	   
	   String tempor4 = ted.get(i);
	   	String kid3 = ""+(i+1);
	  int year4 =  Integer.parseInt(tempor4.substring(8,12));
	   	
	 String  	code4 = tempor4.substring(12,16);
	double   	 temp4 = (double) Integer.parseInt(tempor4.substring(20,23));
		    System.out.println(kid3+ " "+year4 + " "+ code4 + " "+ " " + temp4);
	  Climate tempClimate3 = new Climate(kid3,year4,code4,temp4);
	 ClimateLog.add(tempClimate3);
}// 4 character long code rep
for (int i = 24; i < 25; i++){
	   
	   
	   String tempor4 = ted.get(i);
	   	String kid3 = ""+(i+1);
	int   year4 =  Integer.parseInt(tempor4.substring(8,12));
	   	
	  String 	code4 = tempor4.substring(12,16);
	 double  	 temp4 = (double) Integer.parseInt(tempor4.substring(20,24));
		    System.out.println(kid3+ " "+year4 + " "+ code4 + " "+ " " + temp4);
	  Climate tempClimate3 = new Climate(kid3,year4,code4,temp4);
	 ClimateLog.add(tempClimate3);
}// 4 character long code rep again
for (int i = 25; i <= 26; i++){
	   
	   
	   String tempor4 = ted.get(i);
	   	String kid3 = ""+(i+1);
	int year4 =  Integer.parseInt(tempor4.substring(8,12));
	   	
	   String	code4 = tempor4.substring(12,16);
	   double	 temp4 = (double) Integer.parseInt(tempor4.substring(20,23));
		    System.out.println(kid3+ " "+year4 + " "+ code4 + " "+ " " + temp4);
	  Climate tempClimate3 = new Climate(kid3,year4,code4,temp4);
	 ClimateLog.add(tempClimate3);
}// 4 character long code rep
for (int i = 27; i <= 30; i++){
	   
	   
	   String tempor4 = ted.get(i);
	   	String kid3 = ""+(i+1);
	int   year4 =  Integer.parseInt(tempor4.substring(8,12));
	   	
	String   	code4 = tempor4.substring(12,16);
	  double 	 temp4 = (double) Integer.parseInt(tempor4.substring(19,22));
		    System.out.println(kid3+ " "+year4 + " "+ code4 + " "+ " " + temp4);
	  Climate tempClimate3 = new Climate(kid3,year4,code4,temp4);
	 ClimateLog.add(tempClimate3);
}// 3 character wide section rep
for (int i = 31; i <= 31; i++){
	   
	   
	   String tempor4 = ted.get(i);
	   	String kid3 = ""+(i+1);
	 int  year4 =  Integer.parseInt(tempor4.substring(8,12));
	   	
	  String 	code4 = tempor4.substring(12,16);
	  double 	 temp4 = Integer.parseInt(tempor4.substring(19,23));
		    System.out.println(kid3+ " "+year4 + " "+ code4 + " "+ " " + temp4);
	  Climate tempClimate3 = new Climate(kid3,year4,code4,temp4);
	 ClimateLog.add(tempClimate3);
}//4 Character long one
for (int i = 32; i <= 32; i++){
	   
	   
	   String tempor4 = ted.get(i);
	   	String kid3 = ""+(i+1);
	  int year4 =  Integer.parseInt(tempor4.substring(8,12));
	   	
	 String  	code4 = tempor4.substring(12,16);
	  double 	 temp4 = Integer.parseInt(tempor4.substring(19,22));
		    System.out.println(kid3+ " "+year4 + " "+ code4 + " "+ " " + temp4);
	  Climate tempClimate3 = new Climate(kid3,year4,code4,temp4);
	 ClimateLog.add(tempClimate3);
}//3 character long one
for (int i = 33; i < 34; i++){
	   
	   
	   String tempor4 = ted.get(i);
	   	String kid3 = ""+(i+1);
	 int  year4 =  Integer.parseInt(tempor4.substring(8,12));
	   	
	 String  	code4 = tempor4.substring(12,16);
	  double 	 temp4 = (double) Integer.parseInt(tempor4.substring(20,23));
		    System.out.println(kid3+ " "+year4 + " "+ code4 + " "+ " " + temp4);
	  Climate tempClimate3 = new Climate(kid3,year4,code4,temp4);
	 ClimateLog.add(tempClimate3);
}// 4 character long code rep
for (int i = 34; i < 35; i++){
	   
	   
	   String tempor4 = ted.get(i);
	   	String kid3 = ""+(i+1);
	int   year4 =  Integer.parseInt(tempor4.substring(8,12));
	   	
	 String  	code4 = tempor4.substring(12,16);
	   double	 temp4 = (double) Integer.parseInt(tempor4.substring(20,24));
		    System.out.println(kid3+ " "+year4 + " "+ code4 + " "+ " " + temp4);
	  Climate tempClimate3 = new Climate(kid3,year4,code4,temp4);
	 ClimateLog.add(tempClimate3);
}// 4 character long code rep
for (int i = 35; i <= 36; i++){
	   
	   
	   String tempor4 = ted.get(i);
	   	String kid3 = ""+(i+1);
	  int year4 =  Integer.parseInt(tempor4.substring(8,12));
	   	
	String   	code4 = tempor4.substring(12,16);
	double   	 temp4 = (double) Integer.parseInt(tempor4.substring(20,23));
		    System.out.println(kid3+ " "+year4 + " "+ code4 + " "+ " " + temp4);
	  Climate tempClimate3 = new Climate(kid3,year4,code4,temp4);
	 ClimateLog.add(tempClimate3);
}// 4 character long code rep again

for (int i = 37; i <= 39; i++){
	   
	   
	   String tempor4 = ted.get(i);
	   	String kid3 = ""+(i+1);
	 int  year4 =  Integer.parseInt(tempor4.substring(8,12));
	   	
	  String 	code4 = tempor4.substring(12,16);
	  double 	 temp4 =(double) Integer.parseInt(tempor4.substring(19,22));
		    System.out.println(kid3+ " "+year4 + " "+ code4 + " "+ " " + temp4);
	  Climate tempClimate3 = new Climate(kid3,year4,code4,temp4);
	 ClimateLog.add(tempClimate3);
}// 3 character wide section rep
 }
 public static void map(ArrayList<Climate> heymap, ArrayList<YearTemp> heymapyear){//Start of the Creation of 
	 //the Method for Question (Method for Mapping)
	 for (int i = 0; i < heymap.size(); i++){
    	 YearTemp Yeargoes = new YearTemp();
    	 Climate pleasework;
    	  pleasework = heymap.get(i);
    	  Yeargoes.year = pleasework.year;
    	  Yeargoes.temp = pleasework.temp;
    	  heymapyear.add(Yeargoes);
    	  System.out.println("(" + Yeargoes.year + "," + Yeargoes.temp +")");
	 }
	 
 }
 public static void shuffle(ArrayList<YearTemp> jump, AllInOne jump1){// Start of the creation of the 
	 //Method for Question 4  ( Method for Shuffling)
	 
	 ArrayList<Double> year50 = new ArrayList<Double>();
	 ArrayList<Double> year51 = new ArrayList<Double>();
	 ArrayList<Double> year53 = new ArrayList<Double>();
	 ArrayList<Double> year54 = new ArrayList<Double>();
	 
	 for(int i = 0; i < 40 ; i++){
		 
	 
		 if (jump.get(i).year == 1950){
			 year50.add(jump.get(i).temp);
		 }
	     if ((jump.get(i).year) == 1951){
	    	 year51.add(jump.get(i).temp);
	     }
	    
	     if (jump.get(i).year == 1953){
	    	 year53.add(jump.get(i).temp);
	     }
	     if (jump.get(i).year == 1954){
	    	 year54.add(jump.get(i).temp);
	     }
	     else{
	    	 
	     }
	     
	 }
	
	 jump1.year50 = year50;
	 jump1.year51 = year51;
	 jump1.year53 = year53;
	 jump1.year54 = year54;
	
		 
	 
	 System.out.println("( 1950, " + jump1.year50 + ")");
	 System.out.println("( 1951, " + jump1.year51 + ")");
	 System.out.println("( 1953, " + jump1.year53 + ")");
	 System.out.println("( 1954, " + jump1.year54 + ")");
 }// End of the creation of the method for Question 4 (End of Method for Shuffling)
 
 public static void reduce(AllInOne num5){// Start of the Creation of the  Method  for reducing / 
	 //Start of question 5
	 double max50 = 0;
	 double max51 = 0;
	 double max53 = 0;
	 double max54 = 0;
	 
	 for(int i = 0; i < num5.year50.size(); i++){
		 if(num5.year50.get(i)>max50) max50 = num5.year50.get(i);
		 
		 if(num5.year51.get(i)>max51) max51 = num5.year51.get(i);
	
		 if( num5.year53.get(i)>max53) max53 = num5.year53.get(i);
		 
		 if( num5.year54.get(i)>max54) max54 = num5.year54.get(i);
		 }
	 
	 System.out.println("(1950, " + max50 + ")");
	 System.out.println();
	 System.out.println("(1951, " + max51 + ")");
	 System.out.println();
	 System.out.println("(1953, " + max53 + ")");
	 System.out.println();
	 System.out.println("(1954, " + max54 + ")");
	 System.out.println();
	 }// End of Question 5 (End of the reducing Method)
 public static void spaceon(){
	 System.out.println();
     System.out.println();
     System.out.println();
 }
 
 
	 
	 
 }
 
 
 /*public void build(){}
   public void decompose() {}
   public void map(){}
   public void shuffle(){}
   public void reduce(){}
   */
  

