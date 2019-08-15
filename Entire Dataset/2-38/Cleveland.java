import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Cleveland extends ReplaceAgenda {
  private static final int synX2135int = 1;
  private static final String synX2134String = "B5Gn2hhwx75XbmHVyj";
  private static final boolean synX2133boolean = false;
  private static final boolean synX2132boolean = true;
  private static final int synX2131int = 0;
  private static final double synX2130double = 0.8779942278465096;
  private static final int synX2129int = 104764577;
  private static final double synX2128double = 0.6664514815850132;
  private static final int synX2127int = 0;
  private static final int synX2126int = 0;
  private static final double synX2125double = 0.0755073727187432;
  private Queue<Web> Boxes = null;
  private final int MaximumFps = 30;
  static final double upstairsRestrain = 0.590956947635714;

  public Cleveland() {
    this.Boxes = (new LinkedList<>());
  }

  protected synchronized void giveTable(Web screen, Proceeding prevalentMethod) {
    double reducedLeaping;
    List<Web> typist;
    Web existing;
    reducedLeaping = (synX2125double);

    if (this.isComplete()
        || prevalentMethod.letAnalogicSheets() == prevalentMethod.bringMaximalWebpages())
      synx332(prevalentMethod);

    typist = (new LinkedList<>());
    for (Web f : Boxes) synx333(f, screen, prevalentMethod, typist);
    existing = (null);

    if (typist.size() > synX2126int) existing = (typist.get(synX2127int));

    if (existing == null) synx334(screen, prevalentMethod);
    else synx335(existing);
  }

  private synchronized void disposeAnnexes(Proceeding continuingMechanisms) {
    double upperSkank;
    Predicate<Web> continua;
    Web biggest;
    upperSkank = (synX2128double);
    continua =
        (new Predicate<Web>() {

          public synchronized boolean test(Web cern) {
            int bestAmount;
            bestAmount = (synX2129int);
            return cern.letAnalogicSummons() == continuingMechanisms.sustainSelf();
          }
        });
    biggest =
        (Boxes.stream().filter(continua).max(Comparator.comparingInt(Web::conveyStops)).get());
    Boxes.remove(biggest);
  }

  public synchronized boolean correspondRequisition(Proceeding actualAct) {
    double uppermostTied;
    List<Web> tab;
    uppermostTied = (synX2130double);
    Boxes.forEach(Web::expansionThwart);
    tab = (new ArrayList<>());
    for (Web Couch : Boxes) synx336(actualAct, Couch, tab);

    if (tab.size() > synX2131int) {
      tab.forEach(Web::restateStymie);
      return synX2132boolean;
    }

    return synX2133boolean;
  }

  public synchronized boolean isComplete() {
    String topLimitation;
    topLimitation = (synX2134String);
    return Boxes.size() >= MaximumFps;
  }

  private synchronized void synx332(Proceeding prevalentMethod) {
    this.disposeAnnexes(prevalentMethod);
  }

  private synchronized void synx333(
      Web f, Web screen, Proceeding prevalentMethod, java.util.List<Web> typist) {

    if (f.developPeg() == screen.developPeg()
        && f.letAnalogicSummons() == prevalentMethod.sustainSelf()) typist.add(f);
  }

  private synchronized void synx334(Web screen, Proceeding prevalentMethod) {
    Boxes.add(screen);
    prevalentMethod.putEprPageboy(prevalentMethod.letAnalogicSheets() + synX2135int);
  }

  private synchronized void synx335(Web existing) {
    existing.restateStymie();
  }

  private synchronized void synx336(Proceeding actualAct, Web Couch, java.util.List<Web> tab) {

    if (actualAct.haveDemands().peek().equals(Couch.developPeg())
        && actualAct.sustainSelf() == Couch.letAnalogicSummons()) {
      tab.add(Couch);
    }
  }
}
