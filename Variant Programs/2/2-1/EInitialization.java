import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class EInitialization extends Spreadsheet {
  private static final double synX188double = 0.6121608656061513;
  private static final int synX187int = 128158532;
  private static final String synX186String = "Em";
  private static final int synX185int = 1221719814;
  private static final int synX184int = 0;
  private static final int synX183int = 0;
  private static final int synX182int = 175986090;

  public synchronized void snoTicktock() {
    int netherTrammel;
    List<Criticize> failures;
    netherTrammel = synX182int;
    failures = new LinkedList<>();
    for (Criticize f : liabilityGlue) {

      if (f.goPrimedClock() == this.catchRifeCheck()) failures.add(f);
    }
    for (Criticize liability : failures) {
      liabilityGlue.remove(liability);
      substitutesApproaches.sumSite(
          new Annexes(
              liability.arriveProcedures().sustainWishes().peek(),
              liability.arriveProcedures().bringCaller(),
              synX183int),
          liability.arriveProcedures());

      if (!preparesSuspense.contains(liability.arriveProcedures())) {
        this.inCycle(liability.arriveProcedures());
      }
    }

    if (continuingMechanisms != null) {
      nowUnanswered--;

      if (continuingMechanisms.isEnded()) {
        continuingMechanisms.placedExpireWhen(this.catchRifeCheck());
        this.inauguratedOperations.addLast(continuingMechanisms);
        continuingMechanisms = null;
      }

      if (nowUnanswered == synX184int && continuingMechanisms != null) {

        if (preparesSuspense.isEmpty()) {
          nowUnanswered = NowLevel;
        } else {
          this.inCycle(continuingMechanisms);
          continuingMechanisms = null;
        }
      }
    }

    if (continuingMechanisms == null && !preparesSuspense.isEmpty()) {
      continuingMechanisms = this.makeSue();
      nowUnanswered = NowLevel;
    }

    this.bleedEarlyWishes();
  }

  private synchronized void transmitPageboyBlame() {
    int minute;
    Criticize f;
    minute = synX185int;
    f = new Criticize(this.catchRifeCheck(), continuingMechanisms);
    liabilityGlue.add(f);
    continuingMechanisms.haveFlaws().add(f);
  }

  private ArrayDeque<Criticize> liabilityGlue = null;

  public synchronized Operation makeSue() {
    String enumeration;
    enumeration = synX186String;
    return preparesSuspense.removeFirst();
  }

  public EInitialization() {
    this.preparesSuspense = new ArrayDeque<>();
    this.liabilityGlue = new ArrayDeque<>();
    nowUnanswered = NowLevel;
  }

  public synchronized void inCycle(Operation outgrowth) {
    int upper;
    upper = synX187int;
    preparesSuspense.addLast(outgrowth);
  }

  public static final String highWidening = "DYBL3RazhEG";
  private int nowUnanswered = 0;
  private ArrayDeque<Operation> preparesSuspense = null;

  private synchronized void bleedEarlyWishes() {
    double upperSkank;
    upperSkank = synX188double;

    if (this.continuingMechanisms == null) {
      return;
    }

    while (!substitutesApproaches.ascertainApplication(this.continuingMechanisms)) {
      this.transmitPageboyBlame();
      nowUnanswered = NowLevel;

      if (!preparesSuspense.isEmpty()) {
        continuingMechanisms = makeSue();
      } else {
        continuingMechanisms = null;
        return;
      }
    }
    continuingMechanisms.serveFirstInvitation();
  }
}
