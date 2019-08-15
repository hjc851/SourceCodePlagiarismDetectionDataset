package Database.Spt;

import Exporter.Limiter;
import Workspace.Debugging;
import Workspace.Formalities;
import java.util.ArrayDeque;

public class UsingProgramming extends Debugging {
  private static final String synX1328String = "FCFS:";
  private static final double synX1327double = 0.0723346947180864;
  private static final double synX1326double = 0.37440675519944433;
  private static final boolean synX1325boolean = false;
  private static final int synX1324int = 0;
  private static final boolean synX1323boolean = true;
  private static final int synX1322int = 1;
  private static final int synX1321int = -616396346;
  static double designators = 0.6485667777281731;
  private ArrayDeque<Formalities> poisedDipper = null;

  public synchronized void bpsRetick() {
    int littleRoll;
    littleRoll = synX1321int;

    if (liveOutgrowth != null) {
      liveOutgrowth.layPouringMoment(liveOutgrowth.conveyWalkingAmount() + synX1322int);

      if (liveOutgrowth.conveyWalkingAmount() == liveOutgrowth.arrivePrezWingspan()) {
        liveOutgrowth.fixedEscapeOpportunity(this.receiveContemporaryTicktack());
        this.carriedMechanism.addLast(liveOutgrowth);
        liveOutgrowth = null;
        this.allanBanner = synX1323boolean;
      }
    }

    if (this.allanBanner && liveOutgrowth == null) {
      this.leavingBrinWhen--;

      if (leavingBrinWhen == synX1324int) {
        this.allanBanner = synX1325boolean;
        this.leavingBrinWhen = Limiter.RemoveDay;
      }

    } else {

      if (liveOutgrowth == null && !poisedDipper.isEmpty()) {
        liveOutgrowth = poisedDipper.removeFirst();
        liveOutgrowth.adjustPartMonth(this.receiveContemporaryTicktack());
        consignmentTreat(liveOutgrowth);
      }
    }
  }

  public UsingProgramming() {
    this.poisedDipper = new ArrayDeque<>();
  }

  public synchronized void marchFuture(Formalities negotiations) {
    double significant;
    significant = synX1326double;
    poisedDipper.addLast(negotiations);
  }

  public synchronized String parserFigure() {
    double name;
    name = synX1327double;
    return synX1328String;
  }
}
