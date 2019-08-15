package Programming.Using;

import Regulator.Sender;
import Interface.Writer;
import Interface.Mechanisms;
import java.util.ArrayDeque;

public class PapsOrganizer extends Writer {
  private static final boolean synX1942boolean = false;
  private static final int synX1941int = 0;
  private static final boolean synX1940boolean = true;
  private static final int synX1939int = 1;
  private static final String synX1938String = "FCFS:";
  public ArrayDeque<Mechanisms> cookCue;

  public PapsOrganizer() {
    this.cookCue = new ArrayDeque<>();
  }

  public synchronized String programmerEpithet() {
    return synX1938String;
  }

  public synchronized void weapMark() {

    if (continuingMechanisms != null) {
      continuingMechanisms.situatedOperativeMinutes(
          continuingMechanisms.takeFunctioningPeriod() + synX1939int);

      if (continuingMechanisms.takeFunctioningPeriod()
          == continuingMechanisms.goExecutiveHeight()) {
        continuingMechanisms.markDeceaseHours(this.comeLatestTicktock());
        this.finishedOutgrowth.addLast(continuingMechanisms);
        continuingMechanisms = null;
        this.remoSag = synX1940boolean;
      }
    }

    if (this.remoSag && continuingMechanisms == null) {
      this.residualFraserOpportunity--;

      if (residualFraserOpportunity == synX1941int) {
        this.remoSag = synX1942boolean;
        this.residualFraserOpportunity = Sender.DeployChance;
      }

    } else {

      if (continuingMechanisms == null && !cookCue.isEmpty()) {
        continuingMechanisms = cookCue.removeFirst();
        continuingMechanisms.primedGetPeriod(this.comeLatestTicktock());
        stowLitigate(continuingMechanisms);
      }
    }
  }

  public synchronized void methodsElected(Mechanisms negotiations) {
    cookCue.addLast(negotiations);
  }
}
