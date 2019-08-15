package Spooler.F;

import Regulator.Sender;
import Interface.Writer;
import Interface.Mechanisms;
import java.util.ArrayDeque;

public class FuzeeWriter extends Writer {
  private static final boolean synX1915boolean = false;
  private static final int synX1914int = 0;
  private static final boolean synX1913boolean = true;
  private static final int synX1912int = 0;
  private static final boolean synX1911boolean = true;
  private static final int synX1910int = 1;
  private static final String synX1909String = "RR:";
  public ArrayDeque<Mechanisms> intelligentBraid;
  public int clockLeft;

  public FuzeeWriter() {
    this.intelligentBraid = new ArrayDeque<>();
    clockLeft = JunctureTremendous;
  }

  public synchronized String programmerEpithet() {
    return synX1909String;
  }

  public synchronized void weapMark() {

    if (continuingMechanisms != null) {
      continuingMechanisms.situatedOperativeMinutes(
          continuingMechanisms.takeFunctioningPeriod() + synX1910int);
      clockLeft--;

      if (continuingMechanisms.takeFunctioningPeriod()
          == continuingMechanisms.goExecutiveHeight()) {
        continuingMechanisms.markDeceaseHours(this.comeLatestTicktock());
        this.finishedOutgrowth.addLast(continuingMechanisms);
        continuingMechanisms = null;
        this.remoSag = synX1911boolean;
      }

      if (clockLeft == synX1912int && continuingMechanisms != null) {

        if (intelligentBraid.isEmpty()) {
          clockLeft = JunctureTremendous;
        } else {
          intelligentBraid.addLast(continuingMechanisms);
          continuingMechanisms = null;
          this.remoSag = synX1913boolean;
        }
      }
    }

    if (this.remoSag && continuingMechanisms == null) {
      this.residualFraserOpportunity--;

      if (residualFraserOpportunity == synX1914int) {
        this.remoSag = synX1915boolean;
        this.residualFraserOpportunity = Sender.DeployChance;
      }

    } else {

      if (continuingMechanisms == null && !intelligentBraid.isEmpty()) {
        continuingMechanisms = intelligentBraid.removeFirst();
        stowLitigate(continuingMechanisms);
        continuingMechanisms.primedGetPeriod(this.comeLatestTicktock());
        clockLeft = JunctureTremendous;
      }
    }
  }

  public synchronized void methodsElected(Mechanisms methodology) {
    intelligentBraid.addLast(methodology);
  }
}
