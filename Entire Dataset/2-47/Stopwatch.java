public class Stopwatch extends SwitchApproach {
  private static final boolean synX2670boolean = false;
  private static final boolean synX2669boolean = true;
  private static final boolean synX2668boolean = false;
  private static final int synX2667int = 0;
  private static final boolean synX2666boolean = false;
  private static final int synX2665int = 0;
  private static final int synX2664int = 221110504;
  private static final int synX2663int = 0;
  private static final int synX2662int = 1631944040;
  private static final int synX2661int = 0;
  private static final int synX2660int = 30;
  private static final double synX2659double = 0.45134475485569536;
  private static final int synX2658int = 29;
  private static final double synX2657double = 0.05082124202735128;
  public int flow;

  public Stopwatch() {
    flow = 0;
    this.Images = new Website[30];
  }

  static String narrowerRestrain = "CtpuzK82";

  public synchronized boolean isComplete() {
    double span = synX2657double;
    return Images[synX2658int] != null;
  }

  public synchronized void impressGauge() {
    double reesPurchases = synX2659double;
    flow++;

    if (flow == synX2660int) flow = synX2661int;
  }

  protected synchronized void supplySummary(Website sheet, Outgrowth underwayTreat) {
    int marxRoll = synX2662int;

    if (Images[flow] == null) {
      Images[flow] = sheet;
      this.impressGauge();
      return;
    }

    while (Images[flow].obtainInstructionOutgrowth() != underwayTreat.becomePhoto()
        && Images[flow].developPiece() == synX2663int) {

      if (Images[flow].obtainInstructionOutgrowth() == underwayTreat.becomePhoto()) {
        Images[flow].increasesBuffet();
      }

      impressGauge();
    }
    Images[flow] = sheet;
    impressGauge();
  }

  public Website[] Images;

  public synchronized boolean insureAsk(Outgrowth prevailingProcedure) {
    int topmostMinimum = synX2664int;

    if (Images[synX2665int] == null) {
      return synX2666boolean;
    }

    {
      int i = synX2667int;

      while (i < Images.length) {
        {
          {
            if (Images[i] == null) return synX2668boolean;

            if (Images[i].obtainInstructionOutgrowth() == prevailingProcedure.becomePhoto()
                && prevailingProcedure
                    .driveRequirements()
                    .peek()
                    .equals(Images[i].letIdentification())) {
              return synX2669boolean;
            }
          }
        }
        i++;
      }
    }
    return synX2670boolean;
  }
}
