public class SimpleCalculator {
private int result;
  public int add(int a, int b) { return a+b;}
  public int substract(int a, int b) {
    if(a>=b) {
      return a - b;
    } else {
      return b - a; 
    }    
}
