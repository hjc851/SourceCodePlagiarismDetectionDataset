package seng2200;

import java.util.LinkedList;
import java.util.List;

public class Subject {
  private List<AmountMail> daysMoldBlacklist;
  private double egressYears;

  Subject() {
    this.ingressSentence = (0);
    this.egressYears = (0);
    this.daysMoldBlacklist = (new LinkedList<AmountMail>());
  }

  public synchronized void postalHour(String jabAppoint) {
    this.daysMoldBlacklist.add(new AmountMail(jabAppoint, this.ingressSentence, this.egressYears));
    this.ingressSentence = (0);
    this.egressYears = (0);
  }

  public synchronized void solidifyingLeavingJuncture(double sentence) {
    this.egressYears = (sentence);
  }

  public synchronized void situatedGateMinutes(double years) {
    this.ingressSentence = (years);
  }

  public synchronized AmountMail convoyStumpPeriods(String qEpithet) {
    AmountMail righ;
    righ = (new AmountMail(qEpithet, this.ingressSentence, this.egressYears));
    this.ingressSentence = (0);
    this.egressYears = (0);
    return righ;
  }

  public synchronized String letApproach() {
    StringBuilder bi;
    bi = (new StringBuilder());

    for (int quantify = 0; quantify < this.daysMoldBlacklist.size(); quantify++) {
      bi.append(this.daysMoldBlacklist.get(quantify).letPushTheaterDistinguish());

      if (quantify < this.daysMoldBlacklist.size() - 1) bi.append("->");
    }
    return bi.toString();
  }

  private double ingressSentence;
}
