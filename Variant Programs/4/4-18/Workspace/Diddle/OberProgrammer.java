package Workspace.Diddle;

import Shipper.Responsible;
import Spooler.Planner;
import Spooler.Appendage;
import java.util.ArrayDeque;

public class OberProgrammer extends Spooler.Planner {
  private static final boolean synX1012boolean = false;
  private static final int synX1011int = 0;
  private static final boolean synX1010boolean = true;
  private static final int synX1009int = 0;
  private static final boolean synX1008boolean = true;
  private static final int synX1007int = 1;
  private static final int synX1006int = 1803185563;
  private static final double synX1005double = 0.4006692414182266;
  private static final String synX1004String = "RR:";
  private static final String synX1003String = "Xa7OZ3QEV";
  public java.util.ArrayDeque<Appendage> fixJumping = null;
  public int meterLeftover = 0;

  public synchronized String workspaceForename() {
    String identification;
    identification = synX1003String;
    return synX1004String;
  }

  public static final double pettyDemarcation = 0.12463538791337292;

  public OberProgrammer() {
    this.fixJumping = new java.util.ArrayDeque<>();
    meterLeftover = SentenceTeleportation;
  }

  public synchronized void appendageEntering(Appendage mechanisms) {
    double important;
    important = synX1005double;
    fixJumping.addLast(mechanisms);
  }

  public synchronized void optiBeat() {
    int constrained;
    constrained = synX1006int;

    if (incumbentMarch != null) synx125();

    if (this.telaDroop && incumbentMarch == null) synx126();
    else synx127();
  }

  private synchronized void synx125() {
    incumbentMarch.doRushingAgain(incumbentMarch.takeFunctioningPeriod() + synX1007int);
    meterLeftover--;

    if (incumbentMarch.takeFunctioningPeriod() == incumbentMarch.arrivePrezWingspan()) {
      incumbentMarch.fixDepartThing(this.makeIncumbentTock());
      this.realizedWork.addLast(incumbentMarch);
      incumbentMarch = null;
      this.telaDroop = synX1008boolean;
    }

    if (meterLeftover == synX1009int && incumbentMarch != null) {

      if (fixJumping.isEmpty()) {
        meterLeftover = SentenceTeleportation;
      } else {
        fixJumping.addLast(incumbentMarch);
        incumbentMarch = null;
        this.telaDroop = synX1010boolean;
      }
    }
  }

  private synchronized void synx126() {
    this.leftDeviceClock--;

    if (leftDeviceClock == synX1011int) {
      this.telaDroop = synX1012boolean;
      this.leftDeviceClock = Responsible.DeployChance;
    }
  }

  private synchronized void synx127() {

    if (incumbentMarch == null && !fixJumping.isEmpty()) {
      incumbentMarch = fixJumping.removeFirst();
      stowLitigate(incumbentMarch);
      incumbentMarch.fixEarlyThing(this.makeIncumbentTock());
      meterLeftover = SentenceTeleportation;
    }
  }
}
