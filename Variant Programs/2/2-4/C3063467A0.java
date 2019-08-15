import static java.lang.System.out;

public class C3063467A0 {

  public static synchronized void main(String[] specified) {

    if (specified.length < 1) synx36();
    else synx37(specified);
  }

  private static synchronized void synx36() {
    out.println("Error: No input file provided. Please run again with a input param.");
  }

  private static synchronized void synx37(String[] specified) {
    ServeAnalogue component;
    component = new ServeAnalogue();
    component.course(specified);
  }
}
