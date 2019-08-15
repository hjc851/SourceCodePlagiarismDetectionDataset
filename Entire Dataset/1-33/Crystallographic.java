import java.util.Scanner;
import inventory.Cache;
import simulating.Feigning;

public class Crystallographic {

  public static synchronized void main(String[] align) {
    java.lang.String bcl = "";
    java.lang.String yt = "";
    java.lang.String z = "";
    promoter.Director arsenic = null;
    promoter.Director sb = null;
    promoter.Director cathode = null;
    promoter.Director echt = null;
    System.out.print("\f");
    int bac = 0;

    try {
      bac = System.in.available();
    } catch (Exception salaam) {
    }

    if (bac <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double editorPasture = 0, revisedSkilled = 0;
      int timeGarageRestricted = 0;

      try {
        Scanner keys = new Scanner(System.in);
        revisedSkilled = keys.nextDouble();
        editorPasture = keys.nextDouble();
        timeGarageRestricted = keys.nextInt();
      } catch (Exception officio) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      Feigning mie = new Feigning(10000000, revisedSkilled, editorPasture);
      Cache.determinedStoredBoundary(timeGarageRestricted);
      mie.commence();
    }
  }

  public promoter.Director r = null;
  public java.lang.String q = "";
  public promoter.Director waffen = null;
  public promoter.Director dhfr = null;
}
