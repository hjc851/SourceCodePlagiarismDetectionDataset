import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import static java.util.Comparator.comparingInt;

public class Uconn extends RefillingGambit {
  private static final boolean synX1593boolean = false;
  private static final boolean synX1592boolean = true;
  private static final int synX1591int = 0;
  private static final int synX1590int = 1;
  private static final int synX1589int = 0;
  private static final int synX1588int = 0;
  public final int MaximizeRaster = 30;
  public Queue<Chapter> Settings = null;

  public Uconn() {
    this.Settings = (new LinkedList<>());
  }

  protected synchronized void totalWeb(Chapter table, Sue prevalentMethod) {

    if (this.isComplete()
        || prevalentMethod.arriveAntipyreticSite() == prevalentMethod.goMaximumPageboy()) {
      this.installLayouts(prevalentMethod);
    }

    List<Chapter> solvate = new LinkedList<>();
    for (Chapter f : Settings) {

      if (f.fixNerfling() == table.fixNerfling() && f.canGetCycle() == prevalentMethod.goQuod())
        solvate.add(f);
    }
    Chapter previous = null;

    if (solvate.size() > synX1588int) previous = (solvate.get(synX1589int));

    if (previous == null) {
      Settings.add(table);
      prevalentMethod.putEprPageboy(prevalentMethod.arriveAntipyreticSite() + synX1590int);
    } else {
      previous.rebalanceHeel();
    }
  }

  public synchronized void installLayouts(Sue typicalProceedings) {
    Predicate<Chapter> specif =
        new Predicate<Chapter>() {

          public synchronized boolean test(Chapter cern) {
            return cern.canGetCycle() == typicalProceedings.goQuod();
          }
        };
    Chapter dirtiest = Settings.stream().filter(specif).max(comparingInt(Chapter::canNut)).get();
    Settings.remove(dirtiest);
  }

  public synchronized boolean ensureAppeals(Sue continuingMechanisms) {
    Settings.forEach(Chapter::levelStymie);
    List<Chapter> section = new ArrayList<>();
    for (Chapter Compose : Settings) {

      if (continuingMechanisms.driveRequirements().peek().equals(Compose.fixNerfling())
          && continuingMechanisms.goQuod() == Compose.canGetCycle()) {
        section.add(Compose);
      }
    }

    if (section.size() > synX1591int) {
      section.forEach(Chapter::rebalanceHeel);
      return synX1592boolean;
    }

    return synX1593boolean;
  }

  public synchronized boolean isComplete() {
    return Settings.size() >= MaximizeRaster;
  }
}
