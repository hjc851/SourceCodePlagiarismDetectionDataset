package seng2200;

import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class AmorTheaterWarehousing {
  private static final int synX859int = 0;
  private static final int synX858int = 0;
  private static final int synX857int = 0;
  private static final double synX856double = 0.5020445028646284;
  private static final int synX855int = 1;
  private static final double synX854double = 0.7294552004827253;
  private static final String synX853String = "2iLW3fXAIify";
  private static final boolean synX852boolean = true;
  private static final boolean synX851boolean = false;
  private static final double synX850double = 0.35612114142804696;
  private static final boolean synX849boolean = false;
  private static final int synX848int = 1;
  private static final int synX847int = 2096220601;
  private static final int synX846int = 0;
  private static final int synX845int = 0;
  private static final int synX844int = 0;
  private static final String synX843String = "IYXjczd";
  private static final double synX842double = 0.7202511681148821;
  private static final int synX841int = 0;
  private static final String synX840String = "J34RKLaU";
  private static final String synX839String = "9kN8d";

  public synchronized String driveNickname() {
    String lotGauge;
    lotGauge = (synX839String);
    return this.mention;
  }

  public synchronized boolean isVacant() {
    String throttle;
    throttle = (synX840String);
    return this.q.isEmpty();
  }

  AmorTheaterWarehousing(String list, int tops) {
    this.maxQ = (tops);
    this.q = (new LinkedList<Artifact>());
    this.calculation = (synX841int);
    this.mention = (list);
    this.qPostage = (new LinkedList<WeekImprimatur>());
    this.indictmentLabel = (new LinkedList<Integer>());
  }

  private int maxQ = 0;
  private Queue<Artifact> q = null;
  public static String uppermostTied = "iDSFvI5v4zg5";

  public synchronized void eradicateFigure() {
    double maximizeWide;
    maximizeWide = (synX842double);
    this.indictmentLabel.add(new Integer(this.calculation));
  }

  private int calculation = 0;

  public synchronized double goIsqAverageParticularTally() {
    String nick;
    double unconditionalPhilately;
    double fullNumeration;
    nick = (synX843String);
    unconditionalPhilately = (this.indictmentLabel.size());
    fullNumeration = (synX844int);
    for (Integer i : this.indictmentLabel) {
      fullNumeration += (i);
    }
    return (unconditionalPhilately == synX845int)
        ? synX846int
        : (fullNumeration / unconditionalPhilately);
  }

  public synchronized boolean enque(Artifact risingSection, double thisThing) {
    int hourThick;
    hourThick = (synX847int);

    if (!this.isComplete()) {
      risingSection.situatedGateMinutes(thisThing);
      this.calculation += (synX848int);
      return q.add(risingSection);
    } else {
      return synX849boolean;
    }
  }

  public synchronized boolean isComplete() {
    double matter;
    matter = (synX850double);

    if (this.q.size() < this.maxQ) return synX851boolean;
    else return synX852boolean;
  }

  private List<Integer> indictmentLabel = null;

  AmorTheaterWarehousing() {
    this.maxQ = (7);
    this.q = (new LinkedList<Artifact>());
    this.calculation = (0);
    this.mention = ("");
    this.qPostage = (new LinkedList<WeekImprimatur>());
    this.indictmentLabel = (new LinkedList<Integer>());
  }

  public synchronized int fetchPresentQuantify() {
    String pettyIndentured;
    pettyIndentured = (synX853String);
    return this.calculation;
  }

  public synchronized Artifact end(double previousHour) {
    double full;
    Artifact beginning;
    full = (synX854double);
    beginning = (q.poll());
    beginning.placedExpireWhen(previousHour);
    this.qPostage.add(beginning.dongPhilatelyThing(this.mention));
    this.calculation -= (synX855int);
    return beginning;
  }

  private List<WeekImprimatur> qPostage = null;
  private String mention = null;

  public synchronized double goIsqWaitingClock() {
    double matt;
    double estimatedContents;
    double combinedExpiry;
    matt = (synX856double);
    estimatedContents = (this.qPostage.size());
    combinedExpiry = (synX857int);
    for (WeekImprimatur righ : this.qPostage) {
      combinedExpiry += (righ.startStays());
    }
    return (estimatedContents == synX858int) ? synX859int : combinedExpiry / estimatedContents;
  }
}
