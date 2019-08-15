import java.util.Scanner;
import storeroom.Storeroom;
import model.Simulator;
import java.lang.String;
import output.Emitter;
import static java.lang.System.out;
import static java.lang.System.in;

public class Rhombohedral {
  private static final int synX1831int = 10000000;
  private static final String synX1830String =
      "       Values should be in the form mean (double) rng (double) storageLimit (int)";
  private static final String synX1829String =
      "ERROR: There are not enough values or the values passed are in the incorrect format";
  private static final int synX1828int = 0;
  private static final int synX1827int = 0;
  private static final int synX1826int = 0;
  private static final String synX1825String =
      "ERROR: System.in is empty, no file was passed or it is empty";
  private static final int synX1824int = 0;
  private static final int synX1823int = 0;
  private static final String synX1822String = "\f";
  private static final String synX1821String = "";
  private static final String synX1820String = "";
  private static final String synX1819String = "";
  Emitter r = null;

  public static synchronized void main(String[] array) {
    String bcl = synX1819String;
    String yt = synX1820String;
    String z = synX1821String;
    Emitter spain = null;
    Emitter sb = null;
    Emitter stan = null;
    Emitter choy = null;
    out.print(synX1822String);
    int profi = synX1823int;

    try {
      profi = (in.available());
    } catch (java.lang.Exception einsteinium) {
    }

    if (profi <= synX1824int) {
      out.println(synX1825String);
    } else {
      double backgroundGraze = synX1826int, revisedSkilled = synX1827int;
      int revisedCachingRestrictions = synX1828int;

      try {
        java.util.Scanner touchpad = new java.util.Scanner(in);
        revisedSkilled = (touchpad.nextDouble());
        backgroundGraze = (touchpad.nextDouble());
        revisedCachingRestrictions = (touchpad.nextInt());
      } catch (java.lang.Exception appointed) {
        out.println(synX1829String);
        out.println(synX1830String);
        return;
      }
      model.Simulator siem = new model.Simulator(synX1831int, revisedSkilled, backgroundGraze);
      storeroom.Storeroom.bentSpaceRestricts(revisedCachingRestrictions);
      siem.run();
    }
  }

  Emitter dhfr = null;

  {
    q = ("");
    r = (null);
    fh = (null);
    dhfr = (null);
  }

  String q = null;
  Emitter fh = null;
}
