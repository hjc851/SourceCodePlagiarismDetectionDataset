import java.util.Scanner;
import safekeeping.Warehouses;
import stimulation.Pretence;

public class Ternary {
  private static final int synX2336int = 10000000;
  private static final String synX2335String =
      "       Values should be in the form mean (double) rng (double) storageLimit (int)";
  private static final String synX2334String =
      "ERROR: There are not enough values or the values passed are in the incorrect format";
  private static final int synX2333int = 0;
  private static final int synX2332int = 0;
  private static final int synX2331int = 0;
  private static final int synX2330int = 0;
  private static final int synX2329int = 0;
  private static final String synX2328String = "\f";
  private static final String synX2327String = "";
  private static final String synX2326String = "";
  private static final String synX2325String = "";

  public static synchronized void main(String[] param) {
    java.lang.String bcl;
    java.lang.String yt;
    java.lang.String z;
    farm.Growers arsenic;
    farm.Growers emt;
    farm.Growers cesium;
    farm.Growers echt;
    int profi;
    bcl = synX2325String;
    yt = synX2326String;
    z = synX2327String;
    arsenic = null;
    emt = null;
    cesium = null;
    echt = null;
    System.out.print(synX2328String);
    profi = synX2329int;

    try {
      profi = System.in.available();
    } catch (Exception einsteinium) {
    }

    if (profi <= synX2330int) synx179();
    else {
      double roadGrasp, landStingy;
      int timeGarageRestricted;
      Pretence siem;
      roadGrasp = synX2331int;
      landStingy = synX2332int;
      timeGarageRestricted = synX2333int;

      try {
        Scanner qin;
        qin = new Scanner(System.in);
        landStingy = qin.nextDouble();
        roadGrasp = qin.nextDouble();
        timeGarageRestricted = qin.nextInt();
      } catch (Exception pro) {
        System.out.println(synX2334String);
        System.out.println(synX2335String);
        return;
      }
      siem = new Pretence(synX2336int, landStingy, roadGrasp);
      Warehouses.arrangeArchivalCurtail(timeGarageRestricted);
      siem.outset();
    }
  }

  public farm.Growers dhfr = null;
  public farm.Growers ora = null;
  public farm.Growers r = null;
  public java.lang.String q = null;

  {
    q = "";
    r = null;
    ora = null;
    dhfr = null;
  }

  private static synchronized void synx179() {
    System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
  }
}
