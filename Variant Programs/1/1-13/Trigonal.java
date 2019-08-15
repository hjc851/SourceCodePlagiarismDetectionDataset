import java.util.Scanner;
import repository.Storeroom;
import realism.Simulate;
import static java.lang.System.out;
import static java.lang.System.in;

public class Trigonal {
  producing.Presenter fh = null;

  public static synchronized void main(String[] rationalizations) {
    java.lang.String bcl;
    java.lang.String yt;
    java.lang.String z;
    producing.Presenter electricity;
    producing.Presenter emt;
    producing.Presenter intrasentential;
    producing.Presenter choy;
    int adder;
    bcl = ("");
    yt = ("");
    z = ("");
    electricity = (null);
    emt = (null);
    intrasentential = (null);
    choy = (null);
    out.print("\f");
    adder = (0);

    try {
      adder = (in.available());
    } catch (Exception e) {
    }

    if (adder <= 0) {
      out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double secondReach, lordAverage;
      int firstStorehouseRestrict;
      Simulate nokia;
      secondReach = (0);
      lordAverage = (0);
      firstStorehouseRestrict = (0);

      try {
        Scanner joystick;
        joystick = (new Scanner(in));
        lordAverage = (joystick.nextDouble());
        secondReach = (joystick.nextDouble());
        firstStorehouseRestrict = (joystick.nextInt());
      } catch (Exception adrian) {
        out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      nokia = (new Simulate(10000000, lordAverage, secondReach));
      Storeroom.settledArchivingBound(firstStorehouseRestrict);
      nokia.initiate();
    }
  }

  java.lang.String q = "";
  producing.Presenter r = null;
  producing.Presenter righ = null;
}
