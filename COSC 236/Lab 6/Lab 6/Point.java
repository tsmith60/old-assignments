
public class Point{
  int x;
  int y;
  
  public void Point () {
    x = 0;
    y = 0;
  }
 public Point (int nX,int nY) {
    x = nX;
    y = nY;
  }
  
  
  public String toString() {
    return "Point(" + x + ", " + y + ")";
  }
  public void setLocation(int neX, int neY){
    x = neX;
    y= neY;
  }
  public void translate(int dx, int dy){
    setLocation(x + dx, y + dy);
  }
}