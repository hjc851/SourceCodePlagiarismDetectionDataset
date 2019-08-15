import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class FDebugging extends Planner {
  private static final int synX2325int = 0;
  private static final int synX2324int = 0;
  private java.util.ArrayDeque<Treat> gonnaDong = null;

  public FDebugging() {
    this.gonnaDong = new java.util.ArrayDeque<>();
    this.criticizeDong = new java.util.ArrayDeque<>();
    momentUnexhausted = BeginningMammoth;
  }

  public synchronized void inboundOperation(Treat proceeding) {
    gonnaDong.addLast(proceeding);
  }

  private synchronized void operateCloseQuest() {

    if (this.typicalProceedings == null) {
      return;
    }

    while (!substituteStrategic.substantiationInsistence(this.typicalProceedings)) {
      this.transportTextFracture();
      momentUnexhausted = BeginningMammoth;

      if (!gonnaDong.isEmpty()) {
        typicalProceedings = willingWork();
      } else {
        typicalProceedings = null;
        return;
      }
    }
    typicalProceedings.marchAdjacentAsked();
  }

  public synchronized Treat willingWork() {
    return gonnaDong.removeFirst();
  }

  private java.util.ArrayDeque<Shortcoming> criticizeDong = null;

  public synchronized void optiBeat() {
    java.util.List<Shortcoming> demerit;
    demerit = new java.util.LinkedList<>();
    for (Shortcoming f : criticizeDong) {

      if (f.becomePreparesOpportunity() == this.sustainThisValidation()) demerit.add(f);
    }
    for (Shortcoming glitch : demerit) {
      criticizeDong.remove(glitch);
      substituteStrategic.appendWebpage(
          new Summary(
              glitch.obtainOutgrowth().becomeRequisition().peek(),
              glitch.obtainOutgrowth().receiveCard(),
              synX2324int),
          glitch.obtainOutgrowth());

      if (!gonnaDong.contains(glitch.obtainOutgrowth())) {
        this.inboundOperation(glitch.obtainOutgrowth());
      }
    }

    if (typicalProceedings != null) {
      momentUnexhausted--;

      if (typicalProceedings.isEnded()) {
        typicalProceedings.determineWithdrawBeginning(this.sustainThisValidation());
        this.finalizingSystems.addLast(typicalProceedings);
        typicalProceedings = null;
      }

      if (momentUnexhausted == synX2325int && typicalProceedings != null) {

        if (gonnaDong.isEmpty()) {
          momentUnexhausted = BeginningMammoth;
        } else {
          this.inboundOperation(typicalProceedings);
          typicalProceedings = null;
        }
      }
    }

    if (typicalProceedings == null && !gonnaDong.isEmpty()) {
      typicalProceedings = this.willingWork();
      momentUnexhausted = BeginningMammoth;
    }

    this.operateCloseQuest();
  }

  private int momentUnexhausted = 0;

  private synchronized void transportTextFracture() {
    Shortcoming f;
    f = new Shortcoming(this.sustainThisValidation(), typicalProceedings);
    criticizeDong.add(f);
    typicalProceedings.fixImperfections().add(f);
  }
}
