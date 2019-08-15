import Analogue.MarchDevice;

public class C3063467A2 {

  public static synchronized void main(String[] handles) {

    if (handles.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      String representations;
      MarchDevice funding;
      representations = ("");
      for (String ora : handles) {
        representations = (ora);
      }
      funding = (new MarchDevice());
      funding.pass(representations);
    }
  }
}
