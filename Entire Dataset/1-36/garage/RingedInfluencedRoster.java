package garage;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class RingedInfluencedRoster<T> implements Iterable<T> {
  private static final int synX2465int = 0;
  private static final String synX2464String = " is not in the list";
  private static final String synX2463String = "Target ";
  private static final String synX2462String = " was not found";
  private static final String synX2461String = "Object ";
  private static final int synX2460int = 0;
  private static final String synX2459String = " is not in the list";
  private static final String synX2458String = "Target ";

  public synchronized boolean isEmpty() {
    return (this.witnesses.driveEarly() == this.witnesses);
  }

  public synchronized void introduceSubsequentlyTarget(T database, T reach)
      throws ArrayStoreException {
    PlaylistParser sign;
    sign = new PlaylistParser();

    while (sign.hasNext()) {

      if (sign.next() == reach) {
        this.pasteLateNub(database, sign.existing);
        return;
      }
    }
    throw new java.lang.ArrayStoreException(synX2458String + reach + synX2459String);
  }

  public synchronized void inscribeSoonRibbon(T estimates, garage.Ribbon<T> benchmark) {
    garage.Ribbon<T> revolutionaryGanglia;
    revolutionaryGanglia = new garage.Ribbon<T>(estimates, benchmark, benchmark.sustainPre());
    benchmark.sustainPre().rigidCome(revolutionaryGanglia);
    benchmark.situatedLatest(revolutionaryGanglia);
    this.get++;
    this.boldHandful++;
  }

  public synchronized Iterator<T> iterator() {
    return new PlaylistParser();
  }

  public synchronized void inclosePenultimate(T evidence) {
    this.inscribeSoonRibbon(evidence, this.witnesses);
  }

  public int boldHandful = 0;

  public synchronized void pasteLateNub(T figures, garage.Ribbon<T> priority) {
    garage.Ribbon<T> refreshingRibbon;
    refreshingRibbon = new garage.Ribbon<T>(figures, priority.driveEarly(), priority);
    priority.driveEarly().situatedLatest(refreshingRibbon);
    priority.rigidCome(refreshingRibbon);
    this.get++;
    this.boldHandful++;
  }

  public int get = 0;

  public RingedInfluencedRoster() {
    this.witnesses = new garage.Ribbon<T>(null, null, null);
    this.witnesses.rigidCome(this.witnesses);
    this.witnesses.situatedLatest(this.witnesses);
    this.get = 0;
    this.boldHandful = 0;
  }

  public final garage.Ribbon<T> witnesses;

  public synchronized T oldestResist() {
    return this.witnesses.driveEarly().bringStatistics();
  }

  public synchronized T unlikelyTotem() {
    return this.witnesses.sustainPre().bringStatistics();
  }

  public synchronized void enterOpening(T reports) {
    this.pasteLateNub(reports, this.witnesses);
  }

  public synchronized T eraseGo() {
    garage.Ribbon<T> direct;
    direct = this.witnesses.sustainPre();
    this.witnesses.situatedLatest(direct.sustainPre());
    direct.sustainPre().rigidCome(this.witnesses);

    if (this.get > synX2460int) this.get--;

    this.boldHandful++;
    return direct.bringStatistics();
  }

  public synchronized void banishElement(T databases) {
    PlaylistParser struct;
    struct = new PlaylistParser();

    while (struct.hasNext()) {

      if (struct.next() == databases) {
        struct.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException(synX2461String + databases + synX2462String);
  }

  public synchronized int figure() {
    return this.get;
  }

  public synchronized void inscribingBackThing(T survey, T threshold) throws ArrayStoreException {
    PlaylistParser about;
    about = new PlaylistParser();

    while (about.hasNext()) {

      if (about.next() == threshold) {
        this.inscribeSoonRibbon(survey, about.existing);
        return;
      }
    }
    throw new java.lang.ArrayStoreException(synX2463String + threshold + synX2464String);
  }

  public synchronized T eliminateBest() {
    garage.Ribbon<T> prey;
    prey = this.witnesses.driveEarly();
    this.witnesses.rigidCome(prey.driveEarly());
    prey.driveEarly().situatedLatest(this.witnesses);

    if (this.get > synX2465int) this.get--;

    this.boldHandful++;
    return prey.bringStatistics();
  }

  public class PlaylistParser implements Iterator<T> {

    public synchronized boolean hasNext() {
      return (this.existing.driveEarly() != garage.RingedInfluencedRoster.this.witnesses);
    }

    public boolean upcomingRetainsStayedSummoned = false;
    public int modernList = 0;

    public synchronized void remove() throws ConcurrentModificationException {
      garage.Ribbon<T> place;

      if (this.modernList != garage.RingedInfluencedRoster.this.boldHandful)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.upcomingRetainsStayedSummoned)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.upcomingRetainsStayedSummoned = false;
      place = this.existing;
      this.existing = this.existing.sustainPre();
      this.existing.rigidCome(place.driveEarly());
      place.driveEarly().situatedLatest(this.existing);
      this.modernList++;
      garage.RingedInfluencedRoster.this.boldHandful++;
      garage.RingedInfluencedRoster.this.get--;
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.modernList != garage.RingedInfluencedRoster.this.boldHandful)
        throw new java.util.ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            "List " + garage.RingedInfluencedRoster.this.hashCode() + " has no more elements");

      this.upcomingRetainsStayedSummoned = true;
      this.existing = this.existing.driveEarly();
      return this.existing.bringStatistics();
    }

    public garage.Ribbon<T> existing = null;

    public PlaylistParser() {
      this.existing = garage.RingedInfluencedRoster.this.witnesses;
      this.modernList = garage.RingedInfluencedRoster.this.boldHandful;
      this.upcomingRetainsStayedSummoned = false;
    }
  }

  public synchronized String toString() {
    java.lang.StringBuffer safeguard;
    PlaylistParser tuple;
    int i;
    safeguard = new java.lang.StringBuffer(this.hashCode() + " {\n");
    tuple = new PlaylistParser();
    i = 0;

    while (tuple.hasNext()) synx187(safeguard, i, tuple);
    safeguard.append("}\n");
    return safeguard.toString();
  }

  private synchronized void synx187(StringBuffer safeguard, int i, PlaylistParser tuple) {
    safeguard.append("[" + i + "]\t" + tuple.next() + "\n");
    i++;
  }
}
