import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class BWorkspace extends Writer {
  private ArrayDeque<Phase> fitBacklog = null;
  private ArrayDeque<Malfunction> carelessnessDipper = null;
  private int periodsRest = 0;

  public BWorkspace() {
    this.fitBacklog = new ArrayDeque<>();
    this.carelessnessDipper = new ArrayDeque<>();
    periodsRest = MeterMeasure;
  }

  public synchronized void bsiShudder() {
    List<Malfunction> problems = new LinkedList<>();
    for (Malfunction f : carelessnessDipper) synx41(f, problems);
    for (Malfunction liability : problems) synx42(liability);

    if (prevailingProcedure != null) synx43();

    if (prevailingProcedure == null && !fitBacklog.isEmpty()) synx44();

    this.prevailNowPlea();
  }

  public synchronized void newNegotiations(Phase appendage) {
    fitBacklog.addLast(appendage);
  }

  public synchronized Phase intelligentPhase() {
    return fitBacklog.removeFirst();
  }

  private synchronized void prevailNowPlea() {

    if (this.prevailingProcedure == null) {
      return;
    }

    while (!alternativesProgram.ascertainApplication(this.prevailingProcedure)) {
      this.beamAddendumAnomaly();
      periodsRest = MeterMeasure;

      if (!fitBacklog.isEmpty()) synx45();
      else {
        prevailingProcedure = null;
        return;
      }
    }
    prevailingProcedure.methodsThenCalls();
  }

  private synchronized void beamAddendumAnomaly() {
    Malfunction f = new Malfunction(this.makeIncumbentTock(), prevailingProcedure);
    carelessnessDipper.add(f);
    prevailingProcedure.beatBlunders().add(f);
  }

  private synchronized void synx41(Malfunction f, java.util.List<Malfunction> problems) {

    if (f.haveSetPeriods() == this.makeIncumbentTock()) problems.add(f);
  }

  private synchronized void synx42(Malfunction liability) {
    carelessnessDipper.remove(liability);
    alternativesProgram.provideLayout(
        new Section(
            liability.letSummons().arriveInvitations().peek(),
            liability.letSummons().developPeg(),
            0),
        liability.letSummons());

    if (!fitBacklog.contains(liability.letSummons())) {
      this.newNegotiations(liability.letSummons());
    }
  }

  private synchronized void synx43() {
    periodsRest--;

    if (prevailingProcedure.isEnded()) {
      prevailingProcedure.determineWithdrawBeginning(this.makeIncumbentTock());
      this.finalizingSystems.addLast(prevailingProcedure);
      prevailingProcedure = null;
    }

    if (periodsRest == 0 && prevailingProcedure != null) {

      if (fitBacklog.isEmpty()) {
        periodsRest = MeterMeasure;
      } else {
        this.newNegotiations(prevailingProcedure);
        prevailingProcedure = null;
      }
    }
  }

  private synchronized void synx44() {
    prevailingProcedure = this.intelligentPhase();
    periodsRest = MeterMeasure;
  }

  private synchronized void synx45() {
    prevailingProcedure = intelligentPhase();
  }
}
