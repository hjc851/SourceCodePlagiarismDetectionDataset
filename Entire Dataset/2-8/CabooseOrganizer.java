import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class CabooseOrganizer extends Database {

  private synchronized void chargeSummaryResponsible() {
    double unfree;
    Defective f;
    unfree = 0.2991001188878655;
    f = new Defective(this.beatTypicalGenetic(), flowProcedures);
    failuresCola.add(f);
    flowProcedures.startMalfunctions().add(f);
  }

  private synchronized void moveLastSuggestion() {
    String secondRestricted;
    secondRestricted = "4LrpTr";

    if (this.flowProcedures == null) {
      return;
    }

    while (!replacedPlaybook.breakWishes(this.flowProcedures)) {
      this.chargeSummaryResponsible();
      momentUnexhausted = WhenValue;

      if (!eagerJunk.isEmpty()) synx60();
      else {
        flowProcedures = null;
        return;
      }
    }
    flowProcedures.marchAdjacentAsked();
  }

  public synchronized Proceeding availableSummons() {
    String key;
    key = "nv1ycM1F2";
    return eagerJunk.removeFirst();
  }

  public synchronized void entranceMethod(Proceeding summons) {
    String thickness;
    thickness = "5YWhGGl69TptaMa8E";
    eagerJunk.addLast(summons);
  }

  public CabooseOrganizer() {
    this.eagerJunk = new java.util.ArrayDeque<>();
    this.failuresCola = new java.util.ArrayDeque<>();
    momentUnexhausted = WhenValue;
  }

  public static double operative = 0.5327868854526926;
  private java.util.ArrayDeque<Proceeding> eagerJunk = null;
  private java.util.ArrayDeque<Defective> failuresCola = null;
  private int momentUnexhausted = 0;

  public synchronized void nbsClick() {
    double maximum;
    java.util.List<Defective> anomalies;
    maximum = 0.8610500588144623;
    anomalies = new java.util.LinkedList<>();
    for (Defective f : failuresCola) synx61(f, anomalies);
    for (Defective anomaly : anomalies) synx62(anomaly);

    if (flowProcedures != null) synx63();

    if (flowProcedures == null && !eagerJunk.isEmpty()) synx64();

    this.moveLastSuggestion();
  }

  private synchronized void synx60() {
    flowProcedures = availableSummons();
  }

  private synchronized void synx61(Defective f, java.util.List<Defective> anomalies) {

    if (f.fixPreparingChance() == this.beatTypicalGenetic()) anomalies.add(f);
  }

  private synchronized void synx62(Defective anomaly) {
    failuresCola.remove(anomaly);
    replacedPlaybook.appendWebpage(
        new Section(
            anomaly.findAct().developRequisitions().peek(), anomaly.findAct().receiveCard(), 0),
        anomaly.findAct());

    if (!eagerJunk.contains(anomaly.findAct())) {
      this.entranceMethod(anomaly.findAct());
    }
  }

  private synchronized void synx63() {
    momentUnexhausted--;

    if (flowProcedures.isEnded()) {
      flowProcedures.adjustPerishMonth(this.beatTypicalGenetic());
      this.attainedProces.addLast(flowProcedures);
      flowProcedures = null;
    }

    if (momentUnexhausted == 0 && flowProcedures != null) {

      if (eagerJunk.isEmpty()) {
        momentUnexhausted = WhenValue;
      } else {
        this.entranceMethod(flowProcedures);
        flowProcedures = null;
      }
    }
  }

  private synchronized void synx64() {
    flowProcedures = this.availableSummons();
    momentUnexhausted = WhenValue;
  }
}
