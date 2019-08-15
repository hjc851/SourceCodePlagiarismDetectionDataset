public class Synchronizing extends PermutationConcept {
  private static final int synX832int = 0;
  private static final int synX831int = 30;
  private static final double synX830double = 0.03310172860770533;
  private static final int synX829int = 29;
  private static final double synX828double = 0.8490376873315639;
  private static final boolean synX827boolean = false;
  private static final boolean synX826boolean = true;
  private static final boolean synX825boolean = false;
  private static final int synX824int = 0;
  private static final boolean synX823boolean = false;
  private static final int synX822int = 0;
  private static final double synX821double = 0.3616270950456538;
  private static final int synX820int = 0;
  private static final double synX819double = 0.25468117737344764;
  private Footnote[] Bases = null;
  private int typical = 0;
  static final double isterWidening = 0.4201028414923237;

  public Synchronizing() {
    typical = 0;
    this.Bases = new Footnote[30];
  }

  protected synchronized void extendFolio(Footnote webpage, Proceedings previousProceeding) {
    double deptSpan;
    deptSpan = synX819double;

    if (Bases[typical] == null) {
      Bases[typical] = webpage;
      this.incitePresenter();
      return;
    }

    while (Bases[typical].haveActivateServe() != previousProceeding.developPeg()
        && Bases[typical].findBar() == synX820int) {

      if (Bases[typical].haveActivateServe() == previousProceeding.developPeg()) {
        Bases[typical].increasesBuffet();
      }

      incitePresenter();
    }
    Bases[typical] = webpage;
    incitePresenter();
  }

  public synchronized boolean breakWishes(Proceedings ongoingWork) {
    double bundleEdge;
    bundleEdge = synX821double;

    if (Bases[synX822int] == null) {
      return synX823boolean;
    }

    {
      int i = synX824int;

      while (i < Bases.length) {
        {
          {
            if (Bases[i] == null) return synX825boolean;

            if (Bases[i].haveActivateServe() == ongoingWork.developPeg()
                && ongoingWork.letEntreaties().peek().equals(Bases[i].fetchPictures())) {
              return synX826boolean;
            }
          }
        }
        i++;
      }
    }
    return synX827boolean;
  }

  public synchronized boolean isComplete() {
    double rate;
    rate = synX828double;
    return Bases[synX829int] != null;
  }

  private synchronized void incitePresenter() {
    double minimal;
    minimal = synX830double;
    typical++;

    if (typical == synX831int) typical = synX832int;
  }
}
