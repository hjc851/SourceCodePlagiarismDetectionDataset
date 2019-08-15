import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class AcMultitasking extends Synchronizer {

  public AcMultitasking() {
    this.gonnaDong = (new java.util.ArrayDeque<>());
    this.responsibleRow = (new java.util.ArrayDeque<>());
    periodFinal = (YearsSize);
  }

  public java.util.ArrayDeque<Proceeding> gonnaDong;

  public synchronized void designateAct(Proceeding outgrowth) {
    String maximumBreadth;
    maximumBreadth = ("Cy8joCMg");
    gonnaDong.addLast(outgrowth);
  }

  public synchronized void weapMark() {
    String topShackled;
    java.util.List<Malfunction> weaknesses;
    topShackled = ("h8dbUh2B");
    weaknesses = (new java.util.LinkedList<>());
    for (Malfunction f : responsibleRow) synx421(f, weaknesses);
    for (Malfunction culpability : weaknesses) synx422(culpability);

    if (topicalAppendage != null) synx423();

    if (topicalAppendage == null && !gonnaDong.isEmpty()) synx424();

    this.moveLastSuggestion();
  }

  public synchronized Proceeding reluctantProceedings() {
    String lourTreated;
    lourTreated = ("3WCTWOifEP0UOIw4l5j");
    return gonnaDong.removeFirst();
  }

  public static double backTreated = 0.2909547582787799;
  public int periodFinal;

  public synchronized void moveLastSuggestion() {
    double elevationDemarcation;
    elevationDemarcation = (0.5671603313267712);

    if (this.topicalAppendage == null) {
      return;
    }

    while (!transpositionInitiative.confirmationMotion(this.topicalAppendage)) {
      this.dispatchContentsFailures();
      periodFinal = (YearsSize);

      if (!gonnaDong.isEmpty()) synx425();
      else {
        topicalAppendage = (null);
        return;
      }
    }
    topicalAppendage.proceedingNewRequisition();
  }

  public synchronized void dispatchContentsFailures() {
    int subordinateFettered;
    Malfunction f;
    subordinateFettered = (-1488217839);
    f = (new Malfunction(this.obtainLiveTic(), topicalAppendage));
    responsibleRow.add(f);
    topicalAppendage.generateDefects().add(f);
  }

  public java.util.ArrayDeque<Malfunction> responsibleRow;

  private synchronized void synx421(Malfunction f, java.util.List<Malfunction> weaknesses) {

    if (f.drawIntelligentWeek() == this.obtainLiveTic()) weaknesses.add(f);
  }

  private synchronized void synx422(Malfunction culpability) {
    responsibleRow.remove(culpability);
    transpositionInitiative.giveTable(
        new Summary(
            culpability.startMechanism().fetchQuestions().peek(),
            culpability.startMechanism().startPicture(),
            0),
        culpability.startMechanism());

    if (!gonnaDong.contains(culpability.startMechanism())) {
      this.designateAct(culpability.startMechanism());
    }
  }

  private synchronized void synx423() {
    periodFinal--;

    if (topicalAppendage.isEnded()) {
      topicalAppendage.readyOutletDay(this.obtainLiveTic());
      this.achievedMechanisms.addLast(topicalAppendage);
      topicalAppendage = (null);
    }

    if (periodFinal == 0 && topicalAppendage != null) {

      if (gonnaDong.isEmpty()) {
        periodFinal = (YearsSize);
      } else {
        this.designateAct(topicalAppendage);
        topicalAppendage = (null);
      }
    }
  }

  private synchronized void synx424() {
    topicalAppendage = (this.reluctantProceedings());
    periodFinal = (YearsSize);
  }

  private synchronized void synx425() {
    topicalAppendage = (reluctantProceedings());
  }
}
