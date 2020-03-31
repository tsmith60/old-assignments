//Ted Smith III   Cosc 236 Section 003
//  Lab 6 Problem 3

public class TimeSpan{
  int hours;
  int minutes;
  int timespan = hours + (minutes/60) + (minutes%60);
  
  public TimeSpan(){
    hours = 0;
    minutes = 0;
  }
  public TimeSpan (int hours1, int minutes1){
    
    hours = hours1;
    
    minutes = minutes1;
    
    
  }
  
  public int add( int hours2, int minutes2){
     int minutestotal = (minutes2/60) + (minutes2%60);
    
   hours += hours2;
   minutes += minutestotal;
   if( minutes >= 59){
     hours += (minutes/60);
     minutes = (minutes%60);
   }
   else{
     minutes = minutes;
   }
    return timespan;
  }
  public int add(TimeSpan timespan1){
    timespan += timespan1.timespan;
    return timespan;
}
  public String toString(){
    
    return hours+ " hours " + minutes+ " min";
  }
  public double getTotalHours(){
    double minus = ((double)(minutes)/60);
    double newtimespan = hours + (minus);
    return newtimespan;
  }
  public boolean equals(TimeSpan tx){
    if ((tx.hours==hours)&&(tx.minutes==minutes)){
      return true;
    }
    else{
      return false;
    }
  }
}