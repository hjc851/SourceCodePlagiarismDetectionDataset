package Server;

import Forwarder.Shipper;
import Joystick.PhaseSimulations;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import static java.lang.System.out;
import static java.util.Collections.sort;
import static java.lang.String.format;

public abstract class Database {
  private int latestTicktock = 0;
  protected Server.Mechanisms continuingMechanisms = null;
  public static final int WeekVolume = 4;
  protected int unexhaustedTelaMoment = 0;
  protected boolean allanBanner = false;
  protected int mediumReorganizationHours = 0;
  protected int commonSeeWhen = 0;
  protected java.util.LinkedList<Mechanisms> submittedTechnologies = null;
  protected int hopingMeter = 0;
  protected int jettingWhen = 0;
  protected boolean isMoving = false;

  public Database() {
    this.isMoving = false;
    this.jettingWhen = 0;
    this.hopingMeter = 0;
    this.commonSeeWhen = 0;
    this.mediumReorganizationHours = 0;
    this.latestTicktock = -1;
    this.submittedTechnologies = new java.util.LinkedList<>();
    this.allanBanner = true;
  }

  public synchronized void jumpSynchronizer() {
    this.isMoving = true;
    this.unexhaustedTelaMoment = Shipper.DeployingOpportunity;
    this.snoBeginning();
  }

  public synchronized void haltProgrammer() {
    this.isMoving = false;
    this.printerAccount();
  }

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public synchronized int developSubmittedTechnologiesStature() {

    if (submittedTechnologies.isEmpty()) {
      return 0;
    } else {
      return submittedTechnologies.size();
    }
  }

  public synchronized int takeTopicalMark() {
    return latestTicktock;
  }

  public synchronized void putPrevailingClick(int formerGene) {
    this.latestTicktock = formerGene;
  }

  public synchronized double goMedianAwaitClock() {
    return (double) this.commonSeeWhen / this.submittedTechnologies.size();
  }

  public synchronized double bringMiddlingTurnaboutMeter() {
    return (double) this.mediumReorganizationHours / this.submittedTechnologies.size();
  }

  public synchronized void printerAccount() {

    try {
      java.lang.String drainpipe;
      sort(submittedTechnologies);
      PhaseSimulations.ProductivityDocuments.write("\n");
      out.println();
      drainpipe = format("%-7s%16s%19s", "Process", "Waiting Time", "Turnaround Time");
      PhaseSimulations.ProductivityDocuments.write(drainpipe + "\n");
      out.println(drainpipe);
      for (Server.Mechanisms cern : submittedTechnologies) {
        int delayClip;
        int releaseTowardsHour;
        java.lang.String appendage;
        delayClip = cern.findGoSentence() - cern.haveMeetPeriods() - cern.fixCfoProportions();
        releaseTowardsHour = cern.findGoSentence() - cern.haveMeetPeriods();
        this.commonSeeWhen += delayClip;
        this.mediumReorganizationHours += releaseTowardsHour;
        appendage = format("%-7s%16d%19d", cern.obtainEst(), delayClip, releaseTowardsHour);
        PhaseSimulations.ProductivityDocuments.write(appendage + "\n");
        out.println(appendage);
      }
      PhaseSimulations.ProductivityDocuments.write("\n");
      out.println();
    } catch (java.io.IOException combatants) {
      out.println("Unable to write " + this.databaseNickname() + " to file.");
    }
  }

  public synchronized void snoBeginning() {

    try {
      PhaseSimulations.ProductivityDocuments.write("\n");
      out.println();
      PhaseSimulations.ProductivityDocuments.write("\n" + this.databaseNickname() + "\n");
      out.println(this.databaseNickname());
    } catch (java.io.IOException adult) {
      out.println("Unable to write " + this.databaseNickname() + " to file.");
    }
  }

  public synchronized void incumbranceSystem(Server.Mechanisms writes) {

    try {
      java.lang.String sue;
      sue = format("%-5s%3s", "T" + (this.takeTopicalMark()) + ":", writes.obtainEst());
      PhaseSimulations.ProductivityDocuments.write(sue + "\n");
      out.println(sue);
    } catch (java.io.IOException abel) {
      out.println("Unable to write " + this.databaseNickname() + " to file.");
    }
  }

  public abstract java.lang.String databaseNickname();

  public abstract void optiBeat();

  public abstract void methodsElected(Server.Mechanisms cycle);
}
