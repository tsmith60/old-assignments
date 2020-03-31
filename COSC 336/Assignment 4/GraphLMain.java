//==============================================================
 // Shortest Path Program Main Method
 //==============================================================
 // Ted SMith III
 // COSC 336-001
 // 11-29-2014
 //--------------------------------------------------------------

public class GraphLMain {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  GraphL graph = new GraphL();
 
  graph.firstVertex.linkIt(2,5);
  graph.firstVertex.linkIt(3,8);
  graph.firstVertex.linkIt(5,7);
  graph.firstVertex.linkIt(6,10);
  
  graph.linkItCom(2,3,1);
  graph.linkItCom(2,5,3);
  graph.linkItCom(3,4,6);
  graph.linkItCom(5,4,4);
  graph.linkItCom(5,7,7);
  graph.linkItCom(5,6,2);
  graph.linkItCom(6,7,3);
  graph.linkItCom(7,3,4);
  graph.linkItCom(7,4,5);
  
  graph.dijsk();//This will do dijsk
  
  
  
  //BellMan Ford
  GraphL graphBF = new GraphL();
  
  graphBF.firstVertex.linkIt(2,5);
  graphBF.firstVertex.linkIt(3,8);
  graphBF.firstVertex.linkIt(5,7);
  graphBF.firstVertex.linkIt(6,10);
  
  graphBF.linkItCom(2,3,-1);
  graphBF.linkItCom(2,5,-3);
  graphBF.linkItCom(3,4,6);
  graphBF.linkItCom(5,4,4);
  graphBF.linkItCom(5,7,7);
  graphBF.linkItCom(5,6,2);
  graphBF.linkItCom(6,7,-3);
  graphBF.linkItCom(7,3,4);
  graphBF.linkItCom(7,4,5);
  
  graphBF.bellFord();//This will do Bellman Ford
 
  
 }

}
