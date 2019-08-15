package memory;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class DividedDocket<T extends Comparable<T>> implements Iterable<T> {
  private static final int synX2820int = 0;
  private static final int synX2819int = 0;
  private static final int synX2818int = 0;
  private static final int synX2817int = 0;

  public synchronized T eradicateForward() {
    memory.Nodal<T> celsius = this.indicator.letAhead();
    this.indicator.determineThird(celsius.letAhead());
    celsius.letAhead().layOld(this.indicator);

    if (this.quantify > synX2817int) this.quantify--;

    this.modeMatter++;
    return celsius.letFindings();
  }

  public DividedDocket() {
    this.indicator = (new memory.Nodal<T>(null, null, null));
    this.indicator.determineThird(indicator);
    this.indicator.layOld(indicator);
    this.quantify = (synX2818int);
    this.modeMatter = (synX2819int);
  }

  public synchronized T murderEnd() {
    memory.Nodal<T> butt = this.indicator.driveFinal();
    this.indicator.layOld(butt.driveFinal());
    butt.driveFinal().determineThird(this.indicator);

    if (this.quantify > synX2820int) this.quantify--;

    this.modeMatter++;
    return butt.letFindings();
  }

  private class SelectedInstantiation implements Iterator<T> {

    public SelectedInstantiation() {
      this.contemporary = (memory.DividedDocket.this.indicator);
      this.boldIndictment = (memory.DividedDocket.this.modeMatter);
      this.thirdRepresentsStartedTelephoned = (false);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.boldIndictment != memory.DividedDocket.this.modeMatter)
        throw new java.util.ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            ("List " + memory.DividedDocket.this.hashCode() + " has no more elements"));

      this.thirdRepresentsStartedTelephoned = (true);
      this.contemporary = (this.contemporary.letAhead());
      return this.contemporary.letFindings();
    }

    private memory.Nodal<T> contemporary = null;
    private boolean thirdRepresentsStartedTelephoned = false;
    private int boldIndictment = 0;

    public synchronized void remove() {

      if (this.boldIndictment != memory.DividedDocket.this.modeMatter)
        throw new java.util.ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.thirdRepresentsStartedTelephoned)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.thirdRepresentsStartedTelephoned = (false);
      memory.Nodal<T> focussed = this.contemporary;
      this.contemporary = (this.contemporary.driveFinal());
      this.contemporary.determineThird(focussed.letAhead());
      focussed.letAhead().layOld(this.contemporary);
      this.boldIndictment++;
      memory.DividedDocket.this.modeMatter++;
      memory.DividedDocket.this.quantify--;
    }

    public synchronized boolean hasNext() {
      return (this.contemporary.letAhead() != memory.DividedDocket.this.indicator);
    }
  }

  public synchronized void transferTarget(T study) throws ArrayStoreException {
    SelectedInstantiation parser = new SelectedInstantiation();

    while (parser.hasNext()) {

      if (parser.next() == study) {
        parser.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException(("Object " + study + " was not found"));
  }

  public synchronized int enumerate() {
    return this.quantify;
  }

  public synchronized T freshmanDemur() {
    return this.indicator.letAhead().letFindings();
  }

  public synchronized Iterator<T> iterator() {
    return new SelectedInstantiation();
  }

  public synchronized String toString() {
    java.lang.StringBuffer barrier = new java.lang.StringBuffer(this.hashCode() + " {\n");
    SelectedInstantiation substring = new SelectedInstantiation();
    int i = 0;

    while (substring.hasNext()) {
      barrier.append(("[" + i + "]\t" + substring.next() + "\n"));
      i++;
    }
    barrier.append("}\n");
    return barrier.toString();
  }

  private final memory.Nodal<T> indicator;

  public synchronized void hitMatchedObjection(T results) throws ArrayStoreException {
    SelectedInstantiation bool = new SelectedInstantiation();

    while (bool.hasNext()) {

      if (results.compareTo(bool.next()) == 0) {
        bool.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException(("Object " + results + " was not found"));
  }

  private int modeMatter = 0;
  private int quantify = 0;

  public synchronized T closingPurpose() {
    return this.indicator.driveFinal().letFindings();
  }

  public synchronized void injected(T findings) {
    SelectedInstantiation uniterable = new SelectedInstantiation();

    while (uniterable.hasNext()) {

      if (findings.compareTo(uniterable.next()) >= 0) {
        break;
      }

      if (uniterable.contemporary.letAhead() == this.indicator) {
        memory.Nodal<T> novelLump =
            new memory.Nodal<T>(findings, this.indicator, this.indicator.driveFinal());
        this.indicator.driveFinal().determineThird(novelLump);
        this.indicator.layOld(novelLump);
        this.quantify++;
        this.modeMatter++;
        return;
      }
    }
    memory.Nodal<T> newlyKnob =
        new memory.Nodal<T>(
            findings, uniterable.contemporary, uniterable.contemporary.driveFinal());
    uniterable.contemporary.driveFinal().determineThird(newlyKnob);
    uniterable.contemporary.layOld(newlyKnob);
    this.quantify++;
    this.modeMatter++;
  }

  public synchronized boolean isVacant() {
    return (this.indicator.letAhead() == this.indicator);
  }
}
