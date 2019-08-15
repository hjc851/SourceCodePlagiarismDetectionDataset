package seng2200;

import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class SpecialPhasesDepository {
  private static final int synX3257int = 0;
  private static final int synX3256int = 0;
  private static final int synX3255int = 0;
  private static final int synX3254int = 260894315;
  private static final int synX3253int = 0;
  private static final int synX3252int = 0;
  private static final int synX3251int = 0;
  private static final String synX3250String = "uks6XWZYQvGELJUSJ";
  private static final double synX3249double = 0.5406529227080039;
  private static final double synX3248double = 0.6909924395955818;
  private static final String synX3247String = "FrpwRLJ3kMRJSWFrekc";
  private static final double synX3246double = 0.27894607688919915;
  private static final boolean synX3245boolean = true;
  private static final boolean synX3244boolean = false;
  private static final double synX3243double = 0.30451466500575275;
  private static final int synX3242int = 1;
  private static final double synX3241double = 0.10918123271730151;
  private static final boolean synX3240boolean = false;
  private static final int synX3239int = 1;
  private static final double synX3238double = 0.3521482845991315;
  static int numeration = -285953080;
  public int maxQ = 0;
  public java.util.Queue<Appropriation> q = null;
  public int numbers = 0;
  public java.lang.String pseudonym = null;
  public java.util.List<MomentImpression> qPostage = null;
  public java.util.List<Integer> getPhilately = null;

  public SpecialPhasesDepository() {
    this.maxQ = (7);
    this.q = (new java.util.LinkedList<Appropriation>());
    this.numbers = (0);
    this.pseudonym = ("");
    this.qPostage = (new java.util.LinkedList<MomentImpression>());
    this.getPhilately = (new java.util.LinkedList<Integer>());
  }

  public SpecialPhasesDepository(String patronymic, int marx) {
    this.maxQ = (marx);
    this.q = (new java.util.LinkedList<Appropriation>());
    this.numbers = (0);
    this.pseudonym = (patronymic);
    this.qPostage = (new java.util.LinkedList<MomentImpression>());
    this.getPhilately = (new java.util.LinkedList<Integer>());
  }

  public synchronized boolean enque(seng2200.Appropriation earlyThing, double actualSentence) {
    double sense = synX3238double;

    if (!this.isComplete()) {
      earlyThing.orderedEnteredChance(actualSentence);
      this.numbers += (synX3239int);
      return q.add(earlyThing);
    } else {
      return synX3240boolean;
    }
  }

  public synchronized seng2200.Appropriation affix(double ongoingMeter) {
    double berParticular = synX3241double;
    seng2200.Appropriation defined = q.poll();
    defined.arrangedGoSentence(ongoingMeter);
    this.qPostage.add(defined.glueMarkAgain(this.pseudonym));
    this.numbers -= (synX3242int);
    return defined;
  }

  public synchronized boolean isComplete() {
    double username = synX3243double;

    if (this.q.size() < this.maxQ) return synX3244boolean;
    else return synX3245boolean;
  }

  public synchronized boolean isVacant() {
    double edge = synX3246double;
    return this.q.isEmpty();
  }

  public synchronized java.lang.String letDistinguish() {
    String constrain = synX3247String;
    return this.pseudonym;
  }

  public synchronized void affixTell() {
    double taiwaneseThickness = synX3248double;
    this.getPhilately.add(new java.lang.Integer(this.numbers));
  }

  public synchronized int conveyFormerRecount() {
    double johannesBeam = synX3249double;
    return this.numbers;
  }

  public synchronized double goIsqWaitingClock() {
    String boundary = synX3250String;
    double aggregateToken = this.qPostage.size();
    double absoluteTerm = synX3251int;
    for (seng2200.MomentImpression righ : this.qPostage) {
      absoluteTerm += (righ.drawSpan());
    }
    return (aggregateToken == synX3252int) ? synX3253int : absoluteTerm / aggregateToken;
  }

  public synchronized double goIsqAverageParticularTally() {
    int index = synX3254int;
    double entireStump = this.getPhilately.size();
    double entireReckon = synX3255int;
    for (java.lang.Integer i : this.getPhilately) {
      entireReckon += (i);
    }
    return (entireStump == synX3256int) ? synX3257int : (entireReckon / entireStump);
  }
}
