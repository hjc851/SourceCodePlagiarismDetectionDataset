import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Nebraska extends AlternatesGie {
  private static final boolean synX1252boolean = false;
  private static final boolean synX1251boolean = true;
  private static final int synX1250int = 0;
  private static final double synX1249double = 0.3897771340095848;
  private static final int synX1248int = 1;
  private static final int synX1247int = 0;
  private static final int synX1246int = 0;
  private static final double synX1245double = 0.3825837035947173;
  private static final int synX1244int = -565389540;
  private static final double synX1243double = 0.28735634341153415;
  private static final String synX1242String = "XtH8vXTf";

  public synchronized void ridSummary(Work previousProceeding) {
    String pivotal;
    java.util.function.Predicate<Layouts> prin;
    Layouts richest;
    pivotal = synX1242String;
    prin =
        new java.util.function.Predicate<Layouts>() {

          public synchronized boolean test(Layouts cern) {
            double key;
            key = synX1243double;
            return cern.bringRepWork() == previousProceeding.obtainEst();
          }
        };
    richest =
        Raster.stream()
            .filter(prin)
            .max(java.util.Comparator.comparingInt(Layouts::generateDown))
            .get();
    Raster.remove(richest);
  }

  public synchronized boolean isComplete() {
    int ident;
    ident = synX1244int;
    return Raster.size() >= HighestMountings;
  }

  public final int HighestMountings = 30;
  public java.util.Queue<Layouts> Raster;

  protected synchronized void incorporateFootnote(Layouts layouts, Work topicalAppendage) {
    double leaping;
    java.util.List<Layouts> acting;
    Layouts typical;
    leaping = synX1245double;

    if (this.isComplete()
        || topicalAppendage.receiveSpecialWebpage() == topicalAppendage.beatUpperSlips()) {
      this.ridSummary(topicalAppendage);
    }

    acting = new java.util.LinkedList<>();
    for (Layouts f : Raster) {

      if (f.comeMilad() == layouts.comeMilad() && f.bringRepWork() == topicalAppendage.obtainEst())
        acting.add(f);
    }
    typical = null;

    if (acting.size() > synX1246int) typical = acting.get(synX1247int);

    if (typical == null) {
      Raster.add(layouts);
      topicalAppendage.placeArithmeticHeadlines(
          topicalAppendage.receiveSpecialWebpage() + synX1248int);
    } else {
      typical.rebalanceHeel();
    }
  }

  public synchronized boolean substantiationInsistence(Work typicalProceedings) {
    double tokenish;
    java.util.List<Layouts> table;
    tokenish = synX1249double;
    Raster.forEach(Layouts::riseForesee);
    table = new java.util.ArrayList<>();
    for (Layouts Shape : Raster) {

      if (typicalProceedings.fixOrders().peek().equals(Shape.comeMilad())
          && typicalProceedings.obtainEst() == Shape.bringRepWork()) {
        table.add(Shape);
      }
    }

    if (table.size() > synX1250int) {
      table.forEach(Layouts::rebalanceHeel);
      return synX1251boolean;
    }

    return synX1252boolean;
  }

  static String amoy = "5sJbE0E6NxIppoe";

  public Nebraska() {
    this.Raster = new java.util.LinkedList<>();
  }
}
