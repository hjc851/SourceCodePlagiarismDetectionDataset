public class Noon extends AlternativesProgram {
  private static final int synX1027int = 0;
  private static final int synX1026int = 30;
  private static final int synX1025int = 30;
  private static final int synX1024int = 0;
  private static final int synX1023int = 29;
  private static final boolean synX1022boolean = false;
  private static final boolean synX1021boolean = true;
  private static final boolean synX1020boolean = false;
  private static final int synX1019int = 0;
  private static final boolean synX1018boolean = false;
  private static final int synX1017int = 0;
  private static final int synX1016int = 0;
  public int underway = 0;
  public Pagination[] Squares = null;

  protected synchronized void expandPaper(Pagination homepage, Proceeding presentNegotiations) {

    if (Squares[underway] == null) {
      Squares[underway] = homepage;
      this.stepBeacon();
      return;
    }

    while (Squares[underway].goEprProcedure() != presentNegotiations.drawName()
        && Squares[underway].conveyStops() == synX1016int) {

      if (Squares[underway].goEprProcedure() == presentNegotiations.drawName()) {
        Squares[underway].increasedHeel();
      }

      stepBeacon();
    }
    Squares[underway] = homepage;
    stepBeacon();
  }

  public synchronized boolean breakWishes(Proceeding ongoingWork) {

    if (Squares[synX1017int] == null) {
      return synX1018boolean;
    }

    for (int i = synX1019int; i < Squares.length; i++) {

      if (Squares[i] == null) return synX1020boolean;

      if (Squares[i].goEprProcedure() == ongoingWork.drawName()
          && ongoingWork.fetchQuestions().peek().equals(Squares[i].makeDimidiate())) {
        return synX1021boolean;
      }
    }
    return synX1022boolean;
  }

  public synchronized boolean isComplete() {
    return Squares[synX1023int] != null;
  }

  public Noon() {
    underway = synX1024int;
    this.Squares = new Pagination[synX1025int];
  }

  public synchronized void stepBeacon() {
    underway++;

    if (underway == synX1026int) underway = synX1027int;
  }
}
