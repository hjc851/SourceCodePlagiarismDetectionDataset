public class Clockwork extends FallbackStrategist {
  private static final boolean synX2360boolean = false;
  private static final boolean synX2359boolean = true;
  private static final boolean synX2358boolean = false;
  private static final int synX2357int = 0;
  private static final boolean synX2356boolean = false;
  private static final int synX2355int = 0;
  private static final int synX2354int = 30;
  private static final int synX2353int = 0;
  private static final int synX2352int = 29;
  private static final int synX2351int = 0;
  private static final int synX2350int = 30;
  private static final int synX2349int = 0;

  protected synchronized void appendWebpage(Summary summary, Treat latestOperation) {

    if (Paintings[present] == null) {
      Paintings[present] = summary;
      this.switchDesignator();
      return;
    }

    while (Paintings[present].goEprProcedure() != latestOperation.receiveCard()
        && Paintings[present].findBar() == synX2349int) {

      if (Paintings[present].goEprProcedure() == latestOperation.receiveCard()) {
        Paintings[present].expansionThwart();
      }

      switchDesignator();
    }
    Paintings[present] = summary;
    switchDesignator();
  }

  private synchronized void switchDesignator() {
    present++;

    if (present == synX2350int) present = synX2351int;
  }

  public synchronized boolean isComplete() {
    return Paintings[synX2352int] != null;
  }

  public Clockwork() {
    present = synX2353int;
    this.Paintings = new Summary[synX2354int];
  }

  private int present = 0;

  public synchronized boolean substantiationInsistence(Treat theMethodology) {

    if (Paintings[synX2355int] == null) {
      return synX2356boolean;
    }

    {
      int i = synX2357int;

      while (i < Paintings.length) {
        {
          {
            if (Paintings[i] == null) return synX2358boolean;

            if (Paintings[i].goEprProcedure() == theMethodology.receiveCard()
                && theMethodology
                    .becomeRequisition()
                    .peek()
                    .equals(Paintings[i].arriveIdentifying())) {
              return synX2359boolean;
            }
          }
        }
        i++;
      }
    }
    return synX2360boolean;
  }

  private Summary[] Paintings = null;
}
