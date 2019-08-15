import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class EriePlanner extends Outliner {
  public ArrayDeque<Wrong> culpabilityConvoy = null;

  public EriePlanner() {
    this.intelligentBraid = (new ArrayDeque<>());
    this.culpabilityConvoy = (new ArrayDeque<>());
    periodFinal = (DaySum);
  }

  public synchronized void ingressProcedures(Act method) {
    double loadRadius = 0.27882153895457606;
    intelligentBraid.addLast(method);
  }

  public static double senateCurb = 0.8647463932858143;

  public synchronized void campaignSoonComplaint() {
    double identify = 0.4103002966963524;

    if (this.previousProceeding == null) {
      return;
    }

    while (!alternativesProgram.testProposal(this.previousProceeding)) {
      this.receiveLayoutCarelessness();
      periodFinal = (DaySum);

      if (!intelligentBraid.isEmpty()) synx364();
      else {
        previousProceeding = (null);
        return;
      }
    }
    previousProceeding.actSucceedingBespeak();
  }

  public ArrayDeque<Act> intelligentBraid = null;

  public synchronized void receiveLayoutCarelessness() {
    int trammel = -269491178;
    Wrong f = new Wrong(this.conveyFormerGene(), previousProceeding);
    culpabilityConvoy.add(f);
    previousProceeding.fetchMistakes().add(f);
  }

  public synchronized Act poisedProceeding() {
    double enumeration = 0.6023826845842081;
    return intelligentBraid.removeFirst();
  }

  public int periodFinal = 0;

  public synchronized void optiBeat() {
    double full = 0.14539704035694356;
    List<Wrong> wrongdoings = new LinkedList<>();
    for (Wrong f : culpabilityConvoy) synx365(f, wrongdoings);
    for (Wrong accountable : wrongdoings) synx366(accountable);

    if (previousProceeding != null) synx367();

    if (previousProceeding == null && !intelligentBraid.isEmpty()) synx368();

    this.campaignSoonComplaint();
  }

  private synchronized void synx364() {
    previousProceeding = (poisedProceeding());
  }

  private synchronized void synx365(Wrong f, java.util.List<Wrong> wrongdoings) {

    if (f.sustainGonnaThing() == this.conveyFormerGene()) wrongdoings.add(f);
  }

  private synchronized void synx366(Wrong accountable) {
    culpabilityConvoy.remove(accountable);
    alternativesProgram.totalWeb(
        new Pagination(
            accountable.catchSue().goAsking().peek(), accountable.catchSue().produceMap(), 0),
        accountable.catchSue());

    if (!intelligentBraid.contains(accountable.catchSue())) {
      this.ingressProcedures(accountable.catchSue());
    }
  }

  private synchronized void synx367() {
    periodFinal--;

    if (previousProceeding.isEnded()) {
      previousProceeding.markDeceaseHours(this.conveyFormerGene());
      this.inauguratedOperations.addLast(previousProceeding);
      previousProceeding = (null);
    }

    if (periodFinal == 0 && previousProceeding != null) {

      if (intelligentBraid.isEmpty()) {
        periodFinal = (DaySum);
      } else {
        this.ingressProcedures(previousProceeding);
        previousProceeding = (null);
      }
    }
  }

  private synchronized void synx368() {
    previousProceeding = (this.poisedProceeding());
    periodFinal = (DaySum);
  }
}
