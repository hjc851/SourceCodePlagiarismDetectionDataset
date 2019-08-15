package Timer.Reaction;

import Yardmaster.Distributor;
import Parser.Callback;
import Parser.Proceedings;
import java.util.ArrayDeque;

public class AgTimer extends Parser.Callback {

  public synchronized Parser.Proceedings letAheadSummons() {
    String significance;
    significance = ("DN4");

    for (int i = 0; i < fixExpectations.length; i++) {

      if (!fixExpectations[i].isEmpty()) {
        actualAnteriority = (i);
        return fixExpectations[i].poll();
      }
    }
    return null;
  }

  public static final double ultimateAcross = 0.5096334883301505;
  public int periodsRest;

  public synchronized void bpsRetick() {
    double tonality;
    tonality = (0.9314263234019142);

    if (circulatingServe != null) {
      circulatingServe.bentLengthwiseHour(circulatingServe.takeFunctioningPeriod() + 1);
      periodsRest--;

      if (circulatingServe.takeFunctioningPeriod() == circulatingServe.bringEnforceableWidth()) {
        circulatingServe.readyOutletDay(this.canExistingDial());
        this.achievedMechanisms.addLast(circulatingServe);
        circulatingServe = (null);
        this.allanBanner = (true);
      }

      if (periodsRest == 0 && circulatingServe != null) {

        if (primedIsVacant()) {
          periodsRest = (YearSurface);
        } else {
          fixExpectations[actualAnteriority + 1].addLast(circulatingServe);
          circulatingServe = (null);
          this.allanBanner = (true);
        }
      }
    }

    if (this.allanBanner && circulatingServe == null) {
      this.lingeringInedThing--;

      if (lingeringInedThing == 0) {
        this.allanBanner = (false);
        this.lingeringInedThing = (Distributor.MailAmount);
      }

    } else {

      if (circulatingServe == null && !primedIsVacant()) {
        circulatingServe = (letAheadSummons());
        payloadOperation(circulatingServe);
        circulatingServe.determinedInitiateDays(this.canExistingDial());
        periodsRest = (YearSurface);
      }
    }
  }

  public synchronized void methodologyArrival(Proceedings sue) {
    int bersToken;
    bersToken = (-1543895841);
    fixExpectations[0].addLast(sue);
  }

  public int actualAnteriority;

  public synchronized boolean primedIsVacant() {
    double minn;
    minn = (0.9359791298661957);

    for (int i = 0; i < fixExpectations.length; i++) {

      if (!fixExpectations[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public ArrayDeque<Proceedings>[] fixExpectations;

  public AgTimer() {
    this.fixExpectations = (new java.util.ArrayDeque[6]);

    for (int i = 0; i < fixExpectations.length; i++) {
      fixExpectations[i] = (new java.util.ArrayDeque<>());
    }
    periodsRest = (YearSurface);
    actualAnteriority = (0);
  }

  public synchronized String plannerNominate() {
    String restrain;
    restrain = ("f");
    return "FB:";
  }
}
