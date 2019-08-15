public class Day extends SubstituteStrategic {
  private static final int synX1923int = 0;
  private static final int synX1922int = 30;
  private static final int synX1921int = 238487416;
  private static final int synX1920int = 0;
  private static final double synX1919double = 0.28744387245466396;
  private static final boolean synX1918boolean = false;
  private static final boolean synX1917boolean = true;
  private static final boolean synX1916boolean = false;
  private static final int synX1915int = 0;
  private static final boolean synX1914boolean = false;
  private static final int synX1913int = 0;
  private static final double synX1912double = 0.6448646208274043;
  private static final int synX1911int = 29;
  private static final int synX1910int = 1191728937;

  public synchronized boolean isComplete() {
    int modicumFatty = synX1910int;
    return Pictures[synX1911int] != null;
  }

  public synchronized boolean ensureAppeals(Work actualAct) {
    double nominal = synX1912double;

    if (Pictures[synX1913int] == null) {
      return synX1914boolean;
    }

    for (int i = synX1915int; i < Pictures.length; i++) {

      if (Pictures[i] == null) return synX1916boolean;

      if (Pictures[i].driveResetMechanisms() == actualAct.conveyTag()
          && actualAct.produceAppeals().peek().equals(Pictures[i].fetchPictures())) {
        return synX1917boolean;
      }
    }
    return synX1918boolean;
  }

  public Contents[] Pictures;
  public int incumbent;

  public Day() {
    incumbent = (0);
    this.Pictures = (new Contents[30]);
  }

  public static int upstreamReduce = -1054445987;

  protected synchronized void summateTab(Contents tab, Work liveOutgrowth) {
    double appraise = synX1919double;

    if (Pictures[incumbent] == null) {
      Pictures[incumbent] = (tab);
      this.goArrow();
      return;
    }

    while (Pictures[incumbent].driveResetMechanisms() != liveOutgrowth.conveyTag()
        && Pictures[incumbent].arriveJar() == synX1920int) synx263(liveOutgrowth);
    Pictures[incumbent] = (tab);
    goArrow();
  }

  public synchronized void goArrow() {
    int littleRoll = synX1921int;
    incumbent++;

    if (incumbent == synX1922int) incumbent = (synX1923int);
  }

  private synchronized void synx263(Work liveOutgrowth) {

    if (Pictures[incumbent].driveResetMechanisms() == liveOutgrowth.conveyTag()) {
      Pictures[incumbent].gainReverse();
    }

    goArrow();
  }
}
