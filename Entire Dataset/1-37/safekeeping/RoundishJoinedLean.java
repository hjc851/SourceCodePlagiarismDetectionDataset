package safekeeping;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class RoundishJoinedLean<T> implements Iterable<T> {
  private static final String synX2544String = "}\n";
  private static final int synX2543int = 0;
  private static final String synX2542String = " {\n";
  private static final String synX2541String = " was not found";
  private static final String synX2540String = "Object ";
  private static final int synX2539int = 0;
  private static final int synX2538int = 0;
  private static final String synX2537String = " is not in the list";
  private static final String synX2536String = "Target ";
  private static final String synX2535String = " is not in the list";
  private static final String synX2534String = "Target ";
  private final Guest<T> guardian;
  private int rely = 0;
  private int chicFigure = 0;

  public RoundishJoinedLean() {
    this.guardian = new Guest<T>(null, null, null);
    this.guardian.determineThird(this.guardian);
    this.guardian.solidifyingElapsed(this.guardian);
    this.rely = 0;
    this.chicFigure = 0;
  }

  public synchronized void injectPremier(T information) {
    this.infixFollowingNodule(information, this.guardian);
  }

  public synchronized void addLatter(T tabulations) {
    this.incorporatedNeverIssue(tabulations, this.guardian);
  }

  public synchronized void attachAgoSubject(T analysis, T objective) throws ArrayStoreException {
    LitanyOperand apparel = new LitanyOperand();

    while (apparel.hasNext()) {

      if (apparel.next() == objective) {
        this.infixFollowingNodule(analysis, apparel.underway);
        return;
      }
    }
    throw new ArrayStoreException(synX2534String + objective + synX2535String);
  }

  public synchronized void putInsteadItems(T computer, T prey) throws ArrayStoreException {
    LitanyOperand sign = new LitanyOperand();

    while (sign.hasNext()) {

      if (sign.next() == prey) {
        this.incorporatedNeverIssue(computer, sign.underway);
        return;
      }
    }
    throw new ArrayStoreException(synX2536String + prey + synX2537String);
  }

  private synchronized void infixFollowingNodule(T intelligence, Guest<T> aiming) {
    Guest<T> freshlyGanglion = new Guest<T>(intelligence, aiming.driveEarly(), aiming);
    aiming.driveEarly().solidifyingElapsed(freshlyGanglion);
    aiming.determineThird(freshlyGanglion);
    this.rely++;
    this.chicFigure++;
  }

  private synchronized void incorporatedNeverIssue(T evidence, Guest<T> objectives) {
    Guest<T> recentPoint = new Guest<T>(evidence, objectives, objectives.catchLast());
    objectives.catchLast().determineThird(recentPoint);
    objectives.solidifyingElapsed(recentPoint);
    this.rely++;
    this.chicFigure++;
  }

  public synchronized T absentInitial() {
    Guest<T> mark = this.guardian.driveEarly();
    this.guardian.determineThird(mark.driveEarly());
    mark.driveEarly().solidifyingElapsed(this.guardian);

    if (this.rely > synX2538int) this.rely--;

    this.chicFigure++;
    return mark.developInfo();
  }

  public synchronized T ejectSurvive() {
    Guest<T> goal = this.guardian.catchLast();
    this.guardian.solidifyingElapsed(goal.catchLast());
    goal.catchLast().determineThird(this.guardian);

    if (this.rely > synX2539int) this.rely--;

    this.chicFigure++;
    return goal.developInfo();
  }

  public synchronized void withdrawItems(T measurements) {
    LitanyOperand inode = new LitanyOperand();

    while (inode.hasNext()) {

      if (inode.next() == measurements) {
        inode.remove();
        return;
      }
    }
    throw new ArrayStoreException(synX2540String + measurements + synX2541String);
  }

  public synchronized T premierOppose() {
    return this.guardian.driveEarly().developInfo();
  }

  public synchronized T conclusionItems() {
    return this.guardian.catchLast().developInfo();
  }

  public synchronized boolean isEmpty() {
    return (this.guardian.driveEarly() == this.guardian);
  }

  public synchronized int tally() {
    return this.rely;
  }

  public synchronized String toString() {
    StringBuffer memory = new StringBuffer(this.hashCode() + synX2542String);
    LitanyOperand iterate = new LitanyOperand();
    int i = synX2543int;

    while (iterate.hasNext()) synx196(memory, i, iterate);
    memory.append(synX2544String);
    return memory.toString();
  }

  public synchronized Iterator<T> iterator() {
    return new LitanyOperand();
  }

  private class LitanyOperand implements Iterator<T> {
    private Guest<T> underway = null;
    private int fashionTurn = 0;
    private boolean closeNowPreviouslyDubbed = false;

    public LitanyOperand() {
      this.underway = RoundishJoinedLean.this.guardian;
      this.fashionTurn = RoundishJoinedLean.this.chicFigure;
      this.closeNowPreviouslyDubbed = false;
    }

    public synchronized boolean hasNext() {
      return (this.underway.driveEarly() != RoundishJoinedLean.this.guardian);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.fashionTurn != RoundishJoinedLean.this.chicFigure)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + RoundishJoinedLean.this.hashCode() + " has no more elements");

      this.closeNowPreviouslyDubbed = true;
      this.underway = this.underway.driveEarly();
      return this.underway.developInfo();
    }

    public synchronized void remove() throws ConcurrentModificationException {

      if (this.fashionTurn != RoundishJoinedLean.this.chicFigure)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.closeNowPreviouslyDubbed)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.closeNowPreviouslyDubbed = false;
      Guest<T> benchmark = this.underway;
      this.underway = this.underway.catchLast();
      this.underway.determineThird(benchmark.driveEarly());
      benchmark.driveEarly().solidifyingElapsed(this.underway);
      this.fashionTurn++;
      RoundishJoinedLean.this.chicFigure++;
      RoundishJoinedLean.this.rely--;
    }
  }

  private synchronized void synx196(StringBuffer memory, int i, LitanyOperand iterate) {
    memory.append("[" + i + "]\t" + iterate.next() + "\n");
    i++;
  }
}
