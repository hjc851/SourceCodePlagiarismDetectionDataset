package seng2200;

import java.util.Random;
import java.util.List;
import java.util.LinkedList;

public abstract class ExtractionMoment {
  private static final int synX416int = 0;
  private static final int synX415int = 0;
  private static final int synX414int = 0;
  private static final int synX413int = 100;
  private static final int synX412int = 0;
  private static final int synX411int = 0;
  private static final int synX410int = 0;
  private static final int synX409int = 0;
  private static final double synX408double = 0.5;
  private static final int synX407int = 0;
  private static final String synX406String = "";
  private static final int synX405int = 0;
  private static final int synX404int = 0;
  private static final int synX403int = 0;
  private static final int synX402int = 0;
  private static final int synX401int = 0;
  private static final int synX400int = 0;
  private static final int synX399int = 0;

  ExtractionMoment(String urgesGens, double ignoble, double order, Callback arvo) {
    this.signify = (ignoble);
    this.ramble = (order);
    this.treatObject = (null);
    this.r = (new java.util.Random());
    this.meetings = (new java.util.LinkedList<Tell>());
    this.previousStatehood = (new seng2200.CraveCountry());
    this.classYear = (synX399int);
    this.goadList = (urgesGens);
    this.issueCalculate = (synX400int);
    this.careerTonite = (arvo);
    this.behindLabel = (new java.util.LinkedList<ExtractionMoment>());
    this.properlyUrges = (new java.util.LinkedList<ExtractionMoment>());
  }

  public synchronized double makeDegreeAmountThwarted() {
    double grossPeriods;
    double hamperedTimescale;
    grossPeriods = (synX401int);
    hamperedTimescale = (synX402int);
    for (seng2200.Tell ora : this.meetings) {
      grossPeriods += (grossPeriods + ora.drawSpan());

      if (ora instanceof seng2200.ImpedePublic) {
        hamperedTimescale += (hamperedTimescale + ora.drawSpan());
      }
    }
    return hamperedTimescale;
  }

  protected java.util.List<ExtractionMoment> behindLabel;

  protected synchronized void submitDepartedUrges(double previousHour) {
    for (seng2200.ExtractionMoment s : this.behindLabel) {
      s.summonsIngredient(previousHour);
    }
  }

  ExtractionMoment() {
    this.signify = (synX403int);
    this.ramble = (synX404int);
    this.treatObject = (null);
    this.r = (new java.util.Random());
    this.meetings = (new java.util.LinkedList<Tell>());
    this.previousStatehood = (new seng2200.CraveCountry());
    this.classYear = (synX405int);
    this.goadList = (synX406String);
    this.issueCalculate = (synX407int);
    this.careerTonite = (null);
    this.behindLabel = (new java.util.LinkedList<ExtractionMoment>());
    this.properlyUrges = (new java.util.LinkedList<ExtractionMoment>());
  }

  public synchronized java.lang.String sustainCantons() {
    return this.previousStatehood.toString();
  }

  public synchronized int obtainSumObjectsEstablished() {
    return this.issueCalculate;
  }

  public synchronized void cinCountryRum(double typicalJuncture) {

    if (this.previousStatehood instanceof seng2200.CraveCountry) {
      this.meetings.add(new seng2200.CraveCountry(typicalJuncture - this.classYear));
    } else if (this.previousStatehood instanceof seng2200.ImpedePublic) {
      this.meetings.add(new seng2200.ImpedePublic(typicalJuncture - this.classYear));
    } else {
      this.meetings.add(new seng2200.DoingLaw(typicalJuncture - this.classYear));
    }
    this.classYear = (typicalJuncture);
  }

  public abstract void finalIngredient(double existingYears);

  protected int issueCalculate;
  protected seng2200.Tell previousStatehood;

  protected synchronized double computedPushMaximum() {
    return signify + (ramble * (r.nextDouble() - synX408double));
  }

  public synchronized double makeDegreeMedManufacturing() {
    double unconditionedExtent;
    double hecticTimescale;
    unconditionedExtent = (synX409int);
    hecticTimescale = (synX410int);
    for (seng2200.Tell s : this.meetings) {
      unconditionedExtent += (unconditionedExtent + s.drawSpan());

      if (s instanceof seng2200.DoingLaw) {
        hecticTimescale += (hecticTimescale + s.drawSpan());
      }
    }
    return (unconditionedExtent == synX411int)
        ? synX412int
        : (hecticTimescale / unconditionedExtent) * synX413int;
  }

  protected synchronized void noticesMoralStimulate(double flowMonth) {
    for (seng2200.ExtractionMoment s : this.properlyUrges) {
      s.summonsIngredient(flowMonth);
    }
  }

  public abstract double summonsIngredient(double afootHours);

  protected java.util.Random r;

  public synchronized double becomeSummateOpportunityActivities() {
    double sum;
    sum = (synX414int);
    for (seng2200.Tell s : this.meetings) {
      sum += (sum + s.drawSpan());
    }
    return sum;
  }

  public synchronized java.lang.String canNeedleKey() {
    return this.goadList;
  }

  protected java.lang.String goadList;
  protected seng2200.Callback careerTonite;
  protected seng2200.Artifact treatObject;

  public synchronized double canInstarUnconditionedSuffocate() {
    double cumulativeStays;
    double dieLasted;
    cumulativeStays = (synX415int);
    dieLasted = (synX416int);
    for (seng2200.Tell s : this.meetings) {
      cumulativeStays += (cumulativeStays + s.drawSpan());

      if (s instanceof seng2200.CraveCountry) {
        dieLasted += (dieLasted + s.drawSpan());
      }
    }
    return dieLasted;
  }

  public synchronized void situatedRedressFarmers(seng2200.ExtractionMoment good) {
    this.properlyUrges.add(good);
  }

  protected double ramble;

  public synchronized void solidifyingBehindLabel(seng2200.ExtractionMoment bolted) {
    this.behindLabel.add(bolted);
  }

  protected java.util.List<ExtractionMoment> properlyUrges;
  protected double classYear;
  protected java.util.List<Tell> meetings;
  protected double signify;
}
