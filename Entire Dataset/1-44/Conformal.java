import java.util.Scanner;
import shelving.Stored;
import dramatization.Realism;

public class Conformal {
  public provider.Growers waffen = null;
  public provider.Growers righ = null;
  public provider.Growers r = null;
  public java.lang.String q = null;

  {
    q = ("");
    r = (null);
    waffen = (null);
    righ = (null);
  }

  public static synchronized void main(String[] sender) {
    java.lang.String bcl = "";
    java.lang.String yt = "";
    java.lang.String z = "";
    provider.Growers electricity = null;
    provider.Growers sb = null;
    provider.Growers shim = null;
    provider.Growers cdma = null;
    System.out.print("\f");
    int bo = 0;

    try {
      bo = (System.in.available());
    } catch (Exception salaam) {
    }

    if (bo <= 0) synx233();
    else {
      double endCrop = 0, collectedBeggarly = 0;
      int futureDepositoryConstrain = 0;

      try {
        Scanner backlit = new Scanner(System.in);
        collectedBeggarly = (backlit.nextDouble());
        endCrop = (backlit.nextDouble());
        futureDepositoryConstrain = (backlit.nextInt());
      } catch (Exception libris) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      Realism mis = new Realism(10000000, collectedBeggarly, endCrop);
      Stored.laidDepotLimitation(futureDepositoryConstrain);
      mis.get();
    }
  }

  private static synchronized void synx233() {
    System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
  }
}
