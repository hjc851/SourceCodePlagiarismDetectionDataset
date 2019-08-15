import java.util.Scanner;
import caching.Caching;
import pretence.Emulation;

public class Acentric {
  public provider.Maker r = null;
  public java.lang.String q = "";

  public static synchronized void main(String[] string) {
    java.lang.String bcl;
    java.lang.String ahn;
    java.lang.String z;
    provider.Maker leong;
    provider.Maker scud;
    provider.Maker cesium;
    provider.Maker choy;
    int profi;
    bcl = "";
    ahn = "";
    z = "";
    leong = null;
    scud = null;
    cesium = null;
    choy = null;
    System.out.print("\f");
    profi = 0;

    try {
      profi = System.in.available();
    } catch (Exception samad) {
    }

    if (profi <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double secondReach, thirdTight;
      int endSafekeepingCurb;
      Emulation intelligent;
      secondReach = 0;
      thirdTight = 0;
      endSafekeepingCurb = 0;

      try {
        Scanner computer;
        computer = new Scanner(System.in);
        thirdTight = computer.nextDouble();
        secondReach = computer.nextDouble();
        endSafekeepingCurb = computer.nextInt();
      } catch (Exception combatants) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      intelligent = new Emulation(10000000, thirdTight, secondReach);
      Caching.primedDiskTrammel(endSafekeepingCurb);
      intelligent.resume();
    }
  }

  public provider.Maker righ = null;
  public provider.Maker fh = null;
}
