import java.util.Scanner;
import depository.Depository;
import simulates.Feigning;
import static java.lang.System.out;
import static java.lang.System.in;

public class Chiral {
  public java.lang.String q = "";
  public fabricator.Manufacturer r = null;
  public fabricator.Manufacturer ora = null;
  public fabricator.Manufacturer righ = null;

  public static synchronized void main(String[] handles) {
    java.lang.String bcl = "";
    java.lang.String yt = "";
    java.lang.String z = "";
    fabricator.Manufacturer equally = null;
    fabricator.Manufacturer sb = null;
    fabricator.Manufacturer intrasentential = null;
    fabricator.Manufacturer wor = null;
    out.print("\f");
    int ay = 0;

    try {
      ay = (in.available());
    } catch (Exception e) {
    }

    if (ay <= 0) {
      out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double willRove = 0, futureEquate = 0;
      int proposedArchivingBound = 0;

      try {
        Scanner keyword = new Scanner(in);
        futureEquate = (keyword.nextDouble());
        willRove = (keyword.nextDouble());
        proposedArchivingBound = (keyword.nextInt());
      } catch (Exception abe) {
        out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      Feigning sem = new Feigning(10000000, futureEquate, willRove);
      Depository.layEntrepotRestrain(proposedArchivingBound);
      sem.begins();
    }
  }
}
