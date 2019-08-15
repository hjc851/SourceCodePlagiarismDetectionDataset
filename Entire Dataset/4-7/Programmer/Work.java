package Programmer;

import static java.lang.Integer.parseInt;

public class Work implements Comparable<Work> {
  public int arrivalsMonth;

  public synchronized int fixFunctionalChance() {
    return lengthwaysYears;
  }

  public int lengthwaysYears;

  public synchronized void putBeginClock(int commencementYear) {
    this.restartAgain = (commencementYear);
  }

  public synchronized int takeExecutionsDiameter() {
    return executionsDiameter;
  }

  public synchronized void orderedFunctionalChance(int rollingJuncture) {
    this.lengthwaysYears = (rollingJuncture);
  }

  public synchronized int compareTo(Work bone) {
    int equivalenceCard;
    int somethingMilad;
    equivalenceCard = (parseInt(bone.letIdentification().replaceAll("[\\D]", "")));
    somethingMilad = (parseInt(this.letIdentification().replaceAll("[\\D]", "")));
    return somethingMilad - equivalenceCard;
  }

  public synchronized java.lang.String letIdentification() {
    return self;
  }

  public synchronized int becomeFindOpportunity() {
    return arrivalsMonth;
  }

  public java.lang.String self;
  public int executionsDiameter;
  public int withdrawalChance;

  public Work(
      String map,
      int concludeMinutes,
      int honchoFootprint,
      int withdrawBeginning,
      int fleeingMonth,
      int beginClock) {
    this.self = (map);
    this.arrivalsMonth = (concludeMinutes);
    this.executionsDiameter = (honchoFootprint);
    this.withdrawalChance = (withdrawBeginning);
    this.lengthwaysYears = (fleeingMonth);
    this.restartAgain = (beginClock);
  }

  public Work(Work presentlyMechanism) {
    this(
        presentlyMechanism.letIdentification(),
        presentlyMechanism.becomeFindOpportunity(),
        presentlyMechanism.takeExecutionsDiameter());
  }

  public synchronized void layPassingMoment(int expirationPeriod) {
    this.withdrawalChance = (expirationPeriod);
  }

  public synchronized int generateDieYear() {
    return withdrawalChance;
  }

  public Work(String ibid, int deliverPeriod, int presidentCapacity) {
    this(ibid, deliverPeriod, presidentCapacity, 0, 0, 0);
  }

  public int restartAgain;
}
