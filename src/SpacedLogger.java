
public class SpacedLogger implements Logger{

    public void log(String logMessage) {
      StringBuilder newString = new StringBuilder();
      String spacer = " ";
      
      for (int index = 0; index < logMessage.length(); index ++ ) {
        newString.append(logMessage.charAt(index) + spacer );
        
      }

      newString.deleteCharAt(newString.length()-1);
      System.out.println(newString);
  }

    public void error(String errorMessage) {
      StringBuilder newString = new StringBuilder();
      String spacer = " ";
    
      for (int index = 0; index < errorMessage.length(); index ++ ) {
        newString.append(spacer + errorMessage.charAt(index));
        
      }
      System.out.println("ERROR" + newString);
    }
    
}
