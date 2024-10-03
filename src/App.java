
public class App {

  public static void main(String[] args) {
   
    AsteriskLogger newAL = new AsteriskLogger();
    SpacedLogger newSL = new SpacedLogger();
    
    newAL.log("Iron Man");
    System.out.println();
    newAL.error("Iron Man");
    System.out.println();
    System.out.println("Iron Man");
    
    newSL.log("Iron Man");
    System.out.println();
    newSL.error("Iron Man");
    System.out.println();
  }

}
