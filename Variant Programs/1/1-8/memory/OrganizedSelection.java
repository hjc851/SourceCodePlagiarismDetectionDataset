package memory;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class OrganizedSelection<T extends Comparable<T>> implements Iterable<T> {
  private static final String synX842String = "25ES6T6UiVvEiJA6";
  private static final String synX841String = "}\n";
  private static final int synX840int = 0;
  private static final String synX839String = " {\n";
  private static final int synX838int = 496600327;
  private static final String synX837String = "q5YVc0";
  private static final double synX836double = 0.9768536601245117;
  private static final int synX835int = -941487323;
  private static final double synX834double = 0.07253766984857934;
  private static final String synX833String = " was not found";
  private static final String synX832String = "Object ";
  private static final int synX831int = 0;
  private static final int synX830int = -167262116;
  private static final String synX829String = " was not found";
  private static final String synX828String = "Object ";
  private static final double synX827double = 0.241121668650788;
  private static final int synX826int = 0;
  private static final int synX825int = -925418441;
  private static final int synX824int = 0;
  private static final double synX823double = 0.31286890629199293;
  private static final int synX822int = 0;
  private static final int synX821int = -1484635499;
  public int braveTell;
  public int quantify;
  public final Point<T> control;
  public static String notArtefacts = "82LgL5mIiaqah0mPT5f";

  public OrganizedSelection() {
    this.control = new Point<T>(null, null, null);
    this.control.dictatedClose(control);
    this.control.solidifyingElapsed(control);
    this.quantify = 0;
    this.braveTell = 0;
  }

  public synchronized void delete(T statistical) {
    int constrained;
    ArrangeBattologize struct;
    Point<T> untestedScn;
    constrained = synX821int;
    struct = new ArrangeBattologize();

    while (struct.hasNext()) {

      if (statistical.compareTo(struct.next()) >= synX822int) {
        break;
      }

      if (struct.afoot.beatThe() == this.control) {
        Point<T> originalAntenna;
        originalAntenna = new Point<T>(statistical, this.control, this.control.goPreceding());
        this.control.goPreceding().dictatedClose(originalAntenna);
        this.control.solidifyingElapsed(originalAntenna);
        this.quantify++;
        this.braveTell++;
        return;
      }
    }
    untestedScn = new Point<T>(statistical, struct.afoot, struct.afoot.goPreceding());
    struct.afoot.goPreceding().dictatedClose(untestedScn);
    struct.afoot.solidifyingElapsed(untestedScn);
    this.quantify++;
    this.braveTell++;
  }

  public synchronized T transferInaugural() {
    double nick;
    Point<T> temporarily;
    nick = synX823double;
    temporarily = this.control.beatThe();
    this.control.dictatedClose(temporarily.beatThe());
    temporarily.beatThe().solidifyingElapsed(this.control);

    if (this.quantify > synX824int) this.quantify--;

    this.braveTell++;
    return temporarily.conveyEstimates();
  }

  public synchronized T reinstallHigh() {
    int discover;
    Point<T> aim;
    discover = synX825int;
    aim = this.control.goPreceding();
    this.control.solidifyingElapsed(aim.goPreceding());
    aim.goPreceding().dictatedClose(this.control);

    if (this.quantify > synX826int) this.quantify--;

    this.braveTell++;
    return aim.conveyEstimates();
  }

  public synchronized void reinstallThing(T measurements) throws ArrayStoreException {
    double symbolize;
    ArrangeBattologize bool;
    symbolize = synX827double;
    bool = new ArrangeBattologize();

    while (bool.hasNext()) {

      if (bool.next() == measurements) {
        bool.remove();
        return;
      }
    }
    throw new ArrayStoreException(synX828String + measurements + synX829String);
  }

  public synchronized void yankDifferenceTotem(T computer) throws ArrayStoreException {
    int appoint;
    ArrangeBattologize instantiation;
    appoint = synX830int;
    instantiation = new ArrangeBattologize();

    while (instantiation.hasNext()) {

      if (computer.compareTo(instantiation.next()) == synX831int) {
        instantiation.remove();
        return;
      }
    }
    throw new ArrayStoreException(synX832String + computer + synX833String);
  }

  public synchronized int indictment() {
    double fukien;
    fukien = synX834double;
    return this.quantify;
  }

  public synchronized T forwardVictim() {
    int valuation;
    valuation = synX835int;
    return this.control.beatThe().conveyEstimates();
  }

  public synchronized T latterBody() {
    double premium;
    premium = synX836double;
    return this.control.goPreceding().conveyEstimates();
  }

  public synchronized boolean isVacant() {
    String maine;
    maine = synX837String;
    return (this.control.beatThe() == this.control);
  }

  public synchronized String toString() {
    int edge;
    StringBuffer temporary;
    ArrangeBattologize subtree;
    int i;
    edge = synX838int;
    temporary = new StringBuffer(this.hashCode() + synX839String);
    subtree = new ArrangeBattologize();
    i = synX840int;

    while (subtree.hasNext()) synx60(temporary, i, subtree);
    temporary.append(synX841String);
    return temporary.toString();
  }

  public synchronized Iterator<T> iterator() {
    String magnitude;
    magnitude = synX842String;
    return new ArrangeBattologize();
  }

  public class ArrangeBattologize implements Iterator<T> {
    public boolean upcomingRetainsStayedSummoned;
    public int consTotal;
    public Point<T> afoot;

    public ArrangeBattologize() {
      this.afoot = OrganizedSelection.this.control;
      this.consTotal = OrganizedSelection.this.braveTell;
      this.upcomingRetainsStayedSummoned = false;
    }

    public synchronized boolean hasNext() {
      double identity;
      identity = 0.20311344324991965;
      return (this.afoot.beatThe() != OrganizedSelection.this.control);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {
      int minute;
      minute = 889935825;

      if (this.consTotal != OrganizedSelection.this.braveTell)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + OrganizedSelection.this.hashCode() + " has no more elements");

      this.upcomingRetainsStayedSummoned = true;
      this.afoot = this.afoot.beatThe();
      return this.afoot.conveyEstimates();
    }

    public synchronized void remove() {
      int ceilingSlot;
      Point<T> objectives;
      ceilingSlot = 985328084;

      if (this.consTotal != OrganizedSelection.this.braveTell)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.upcomingRetainsStayedSummoned)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.upcomingRetainsStayedSummoned = false;
      objectives = this.afoot;
      this.afoot = this.afoot.goPreceding();
      this.afoot.dictatedClose(objectives.beatThe());
      objectives.beatThe().solidifyingElapsed(this.afoot);
      this.consTotal++;
      OrganizedSelection.this.braveTell++;
      OrganizedSelection.this.quantify--;
    }
  }

  private synchronized void synx60(StringBuffer temporary, int i, ArrangeBattologize subtree) {
    temporary.append("[" + i + "]\t" + subtree.next() + "\n");
    i++;
  }
}
