import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Clemson extends SurrogateVision {
  private static final int synX2537int = 1;
  private static final boolean synX2536boolean = false;
  private static final boolean synX2535boolean = true;
  private static final int synX2534int = 0;
  private static final int synX2533int = 0;
  private static final int synX2532int = 0;
  public final int FullPairs = 30;

  protected synchronized void combineScreen(Layouts table, Procedures presentlyMechanism) {

    if (this.isComplete()
        || presentlyMechanism.catchAddSections() == presentlyMechanism.developUltimatePpm())
      synx446(presentlyMechanism);

    java.util.List<Layouts> thermometer = new java.util.LinkedList<>();
    for (Layouts f : Bases) synx447(f, table, presentlyMechanism, thermometer);
    Layouts live = null;

    if (thermometer.size() > synX2532int) live = (thermometer.get(synX2533int));

    if (live == null) synx448(table, presentlyMechanism);
    else synx449(live);
  }

  public Clemson() {
    this.Bases = (new java.util.LinkedList<>());
  }

  public synchronized void eliminateSection(Procedures actualAct) {
    java.util.function.Predicate<Layouts> titre =
        new java.util.function.Predicate<Layouts>() {

          public synchronized boolean test(Layouts cern) {
            return cern.haveActivateServe() == actualAct.sustainSelf();
          }
        };
    Layouts greatest =
        Bases.stream()
            .filter(titre)
            .max(java.util.Comparator.comparingInt(Layouts::comeAnti))
            .get();
    Bases.remove(greatest);
  }

  public synchronized boolean watchQuest(Procedures circulatingServe) {
    Bases.forEach(Layouts::increasingCurb);
    java.util.List<Layouts> tab = new java.util.ArrayList<>();
    for (Layouts Physique : Bases) synx450(circulatingServe, Physique, tab);

    if (tab.size() > synX2534int) {
      tab.forEach(Layouts::buttonStem);
      return synX2535boolean;
    }

    return synX2536boolean;
  }

  public java.util.Queue<Layouts> Bases;

  public synchronized boolean isComplete() {
    return Bases.size() >= FullPairs;
  }

  private synchronized void synx446(Procedures presentlyMechanism) {
    this.eliminateSection(presentlyMechanism);
  }

  private synchronized void synx447(
      Layouts f,
      Layouts table,
      Procedures presentlyMechanism,
      java.util.List<Layouts> thermometer) {

    if (f.fetchPictures() == table.fetchPictures()
        && f.haveActivateServe() == presentlyMechanism.sustainSelf()) thermometer.add(f);
  }

  private synchronized void synx448(Layouts table, Procedures presentlyMechanism) {
    Bases.add(table);
    presentlyMechanism.doResetAspects(presentlyMechanism.catchAddSections() + synX2537int);
  }

  private synchronized void synx449(Layouts live) {
    live.buttonStem();
  }

  private synchronized void synx450(
      Procedures circulatingServe, Layouts Physique, java.util.List<Layouts> tab) {

    if (circulatingServe.drawSubmissions().peek().equals(Physique.fetchPictures())
        && circulatingServe.sustainSelf() == Physique.haveActivateServe()) {
      tab.add(Physique);
    }
  }
}
