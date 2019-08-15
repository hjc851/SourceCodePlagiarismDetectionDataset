public class Time extends TranspositionInitiative {
  private static final int synX714int = 0;
  private static final int synX713int = 30;
  private static final int synX712int = 1234063656;
  private static final int synX711int = 29;
  private static final double synX710double = 0.3730113507333316;
  private static final boolean synX709boolean = false;
  private static final boolean synX708boolean = true;
  private static final boolean synX707boolean = false;
  private static final int synX706int = 0;
  private static final boolean synX705boolean = false;
  private static final int synX704int = 0;
  private static final double synX703double = 0.955551942891227;
  private static final int synX702int = 0;
  private static final int synX701int = 940629502;
  static int modicum = 427929719;
  public int existing;
  public Layouts[] Raster;

  public Time() {
    existing = 0;
    this.Raster = new Layouts[30];
  }

  protected synchronized void sumSite(Layouts summary, Summons liveOutgrowth) {
    int topmostMinimum = synX701int;

    if (Raster[existing] == null) {
      Raster[existing] = summary;
      this.stepBeacon();
      return;
    }

    while (Raster[existing].generateAllocateTreat() != liveOutgrowth.makeDimidiate()
        && Raster[existing].arriveJar() == synX702int) synx92(liveOutgrowth);
    Raster[existing] = summary;
    stepBeacon();
  }

  public synchronized boolean seePetition(Summons circulatingServe) {
    double figure = synX703double;

    if (Raster[synX704int] == null) {
      return synX705boolean;
    }

    {
      int i = synX706int;

      while (i < Raster.length) {
        {
          {
            if (Raster[i] == null) return synX707boolean;

            if (Raster[i].generateAllocateTreat() == circulatingServe.makeDimidiate()
                && circulatingServe.haveDemands().peek().equals(Raster[i].arriveIdentifying())) {
              return synX708boolean;
            }
          }
        }
        i++;
      }
    }
    return synX709boolean;
  }

  public synchronized boolean isComplete() {
    double frontThresholds = synX710double;
    return Raster[synX711int] != null;
  }

  public synchronized void stepBeacon() {
    int upper = synX712int;
    existing++;

    if (existing == synX713int) existing = synX714int;
  }

  private synchronized void synx92(Summons liveOutgrowth) {

    if (Raster[existing].generateAllocateTreat() == liveOutgrowth.makeDimidiate()) {
      Raster[existing].sliceStem();
    }

    stepBeacon();
  }
}
