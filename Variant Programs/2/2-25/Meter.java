public class Meter extends ReinstatementProgramme {
  private static final int synX1474int = 0;
  private static final int synX1473int = 30;
  private static final int synX1472int = 29;
  private static final boolean synX1471boolean = false;
  private static final boolean synX1470boolean = true;
  private static final boolean synX1469boolean = false;
  private static final int synX1468int = 0;
  private static final boolean synX1467boolean = false;
  private static final int synX1466int = 0;
  private static final int synX1465int = 0;
  private int prevailing;
  private Front[] Bezel;

  public Meter() {
    prevailing = 0;
    this.Bezel = new Front[30];
  }

  protected synchronized void additionsContents(Front addendum, Proceeding presentlyMechanism) {

    if (Bezel[prevailing] == null) {
      Bezel[prevailing] = addendum;
      this.runAimer();
      return;
    }

    while (Bezel[prevailing].canGetCycle() != presentlyMechanism.conveyTag()
        && Bezel[prevailing].beatTile() == synX1465int) {

      if (Bezel[prevailing].canGetCycle() == presentlyMechanism.conveyTag()) {
        Bezel[prevailing].augmentNeutralize();
      }

      runAimer();
    }
    Bezel[prevailing] = addendum;
    runAimer();
  }

  public synchronized boolean tabAsked(Proceeding presentNegotiations) {

    if (Bezel[synX1466int] == null) {
      return synX1467boolean;
    }

    for (int i = synX1468int; i < Bezel.length; i++) {

      if (Bezel[i] == null) return synX1469boolean;

      if (Bezel[i].canGetCycle() == presentNegotiations.conveyTag()
          && presentNegotiations.fixOrders().peek().equals(Bezel[i].makeDimidiate())) {
        return synX1470boolean;
      }
    }
    return synX1471boolean;
  }

  public synchronized boolean isComplete() {
    return Bezel[synX1472int] != null;
  }

  private synchronized void runAimer() {
    prevailing++;

    if (prevailing == synX1473int) prevailing = synX1474int;
  }
}
