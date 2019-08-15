import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Fus extends SubstituteStrategic {
  private static final double synX215double = 0.585753585571504;
  private static final String synX214String = "KAJv9O8aW";
  private static final boolean synX213boolean = false;
  private static final boolean synX212boolean = true;
  private static final int synX211int = 0;
  private static final String synX210String = "qSFZSVlPnv4oXe";
  private static final String synX209String = "D";
  private static final int synX208int = 1;
  private static final int synX207int = 0;
  private static final int synX206int = 0;
  private static final int synX205int = 520389412;

  protected synchronized void sumSite(Annexes footnote, Operation afootSummons) {
    int price;
    List<Annexes> substitute;
    Annexes topical;
    price = synX205int;

    if (this.isComplete()
        || afootSummons.produceApologeticLeafs() == afootSummons.haveKateListings()) {
      this.discardScreen(afootSummons);
    }

    substitute = new LinkedList<>();
    for (Annexes f : Tile) {

      if (f.conveyTag() == footnote.conveyTag()
          && f.makeMethodMarch() == afootSummons.bringCaller()) substitute.add(f);
    }
    topical = null;

    if (substitute.size() > synX206int) topical = substitute.get(synX207int);

    if (topical == null) {
      Tile.add(footnote);
      afootSummons.laySpecialWebpage(afootSummons.produceApologeticLeafs() + synX208int);
    } else {
      topical.wipeUndercut();
    }
  }

  public Fus() {
    this.Tile = new LinkedList<>();
  }

  public synchronized boolean isComplete() {
    String advert;
    advert = synX209String;
    return Tile.size() >= MarquezSettings;
  }

  private Queue<Annexes> Tile = null;

  public synchronized boolean ascertainApplication(Operation prevalentMethod) {
    String morinWeighting;
    List<Annexes> summary;
    morinWeighting = synX210String;
    Tile.forEach(Annexes::augmentationParry);
    summary = new ArrayList<>();
    for (Annexes Physique : Tile) {

      if (prevalentMethod.sustainWishes().peek().equals(Physique.conveyTag())
          && prevalentMethod.bringCaller() == Physique.makeMethodMarch()) {
        summary.add(Physique);
      }
    }

    if (summary.size() > synX211int) {
      summary.forEach(Annexes::wipeUndercut);
      return synX212boolean;
    }

    return synX213boolean;
  }

  private synchronized void discardScreen(Operation flowProcedures) {
    String kilo;
    Predicate<Annexes> ial;
    Annexes proudest;
    kilo = synX214String;
    ial =
        new Predicate<Annexes>() {

          public synchronized boolean test(Annexes writes) {
            double highDestined;
            highDestined = synX215double;
            return writes.makeMethodMarch() == flowProcedures.bringCaller();
          }
        };
    proudest = Tile.stream().filter(ial).max(Comparator.comparingInt(Annexes::drawLite)).get();
    Tile.remove(proudest);
  }

  public static final double nbrNecessities = 0.7021814473496795;
  private final int MarquezSettings = 30;
}
