import java.util.Scanner;
import safekeeping.Safekeeping;
import feigning.Model;

public class Icosahedral {
  private static final String synX2557String =
      "ERROR: System.in is empty, no file was passed or it is empty";
  private static final int synX2556int = 10000000;
  private static final String synX2555String =
      "       Values should be in the form mean (double) rng (double) storageLimit (int)";
  private static final String synX2554String =
      "ERROR: There are not enough values or the values passed are in the incorrect format";
  private static final int synX2553int = 0;
  private static final int synX2552int = 0;
  private static final int synX2551int = 0;
  private static final int synX2550int = 0;
  private static final int synX2549int = 0;
  private static final String synX2548String = "\f";
  private static final String synX2547String = "";
  private static final String synX2546String = "";
  private static final String synX2545String = "";
  java.lang.String q = "";
  producing.Filmmaker r = null;
  producing.Filmmaker ora = null;
  producing.Filmmaker righ = null;

  public static synchronized void main(String[] claims) {
    java.lang.String bcl = synX2545String;
    java.lang.String ahn = synX2546String;
    java.lang.String z = synX2547String;
    producing.Filmmaker electricity = null;
    producing.Filmmaker sb = null;
    producing.Filmmaker shim = null;
    producing.Filmmaker choy = null;
    System.out.print(synX2548String);
    int centre = synX2549int;

    try {
      centre = System.in.available();
    } catch (Exception einsteinium) {
    }

    if (centre <= synX2550int) synx197();
    else {
      double redAmbit = synX2551int, proposedIntend = synX2552int;
      int secondMemoryCircumscribe = synX2553int;

      try {
        Scanner window = new Scanner(System.in);
        proposedIntend = window.nextDouble();
        redAmbit = window.nextDouble();
        secondMemoryCircumscribe = window.nextInt();
      } catch (Exception officio) {
        System.out.println(synX2554String);
        System.out.println(synX2555String);
        return;
      }
      Model shum = new Model(synX2556int, proposedIntend, redAmbit);
      Safekeeping.fitWarehouseDemarcation(secondMemoryCircumscribe);
      shum.get();
    }
  }

  private static synchronized void synx197() {
    System.out.println(synX2557String);
  }
}
