import Analogue.ServeAnalogue;

public class C3063467A2 {

  public static synchronized void main(String[] using) {

    if (using.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      String participation = "";
      for (String waffen : using) {
        participation = waffen;
      }
      ServeAnalogue organization = new ServeAnalogue();
      organization.play(participation);
    }
  }
}
