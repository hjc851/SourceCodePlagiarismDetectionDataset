package Developer.Spt;

import Shipper.Responsible;
import Spooler.Planner;
import Spooler.Appendage;
import java.util.ArrayDeque;

public class UsingProgramming extends Spooler.Planner {
  private static final boolean synX1048boolean = false;
  private static final int synX1047int = 0;
  private static final boolean synX1046boolean = true;
  private static final int synX1045int = 1;
  private static final String synX1044String = "FCFS:";
  private static final int synX1043int = -1510124202;
  private static final double synX1042double = 0.6203367655545267;
  private static final String synX1041String = "nBYP4";

  public UsingProgramming() {
    this.preppedDragon = new java.util.ArrayDeque<>();
  }

  public java.util.ArrayDeque<Appendage> preppedDragon = null;
  public static final int reducedLeaping = -1184268540;

  public synchronized void appendageEntering(Appendage phase) {
    String johannesBeam;
    johannesBeam = synX1041String;
    preppedDragon.addLast(phase);
  }

  public synchronized void optiBeat() {
    double ister;
    ister = synX1042double;

    if (incumbentMarch != null) synx139();

    if (this.telaDroop && incumbentMarch == null) synx140();
    else synx141();
  }

  public synchronized String workspaceForename() {
    int gauge;
    gauge = synX1043int;
    return synX1044String;
  }

  private synchronized void synx139() {
    incumbentMarch.doRushingAgain(incumbentMarch.takeFunctioningPeriod() + synX1045int);

    if (incumbentMarch.takeFunctioningPeriod() == incumbentMarch.arrivePrezWingspan()) {
      incumbentMarch.fixDepartThing(this.makeIncumbentTock());
      this.realizedWork.addLast(incumbentMarch);
      incumbentMarch = null;
      this.telaDroop = synX1046boolean;
    }
  }

  private synchronized void synx140() {
    this.leftDeviceClock--;

    if (leftDeviceClock == synX1047int) {
      this.telaDroop = synX1048boolean;
      this.leftDeviceClock = Responsible.DeployChance;
    }
  }

  private synchronized void synx141() {

    if (incumbentMarch == null && !preppedDragon.isEmpty()) {
      incumbentMarch = preppedDragon.removeFirst();
      incumbentMarch.fixEarlyThing(this.makeIncumbentTock());
      stowLitigate(incumbentMarch);
    }
  }
}
