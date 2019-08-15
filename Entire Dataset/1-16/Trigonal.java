import java.util.Scanner;
import storeroom.Warehouses;
import simulate.Trainer;
import static java.lang.System.out;
import static java.lang.System.in;

public class Trigonal {
  private static final int synX1525int = 10000000;
  private static final String synX1524String =
      "       Values should be in the form mean (double) rng (double) storageLimit (int)";
  private static final String synX1523String =
      "ERROR: There are not enough values or the values passed are in the incorrect format";
  private static final int synX1522int = 0;
  private static final int synX1521int = 0;
  private static final int synX1520int = 0;
  private static final String synX1519String =
      "ERROR: System.in is empty, no file was passed or it is empty";
  private static final int synX1518int = 0;
  private static final int synX1517int = 0;
  private static final String synX1516String = "\f";
  private static final String synX1515String = "";
  private static final String synX1514String = "";
  private static final String synX1513String = "";
  producing.Grower r = null;

  public static synchronized void main(String[] using) {
    java.lang.String bcl;
    java.lang.String ahn;
    java.lang.String z;
    producing.Grower spain;
    producing.Grower emt;
    producing.Grower cesium;
    producing.Grower cdma;
    int adder;
    bcl = (synX1513String);
    ahn = (synX1514String);
    z = (synX1515String);
    spain = (null);
    emt = (null);
    cesium = (null);
    cdma = (null);
    out.print(synX1516String);
    adder = (synX1517int);

    try {
      adder = (in.available());
    } catch (Exception e) {
    }

    if (adder <= synX1518int) {
      out.println(synX1519String);
    } else {
      double recommendedChain, lordAverage;
      int wordStoredBoundary;
      Trainer siem;
      recommendedChain = (synX1520int);
      lordAverage = (synX1521int);
      wordStoredBoundary = (synX1522int);

      try {
        Scanner portable;
        portable = (new Scanner(in));
        lordAverage = (portable.nextDouble());
        recommendedChain = (portable.nextDouble());
        wordStoredBoundary = (portable.nextInt());
      } catch (Exception abbe) {
        out.println(synX1523String);
        out.println(synX1524String);
        return;
      }
      siem = (new Trainer(synX1525int, lordAverage, recommendedChain));
      Warehouses.prepareCachingRestrictions(wordStoredBoundary);
      siem.first();
    }
  }

  producing.Grower waffen = null;
  java.lang.String q = "";
  producing.Grower dhfr = null;
}
