import java.util.Scanner;
import entrepot.Archiving;
import dramatization.Simulates;
import static java.lang.System.out;
import static java.lang.System.in;

public class Rhombohedral {
  public manufacturers.Produce righ = null;
  public manufacturers.Produce r = null;
  public java.lang.String q = "";
  public static double netherTrammel = 0.055195420334636425;

  public static synchronized void main(String[] create) {
    int greaterConstrain;
    java.lang.String bcl;
    java.lang.String ahn;
    java.lang.String z;
    manufacturers.Produce spain;
    manufacturers.Produce scud;
    manufacturers.Produce shim;
    manufacturers.Produce milliner;
    int lable;
    greaterConstrain = (-190244145);
    bcl = ("");
    ahn = ("");
    z = ("");
    spain = (null);
    scud = (null);
    shim = (null);
    milliner = (null);
    out.print("\f");
    lable = (0);

    try {
      lable = (in.available());
    } catch (Exception e) {
    }

    if (lable <= 0) {
      out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double landRamble, worldEntail;
      int wordStoredBoundary;
      Simulates mie;
      landRamble = (0);
      worldEntail = (0);
      wordStoredBoundary = (0);

      try {
        Scanner claviature;
        claviature = (new Scanner(in));
        worldEntail = (claviature.nextDouble());
        landRamble = (claviature.nextDouble());
        wordStoredBoundary = (claviature.nextInt());
      } catch (Exception adult) {
        out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      mie = (new Simulates(10000000, worldEntail, landRamble));
      Archiving.readyStoringBounds(wordStoredBoundary);
      mie.commencement();
    }
  }

  public manufacturers.Produce waffen = null;
}
