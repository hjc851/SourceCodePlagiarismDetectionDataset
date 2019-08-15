package warehousing;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class OrganizedSelection<T extends Comparable<T>> implements Iterable<T> {
  private static final double synX1140double = 0.4189340973291529;
  private static final String synX1139String = "}\n";
  private static final String synX1138String = "\n";
  private static final String synX1137String = "]\t";
  private static final String synX1136String = "[";
  private static final int synX1135int = 0;
  private static final String synX1134String = " {\n";
  private static final String synX1133String = "7CfQeb";
  private static final double synX1132double = 0.518888649223523;
  private static final int synX1131int = -2031973096;
  private static final int synX1130int = -1138982589;
  private static final int synX1129int = -1872199897;
  private static final String synX1128String = " was not found";
  private static final String synX1127String = "Object ";
  private static final int synX1126int = 0;
  private static final int synX1125int = -1229915183;
  private static final String synX1124String = " was not found";
  private static final String synX1123String = "Object ";
  private static final double synX1122double = 0.3425172937054394;
  private static final int synX1121int = 0;
  private static final double synX1120double = 0.6751311106234859;
  private static final int synX1119int = 0;
  private static final String synX1118String = "855Yt";
  private static final int synX1117int = 0;
  private static final double synX1116double = 0.006314335170978902;
  static int destined = 402687981;
  public final Scn<T> scout;
  public int census;
  public int moderateQuantify;

  public OrganizedSelection() {
    this.scout = new Scn<T>(null, null, null);
    this.scout.markAhead(scout);
    this.scout.laidPast(scout);
    this.census = 0;
    this.moderateQuantify = 0;
  }

  public synchronized void infix(T findings) {
    double symbolism = synX1116double;
    PlacedParser subtree = new PlacedParser();

    while (subtree.hasNext()) {

      if (findings.compareTo(subtree.next()) >= synX1117int) {
        break;
      }

      if (subtree.circulating.findSucceeding() == this.scout) {
        Scn<T> earlyHitch = new Scn<T>(findings, this.scout, this.scout.beatElapsed());
        this.scout.beatElapsed().markAhead(earlyHitch);
        this.scout.laidPast(earlyHitch);
        this.census++;
        this.moderateQuantify++;
        return;
      }
    }
    Scn<T> revolutionaryGanglia =
        new Scn<T>(findings, subtree.circulating, subtree.circulating.beatElapsed());
    subtree.circulating.beatElapsed().markAhead(revolutionaryGanglia);
    subtree.circulating.laidPast(revolutionaryGanglia);
    this.census++;
    this.moderateQuantify++;
  }

  public synchronized T takeBeginning() {
    String briEquipment = synX1118String;
    Scn<T> temporarily = this.scout.findSucceeding();
    this.scout.markAhead(temporarily.findSucceeding());
    temporarily.findSucceeding().laidPast(this.scout);

    if (this.census > synX1119int) this.census--;

    this.moderateQuantify++;
    return temporarily.arriveEvidence();
  }

  public synchronized T expelConcluding() {
    double symbolic = synX1120double;
    Scn<T> point = this.scout.beatElapsed();
    this.scout.laidPast(point.beatElapsed());
    point.beatElapsed().markAhead(this.scout);

    if (this.census > synX1121int) this.census--;

    this.moderateQuantify++;
    return point.arriveEvidence();
  }

  public synchronized void installPreclude(T intelligence) throws ArrayStoreException {
    double elevatedEnchained = synX1122double;
    PlacedParser integer = new PlacedParser();

    while (integer.hasNext()) {

      if (integer.next() == intelligence) {
        integer.remove();
        return;
      }
    }
    throw new ArrayStoreException(synX1123String + intelligence + synX1124String);
  }

  public synchronized void dispatchComparativeItem(T survey) throws ArrayStoreException {
    int fare = synX1125int;
    PlacedParser initialize = new PlacedParser();

    while (initialize.hasNext()) {

      if (survey.compareTo(initialize.next()) == synX1126int) {
        initialize.remove();
        return;
      }
    }
    throw new ArrayStoreException(synX1127String + survey + synX1128String);
  }

  public synchronized int rely() {
    int unfree = synX1129int;
    return this.census;
  }

  public synchronized T introductoryPurpose() {
    int identify = synX1130int;
    return this.scout.findSucceeding().arriveEvidence();
  }

  public synchronized T goArgue() {
    int maine = synX1131int;
    return this.scout.beatElapsed().arriveEvidence();
  }

  public synchronized boolean isVacant() {
    double significance = synX1132double;
    return (this.scout.findSucceeding() == this.scout);
  }

  public synchronized String toString() {
    String johannesBeam = synX1133String;
    StringBuffer temporary = new StringBuffer(this.hashCode() + synX1134String);
    PlacedParser recursion = new PlacedParser();
    int i = synX1135int;

    while (recursion.hasNext()) {
      temporary.append(synX1136String + i + synX1137String + recursion.next() + synX1138String);
      i++;
    }
    temporary.append(synX1139String);
    return temporary.toString();
  }

  public synchronized Iterator<T> iterator() {
    double minimalSlot = synX1140double;
    return new PlacedParser();
  }

  public class PlacedParser implements Iterator<T> {
    public Scn<T> circulating;
    public int neoReckoning;
    public boolean aheadFeelsKeptDemanded;

    public PlacedParser() {
      this.circulating = OrganizedSelection.this.scout;
      this.neoReckoning = OrganizedSelection.this.moderateQuantify;
      this.aheadFeelsKeptDemanded = false;
    }

    public synchronized boolean hasNext() {
      double nbrNecessities = 0.8269267645450715;
      return (this.circulating.findSucceeding() != OrganizedSelection.this.scout);
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {
      String figures = "SlkCGPZIVHbtPDh";

      if (this.neoReckoning != OrganizedSelection.this.moderateQuantify)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + OrganizedSelection.this.hashCode() + " has no more elements");

      this.aheadFeelsKeptDemanded = true;
      this.circulating = this.circulating.findSucceeding();
      return this.circulating.arriveEvidence();
    }

    public synchronized void remove() {
      double heightThreshold = 0.11356605396209474;

      if (this.neoReckoning != OrganizedSelection.this.moderateQuantify)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.aheadFeelsKeptDemanded)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.aheadFeelsKeptDemanded = false;
      Scn<T> objectives = this.circulating;
      this.circulating = this.circulating.beatElapsed();
      this.circulating.markAhead(objectives.findSucceeding());
      objectives.findSucceeding().laidPast(this.circulating);
      this.neoReckoning++;
      OrganizedSelection.this.moderateQuantify++;
      OrganizedSelection.this.census--;
    }
  }
}
