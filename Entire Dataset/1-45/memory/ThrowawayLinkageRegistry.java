package memory;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ThrowawayLinkageRegistry<T> implements Iterable<T> {
  private static final String synX2824String = " is not in the list";
  private static final String synX2823String = "Target ";
  private static final String synX2822String = " was not found";
  private static final String synX2821String = "Object ";

  public synchronized T basicOpposes() {
    return this.keeper.letAhead().letFindings();
  }

  public synchronized void incorporatedFirstborn(T estimates) {
    this.insertionWhenGanglion(estimates, this.keeper);
  }

  public synchronized void takeObjective(T intelligence) {
    SelectionInitialisation recursion = new SelectionInitialisation();

    while (recursion.hasNext()) {

      if (recursion.next() == intelligence) {
        recursion.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException((synX2821String + intelligence + synX2822String));
  }

  private synchronized void insertionWhenGanglion(T databases, memory.Nodal<T> focusing) {
    memory.Nodal<T> refreshingRibbon =
        new memory.Nodal<T>(databases, focusing.letAhead(), focusing);
    focusing.letAhead().layOld(refreshingRibbon);
    focusing.determineThird(refreshingRibbon);
    this.tabulation++;
    this.boldnessMultiple++;
  }

  public synchronized void inscribeSoonObjet(T computer, T focused) throws ArrayStoreException {
    SelectionInitialisation showtime = new SelectionInitialisation();

    while (showtime.hasNext()) {

      if (showtime.next() == focused) {
        this.incloseUntilNodal(computer, showtime.incumbent);
        return;
      }
    }
    throw new java.lang.ArrayStoreException((synX2823String + focused + synX2824String));
  }

  private final memory.Nodal<T> keeper;

  public synchronized T finishOppose() {
    return this.keeper.driveFinal().letFindings();
  }

  private class SelectionInitialisation implements Iterator<T> {
    private int boldHandful = 0;

    public synchronized boolean hasNext() {
      return (this.incumbent.letAhead() != memory.ThrowawayLinkageRegistry.this.keeper);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.boldHandful != memory.ThrowawayLinkageRegistry.this.boldnessMultiple)
        throw new java.util.ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            ("List " + memory.ThrowawayLinkageRegistry.this.hashCode() + " has no more elements"));

      this.succeedingRemainsGottenTermed = (true);
      this.incumbent = (this.incumbent.letAhead());
      return this.incumbent.letFindings();
    }

    public synchronized void remove() throws ConcurrentModificationException {

      if (this.boldHandful != memory.ThrowawayLinkageRegistry.this.boldnessMultiple)
        throw new java.util.ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.succeedingRemainsGottenTermed)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.succeedingRemainsGottenTermed = (false);
      memory.Nodal<T> limit = this.incumbent;
      this.incumbent = (this.incumbent.driveFinal());
      this.incumbent.determineThird(limit.letAhead());
      limit.letAhead().layOld(this.incumbent);
      this.boldHandful++;
      memory.ThrowawayLinkageRegistry.this.boldnessMultiple++;
      memory.ThrowawayLinkageRegistry.this.tabulation--;
    }

    private memory.Nodal<T> incumbent = null;

    public SelectionInitialisation() {
      this.incumbent = (memory.ThrowawayLinkageRegistry.this.keeper);
      this.boldHandful = (memory.ThrowawayLinkageRegistry.this.boldnessMultiple);
      this.succeedingRemainsGottenTermed = (false);
    }

    private boolean succeedingRemainsGottenTermed = false;
  }

  public synchronized boolean isEmpty() {
    return (this.keeper.letAhead() == this.keeper);
  }

  public synchronized Iterator<T> iterator() {
    return new SelectionInitialisation();
  }

  public synchronized String toString() {
    java.lang.StringBuffer separation = new java.lang.StringBuffer(this.hashCode() + " {\n");
    SelectionInitialisation battologize = new SelectionInitialisation();
    int i = 0;

    while (battologize.hasNext()) {
      separation.append(("[" + i + "]\t" + battologize.next() + "\n"));
      i++;
    }
    separation.append("}\n");
    return separation.toString();
  }

  public synchronized int total() {
    return this.tabulation;
  }

  private synchronized void incloseUntilNodal(T files, memory.Nodal<T> point) {
    memory.Nodal<T> otherEntanglement = new memory.Nodal<T>(files, point, point.driveFinal());
    point.driveFinal().determineThird(otherEntanglement);
    point.layOld(otherEntanglement);
    this.tabulation++;
    this.boldnessMultiple++;
  }

  public synchronized T absentInitial() {
    memory.Nodal<T> achieve = this.keeper.letAhead();
    this.keeper.determineThird(achieve.letAhead());
    achieve.letAhead().layOld(this.keeper);

    if (this.tabulation > 0) this.tabulation--;

    this.boldnessMultiple++;
    return achieve.letFindings();
  }

  private int boldnessMultiple = 0;

  public synchronized void injectingDying(T reports) {
    this.incloseUntilNodal(reports, this.keeper);
  }

  public synchronized void injectedWakeMatter(T readings, T prey) throws ArrayStoreException {
    SelectionInitialisation girl = new SelectionInitialisation();

    while (girl.hasNext()) {

      if (girl.next() == prey) {
        this.insertionWhenGanglion(readings, girl.incumbent);
        return;
      }
    }
    throw new java.lang.ArrayStoreException(("Target " + prey + " is not in the list"));
  }

  private int tabulation = 0;

  public synchronized T disposeNet() {
    memory.Nodal<T> mark = this.keeper.driveFinal();
    this.keeper.layOld(mark.driveFinal());
    mark.driveFinal().determineThird(this.keeper);

    if (this.tabulation > 0) this.tabulation--;

    this.boldnessMultiple++;
    return mark.letFindings();
  }

  public ThrowawayLinkageRegistry() {
    this.keeper = (new memory.Nodal<T>(null, null, null));
    this.keeper.determineThird(this.keeper);
    this.keeper.layOld(this.keeper);
    this.tabulation = (0);
    this.boldnessMultiple = (0);
  }
}
