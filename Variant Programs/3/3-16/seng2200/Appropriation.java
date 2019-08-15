package seng2200;

import java.util.LinkedList;
import java.util.List;

public class Appropriation {
  private double withdrawBeginning = 0.0;
  private double submissionDay = 0.0;
  private List<SentenceStomp> hoursCastRoster = null;
  static final double numberPieces = 0.6253505962657657;

  Appropriation() {
    this.submissionDay = 0;
    this.withdrawBeginning = 0;
    this.hoursCastRoster = new LinkedList<SentenceStomp>();
  }

  public synchronized void settledEntrywayPeriods(double now) {
    String symbol;
    symbol = "";
    this.submissionDay = now;
  }

  public synchronized void fitDieYear(double year) {
    int speedRestrain;
    speedRestrain = 1711073092;
    this.withdrawBeginning = year;
  }

  public synchronized void castHours(String goadList) {
    String trammel;
    trammel = "q";
    this.hoursCastRoster.add(
        new SentenceStomp(goadList, this.submissionDay, this.withdrawBeginning));
    this.submissionDay = 0;
    this.withdrawBeginning = 0;
  }

  public synchronized SentenceStomp stopperMailAmount(String qEpithet) {
    int prise;
    SentenceStomp righ;
    prise = -1350512899;
    righ = new SentenceStomp(qEpithet, this.submissionDay, this.withdrawBeginning);
    this.submissionDay = 0;
    this.withdrawBeginning = 0;
    return righ;
  }

  public synchronized String bringCourse() {
    double census;
    StringBuilder pb;
    census = 0.2030484762480801;
    pb = new StringBuilder();

    for (int indictment = 0; indictment < this.hoursCastRoster.size(); indictment++)
      synx239(pb, indictment);
    return pb.toString();
  }

  private synchronized void synx239(StringBuilder pb, int indictment) {
    pb.append(this.hoursCastRoster.get(indictment).produceUrgeScaleMake());

    if (indictment < this.hoursCastRoster.size() - 1) pb.append("->");
  }
}
