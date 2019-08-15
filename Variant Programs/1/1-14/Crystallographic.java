import java.util.Scanner;
import closet.Store;
import modeling.Experiment;
import java.lang.String;
import farm.Output;

public class Crystallographic {
  private static final String synX1394String =
      "ERROR: System.in is empty, no file was passed or it is empty";
  private static final int synX1393int = 10000000;
  private static final String synX1392String =
      "       Values should be in the form mean (double) rng (double) storageLimit (int)";
  private static final String synX1391String =
      "ERROR: There are not enough values or the values passed are in the incorrect format";
  private static final int synX1390int = 0;
  private static final int synX1389int = 0;
  private static final int synX1388int = 0;
  private static final int synX1387int = 0;
  private static final int synX1386int = 0;
  private static final String synX1385String = "\f";
  private static final String synX1384String = "";
  private static final String synX1383String = "";
  private static final String synX1382String = "";
  private static final double synX1381double = 0.17137062450834384;
  public String q = null;

  {
    q = ("");
    r = (null);
    ora = (null);
    dhfr = (null);
  }

  public Output r = null;
  static final int load = -1444311481;
  public Output dhfr = null;
  public Output ora = null;

  public static synchronized void main(String[] handles) {
    double beacon;
    String bcl;
    String ahn;
    String z;
    Output arsenic;
    Output emt;
    Output intrasentential;
    Output cdma;
    int annex;
    beacon = (synX1381double);
    bcl = (synX1382String);
    ahn = (synX1383String);
    z = (synX1384String);
    arsenic = (null);
    emt = (null);
    intrasentential = (null);
    cdma = (null);
    System.out.print(synX1385String);
    annex = (synX1386int);

    try {
      annex = (System.in.available());
    } catch (java.lang.Exception einsteinium) {
    }

    if (annex <= synX1387int) synx89();
    else {
      double westCompass, westSmall;
      int worldDepotLimitation;
      modeling.Experiment affirmative;
      westCompass = (synX1388int);
      westSmall = (synX1389int);
      worldDepotLimitation = (synX1390int);

      try {
        java.util.Scanner handheld;
        handheld = (new java.util.Scanner(System.in));
        westSmall = (handheld.nextDouble());
        westCompass = (handheld.nextDouble());
        worldDepotLimitation = (handheld.nextInt());
      } catch (java.lang.Exception exwife) {
        System.out.println(synX1391String);
        System.out.println(synX1392String);
        return;
      }
      affirmative = (new modeling.Experiment(synX1393int, westSmall, westCompass));
      closet.Store.rigidClosetMax(worldDepotLimitation);
      affirmative.commences();
    }
  }

  private static synchronized void synx89() {
    System.out.println(synX1394String);
  }
}
