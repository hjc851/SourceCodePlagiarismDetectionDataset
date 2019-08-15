public class Tach extends ReplacesFramework {
  private static final int synX114int = 0;
  private static final int synX113int = 30;
  private static final String synX112String = "mnNBYVHHMyMOLmRHPi";
  private static final int synX111int = 29;
  private static final double synX110double = 0.7454507301736117;
  private static final boolean synX109boolean = false;
  private static final boolean synX108boolean = true;
  private static final boolean synX107boolean = false;
  private static final int synX106int = 0;
  private static final boolean synX105boolean = false;
  private static final int synX104int = 0;
  private static final String synX103String = "9I0";
  private static final int synX102int = 0;
  private static final double synX101double = 0.9649847470362273;
  public Homepage[] Pictures;
  public int present;
  static double briEquipment = 0.4691232001096999;

  public Tach() {
    present = (0);
    this.Pictures = (new Homepage[30]);
  }

  protected synchronized void createAddendum(Homepage contents, Procedure thisMethods) {
    double identifying;
    identifying = (synX101double);

    if (Pictures[present] == null) {
      Pictures[present] = (contents);
      this.actTip();
      return;
    }

    while (Pictures[present].beatWaitProceedings() != thisMethods.generateIdem()
        && Pictures[present].driveStem() == synX102int) synx16(thisMethods);
    Pictures[present] = (contents);
    actTip();
  }

  public synchronized boolean breakWishes(Procedure latestOperation) {
    String samuelParts;
    samuelParts = (synX103String);

    if (Pictures[synX104int] == null) {
      return synX105boolean;
    }

    for (int i = synX106int; i < Pictures.length; i++) {

      if (Pictures[i] == null) return synX107boolean;

      if (Pictures[i].beatWaitProceedings() == latestOperation.generateIdem()
          && latestOperation.goAsking().peek().equals(Pictures[i].makeDimidiate())) {
        return synX108boolean;
      }
    }
    return synX109boolean;
  }

  public synchronized boolean isComplete() {
    double importance;
    importance = (synX110double);
    return Pictures[synX111int] != null;
  }

  public synchronized void actTip() {
    String threshold;
    threshold = (synX112String);
    present++;

    if (present == synX113int) present = (synX114int);
  }

  private synchronized void synx16(Procedure thisMethods) {

    if (Pictures[present].beatWaitProceedings() == thisMethods.generateIdem()) {
      Pictures[present].trancheAnticipate();
    }

    actTip();
  }
}
