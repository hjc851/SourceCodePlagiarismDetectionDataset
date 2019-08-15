package seng2200;

import java.util.Random;
import java.util.List;
import java.util.LinkedList;

public abstract class ProcessingScale {
  public Aspect proceedingIssue = null;
  public double spiteful = 0.0;
  public double swan = 0.0;
  public Random r = null;
  public List<Federal> happenings = null;
  public Federal existingSovereign = null;
  public double previousClock = 0.0;
  public String farmNickname = null;
  public int somethingNumeration = 0;
  public List<ProcessingScale> larboardUrging = null;
  public List<ProcessingScale> correctNudge = null;
  public Database occupationsSpinnaker = null;

  public abstract double serveConsignment(double prevalentNow);

  public abstract void completingComponent(double presentlyMinutes);

  public ProcessingScale() {
    this.spiteful = (0);
    this.swan = (0);
    this.proceedingIssue = (null);
    this.r = (new Random());
    this.happenings = (new LinkedList<Federal>());
    this.existingSovereign = (new DepriveSay());
    this.previousClock = (0);
    this.farmNickname = ("");
    this.somethingNumeration = (0);
    this.occupationsSpinnaker = (null);
    this.larboardUrging = (new LinkedList<ProcessingScale>());
    this.correctNudge = (new LinkedList<ProcessingScale>());
  }

  public ProcessingScale(String inciteDescribe, double ungenerous, double drift, Database ushant) {
    this.spiteful = (ungenerous);
    this.swan = (drift);
    this.proceedingIssue = (null);
    this.r = (new Random());
    this.happenings = (new LinkedList<Federal>());
    this.existingSovereign = (new DepriveSay());
    this.previousClock = (0);
    this.farmNickname = (inciteDescribe);
    this.somethingNumeration = (0);
    this.occupationsSpinnaker = (ushant);
    this.larboardUrging = (new LinkedList<ProcessingScale>());
    this.correctNudge = (new LinkedList<ProcessingScale>());
  }

  public synchronized double computedPushMaximum() {
    return spiteful + (swan * (r.nextDouble() - 0.5));
  }

  public synchronized int beatPercentagePartsInstituted() {
    return this.somethingNumeration;
  }

  public synchronized String generateJabAppoint() {
    return this.farmNickname;
  }

  public synchronized String drawSate() {
    return this.existingSovereign.toString();
  }

  public synchronized double produceAddNowVenture() {
    double tot = 0;
    for (Federal fh : this.happenings) {
      tot += (fh.becomeHours());
    }
    return tot;
  }

  public synchronized void aveSubmitTough(double actualSentence) {

    if (this.existingSovereign instanceof DepriveSay) synx71(actualSentence);
    else if (this.existingSovereign instanceof LugCentral) synx72(actualSentence);
    else synx73(actualSentence);
    this.previousClock = (actualSentence);
  }

  public synchronized void fitNighJab(ProcessingScale exited) {
    this.larboardUrging.add(exited);
  }

  public synchronized void arrangePerpendicularNeedle(ProcessingScale appropriate) {
    this.correctNudge.add(appropriate);
  }

  public synchronized void tellExitedNeedle(double newChance) {
    for (ProcessingScale s : this.larboardUrging) synx74(s, newChance);
  }

  public synchronized void discloseExactIncite(double contemporaryMoment) {
    for (ProcessingScale s : this.correctNudge) synx75(s, contemporaryMoment);
  }

  public synchronized double generateRostrumAbsolutePrevented() {
    double amountLasted = 0;
    double paralyzedTime = 0;
    for (Federal s : this.happenings) {
      amountLasted += (s.becomeHours());

      if (s instanceof LugCentral) {
        paralyzedTime += (s.becomeHours());
      }
    }
    return paralyzedTime;
  }

  public synchronized double makeDegreeMedManufacturing() {
    double numberDuring = 0;
    double fussyContinuance = 0;
    for (Federal s : this.happenings) {
      numberDuring += (s.becomeHours());

      if (s instanceof CongestedCanton) {
        fussyContinuance += (s.becomeHours());
      }
    }
    return (numberDuring == 0) ? 0 : (fussyContinuance / numberDuring) * 100;
  }

  public synchronized double catchMomentFullStrangle() {
    double addRemainder = 0;
    double consumeLongevity = 0;
    for (Federal s : this.happenings) {
      addRemainder += (s.becomeHours());

      if (s instanceof DepriveSay) {
        consumeLongevity += (s.becomeHours());
      }
    }
    return consumeLongevity;
  }

  private synchronized void synx71(double actualSentence) {
    this.happenings.add(new DepriveSay(actualSentence - this.previousClock));
  }

  private synchronized void synx72(double actualSentence) {
    this.happenings.add(new LugCentral(actualSentence - this.previousClock));
  }

  private synchronized void synx73(double actualSentence) {
    this.happenings.add(new CongestedCanton(actualSentence - this.previousClock));
  }

  private synchronized void synx74(ProcessingScale s, double newChance) {
    s.serveConsignment(newChance);
  }

  private synchronized void synx75(ProcessingScale s, double contemporaryMoment) {
    s.serveConsignment(contemporaryMoment);
  }
}
