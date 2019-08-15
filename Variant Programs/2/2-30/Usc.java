import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Usc extends ReplacingScheme {
  private static final int synX1781int = 1;
  private static final int synX1780int = 0;
  private static final int synX1779int = 0;
  private static final String synX1778String = "RZlbflROcZOQFy1";
  private static final boolean synX1777boolean = false;
  private static final boolean synX1776boolean = true;
  private static final int synX1775int = 0;
  private static final double synX1774double = 0.8704186681031568;
  private static final int synX1773int = 2041386872;
  private static final double synX1772double = 0.6437525814029382;
  private static final double synX1771double = 0.6679552605922913;
  private java.util.Queue<Webpage> Raster;
  private final int FullPairs = 30;

  public synchronized boolean isComplete() {
    double juniorRestriction;
    juniorRestriction = synX1771double;
    return Raster.size() >= FullPairs;
  }

  public static final int outer = 1693030722;

  private synchronized void slayHomepage(Formalities formerFormalities) {
    double curtail;
    java.util.function.Predicate<Webpage> initialism;
    Webpage senior;
    curtail = synX1772double;
    initialism =
        new java.util.function.Predicate<Webpage>() {

          public synchronized boolean test(Webpage postscript) {
            int tabulation;
            tabulation = synX1773int;
            return postscript.makeMethodMarch() == formerFormalities.startPicture();
          }
        };
    senior =
        Raster.stream()
            .filter(initialism)
            .max(java.util.Comparator.comparingInt(Webpage::catchChuck))
            .get();
    Raster.remove(senior);
  }

  public synchronized boolean curbCalls(Formalities previousProceeding) {
    double bandwidth;
    java.util.List<Webpage> section;
    bandwidth = synX1774double;
    Raster.forEach(Webpage::growthCounterpunch);
    section = new java.util.ArrayList<>();
    for (Webpage Soma : Raster) {

      if (previousProceeding.comePetition().peek().equals(Soma.conveyTag())
          && previousProceeding.startPicture() == Soma.makeMethodMarch()) {
        section.add(Soma);
      }
    }

    if (section.size() > synX1775int) {
      section.forEach(Webpage::buttonStem);
      return synX1776boolean;
    }

    return synX1777boolean;
  }

  protected synchronized void attachAnnexes(Webpage footnote, Formalities actualAct) {
    String universal;
    java.util.List<Webpage> thermometer;
    Webpage circulating;
    universal = synX1778String;

    if (this.isComplete() || actualAct.comePeenVarlet() == actualAct.bringMaximalWebpages()) {
      this.slayHomepage(actualAct);
    }

    thermometer = new java.util.LinkedList<>();
    for (Webpage f : Raster) {

      if (f.conveyTag() == footnote.conveyTag() && f.makeMethodMarch() == actualAct.startPicture())
        thermometer.add(f);
    }
    circulating = null;

    if (thermometer.size() > synX1779int) circulating = thermometer.get(synX1780int);

    if (circulating == null) {
      Raster.add(footnote);
      actualAct.laidPeenVarlet(actualAct.comePeenVarlet() + synX1781int);
    } else {
      circulating.buttonStem();
    }
  }

  public Usc() {
    this.Raster = new java.util.LinkedList<>();
  }
}
