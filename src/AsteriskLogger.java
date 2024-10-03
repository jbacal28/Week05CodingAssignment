
public class AsteriskLogger implements Logger {

  @Override
  public void log(String logMessage) {
  
    System.out.println("***" + logMessage + "***");

  }
  
  @Override
  public void error(String errorMessage) {
    String count ="";
    for (int index =0; index <12 + errorMessage.length(); index ++) {
      count += "*";
    }
    
    System.out.println(count);
    System.out.println("***Error: " + errorMessage + "***");
    System.out.println(count);
    
  }

}
