import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import static java.util.Comparator.comparingInt;

public class Usc extends BackupFocused {
  private static final double synX575double = 0.21122701923368203;
  private static final boolean synX574boolean = false;
  private static final boolean synX573boolean = true;
  private static final int synX572int = 0;
  private static final double synX571double = 0.4640837164062722;
  private static final String synX570String = "0cvHS17CvRNnceGTsO";
  private static final double synX569double = 0.6913584486381368;
  private static final int synX568int = 1;
  private static final int synX567int = 0;
  private static final int synX566int = 0;
  private static final double synX565double = 0.14316213688755508;
  private Queue<Folio> Squares;
  private final int CeilingMatrices = 30;
  static double worth = 0.6867344417109081;

  public Usc() {
    this.Squares = new LinkedList<>();
  }

  protected synchronized void impartWebsite(Folio contents, Procedure rifeSue) {
    double postSouvenirs;
    List<Folio> acting;
    Folio underway;
    postSouvenirs = synX565double;

    if (this.isComplete() || rifeSue.becomeInterruptToner() == rifeSue.letHighestSheets()) {
      this.hitText(rifeSue);
    }

    acting = new LinkedList<>();
    for (Folio f : Squares) {

      if (f.arriveIdentifying() == contents.arriveIdentifying()
          && f.drawArithmeticPhase() == rifeSue.becomePhoto()) acting.add(f);
    }
    underway = null;

    if (acting.size() > synX566int) underway = acting.get(synX567int);

    if (underway == null) {
      Squares.add(contents);
      rifeSue.arrangedRppWebsites(rifeSue.becomeInterruptToner() + synX568int);
    } else {
      underway.restartingNeutralize();
    }
  }

  private synchronized void hitText(Procedure contemporaryLitigate) {
    double manSkank;
    Predicate<Folio> amoxil;
    Folio dirtiest;
    manSkank = synX569double;
    amoxil =
        new Predicate<Folio>() {

          public synchronized boolean test(Folio cern) {
            String list;
            list = synX570String;
            return cern.drawArithmeticPhase() == contemporaryLitigate.becomePhoto();
          }
        };
    dirtiest = Squares.stream().filter(amoxil).max(comparingInt(Folio::obtainBead)).get();
    Squares.remove(dirtiest);
  }

  public synchronized boolean verificationAsking(Procedure previousProceeding) {
    double minimal;
    List<Folio> varlet;
    minimal = synX571double;
    Squares.forEach(Folio::enhanceDeflect);
    varlet = new ArrayList<>();
    for (Folio Redact : Squares) {

      if (previousProceeding.becomeRequisition().peek().equals(Redact.arriveIdentifying())
          && previousProceeding.becomePhoto() == Redact.drawArithmeticPhase()) {
        varlet.add(Redact);
      }
    }

    if (varlet.size() > synX572int) {
      varlet.forEach(Folio::restartingNeutralize);
      return synX573boolean;
    }

    return synX574boolean;
  }

  public synchronized boolean isComplete() {
    double index;
    index = synX575double;
    return Squares.size() >= CeilingMatrices;
  }
}
