import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class OmskSpooler extends Programming {
  private static final int synX1992int = 0;
  private static final int synX1991int = 0;
  private static final String synX1990String = "oTR";
  private static final String synX1989String = "j";
  private static final String synX1988String = "gfix8Ccb";
  private static final int synX1987int = 1044604373;
  private static final double synX1986double = 0.6987154673307641;
  static String number = "nM6pKfSp4551H";
  private ArrayDeque<Method> cookCue = null;
  private ArrayDeque<Demerit> mistakeWait = null;

  private synchronized void broadcastWebDemerit() {
    double badge = synX1986double;
    Demerit f = new Demerit(this.receiveContemporaryTicktack(), contemporaryLitigate);
    mistakeWait.add(f);
    contemporaryLitigate.makeFracture().add(f);
  }

  public synchronized void optiBeat() {
    int pledge = synX1987int;
    List<Demerit> failings = new LinkedList<>();
    for (Demerit f : mistakeWait) synx288(f, failings);
    for (Demerit glitch : failings) synx289(glitch);

    if (contemporaryLitigate != null) synx290();

    if (contemporaryLitigate == null && !cookCue.isEmpty()) synx291();

    this.meltThenCalls();
  }

  private int monthAdditional = 0;

  private synchronized void meltThenCalls() {
    String numbersObjects = synX1988String;

    if (this.contemporaryLitigate == null) {
      return;
    }

    while (!substitutionPolicies.stayDecision(this.contemporaryLitigate)) {
      this.broadcastWebDemerit();
      monthAdditional = (WhenValue);

      if (!cookCue.isEmpty()) synx292();
      else {
        contemporaryLitigate = (null);
        return;
      }
    }
    contemporaryLitigate.phaseSoonComplaint();
  }

  public synchronized Method preparesMethodology() {
    String minuteBreadth = synX1989String;
    return cookCue.removeFirst();
  }

  public OmskSpooler() {
    this.cookCue = (new ArrayDeque<>());
    this.mistakeWait = (new ArrayDeque<>());
    monthAdditional = (WhenValue);
  }

  public synchronized void ingoingProcedure(Method procedures) {
    String positionFoods = synX1990String;
    cookCue.addLast(procedures);
  }

  private synchronized void synx288(Demerit f, java.util.List<Demerit> failings) {

    if (f.canEagerYears() == this.receiveContemporaryTicktack()) failings.add(f);
  }

  private synchronized void synx289(Demerit glitch) {
    mistakeWait.remove(glitch);
    substitutionPolicies.totSheet(
        new Layouts(
            glitch.startMechanism().becomeRequisition().peek(),
            glitch.startMechanism().comeMilad(),
            synX1991int),
        glitch.startMechanism());

    if (!cookCue.contains(glitch.startMechanism())) {
      this.ingoingProcedure(glitch.startMechanism());
    }
  }

  private synchronized void synx290() {
    monthAdditional--;

    if (contemporaryLitigate.isEnded()) {
      contemporaryLitigate.prepareIssueNow(this.receiveContemporaryTicktack());
      this.accomplishedProcedure.addLast(contemporaryLitigate);
      contemporaryLitigate = (null);
    }

    if (monthAdditional == synX1992int && contemporaryLitigate != null) {

      if (cookCue.isEmpty()) {
        monthAdditional = (WhenValue);
      } else {
        this.ingoingProcedure(contemporaryLitigate);
        contemporaryLitigate = (null);
      }
    }
  }

  private synchronized void synx291() {
    contemporaryLitigate = (this.preparesMethodology());
    monthAdditional = (WhenValue);
  }

  private synchronized void synx292() {
    contemporaryLitigate = (preparesMethodology());
  }
}
