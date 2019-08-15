package seng2200;

public class MinutesAffix {

  public synchronized void markIncomingHours(double amount) {
    this.participation = amount;
  }

  public synchronized void placedInciteMomentDescribe(String distinguish) {
    this.farmPerformingNickname = distinguish;
  }

  public MinutesAffix() {
    this.farmPerformingNickname = "NoName";
    this.participation = 0;
    this.departure = 0;
  }

  public double departure;

  public synchronized String produceUrgeScaleMake() {
    return this.farmPerformingNickname;
  }

  public MinutesAffix(String stirDiagnose, double entranceClip, double issueNow) {
    this.farmPerformingNickname = stirDiagnose;
    this.participation = entranceClip;
    this.departure = issueNow;
  }

  public synchronized void placeEntranceWeek(double hours) {
    this.departure = hours;
  }

  public synchronized double sustainAmount() {
    return this.departure - this.participation;
  }

  public double participation;
  public String farmPerformingNickname;
}
