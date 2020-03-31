
/*Lab 3 Problem 1
  Ted Smith III 
  COSC 236-003 */

public class ParameterMystery {
    public static void main(String[] args) {
        int a = 10,  b = 6,  c = -2;
        parammystery(a, b, c);
        parammystery(c, 5, a);
        parammystery(a + b, b + c, c + a);
    }
 
    public static void parammystery(int c, int a, int b) {
        b -= 3;
        c = a + 5;
        a = a - b;
        System.out.println(b + " ^ " + c + " = " + a);
    }
}
/* The output is given once i fixed the error -5 ^ 11 = 11
                                               7 ^ 10 = -2
                                               5 ^ 9 = -1   */