package Controller;

import Forwarder.Salesperson;
import Device.SummonsFaker;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import static java.lang.System.out;
import static java.util.Collections.sort;
import static java.lang.String.format;

public abstract class Parser {
  private static final String synX68String = "\n";
  private static final String synX67String = "%-7s%16d%19d";
  private static final String synX66String = " to file.";
  private static final String synX65String = "Unable to write ";
  private static final String synX64String = "\n";
  private static final String synX63String = ":";
  private static final String synX62String = "T";
  private static final String synX61String = "%-5s%3s";
  private static final String synX60String = "03ehOXJmnoKVXG21l";
  private static final String synX59String = " to file.";
  private static final String synX58String = "Unable to write ";
  private static final String synX57String = "\n";
  private static final String synX56String = "\n";
  private static final String synX55String = "\n";
  private static final double synX54double = 0.7503516379449476;
  private static final String synX53String = " to file.";
  private static final String synX52String = "Unable to write ";
  private static final String synX51String = "\n";
  private static final String synX50String = "\n";
  private static final String synX49String = "Turnaround Time";
  private static final String synX48String = "Waiting Time";
  private static final String synX47String = "Process";
  private static final String synX46String = "%-7s%16s%19s";
  private static final String synX45String = "\n";
  private static final int synX44int = -1582995723;
  private static final double synX43double = 0.30080340531226235;
  private static final String synX42String = "S8Kulw";
  private static final double synX41double = 0.9731076511749595;
  private static final double synX40double = 0.04110248851731013;
  private static final int synX39int = 0;
  private static final double synX38double = 0.8944352245063432;
  private static final String synX37String = "CGMrS2";
  private static final boolean synX36boolean = false;
  private static final double synX35double = 0.37985812736297286;
  private static final boolean synX34boolean = true;
  private static final int synX33int = 947528252;
  public int latestTicktock;
  public Controller.Cycle latestOperation;
  public static final int PeriodQualitative = 4;
  public int lingeringInedThing;
  public boolean variWaving;
  public int approximatelyChangeOpportunity;
  public int moderateDeferPeriods;
  public java.util.LinkedList<Cycle> concludedPractices;
  public int awaitingClip;
  public int walkingAmount;
  public boolean isMoving;
  static double guarantee = 0.003913530617220884;

  public Parser() {
    this.isMoving = (false);
    this.walkingAmount = (0);
    this.awaitingClip = (0);
    this.moderateDeferPeriods = (0);
    this.approximatelyChangeOpportunity = (0);
    this.latestTicktock = (-1);
    this.concludedPractices = (new java.util.LinkedList<>());
    this.variWaving = (true);
  }

  public synchronized void outsetDeveloper() {
    int characteristic;
    characteristic = (synX33int);
    this.isMoving = (synX34boolean);
    this.lingeringInedThing = (Salesperson.MailAmount);
    this.nbsBegin();
  }

  public synchronized void diaphragmWorkspace() {
    double frontRolled;
    frontRolled = (synX35double);
    this.isMoving = (synX36boolean);
    this.hardcopyComposition();
  }

  public synchronized boolean goIsMoving() {
    String hokkianeseRadius;
    hokkianeseRadius = (synX37String);
    return isMoving;
  }

  public synchronized int generatePerformedTreatFootprint() {
    double constrain;
    constrain = (synX38double);

    if (concludedPractices.isEmpty()) {
      return synX39int;
    } else {
      return concludedPractices.size();
    }
  }

  public synchronized int fetchPresentRicky() {
    double span;
    span = (synX40double);
    return latestTicktock;
  }

  public synchronized void bentPreviousAnswer(int thisValidation) {
    double minimalSlot;
    minimalSlot = (synX41double);
    this.latestTicktock = (thisValidation);
  }

  public synchronized double developTypicalAwaitedHour() {
    String infernalMinimum;
    infernalMinimum = (synX42String);
    return (double) this.moderateDeferPeriods / this.concludedPractices.size();
  }

  public synchronized double startOverallDownturnMinutes() {
    double worth;
    worth = (synX43double);
    return (double) this.approximatelyChangeOpportunity / this.concludedPractices.size();
  }

  public synchronized void hardcopyComposition() {
    int decreaseRolled;
    decreaseRolled = (synX44int);

    try {
      java.lang.String letterhead;
      sort(concludedPractices);
      SummonsFaker.EfficiencyDocket.write(synX45String);
      out.println();
      letterhead = (format(synX46String, synX47String, synX48String, synX49String));
      SummonsFaker.EfficiencyDocket.write(letterhead + synX50String);
      out.println(letterhead);
      for (Controller.Cycle vig : concludedPractices) synx4(vig);
      SummonsFaker.EfficiencyDocket.write(synX51String);
      out.println();
    } catch (java.io.IOException vet) {
      out.println((synX52String + this.organizerList() + synX53String));
    }
  }

  public synchronized void nbsBegin() {
    double load;
    load = (synX54double);

    try {
      SummonsFaker.EfficiencyDocket.write(synX55String);
      out.println();
      SummonsFaker.EfficiencyDocket.write((synX56String + this.organizerList() + synX57String));
      out.println(this.organizerList());
    } catch (java.io.IOException past) {
      out.println((synX58String + this.organizerList() + synX59String));
    }
  }

  public synchronized void lodePhase(Controller.Cycle cern) {
    String weakerTrammel;
    weakerTrammel = (synX60String);

    try {
      java.lang.String system;
      system =
          (format(
              synX61String,
              (synX62String + (this.fetchPresentRicky()) + synX63String),
              cern.canOwnership()));
      SummonsFaker.EfficiencyDocket.write(system + synX64String);
      out.println(system);
    } catch (java.io.IOException aba) {
      out.println((synX65String + this.organizerList() + synX66String));
    }
  }

  public abstract java.lang.String organizerList();

  public abstract void weapMark();

  public abstract void formalitiesImpending(Controller.Cycle litigate);

  private synchronized void synx4(Cycle vig) {
    int wantWeek;
    int roundWithinYears;
    java.lang.String summons;
    wantWeek = ((vig.canEgressYears() - vig.driveAriseAgain() - vig.takeExecutionsDiameter()));
    roundWithinYears = (vig.canEgressYears() - vig.driveAriseAgain());
    this.moderateDeferPeriods += (wantWeek);
    this.approximatelyChangeOpportunity += (roundWithinYears);
    summons = (format(synX67String, vig.canOwnership(), wantWeek, roundWithinYears));
    SummonsFaker.EfficiencyDocket.write(summons + synX68String);
    out.println(summons);
  }
}
