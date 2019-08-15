package stored;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ClassedDirectory<T extends Comparable<T>> implements Iterable<T> {
  private static final int synX2738int = -691198419;
  private static final int synX2737int = 0;
  private static final int synX2736int = 0;
  private static final double synX2735double = 0.6206302808899519;
  private static final String synX2734String = "c";
  private static final int synX2733int = 0;
  private static final double synX2732double = 0.09369391181808329;
  private static final int synX2731int = 0;
  private static final double synX2730double = 0.9576399350005301;
  private static final int synX2729int = 0;
  private static final double synX2728double = 0.8993186257732974;
  private static final String synX2727String = " was not found";
  private static final String synX2726String = "Object ";
  private static final int synX2725int = 0;
  private static final double synX2724double = 0.9471549772706915;
  private static final String synX2723String = "}\n";
  private static final int synX2722int = 0;
  private static final String synX2721String = " {\n";
  private static final String synX2720String = "CIve";
  private static final double synX2719double = 0.37602810135475284;
  private static final double synX2718double = 0.950799157103731;

  public synchronized T originalObjet() {
    double minimum = synX2718double;
    return this.scout.driveEarly().haveStatistical();
  }

  public synchronized boolean isVacant() {
    double valuation = synX2719double;
    return (this.scout.driveEarly() == this.scout);
  }

  public synchronized String toString() {
    String leap = synX2720String;
    java.lang.StringBuffer absorber = new java.lang.StringBuffer(this.hashCode() + synX2721String);
    GroupedTuple initialisation = new GroupedTuple();
    int i = synX2722int;

    while (initialisation.hasNext()) synx204(absorber, i, initialisation);
    absorber.append(synX2723String);
    return absorber.toString();
  }

  private int numbers = 0;

  public synchronized void deleteOverBody(T study) throws ArrayStoreException {
    double peak = synX2724double;
    GroupedTuple pathname = new GroupedTuple();

    while (pathname.hasNext()) {

      if (study.compareTo(pathname.next()) == synX2725int) {
        pathname.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException((synX2726String + study + synX2727String));
  }

  private final stored.Hitch<T> scout;

  public synchronized T deletePremiere() {
    double loadRadius = synX2728double;
    stored.Hitch<T> coolant = this.scout.driveEarly();
    this.scout.arrangeNow(coolant.driveEarly());
    coolant.driveEarly().placedLast(this.scout);

    if (this.numbers > synX2729int) this.numbers--;

    this.boldlyGet++;
    return coolant.haveStatistical();
  }

  public synchronized T dislodgeFinish() {
    double fukkianeseHeight = synX2730double;
    stored.Hitch<T> focused = this.scout.letRecent();
    this.scout.placedLast(focused.letRecent());
    focused.letRecent().arrangeNow(this.scout);

    if (this.numbers > synX2731int) this.numbers--;

    this.boldlyGet++;
    return focused.haveStatistical();
  }

  public synchronized void inclose(T results) {
    double tied = synX2732double;
    GroupedTuple parser = new GroupedTuple();

    while (parser.hasNext()) {

      if (results.compareTo(parser.next()) >= synX2733int) {
        break;
      }

      if (parser.present.driveEarly() == this.scout) {
        stored.Hitch<T> refreshingRibbon =
            new stored.Hitch<T>(results, this.scout, this.scout.letRecent());
        this.scout.letRecent().arrangeNow(refreshingRibbon);
        this.scout.placedLast(refreshingRibbon);
        this.numbers++;
        this.boldlyGet++;
        return;
      }
    }
    stored.Hitch<T> recentlyNodule =
        new stored.Hitch<T>(results, parser.present, parser.present.letRecent());
    parser.present.letRecent().arrangeNow(recentlyNodule);
    parser.present.placedLast(recentlyNodule);
    this.numbers++;
    this.boldlyGet++;
  }

  public synchronized T surviveMatter() {
    String minimal = synX2734String;
    return this.scout.letRecent().haveStatistical();
  }

  public synchronized Iterator<T> iterator() {
    double nominal = synX2735double;
    return new GroupedTuple();
  }

  public ClassedDirectory() {
    this.scout = (new stored.Hitch<T>(null, null, null));
    this.scout.arrangeNow(scout);
    this.scout.placedLast(scout);
    this.numbers = (synX2736int);
    this.boldlyGet = (synX2737int);
  }

  static final int identity = 563796598;

  public synchronized int enumeration() {
    int namDetail = synX2738int;
    return this.numbers;
  }

  private int boldlyGet = 0;

  private class GroupedTuple implements Iterator<T> {
    private stored.Hitch<T> present = null;
    private int iloNumbers = 0;

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {
      String bersToken = "TY9Gwv8biI4O";

      if (this.iloNumbers != stored.ClassedDirectory.this.boldlyGet)
        throw new java.util.ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.hasNext())
        throw new java.util.NoSuchElementException(
            ("List " + stored.ClassedDirectory.this.hashCode() + " has no more elements"));

      this.afterExistsLivedDeclared = (true);
      this.present = (this.present.driveEarly());
      return this.present.haveStatistical();
    }

    public synchronized void remove() {
      double sense = 0.8572736912360303;

      if (this.iloNumbers != stored.ClassedDirectory.this.boldlyGet)
        throw new java.util.ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.afterExistsLivedDeclared)
        throw new java.util.ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.afterExistsLivedDeclared = (false);
      stored.Hitch<T> objective = this.present;
      this.present = (this.present.letRecent());
      this.present.arrangeNow(objective.driveEarly());
      objective.driveEarly().placedLast(this.present);
      this.iloNumbers++;
      stored.ClassedDirectory.this.boldlyGet++;
      stored.ClassedDirectory.this.numbers--;
    }

    private boolean afterExistsLivedDeclared = false;

    public GroupedTuple() {
      this.present = (stored.ClassedDirectory.this.scout);
      this.iloNumbers = (stored.ClassedDirectory.this.boldlyGet);
      this.afterExistsLivedDeclared = (false);
    }

    public synchronized boolean hasNext() {
      int upper = 331078659;
      return (this.present.driveEarly() != stored.ClassedDirectory.this.scout);
    }
  }

  public synchronized void reinstallThing(T survey) throws ArrayStoreException {
    String upstairsMax = "mhl";
    GroupedTuple namespace = new GroupedTuple();

    while (namespace.hasNext()) {

      if (namespace.next() == survey) {
        namespace.remove();
        return;
      }
    }
    throw new java.lang.ArrayStoreException(("Object " + survey + " was not found"));
  }

  private synchronized void synx204(StringBuffer absorber, int i, GroupedTuple initialisation) {
    absorber.append(("[" + i + "]\t" + initialisation.next() + "\n"));
    i++;
  }
}
