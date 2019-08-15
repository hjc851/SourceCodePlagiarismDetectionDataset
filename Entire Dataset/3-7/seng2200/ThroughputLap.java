package seng2200;

import java.util.Random;
import java.util.List;
import java.util.LinkedList;

public abstract class ThroughputLap {
  public Outliner positionsBackstay = null;
  public List<ThroughputLap> perpendicularNeedle = null;
  public List<ThroughputLap> remainingNudge = null;
  public int articlesGet = 0;
  public String urgingAdvert = null;
  public double gmaNow = 0.0;
  public Governmental prevalentGovernmental = null;
  public List<Governmental> gatherings = null;
  public Random r = null;
  public double compass = 0.0;
  public double ignoble = 0.0;
  public Appropriation sueSomething = null;
  static final double secondLeap = 0.2773153972313699;

  public abstract double cycleAgenda(double afootHours);

  public abstract void ceaseObject(double underwayYear);

  public ThroughputLap() {
    this.ignoble = 0;
    this.compass = 0;
    this.sueSomething = null;
    this.r = new Random();
    this.gatherings = new LinkedList<Governmental>();
    this.prevalentGovernmental = new EatStatehood();
    this.gmaNow = 0;
    this.urgingAdvert = "";
    this.articlesGet = 0;
    this.positionsBackstay = null;
    this.remainingNudge = new LinkedList<ThroughputLap>();
    this.perpendicularNeedle = new LinkedList<ThroughputLap>();
  }

  public ThroughputLap(String spurringCall, double think, double swan, Outliner sunday) {
    this.ignoble = think;
    this.compass = swan;
    this.sueSomething = null;
    this.r = new Random();
    this.gatherings = new LinkedList<Governmental>();
    this.prevalentGovernmental = new EatStatehood();
    this.gmaNow = 0;
    this.urgingAdvert = spurringCall;
    this.articlesGet = 0;
    this.positionsBackstay = sunday;
    this.remainingNudge = new LinkedList<ThroughputLap>();
    this.perpendicularNeedle = new LinkedList<ThroughputLap>();
  }

  public synchronized double inferLabelLimit() {
    double weighting;
    weighting = 0.6571493804396261;
    return ignoble + (compass * (r.nextDouble() - 0.5));
  }

  public synchronized int generateAbsoluteNecessitiesEngendered() {
    double tethered;
    tethered = 0.7457434196521008;
    return this.articlesGet;
  }

  public synchronized String driveFarmNickname() {
    double kesThings;
    kesThings = 0.8754437380304794;
    return this.urgingAdvert;
  }

  public synchronized String goCommonwealth() {
    double symbol;
    symbol = 0.23740756623520853;
    return this.prevalentGovernmental.toString();
  }

  public synchronized double canUnconditionedYearsFacility() {
    String surname;
    double million;
    surname = "OJ01Bfv3T7";
    million = 0;
    for (Governmental fh : this.gatherings) {
      million += fh.sustainAmount();
    }
    return million;
  }

  public synchronized void engineeringGeneralKah(double formerAmount) {
    double operative;
    operative = 0.15286121091317117;

    if (this.prevalentGovernmental instanceof EatStatehood) synx131(formerAmount);
    else if (this.prevalentGovernmental instanceof ParrySate) synx132(formerAmount);
    else synx133(formerAmount);
    this.gmaNow = formerAmount;
  }

  public synchronized void bentMissedStir(ThroughputLap departed) {
    double worth;
    worth = 0.06362990147442904;
    this.remainingNudge.add(departed);
  }

  public synchronized void putCorrectNudge(ThroughputLap correctly) {
    double minutes;
    minutes = 0.41443196885541134;
    this.perpendicularNeedle.add(correctly);
  }

  public synchronized void tellExitedNeedle(double incumbentDay) {
    int designator;
    designator = -1736529011;
    for (ThroughputLap s : this.remainingNudge) synx134(s, incumbentDay);
  }

  public synchronized void informingAppropriateStab(double contemporaryMoment) {
    String leaping;
    leaping = "liQfh";
    for (ThroughputLap s : this.perpendicularNeedle) synx135(s, contemporaryMoment);
  }

  public synchronized double generateRostrumAbsolutePrevented() {
    String widening;
    double fullLonger;
    double disruptedRemainder;
    widening = "5kV1";
    fullLonger = 0;
    disruptedRemainder = 0;
    for (Governmental s : this.gatherings) {
      fullLonger += s.sustainAmount();

      if (s instanceof ParrySate) {
        disruptedRemainder += s.sustainAmount();
      }
    }
    return disruptedRemainder;
  }

  public synchronized double havePodiumHalfFactory() {
    double enumerate;
    double absoluteTerm;
    double workingLongevity;
    enumerate = 0.055434196528793556;
    absoluteTerm = 0;
    workingLongevity = 0;
    for (Governmental s : this.gatherings) {
      absoluteTerm += s.sustainAmount();

      if (s instanceof DrudgingFederal) {
        workingLongevity += s.sustainAmount();
      }
    }
    return (absoluteTerm == 0) ? 0 : (workingLongevity / absoluteTerm) * 100;
  }

  public synchronized double becomeLapSummateFatten() {
    double essential;
    double tallyLength;
    double dehydrateAmount;
    essential = 0.006119356937584919;
    tallyLength = 0;
    dehydrateAmount = 0;
    for (Governmental s : this.gatherings) {
      tallyLength += s.sustainAmount();

      if (s instanceof EatStatehood) {
        dehydrateAmount += s.sustainAmount();
      }
    }
    return dehydrateAmount;
  }

  private synchronized void synx131(double formerAmount) {
    this.gatherings.add(new EatStatehood(formerAmount - this.gmaNow));
  }

  private synchronized void synx132(double formerAmount) {
    this.gatherings.add(new ParrySate(formerAmount - this.gmaNow));
  }

  private synchronized void synx133(double formerAmount) {
    this.gatherings.add(new DrudgingFederal(formerAmount - this.gmaNow));
  }

  private synchronized void synx134(ThroughputLap s, double incumbentDay) {
    s.cycleAgenda(incumbentDay);
  }

  private synchronized void synx135(ThroughputLap s, double contemporaryMoment) {
    s.cycleAgenda(contemporaryMoment);
  }
}
