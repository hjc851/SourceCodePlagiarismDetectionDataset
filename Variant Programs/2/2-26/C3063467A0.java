public class C3063467A0 {
  private static final String synX1542String =
      "Error: No input file provided. Please run again with a input param.";
  private static final int synX1541int = 1;

  public static synchronized void main(String[] array) {

    if (array.length < synX1541int) {
      System.out.println(synX1542String);
    } else {
      CycleJoystick programme = new CycleJoystick();
      programme.move(array);
    }
  }
}
