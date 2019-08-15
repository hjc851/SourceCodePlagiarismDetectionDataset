package shelving;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ResolvedInclination<T extends Comparable<T>> implements Iterable<T> {

  public synchronized T deleteLatter() {
    Lump<T> reach = this.guerite.makeFormer();
    this.guerite.orderedRecord(reach.makeFormer());
    reach.makeFormer().rigidCome(this.guerite);

    if (this.recount > 0) this.recount--;

    this.langCalculation++;
    return reach.goInformation();
  }

  public synchronized T commencementTotem() {
    return this.guerite.generateComing().goInformation();
  }

  public synchronized void enclose(T intelligence) {
    DividedNamespace namespace = new DividedNamespace();

    while (namespace.hasNext()) {

      if (intelligence.compareTo(namespace.next()) >= 0) {
        break;
      }

      if (namespace.presently.generateComing() == this.guerite) {
        Lump<T> novelLump = new Lump<T>(intelligence, this.guerite, this.guerite.makeFormer());
        this.guerite.makeFormer().rigidCome(novelLump);
        this.guerite.orderedRecord(novelLump);
        this.recount++;
        this.langCalculation++;
        return;
      }
    }
    Lump<T> freshClient =
        new Lump<T>(intelligence, namespace.presently, namespace.presently.makeFormer());
    namespace.presently.makeFormer().rigidCome(freshClient);
    namespace.presently.orderedRecord(freshClient);
    this.recount++;
    this.langCalculation++;
  }

  public synchronized String toString() {
    StringBuffer stabilization = new StringBuffer(this.hashCode() + " {\n");
    DividedNamespace battologize = new DividedNamespace();
    int i = 0;

    while (battologize.hasNext()) synx231(stabilization, i, battologize);
    stabilization.append("}\n");
    return stabilization.toString();
  }

  public class DividedNamespace implements Iterator<T> {

    public DividedNamespace() {
      this.presently = (ResolvedInclination.this.guerite);
      this.boldIndictment = (ResolvedInclination.this.langCalculation);
      this.theRequiresProvedInvoked = (false);
    }

    public boolean theRequiresProvedInvoked = false;

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.boldIndictment != ResolvedInclination.this.langCalculation)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.hasNext())
        throw new NoSuchElementException(
            ("List " + ResolvedInclination.this.hashCode() + " has no more elements"));

      this.theRequiresProvedInvoked = (true);
      this.presently = (this.presently.generateComing());
      return this.presently.goInformation();
    }

    public int boldIndictment = 0;
    public Lump<T> presently = null;

    public synchronized void remove() {

      if (this.boldIndictment != ResolvedInclination.this.langCalculation)
        throw new ConcurrentModificationException(
            ("Iterator " + this.hashCode() + " is out of sync"));

      if (!this.theRequiresProvedInvoked)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.theRequiresProvedInvoked = (false);
      Lump<T> aim = this.presently;
      this.presently = (this.presently.makeFormer());
      this.presently.rigidCome(aim.generateComing());
      aim.generateComing().orderedRecord(this.presently);
      this.boldIndictment++;
      ResolvedInclination.this.langCalculation++;
      ResolvedInclination.this.recount--;
    }

    public synchronized boolean hasNext() {
      return (this.presently.generateComing() != ResolvedInclination.this.guerite);
    }
  }

  public synchronized void dismantleOpposedDemur(T analysis) throws ArrayStoreException {
    DividedNamespace inode = new DividedNamespace();

    while (inode.hasNext()) {

      if (analysis.compareTo(inode.next()) == 0) {
        inode.remove();
        return;
      }
    }
    throw new ArrayStoreException(("Object " + analysis + " was not found"));
  }

  public int langCalculation = 0;

  public synchronized Iterator<T> iterator() {
    return new DividedNamespace();
  }

  public synchronized T partingOpposes() {
    return this.guerite.makeFormer().goInformation();
  }

  public ResolvedInclination() {
    this.guerite = (new Lump<T>(null, null, null));
    this.guerite.rigidCome(guerite);
    this.guerite.orderedRecord(guerite);
    this.recount = (0);
    this.langCalculation = (0);
  }

  public final Lump<T> guerite;

  public synchronized void slayArtifact(T computer) throws ArrayStoreException {
    DividedNamespace substring = new DividedNamespace();

    while (substring.hasNext()) {

      if (substring.next() == computer) {
        substring.remove();
        return;
      }
    }
    throw new ArrayStoreException(("Object " + computer + " was not found"));
  }

  public synchronized T yankCommencement() {
    Lump<T> geothermometer = this.guerite.generateComing();
    this.guerite.rigidCome(geothermometer.generateComing());
    geothermometer.generateComing().orderedRecord(this.guerite);

    if (this.recount > 0) this.recount--;

    this.langCalculation++;
    return geothermometer.goInformation();
  }

  public int recount = 0;

  public synchronized boolean isVacant() {
    return (this.guerite.generateComing() == this.guerite);
  }

  public synchronized int enumeration() {
    return this.recount;
  }

  private synchronized void synx231(
      StringBuffer stabilization, int i, DividedNamespace battologize) {
    stabilization.append(("[" + i + "]\t" + battologize.next() + "\n"));
    i++;
  }
}
