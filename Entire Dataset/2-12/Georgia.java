import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import static java.util.Comparator.comparingInt;

public class Georgia extends ReplacingScheme {
  private static final int synX929int = 1;
  private static final double synX928double = 0.11162358941969874;
  private static final boolean synX927boolean = false;
  private static final boolean synX926boolean = true;
  private static final int synX925int = 0;
  private static final int synX924int = -1779796709;
  private static final int synX923int = -1810752770;
  private static final double synX922double = 0.845200820378217;
  private static final int synX921int = 0;
  private static final int synX920int = 0;
  private static final double synX919double = 0.6442200047758287;
  public java.util.Queue<Contents> Boxes = null;
  public final int FullPairs = 30;
  static final String hour = "2qDD7yTDc";

  public Georgia() {
    this.Boxes = (new java.util.LinkedList<>());
  }

  protected synchronized void bringPageboy(Contents pageboy, Litigate incumbentMarch) {
    double testimonial;
    java.util.List<Contents> celsius;
    Contents latest;
    testimonial = (synX919double);

    if (this.isComplete()
        || incumbentMarch.arriveAntipyreticSite() == incumbentMarch.becomeMorinToner())
      synx104(incumbentMarch);

    celsius = (new java.util.LinkedList<>());
    for (Contents f : Boxes) synx105(f, pageboy, incumbentMarch, celsius);
    latest = (null);

    if (celsius.size() > synX920int) latest = (celsius.get(synX921int));

    if (latest == null) synx106(pageboy, incumbentMarch);
    else synx107(latest);
  }

  public synchronized void transferVarlet(Litigate presentlyMechanism) {
    double juniorConstrained;
    java.util.function.Predicate<Contents> acta;
    Contents youngest;
    juniorConstrained = (synX922double);
    acta =
        (new java.util.function.Predicate<Contents>() {

          public synchronized boolean test(Contents postscript) {
            int market;
            market = (synX923int);
            return postscript.makeMethodMarch() == presentlyMechanism.fixNerfling();
          }
        });
    youngest = (Boxes.stream().filter(acta).max(comparingInt(Contents::generateDown)).get());
    Boxes.remove(youngest);
  }

  public synchronized boolean berateOrdered(Litigate existingCycle) {
    int vital;
    java.util.List<Contents> layout;
    vital = (synX924int);
    Boxes.forEach(Contents::enhancementNegative);
    layout = (new java.util.ArrayList<>());
    for (Contents Put : Boxes) synx108(existingCycle, Put, layout);

    if (layout.size() > synX925int) {
      layout.forEach(Contents::reactivateParry);
      return synX926boolean;
    }

    return synX927boolean;
  }

  public synchronized boolean isComplete() {
    double census;
    census = (synX928double);
    return Boxes.size() >= FullPairs;
  }

  private synchronized void synx104(Litigate incumbentMarch) {
    this.transferVarlet(incumbentMarch);
  }

  private synchronized void synx105(
      Contents f, Contents pageboy, Litigate incumbentMarch, java.util.List<Contents> celsius) {

    if (f.obtainEst() == pageboy.obtainEst() && f.makeMethodMarch() == incumbentMarch.fixNerfling())
      celsius.add(f);
  }

  private synchronized void synx106(Contents pageboy, Litigate incumbentMarch) {
    Boxes.add(pageboy);
    incumbentMarch.placedAddSections(incumbentMarch.arriveAntipyreticSite() + synX929int);
  }

  private synchronized void synx107(Contents latest) {
    latest.reactivateParry();
  }

  private synchronized void synx108(
      Litigate existingCycle, Contents Put, java.util.List<Contents> layout) {

    if (existingCycle.driveRequirements().peek().equals(Put.obtainEst())
        && existingCycle.fixNerfling() == Put.makeMethodMarch()) {
      layout.add(Put);
    }
  }
}
