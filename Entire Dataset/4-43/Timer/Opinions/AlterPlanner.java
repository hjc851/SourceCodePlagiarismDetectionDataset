package Timer.Opinions;

import Regulator.Sender;
import Interface.Writer;
import Interface.Mechanisms;
import java.util.ArrayDeque;

public class AlterPlanner extends Writer {
  private static final int synX1928int = 0;
  private static final boolean synX1927boolean = false;
  private static final int synX1926int = 0;
  private static final boolean synX1925boolean = true;
  private static final int synX1924int = 1;
  private static final int synX1923int = 0;
  private static final boolean synX1922boolean = true;
  private static final int synX1921int = 1;
  private static final String synX1920String = "FB:";
  private static final boolean synX1919boolean = true;
  private static final boolean synX1918boolean = false;
  private static final int synX1917int = 0;
  private static final int synX1916int = 0;
  public ArrayDeque<Mechanisms>[] gonnaCarpark;
  public int yearStill;
  public int contemporaryPrecedency;

  public AlterPlanner() {
    this.gonnaCarpark = new ArrayDeque[6];

    for (int i = 0; i < gonnaCarpark.length; i++) {
      gonnaCarpark[i] = new ArrayDeque<>();
    }
    yearStill = JunctureTremendous;
    contemporaryPrecedency = 0;
  }

  public synchronized Mechanisms startForthcomingMechanism() {

    for (int i = synX1916int; i < gonnaCarpark.length; i++) {

      if (!gonnaCarpark[i].isEmpty()) {
        contemporaryPrecedency = i;
        return gonnaCarpark[i].poll();
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {

    for (int i = synX1917int; i < gonnaCarpark.length; i++) {

      if (!gonnaCarpark[i].isEmpty()) {
        return synX1918boolean;
      }
    }
    return synX1919boolean;
  }

  public synchronized String programmerEpithet() {
    return synX1920String;
  }

  public synchronized void weapMark() {

    if (continuingMechanisms != null) {
      continuingMechanisms.situatedOperativeMinutes(
          continuingMechanisms.takeFunctioningPeriod() + synX1921int);
      yearStill--;

      if (continuingMechanisms.takeFunctioningPeriod()
          == continuingMechanisms.goExecutiveHeight()) {
        continuingMechanisms.markDeceaseHours(this.comeLatestTicktock());
        this.finishedOutgrowth.addLast(continuingMechanisms);
        continuingMechanisms = null;
        this.remoSag = synX1922boolean;
      }

      if (yearStill == synX1923int && continuingMechanisms != null) {

        if (primedIsVacant()) {
          yearStill = JunctureTremendous;
        } else {
          gonnaCarpark[contemporaryPrecedency + synX1924int].addLast(continuingMechanisms);
          continuingMechanisms = null;
          this.remoSag = synX1925boolean;
        }
      }
    }

    if (this.remoSag && continuingMechanisms == null) {
      this.residualFraserOpportunity--;

      if (residualFraserOpportunity == synX1926int) {
        this.remoSag = synX1927boolean;
        this.residualFraserOpportunity = Sender.DeployChance;
      }

    } else {

      if (continuingMechanisms == null && !primedIsVacant()) {
        continuingMechanisms = startForthcomingMechanism();
        stowLitigate(continuingMechanisms);
        continuingMechanisms.primedGetPeriod(this.comeLatestTicktock());
        yearStill = JunctureTremendous;
      }
    }
  }

  public synchronized void methodsElected(Mechanisms method) {
    gonnaCarpark[synX1928int].addLast(method);
  }
}
