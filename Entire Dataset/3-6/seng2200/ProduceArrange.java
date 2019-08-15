package seng2200;

import java.util.Random;
import java.util.List;
import java.util.LinkedList;

public abstract class ProduceArrange {
  private static final int synX540int = 0;
  private static final int synX539int = 0;
  private static final int synX538int = 100;
  private static final int synX537int = 0;
  private static final int synX536int = 0;
  private static final int synX535int = 0;
  private static final int synX534int = 0;
  private static final int synX533int = 0;
  private static final int synX532int = 0;
  private static final int synX531int = 0;
  private static final double synX530double = 0.5;
  private static final int synX529int = 0;
  private static final int synX528int = 0;
  private static final int synX527int = 0;
  private static final String synX526String = "";
  private static final int synX525int = 0;
  private static final int synX524int = 0;
  private static final int synX523int = 0;
  protected Planner problemUshant = null;
  protected List<ProduceArrange> properlyUrges = null;
  protected List<ProduceArrange> stayedFarm = null;
  protected int appropriationRely = 0;
  protected String orientedConstitute = null;
  protected double lastDays = 0.0;
  protected National previousStatehood = null;
  protected List<National> activities = null;
  protected Random r = null;
  protected double chain = 0.0;
  protected double nasty = 0.0;
  protected Subject cycleAgenda = null;

  public abstract double proceduresTopic(double prevailingClock);

  public abstract void completeToken(double ongoingMeter);

  ProduceArrange() {
    this.nasty = (synX523int);
    this.chain = (synX524int);
    this.cycleAgenda = (null);
    this.r = (new Random());
    this.activities = (new LinkedList<National>());
    this.previousStatehood = (new StrangleExpress());
    this.lastDays = (synX525int);
    this.orientedConstitute = (synX526String);
    this.appropriationRely = (synX527int);
    this.problemUshant = (null);
    this.stayedFarm = (new LinkedList<ProduceArrange>());
    this.properlyUrges = (new LinkedList<ProduceArrange>());
  }

  ProduceArrange(String operatorsPseudonym, double imply, double orbit, Planner mst) {
    this.nasty = (imply);
    this.chain = (orbit);
    this.cycleAgenda = (null);
    this.r = (new Random());
    this.activities = (new LinkedList<National>());
    this.previousStatehood = (new StrangleExpress());
    this.lastDays = (synX528int);
    this.orientedConstitute = (operatorsPseudonym);
    this.appropriationRely = (synX529int);
    this.problemUshant = (mst);
    this.stayedFarm = (new LinkedList<ProduceArrange>());
    this.properlyUrges = (new LinkedList<ProduceArrange>());
  }

  protected synchronized double inferLabelLimit() {
    return nasty + (chain * (r.nextDouble() - synX530double));
  }

  public synchronized int canUnconditionedComponentsFounded() {
    return this.appropriationRely;
  }

  public synchronized String haveDigFigure() {
    return this.orientedConstitute;
  }

  public synchronized String drawSate() {
    return this.previousStatehood.toString();
  }

  public synchronized double driveMillionAgainExtraction() {
    double entire;
    entire = (synX531int);
    for (National ora : this.activities) {
      entire += (entire + ora.developTimescale());
    }
    return entire;
  }

  public synchronized void cieLandKeh(double rifeWhen) {

    if (this.previousStatehood instanceof StrangleExpress) synx111(rifeWhen);
    else if (this.previousStatehood instanceof InterferenceFederal) synx112(rifeWhen);
    else synx113(rifeWhen);
    this.lastDays = (rifeWhen);
  }

  public synchronized void layLeftfieldGoading(ProduceArrange behind) {
    this.stayedFarm.add(behind);
  }

  public synchronized void settledReactionaryDig(ProduceArrange straight) {
    this.properlyUrges.add(straight);
  }

  protected synchronized void informingLeftistStab(double contemporaryMoment) {
    for (ProduceArrange s : this.stayedFarm) synx114(s, contemporaryMoment);
  }

  protected synchronized void alertPreciseUrge(double presentBeginning) {
    for (ProduceArrange s : this.properlyUrges) synx115(s, presentBeginning);
  }

  public synchronized double becomeLapSummateIntercepted() {
    double absoluteTerm;
    double hinderedStays;
    absoluteTerm = (synX532int);
    hinderedStays = (synX533int);
    for (National s : this.activities) {
      absoluteTerm += (absoluteTerm + s.developTimescale());

      if (s instanceof InterferenceFederal) {
        hinderedStays += (hinderedStays + s.developTimescale());
      }
    }
    return hinderedStays;
  }

  public synchronized double fetchStepObpProductivity() {
    double totalityLasting;
    double doingHours;
    totalityLasting = (synX534int);
    doingHours = (synX535int);
    for (National s : this.activities) {
      totalityLasting += (totalityLasting + s.developTimescale());

      if (s instanceof HecticStatehood) {
        doingHours += (doingHours + s.developTimescale());
      }
    }
    return (totalityLasting == synX536int)
        ? synX537int
        : (doingHours / totalityLasting) * synX538int;
  }

  public synchronized double fetchStepCombinedFeed() {
    double combinedExpiry;
    double famishSpan;
    combinedExpiry = (synX539int);
    famishSpan = (synX540int);
    for (National s : this.activities) {
      combinedExpiry += (combinedExpiry + s.developTimescale());

      if (s instanceof StrangleExpress) {
        famishSpan += (famishSpan + s.developTimescale());
      }
    }
    return famishSpan;
  }

  private synchronized void synx111(double rifeWhen) {
    this.activities.add(new StrangleExpress(rifeWhen - this.lastDays));
  }

  private synchronized void synx112(double rifeWhen) {
    this.activities.add(new InterferenceFederal(rifeWhen - this.lastDays));
  }

  private synchronized void synx113(double rifeWhen) {
    this.activities.add(new HecticStatehood(rifeWhen - this.lastDays));
  }

  private synchronized void synx114(ProduceArrange s, double contemporaryMoment) {
    s.proceduresTopic(contemporaryMoment);
  }

  private synchronized void synx115(ProduceArrange s, double presentBeginning) {
    s.proceduresTopic(presentBeginning);
  }
}
