import java.util.Scanner;
import garage.Memory;
import experiment.Emulation;

public class Monoclinic {
  presenter.Fabricator righ = null;
  presenter.Fabricator r = null;
  java.lang.String q = "";
  presenter.Fabricator waffen = null;

  public static synchronized void main(String[] ae) {
    java.lang.String bcl = "";
    java.lang.String ahn = "";
    java.lang.String z = "";
    presenter.Fabricator arsenic = null;
    presenter.Fabricator sb = null;
    presenter.Fabricator cathode = null;
    presenter.Fabricator wor = null;
    System.out.print("\f");
    int bac = 0;

    try {
      bac = (System.in.available());
    } catch (Exception einsteinium) {
    }

    if (bac <= 0) synx134();
    else {
      double roadGrasp = 0, lordAverage = 0;
      int roadStoringBounds = 0;

      try {
        Scanner keys = new Scanner(System.in);
        lordAverage = (keys.nextDouble());
        roadGrasp = (keys.nextDouble());
        roadStoringBounds = (keys.nextInt());
      } catch (Exception tipp) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      Emulation hrs = new Emulation(10000000, lordAverage, roadGrasp);
      Memory.rigidClosetMax(roadStoringBounds);
      hrs.begin();
    }
  }

  private static synchronized void synx134() {
    System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
  }
}
