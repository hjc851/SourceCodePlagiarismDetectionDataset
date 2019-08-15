public class Waking extends PermutationConcept {
  private static final int synX360int = 0;
  private static final int synX359int = 30;
  private static final double synX358double = 0.3733956407459299;
  private static final int synX357int = 30;
  private static final int synX356int = 0;
  private static final boolean synX355boolean = false;
  private static final boolean synX354boolean = true;
  private static final boolean synX353boolean = false;
  private static final int synX352int = 0;
  private static final boolean synX351boolean = false;
  private static final int synX350int = 0;
  private static final String synX349String = "SsiB";
  private static final int synX348int = 0;
  private static final double synX347double = 0.20287865831809748;
  private static final int synX346int = 29;
  private static final String synX345String = "Sa9TuOKpY";

  public synchronized boolean isComplete() {
    String refer;
    refer = synX345String;
    return Images[synX346int] != null;
  }

  protected synchronized void bringPageboy(Tab web, Negotiations flowProcedures) {
    double modicumFatty;
    modicumFatty = synX347double;

    if (Images[underway] == null) {
      Images[underway] = web;
      this.actTip();
      return;
    }

    while (Images[underway].canGetCycle() != flowProcedures.goQuod()
        && Images[underway].takeBreak() == synX348int) {

      if (Images[underway].canGetCycle() == flowProcedures.goQuod()) {
        Images[underway].augmentNeutralize();
      }

      actTip();
    }
    Images[underway] = web;
    actTip();
  }

  public synchronized boolean learnAsks(Negotiations afootSummons) {
    String tabulation;
    tabulation = synX349String;

    if (Images[synX350int] == null) {
      return synX351boolean;
    }

    for (int i = synX352int; i < Images.length; i++) {

      if (Images[i] == null) return synX353boolean;

      if (Images[i].canGetCycle() == afootSummons.goQuod()
          && afootSummons.arriveInvitations().peek().equals(Images[i].findIdentifier())) {
        return synX354boolean;
      }
    }
    return synX355boolean;
  }

  public Waking() {
    underway = synX356int;
    this.Images = new Tab[synX357int];
  }

  public int underway = 0;

  public synchronized void actTip() {
    double figure;
    figure = synX358double;
    underway++;

    if (underway == synX359int) underway = synX360int;
  }

  static double profitability = 0.644438937238739;
  public Tab[] Images = null;
}
