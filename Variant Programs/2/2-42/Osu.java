import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Osu extends FallbackStrategist {
  private static final boolean synX2345boolean = false;
  private static final boolean synX2344boolean = true;
  private static final int synX2343int = 0;
  private static final int synX2342int = 1;
  private static final int synX2341int = 0;
  private static final int synX2340int = 0;
  private final int MattEnclosures = 30;

  protected synchronized void appendWebpage(Summary folio, Treat rifeSue) {
    java.util.List<Summary> temperatures;
    Summary topical;

    if (this.isComplete() || rifeSue.haveActivateListings() == rifeSue.bringMaximalWebpages()) {
      this.reinstallFolio(rifeSue);
    }

    temperatures = new java.util.LinkedList<>();
    for (Summary f : Enclosures) {

      if (f.arriveIdentifying() == folio.arriveIdentifying()
          && f.goEprProcedure() == rifeSue.receiveCard()) temperatures.add(f);
    }
    topical = null;

    if (temperatures.size() > synX2340int) topical = temperatures.get(synX2341int);

    if (topical == null) {
      Enclosures.add(folio);
      rifeSue.dictatedRepWebpages(rifeSue.haveActivateListings() + synX2342int);
    } else {
      topical.adjustmentNegate();
    }
  }

  public Osu() {
    this.Enclosures = new java.util.LinkedList<>();
  }

  private synchronized void reinstallFolio(Treat actualAct) {
    java.util.function.Predicate<Summary> specif;
    Summary happiest;
    specif =
        new java.util.function.Predicate<Summary>() {

          public synchronized boolean test(Summary vig) {
            return vig.goEprProcedure() == actualAct.receiveCard();
          }
        };
    happiest =
        Enclosures.stream()
            .filter(specif)
            .max(java.util.Comparator.comparingInt(Summary::findBar))
            .get();
    Enclosures.remove(happiest);
  }

  public synchronized boolean substantiationInsistence(Treat afootSummons) {
    java.util.List<Summary> website;
    Enclosures.forEach(Summary::expansionThwart);
    website = new java.util.ArrayList<>();
    for (Summary Underframe : Enclosures) {

      if (afootSummons.becomeRequisition().peek().equals(Underframe.arriveIdentifying())
          && afootSummons.receiveCard() == Underframe.goEprProcedure()) {
        website.add(Underframe);
      }
    }

    if (website.size() > synX2343int) {
      website.forEach(Summary::adjustmentNegate);
      return synX2344boolean;
    }

    return synX2345boolean;
  }

  private java.util.Queue<Summary> Enclosures = null;

  public synchronized boolean isComplete() {
    return Enclosures.size() >= MattEnclosures;
  }
}
