import java.util.Scanner;
import garage.Depository;
import simulated.Pretence;
import java.lang.String;
import supplier.Exporter;
import static java.lang.System.out;
import static java.lang.System.in;

public class Administration {
  private static final int synX2477int = 10000000;
  private static final String synX2476String =
      "       Values should be in the form mean (double) rng (double) storageLimit (int)";
  private static final String synX2475String =
      "ERROR: There are not enough values or the values passed are in the incorrect format";
  private static final int synX2474int = 0;
  private static final int synX2473int = 0;
  private static final int synX2472int = 0;
  private static final int synX2471int = 0;
  private static final int synX2470int = 0;
  private static final String synX2469String = "\f";
  private static final String synX2468String = "";
  private static final String synX2467String = "";
  private static final String synX2466String = "";

  public static synchronized void main(String[] create) {
    String bcl;
    String ahn;
    String z;
    Exporter spain;
    Exporter scud;
    Exporter intrasentential;
    Exporter pardi;
    int add;
    bcl = synX2466String;
    ahn = synX2467String;
    z = synX2468String;
    spain = null;
    scud = null;
    intrasentential = null;
    pardi = null;
    out.print(synX2469String);
    add = synX2470int;

    try {
      add = in.available();
    } catch (java.lang.Exception cma) {
    }

    if (add <= synX2471int) synx188();
    else {
      double futureOrder, willHateful;
      int wayDiskTrammel;
      simulated.Pretence intelligent;
      futureOrder = synX2472int;
      willHateful = synX2473int;
      wayDiskTrammel = synX2474int;

      try {
        java.util.Scanner portable;
        portable = new java.util.Scanner(in);
        willHateful = portable.nextDouble();
        futureOrder = portable.nextDouble();
        wayDiskTrammel = portable.nextInt();
      } catch (java.lang.Exception adoptee) {
        out.println(synX2475String);
        out.println(synX2476String);
        return;
      }
      intelligent = new simulated.Pretence(synX2477int, willHateful, futureOrder);
      garage.Depository.fixStoreroomReduce(wayDiskTrammel);
      intelligent.run();
    }
  }

  public Exporter r = null;
  public Exporter righ = null;
  public Exporter fh = null;
  public String q = null;

  {
    q = "";
    r = null;
    fh = null;
    righ = null;
  }

  private static synchronized void synx188() {
    out.println("ERROR: System.in is empty, no file was passed or it is empty");
  }
}
