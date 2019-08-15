public class Noon extends SurrogateVision {
  private static final boolean synX2551boolean = false;
  private static final boolean synX2550boolean = true;
  private static final boolean synX2549boolean = false;
  private static final int synX2548int = 0;
  private static final boolean synX2547boolean = false;
  private static final int synX2546int = 0;
  private static final int synX2545int = 0;
  private static final int synX2544int = 30;
  private static final int synX2543int = 0;
  private static final int synX2542int = 30;
  private static final int synX2541int = 0;
  private static final int synX2540int = 29;

  public synchronized boolean isComplete() {
    return Bezel[synX2540int] != null;
  }

  public Noon() {
    afoot = (synX2541int);
    this.Bezel = (new Layouts[synX2542int]);
  }

  protected synchronized void combineScreen(Layouts summary, Procedures incumbentMarch) {

    if (Bezel[afoot] == null) {
      Bezel[afoot] = (summary);
      this.pushHint();
      return;
    }

    while (Bezel[afoot].haveActivateServe() != incumbentMarch.sustainSelf()
        && Bezel[afoot].comeAnti() == synX2543int) synx453(incumbentMarch);
    Bezel[afoot] = (summary);
    pushHint();
  }

  public synchronized void pushHint() {
    afoot++;

    if (afoot == synX2544int) afoot = (synX2545int);
  }

  public int afoot;
  public Layouts[] Bezel;

  public synchronized boolean watchQuest(Procedures topicalAppendage) {

    if (Bezel[synX2546int] == null) {
      return synX2547boolean;
    }

    {
      int i = synX2548int;

      while (i < Bezel.length) {
        {
          {
            if (Bezel[i] == null) return synX2549boolean;

            if (Bezel[i].haveActivateServe() == topicalAppendage.sustainSelf()
                && topicalAppendage.drawSubmissions().peek().equals(Bezel[i].fetchPictures())) {
              return synX2550boolean;
            }
          }
        }
        i++;
      }
    }
    return synX2551boolean;
  }

  private synchronized void synx453(Procedures incumbentMarch) {

    if (Bezel[afoot].haveActivateServe() == incumbentMarch.sustainSelf()) {
      Bezel[afoot].increasingCurb();
    }

    pushHint();
  }
}
