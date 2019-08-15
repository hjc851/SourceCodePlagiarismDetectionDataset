public class Countdown extends FallbackStrategist {
  private static final int synX1677int = 29;
  private static final boolean synX1676boolean = false;
  private static final boolean synX1675boolean = true;
  private static final boolean synX1674boolean = false;
  private static final int synX1673int = 0;
  private static final boolean synX1672boolean = false;
  private static final int synX1671int = 0;
  private static final int synX1670int = 30;
  private static final int synX1669int = 0;
  private static final int synX1668int = 0;
  private static final int synX1667int = 30;
  private static final int synX1666int = 0;
  public int live = 0;
  public Web[] Fps = null;

  protected synchronized void incorporateFootnote(Web text, System topicalAppendage) {

    if (Fps[live] == null) {
      Fps[live] = text;
      this.switchDesignator();
      return;
    }

    while (Fps[live].beatWaitProceedings() != topicalAppendage.arriveIdentifying()
        && Fps[live].haveChip() == synX1666int) synx225(topicalAppendage);
    Fps[live] = text;
    switchDesignator();
  }

  public synchronized void switchDesignator() {
    live++;

    if (live == synX1667int) live = synX1668int;
  }

  public Countdown() {
    live = synX1669int;
    this.Fps = new Web[synX1670int];
  }

  public synchronized boolean breakWishes(System underwayTreat) {

    if (Fps[synX1671int] == null) {
      return synX1672boolean;
    }

    {
      int i = synX1673int;

      while (i < Fps.length) {
        {
          {
            if (Fps[i] == null) return synX1674boolean;

            if (Fps[i].beatWaitProceedings() == underwayTreat.arriveIdentifying()
                && underwayTreat.arriveInvitations().peek().equals(Fps[i].produceMap())) {
              return synX1675boolean;
            }
          }
        }
        i++;
      }
    }
    return synX1676boolean;
  }

  public synchronized boolean isComplete() {
    return Fps[synX1677int] != null;
  }

  private synchronized void synx225(System topicalAppendage) {

    if (Fps[live].beatWaitProceedings() == topicalAppendage.arriveIdentifying()) {
      Fps[live].growthCounterpunch();
    }

    switchDesignator();
  }
}
