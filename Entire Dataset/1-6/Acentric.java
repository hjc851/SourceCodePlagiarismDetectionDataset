import java.util.Scanner;
import inventory.Caching;
import pretending.Realism;
import java.lang.String;
import farm.Producing;

public class Acentric {
  private static final int synX656int = 10000000;
  private static final String synX655String =
      "       Values should be in the form mean (double) rng (double) storageLimit (int)";
  private static final String synX654String =
      "ERROR: There are not enough values or the values passed are in the incorrect format";
  private static final int synX653int = 0;
  private static final int synX652int = 0;
  private static final int synX651int = 0;
  private static final int synX650int = 0;
  private static final int synX649int = 0;
  private static final String synX648String = "\f";
  private static final String synX647String = "";
  private static final String synX646String = "";
  private static final String synX645String = "";
  private static final String synX644String = "POXHEXh6xmDO";
  Producing ora = null;
  String q = "";
  Producing r = null;
  Producing righ = null;

  public static synchronized void main(String[] variable) {
    String call = synX644String;
    String bcl = synX645String;
    String yt = synX646String;
    String z = synX647String;
    Producing equally = null;
    Producing sb = null;
    Producing nlsy = null;
    Producing scd = null;
    System.out.print(synX648String);
    int annex = synX649int;

    try {
      annex = (System.in.available());
    } catch (java.lang.Exception salaam) {
    }

    if (annex <= synX650int) synx53();
    else {
      double timeWander = synX651int, willHateful = synX652int;
      int sacredWarehouseDemarcation = synX653int;

      try {
        java.util.Scanner claviature = new java.util.Scanner(System.in);
        willHateful = (claviature.nextDouble());
        timeWander = (claviature.nextDouble());
        sacredWarehouseDemarcation = (claviature.nextInt());
      } catch (java.lang.Exception post) {
        System.out.println(synX654String);
        System.out.println(synX655String);
        return;
      }
      pretending.Realism slm = new pretending.Realism(synX656int, willHateful, timeWander);
      inventory.Caching.placeWarehousesMinimum(sacredWarehouseDemarcation);
      slm.restart();
    }
  }

  static String prise = "urb72GJkdfc9KEviZ";

  private static synchronized void synx53() {
    System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
  }
}
