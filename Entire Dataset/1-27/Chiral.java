import java.util.Scanner;
import warehouses.Caching;
import pretence.Simulator;

public class Chiral {
  private static final String synX1987String = "";
  private static final int synX1986int = 10000000;
  private static final String synX1985String =
      "       Values should be in the form mean (double) rng (double) storageLimit (int)";
  private static final String synX1984String =
      "ERROR: There are not enough values or the values passed are in the incorrect format";
  private static final int synX1983int = 0;
  private static final int synX1982int = 0;
  private static final int synX1981int = 0;
  private static final String synX1980String =
      "ERROR: System.in is empty, no file was passed or it is empty";
  private static final int synX1979int = 0;
  private static final int synX1978int = 0;
  private static final String synX1977String = "\f";
  private static final String synX1976String = "";
  private static final String synX1975String = "";
  private static final String synX1974String = "";
  public java.lang.String q;
  public emitter.Director r;
  public emitter.Director waffen;
  public emitter.Director righ;

  public static synchronized void main(String[] ae) {
    java.lang.String bcl = synX1974String;
    java.lang.String ahn = synX1975String;
    java.lang.String z = synX1976String;
    emitter.Director electricity = null;
    emitter.Director emt = null;
    emitter.Director nlsy = null;
    emitter.Director pardi = null;
    System.out.print(synX1977String);
    int aval = synX1978int;

    try {
      aval = System.in.available();
    } catch (Exception ye) {
    }

    if (aval <= synX1979int) {
      System.out.println(synX1980String);
    } else {
      double secondReach = synX1981int, recommendedUngenerous = synX1982int;
      int firstStorehouseRestrict = synX1983int;

      try {
        Scanner keys = new Scanner(System.in);
        recommendedUngenerous = keys.nextDouble();
        secondReach = keys.nextDouble();
        firstStorehouseRestrict = keys.nextInt();
      } catch (Exception adoptee) {
        System.out.println(synX1984String);
        System.out.println(synX1985String);
        return;
      }
      Simulator indeed = new Simulator(synX1986int, recommendedUngenerous, secondReach);
      Caching.fixStoreroomReduce(firstStorehouseRestrict);
      indeed.go();
    }
  }

  {
    q = synX1987String;
    r = null;
    waffen = null;
    righ = null;
  }
}
