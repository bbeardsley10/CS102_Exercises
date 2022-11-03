package Exercise08;

/**
 * mainClass
 */
public class mainClass {
  
    public static void main(String[] args) {
      System.out.println(factorial_recursive(5));
      towerOfHanoi(3, "A", "B", "C");  
    }
    static void towerOfHanoi(int numOfDiscs, String from, String to, String helper){
      if(numOfDiscs == 0){
        return;
      }
      towerOfHanoi(numOfDiscs -1, from, helper, to);
      System.out.println("Move disk  1 from " + from + " to " + to);
      towerOfHanoi(numOfDiscs -1, helper, to, from);
    }
  
    static int factorial (int n){
      int result = 1;
  
      for(int i = 1; i <= n; i++){
        result = result *i;
  
      }
      return result;
    }
  
    static int factorial_recursive(int n) {
      if(n ==1){
        return 1;
      }
      return n* factorial(n-1);
    }
  }