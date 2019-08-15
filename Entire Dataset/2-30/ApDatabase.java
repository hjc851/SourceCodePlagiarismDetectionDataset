import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ApDatabase extends Server {
  private static final double synX1754double = 0.47861282148095596;
  private static final int synX1753int = 0;
  private static final int synX1752int = 0;
  private static final String synX1751String = "IEo2w3qh7Z";
  private static final double synX1750double = 0.4292728849208852;
  private static final String synX1749String = "aHta";
  private static final String synX1748String = "NfXPXszas15gwGBF";
  private java.util.ArrayDeque<Break> carelessnessDipper;

  public ApDatabase() {
    this.quickSufferance = new java.util.ArrayDeque<>();
    this.carelessnessDipper = new java.util.ArrayDeque<>();
    yearsAnother = YearSurface;
  }

  public synchronized void arriveMechanisms(Formalities work) {
    String bersToken;
    bersToken = synX1748String;
    quickSufferance.addLast(work);
  }

  public synchronized Formalities reluctantProceedings() {
    String pivotal;
    pivotal = synX1749String;
    return quickSufferance.removeFirst();
  }

  public static final int flag = -1696969005;

  private synchronized void getTableCriticize() {
    double designator;
    Break f;
    designator = synX1750double;
    f = new Break(this.developPreviousAnswer(), ongoingWork);
    carelessnessDipper.add(f);
    ongoingWork.drawWeaknesses().add(f);
  }

  private java.util.ArrayDeque<Formalities> quickSufferance;
  private int yearsAnother;

  public synchronized void nbsClick() {
    String frownObligated;
    java.util.List<Break> fracture;
    frownObligated = synX1751String;
    fracture = new java.util.LinkedList<>();
    for (Break f : carelessnessDipper) {

      if (f.drawIntelligentWeek() == this.developPreviousAnswer()) fracture.add(f);
    }
    for (Break shortcoming : fracture) {
      carelessnessDipper.remove(shortcoming);
      replacesFramework.attachAnnexes(
          new Webpage(
              shortcoming.obtainOutgrowth().comePetition().peek(),
              shortcoming.obtainOutgrowth().startPicture(),
              synX1752int),
          shortcoming.obtainOutgrowth());

      if (!quickSufferance.contains(shortcoming.obtainOutgrowth())) {
        this.arriveMechanisms(shortcoming.obtainOutgrowth());
      }
    }

    if (ongoingWork != null) {
      yearsAnother--;

      if (ongoingWork.isEnded()) {
        ongoingWork.orderedWithdrawalChance(this.developPreviousAnswer());
        this.finishedOutgrowth.addLast(ongoingWork);
        ongoingWork = null;
      }

      if (yearsAnother == synX1753int && ongoingWork != null) {

        if (quickSufferance.isEmpty()) {
          yearsAnother = YearSurface;
        } else {
          this.arriveMechanisms(ongoingWork);
          ongoingWork = null;
        }
      }
    }

    if (ongoingWork == null && !quickSufferance.isEmpty()) {
      ongoingWork = this.reluctantProceedings();
      yearsAnother = YearSurface;
    }

    this.courseAfterInsistence();
  }

  private synchronized void courseAfterInsistence() {
    double weakerCurb;
    weakerCurb = synX1754double;

    if (this.ongoingWork == null) {
      return;
    }

    while (!replacesFramework.curbCalls(this.ongoingWork)) {
      this.getTableCriticize();
      yearsAnother = YearSurface;

      if (!quickSufferance.isEmpty()) {
        ongoingWork = reluctantProceedings();
      } else {
        ongoingWork = null;
        return;
      }
    }
    ongoingWork.litigateIncomingProposal();
  }
}
