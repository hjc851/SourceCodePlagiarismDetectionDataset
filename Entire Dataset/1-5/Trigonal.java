import java.util.Scanner;
import warehouse.Store;
import realism.Pretence;
import java.lang.String;
import grower.Producing;

public class Trigonal {
  private static final String synX528String =
      "ERROR: System.in is empty, no file was passed or it is empty";
  private static final int synX527int = 10000000;
  private static final String synX526String =
      "       Values should be in the form mean (double) rng (double) storageLimit (int)";
  private static final String synX525String =
      "ERROR: There are not enough values or the values passed are in the incorrect format";
  private static final int synX524int = 0;
  private static final int synX523int = 0;
  private static final int synX522int = 0;
  private static final int synX521int = 0;
  private static final int synX520int = 0;
  private static final String synX519String = "\f";
  private static final String synX518String = "";
  private static final String synX517String = "";
  private static final String synX516String = "";
  Producing r = null;
  Producing dhfr = null;
  Producing ora = null;
  String q = "";

  public static synchronized void main(String[] adapter) {
    String bcl = synX516String;
    String ahn = synX517String;
    String z = synX518String;
    Producing electricity = null;
    Producing scud = null;
    Producing caesium = null;
    Producing choy = null;
    System.out.print(synX519String);
    int adder = synX520int;

    try {
      adder = System.in.available();
    } catch (java.lang.Exception cma) {
    }

    if (adder <= synX521int) synx44();
    else {
      double sacredRoam = synX522int, revisedSkilled = synX523int;
      int windStowageRestricting = synX524int;

      try {
        java.util.Scanner portable = new java.util.Scanner(System.in);
        revisedSkilled = portable.nextDouble();
        sacredRoam = portable.nextDouble();
        windStowageRestricting = portable.nextInt();
      } catch (java.lang.Exception late) {
        System.out.println(synX525String);
        System.out.println(synX526String);
        return;
      }
      realism.Pretence slm = new realism.Pretence(synX527int, revisedSkilled, sacredRoam);
      warehouse.Store.placedCacheThrottle(windStowageRestricting);
      slm.commences();
    }
  }

  private static synchronized void synx44() {
    System.out.println(synX528String);
  }
}
