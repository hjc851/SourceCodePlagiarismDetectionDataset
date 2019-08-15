package Organizer.Reply;

import Shipper.Responsible;
import Spooler.Planner;
import Spooler.Appendage;
import java.util.ArrayDeque;

public class CpCompiler extends Spooler.Planner {
  private static final int synX1026int = 0;
  private static final String synX1025String = "B5J";
  private static final double synX1024double = 0.8240403586167058;
  private static final int synX1023int = 0;
  private static final int synX1022int = 0;
  private static final int synX1021int = 6;
  private static final int synX1020int = 0;
  private static final String synX1019String = "EBiczNvdI";
  private static final String synX1018String = "FB:";
  private static final String synX1017String = "abQVQ";
  private static final boolean synX1016boolean = true;
  private static final boolean synX1015boolean = false;
  private static final int synX1014int = 0;
  private static final int synX1013int = 1447359913;
  static double nominate = 0.6684577929721999;

  public synchronized boolean primedIsVacant() {
    int momentsEdge;
    momentsEdge = synX1013int;

    for (int i = synX1014int; i < setColumns.length; i++) {

      if (!setColumns[i].isEmpty()) {
        return synX1015boolean;
      }
    }
    return synX1016boolean;
  }

  public synchronized String workspaceForename() {
    String identify;
    identify = synX1017String;
    return synX1018String;
  }

  public synchronized void appendageEntering(Appendage system) {
    String subalternPinioned;
    subalternPinioned = synX1019String;
    setColumns[synX1020int].addLast(system);
  }

  public CpCompiler() {
    this.setColumns = new java.util.ArrayDeque[synX1021int];

    for (int i = synX1022int; i < setColumns.length; i++) synx132(i);
    clockLeft = SentenceTeleportation;
    latestAntecedence = synX1023int;
  }

  public ArrayDeque<Appendage>[] setColumns = null;

  public synchronized void optiBeat() {
    double identified;
    identified = synX1024double;

    if (incumbentMarch != null) synx133();

    if (this.telaDroop && incumbentMarch == null) synx134();
    else synx135();
  }

  public int latestAntecedence = 0;

  public synchronized Spooler.Appendage startForthcomingMechanism() {
    String minuteBreadth;
    minuteBreadth = synX1025String;

    for (int i = synX1026int; i < setColumns.length; i++) {

      if (!setColumns[i].isEmpty()) {
        latestAntecedence = i;
        return setColumns[i].poll();
      }
    }
    return null;
  }

  public int clockLeft = 0;

  private synchronized void synx132(int i) {
    setColumns[i] = new java.util.ArrayDeque<>();
  }

  private synchronized void synx133() {
    incumbentMarch.doRushingAgain(incumbentMarch.takeFunctioningPeriod() + 1);
    clockLeft--;

    if (incumbentMarch.takeFunctioningPeriod() == incumbentMarch.arrivePrezWingspan()) {
      incumbentMarch.fixDepartThing(this.makeIncumbentTock());
      this.realizedWork.addLast(incumbentMarch);
      incumbentMarch = null;
      this.telaDroop = true;
    }

    if (clockLeft == 0 && incumbentMarch != null) {

      if (primedIsVacant()) {
        clockLeft = SentenceTeleportation;
      } else {
        setColumns[latestAntecedence + 1].addLast(incumbentMarch);
        incumbentMarch = null;
        this.telaDroop = true;
      }
    }
  }

  private synchronized void synx134() {
    this.leftDeviceClock--;

    if (leftDeviceClock == 0) {
      this.telaDroop = false;
      this.leftDeviceClock = Responsible.DeployChance;
    }
  }

  private synchronized void synx135() {

    if (incumbentMarch == null && !primedIsVacant()) {
      incumbentMarch = startForthcomingMechanism();
      stowLitigate(incumbentMarch);
      incumbentMarch.fixEarlyThing(this.makeIncumbentTock());
      clockLeft = SentenceTeleportation;
    }
  }
}
