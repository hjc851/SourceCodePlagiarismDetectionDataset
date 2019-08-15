import Sim.MechanismMockup;

public class C3063467A2 {

  public static synchronized void main(String[] handles) {

    if (handles.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      java.lang.String assistance;
      Sim.MechanismMockup schemes;
      assistance = ("");
      for (java.lang.String fh : handles) {
        assistance = (fh);
      }
      schemes = (new Sim.MechanismMockup());
      schemes.go(assistance);
    }
  }
}
