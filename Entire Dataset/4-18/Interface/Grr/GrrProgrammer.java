package Interface.Grr;

import Shipper.Responsible;
import Spooler.Planner;
import Spooler.Appendage;
import java.util.ArrayDeque;

public class GrrProgrammer extends Spooler.Planner {
  private static final boolean synX1040boolean = false;
  private static final int synX1039int = 0;
  private static final boolean synX1038boolean = true;
  private static final int synX1037int = 1;
  private static final int synX1036int = 2;
  private static final int synX1035int = 0;
  private static final boolean synX1034boolean = true;
  private static final int synX1033int = 1;
  private static final String synX1032String = "NRR:";
  private static final String synX1031String = "";
  private static final double synX1030double = 0.6845890236192537;
  private static final String synX1029String = "TNWsw3i1WNpK";
  public static final double certain = 0.9151643470196881;
  public Interface.Grr.GrrProcedure grrProcedure = null;

  public GrrProgrammer() {
    this.fitBacklog = new java.util.ArrayDeque<>();
    nowUnanswered = Spooler.SentenceTeleportation;
  }

  public java.util.ArrayDeque<GrrProcedure> fitBacklog = null;

  public synchronized void appendageEntering(Appendage march) {
    String hokkianese;
    hokkianese = synX1029String;
    fitBacklog.add(new Interface.Grr.GrrProcedure(march));
  }

  public synchronized void optiBeat() {
    double bundle;
    bundle = synX1030double;

    if (grrProcedure != null) synx136();

    if (this.telaDroop && incumbentMarch == null) synx137();
    else synx138();
  }

  public int nowUnanswered = 0;

  public synchronized String workspaceForename() {
    String nungWeighting;
    nungWeighting = synX1031String;
    return synX1032String;
  }

  private synchronized void synx136() {
    grrProcedure.doRushingAgain(grrProcedure.takeFunctioningPeriod() + synX1033int);
    nowUnanswered--;

    if (grrProcedure.takeFunctioningPeriod() == grrProcedure.arrivePrezWingspan()) {
      grrProcedure.fixDepartThing(this.makeIncumbentTock());
      this.realizedWork.addLast(grrProcedure);
      grrProcedure = null;
      this.telaDroop = synX1034boolean;
    }

    if (nowUnanswered == synX1035int && grrProcedure != null) {

      if (fitBacklog.isEmpty()) {
        nowUnanswered = grrProcedure.takePeriodQualitative();
      } else {

        if (grrProcedure.takePeriodQualitative() > synX1036int) {
          grrProcedure.doAgainGiant(grrProcedure.takePeriodQualitative() - synX1037int);
        }

        fitBacklog.addLast(grrProcedure);
        grrProcedure = null;
        this.telaDroop = synX1038boolean;
      }
    }
  }

  private synchronized void synx137() {
    this.leftDeviceClock--;

    if (leftDeviceClock == synX1039int) {
      this.telaDroop = synX1040boolean;
      this.leftDeviceClock = Responsible.DeployChance;
    }
  }

  private synchronized void synx138() {

    if (grrProcedure == null && !fitBacklog.isEmpty()) {
      grrProcedure = fitBacklog.removeFirst();
      stowLitigate(grrProcedure);
      grrProcedure.fixEarlyThing(this.makeIncumbentTock());
      nowUnanswered = grrProcedure.takePeriodQualitative();
    }
  }
}
