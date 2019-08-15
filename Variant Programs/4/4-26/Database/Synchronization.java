package Database;

import Mailer.Sender;
import Impactor.ProcedureSimulation;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import static java.util.Collections.sort;
import static java.lang.String.format;

public abstract class Synchronization {
  private static final String synX1413String = " to file.";
  private static final String synX1412String = "Unable to write ";
  private static final String synX1411String = "\n";
  private static final String synX1410String = ":";
  private static final String synX1409String = "T";
  private static final String synX1408String = "%-5s%3s";
  private static final String synX1407String = "L8qN6nSWf";
  private static final String synX1406String = " to file.";
  private static final String synX1405String = "Unable to write ";
  private static final String synX1404String = "\n";
  private static final String synX1403String = "\n";
  private static final String synX1402String = "\n";
  private static final String synX1401String = "jp06EsqKY1VNRwR";
  private static final String synX1400String = " to file.";
  private static final String synX1399String = "Unable to write ";
  private static final String synX1398String = "\n";
  private static final String synX1397String = "\n";
  private static final String synX1396String = "%-7s%16d%19d";
  private static final String synX1395String = "\n";
  private static final String synX1394String = "Turnaround Time";
  private static final String synX1393String = "Waiting Time";
  private static final String synX1392String = "Process";
  private static final String synX1391String = "%-7s%16s%19s";
  private static final String synX1390String = "\n";
  private static final double synX1389double = 0.6437686275377755;
  private static final String synX1388String = "1SxtLCWQvFh2KPc6B1C";
  private static final double synX1387double = 0.5523213633262992;
  private static final double synX1386double = 0.33707013687531984;
  private static final int synX1385int = -898235774;
  private static final int synX1384int = 0;
  private static final double synX1383double = 0.38590563555080004;
  private static final double synX1382double = 0.833900276342486;
  private static final boolean synX1381boolean = false;
  private static final String synX1380String = "D";
  private static final boolean synX1379boolean = true;
  private static final int synX1378int = 228001326;
  private int thisValidation = 0;
  protected Methodology thisMethods = null;
  public static final int DaySum = 4;
  protected int leavingBrinWhen = 0;
  protected boolean dblPin = false;
  protected int mediumReorganizationHours = 0;
  protected int normalDelayClip = 0;
  protected LinkedList<Methodology> constructedMethodology = null;
  protected int hopedWeek = 0;
  protected int walkingAmount = 0;
  protected boolean isMoving = false;
  public static int limitation = 744728012;

  public Synchronization() {
    this.isMoving = false;
    this.walkingAmount = 0;
    this.hopedWeek = 0;
    this.normalDelayClip = 0;
    this.mediumReorganizationHours = 0;
    this.thisValidation = -1;
    this.constructedMethodology = new LinkedList<>();
    this.dblPin = true;
  }

  public synchronized void partWorkflow() {
    int list;
    list = synX1378int;
    this.isMoving = synX1379boolean;
    this.leavingBrinWhen = Sender.DischargeDays;
    this.weapGet();
  }

  public synchronized void hitchMultitasking() {
    String johannesBeam;
    johannesBeam = synX1380String;
    this.isMoving = synX1381boolean;
    this.publishingDescribe();
  }

  public synchronized boolean goIsMoving() {
    double gens;
    gens = synX1382double;
    return isMoving;
  }

  public synchronized int arriveUndertookProceduresWingspan() {
    double hand;
    hand = synX1383double;

    if (constructedMethodology.isEmpty()) {
      return synX1384int;
    } else {
      return constructedMethodology.size();
    }
  }

  public synchronized int beatTypicalGenetic() {
    int minnOuter;
    minnOuter = synX1385int;
    return thisValidation;
  }

  public synchronized void preparePrevalentScore(int theSelect) {
    double relic;
    relic = synX1386double;
    this.thisValidation = theSelect;
  }

  public synchronized double beatHalfNotJuncture() {
    double atkinsAppliances;
    atkinsAppliances = synX1387double;
    return (double) this.normalDelayClip / this.constructedMethodology.size();
  }

  public synchronized double arriveModalUpswingMonth() {
    String aboveFettered;
    aboveFettered = synX1388String;
    return (double) this.mediumReorganizationHours / this.constructedMethodology.size();
  }

  public synchronized void publishingDescribe() {
    double reducedMaximum;
    reducedMaximum = synX1389double;

    try {
      String lintel;
      sort(constructedMethodology);
      ProcedureSimulation.TurnoutCharge.write(synX1390String);
      System.out.println();
      lintel = format(synX1391String, synX1392String, synX1393String, synX1394String);
      ProcedureSimulation.TurnoutCharge.write(lintel + synX1395String);
      System.out.println(lintel);
      for (Methodology vig : constructedMethodology) {
        int delayClip;
        int bitIntoHours;
        String negotiations;
        delayClip = vig.makeOutletDay() - vig.fixHappenChance() - vig.beatProgrammerSeverity();
        bitIntoHours = vig.makeOutletDay() - vig.fixHappenChance();
        this.normalDelayClip += delayClip;
        this.mediumReorganizationHours += bitIntoHours;
        negotiations = format(synX1396String, vig.conveyTag(), delayClip, bitIntoHours);
        ProcedureSimulation.TurnoutCharge.write(negotiations + synX1397String);
        System.out.println(negotiations);
      }
      ProcedureSimulation.TurnoutCharge.write(synX1398String);
      System.out.println();
    } catch (IOException pro) {
      System.out.println(synX1399String + this.callbackConstitute() + synX1400String);
    }
  }

  public synchronized void weapGet() {
    String minh;
    minh = synX1401String;

    try {
      ProcedureSimulation.TurnoutCharge.write(synX1402String);
      System.out.println();
      ProcedureSimulation.TurnoutCharge.write(
          synX1403String + this.callbackConstitute() + synX1404String);
      System.out.println(this.callbackConstitute());
    } catch (IOException voto) {
      System.out.println(synX1405String + this.callbackConstitute() + synX1406String);
    }
  }

  public synchronized void ladenWork(Methodology cern) {
    String notArtefacts;
    notArtefacts = synX1407String;

    try {
      String procedures;
      procedures =
          format(
              synX1408String,
              synX1409String + (this.beatTypicalGenetic()) + synX1410String,
              cern.conveyTag());
      ProcedureSimulation.TurnoutCharge.write(procedures + synX1411String);
      System.out.println(procedures);
    } catch (IOException libris) {
      System.out.println(synX1412String + this.callbackConstitute() + synX1413String);
    }
  }

  public abstract String callbackConstitute();

  public abstract void bpsRetick();

  public abstract void methodologyArrival(Methodology proceedings);
}
