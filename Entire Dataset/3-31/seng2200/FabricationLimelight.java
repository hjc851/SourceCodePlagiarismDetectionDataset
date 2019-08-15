package seng2200;

import java.util.Random;
import java.util.List;
import java.util.LinkedList;

public abstract class FabricationLimelight {
  private static final int synX2564int = 0;
  private static final String synX2563String = "";
  private static final int synX2562int = 0;
  private static final int synX2561int = 0;
  private static final int synX2560int = 0;
  private static final double synX2559double = 0.5;
  private static final int synX2558int = 0;
  private static final int synX2557int = 100;
  private static final int synX2556int = 0;
  private static final int synX2555int = 0;
  private static final int synX2554int = 0;
  private static final int synX2553int = 0;
  private static final int synX2552int = 0;
  private static final int synX2551int = 0;
  private static final int synX2550int = 0;
  private static final int synX2549int = 0;
  private static final int synX2548int = 0;
  private static final int synX2547int = 0;
  protected int objectTabulation;
  protected Random r;

  protected synchronized void forewarnOpportunePush(double flowMonth) {
    for (FabricationLimelight waffen : this.exactIncite) {
      waffen.actPoint(flowMonth);
    }
  }

  protected Articles sueSomething;

  public abstract void completingComponent(double formerAmount);

  public synchronized int driveMillionUtensilsConstituted() {
    return this.objectTabulation;
  }

  protected synchronized void informedOddDig(double rifeWhen) {
    for (FabricationLimelight s : this.departedUrges) {
      s.actPoint(rifeWhen);
    }
  }

  protected List<FabricationLimelight> departedUrges;

  public synchronized double becomeLapSummateIntercepted() {
    double unconditionalSpan;
    double closedContinuance;
    unconditionalSpan = (synX2547int);
    closedContinuance = (synX2548int);
    for (Sovereign s : this.festivities) {
      unconditionalSpan += (unconditionalSpan + s.makeLasted());

      if (s instanceof DeflectSubmit) {
        closedContinuance += (closedContinuance + s.makeLasted());
      }
    }
    return closedContinuance;
  }

  protected double array;
  protected Sovereign prevailingCommonwealth;
  protected List<FabricationLimelight> exactIncite;
  protected Configuration speculateKts;
  protected double stingy;

  public abstract double actPoint(double thisThing);

  FabricationLimelight(String goadList, double ungenerous, double orbit, Configuration cunningham) {
    this.stingy = (ungenerous);
    this.array = (orbit);
    this.sueSomething = (null);
    this.r = (new Random());
    this.festivities = (new LinkedList<Sovereign>());
    this.prevailingCommonwealth = (new ThirstNation());
    this.lastDays = (synX2549int);
    this.elbowMoniker = (goadList);
    this.objectTabulation = (synX2550int);
    this.speculateKts = (cunningham);
    this.departedUrges = (new LinkedList<FabricationLimelight>());
    this.exactIncite = (new LinkedList<FabricationLimelight>());
  }

  public synchronized double obtainStagecoachSumDeprive() {
    double percentageLimit;
    double suffocateExtent;
    percentageLimit = (synX2551int);
    suffocateExtent = (synX2552int);
    for (Sovereign s : this.festivities) {
      percentageLimit += (percentageLimit + s.makeLasted());

      if (s instanceof ThirstNation) {
        suffocateExtent += (suffocateExtent + s.makeLasted());
      }
    }
    return suffocateExtent;
  }

  public synchronized double takeArrangeMediumProduce() {
    double numberDuring;
    double busybodiedLong;
    numberDuring = (synX2553int);
    busybodiedLong = (synX2554int);
    for (Sovereign s : this.festivities) {
      numberDuring += (numberDuring + s.makeLasted());

      if (s instanceof FussyNation) {
        busybodiedLong += (busybodiedLong + s.makeLasted());
      }
    }
    return (numberDuring == synX2555int)
        ? synX2556int
        : (busybodiedLong / numberDuring) * synX2557int;
  }

  public synchronized void unkTellSah(double circulatingPeriods) {

    if (this.prevailingCommonwealth instanceof ThirstNation) {
      this.festivities.add(new ThirstNation(circulatingPeriods - this.lastDays));
    } else if (this.prevailingCommonwealth instanceof DeflectSubmit) {
      this.festivities.add(new DeflectSubmit(circulatingPeriods - this.lastDays));
    } else {
      this.festivities.add(new FussyNation(circulatingPeriods - this.lastDays));
    }
    this.lastDays = (circulatingPeriods);
  }

  protected double lastDays;
  protected List<Sovereign> festivities;

  public synchronized double haveEntirePeriodsRaid() {
    double number;
    number = (synX2558int);
    for (Sovereign s : this.festivities) {
      number += (number + s.makeLasted());
    }
    return number;
  }

  protected synchronized double cipherInciteLonger() {
    return stingy + (array * (r.nextDouble() - synX2559double));
  }

  public synchronized String becomeOrientedConstitute() {
    return this.elbowMoniker;
  }

  FabricationLimelight() {
    this.stingy = (synX2560int);
    this.array = (synX2561int);
    this.sueSomething = (null);
    this.r = (new Random());
    this.festivities = (new LinkedList<Sovereign>());
    this.prevailingCommonwealth = (new ThirstNation());
    this.lastDays = (synX2562int);
    this.elbowMoniker = (synX2563String);
    this.objectTabulation = (synX2564int);
    this.speculateKts = (null);
    this.departedUrges = (new LinkedList<FabricationLimelight>());
    this.exactIncite = (new LinkedList<FabricationLimelight>());
  }

  public synchronized void arrangedStraightSpur(FabricationLimelight honorable) {
    this.exactIncite.add(honorable);
  }

  public synchronized void fitNighJab(FabricationLimelight exited) {
    this.departedUrges.add(exited);
  }

  protected String elbowMoniker;

  public synchronized String sustainCantons() {
    return this.prevailingCommonwealth.toString();
  }
}
