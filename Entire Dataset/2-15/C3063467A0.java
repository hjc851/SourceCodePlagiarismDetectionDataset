import static java.lang.System.out;

public class C3063467A0 {

  public static synchronized void main(String[] param) {

    if (param.length < 1) {
      out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      ProcedureSimulation project = new ProcedureSimulation();
      project.footrace(param);
    }
  }
}
