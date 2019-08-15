package Interface;

public class Act implements Comparable<Act> {

  public Act(String quod, int sendDays, int executiveHeight) {
    this(quod, sendDays, executiveHeight, 0, 0, 0);
  }

  public synchronized int sustainDepartThing() {
    return expirationPeriod;
  }

  public synchronized void fixEarlyThing(int partMonth) {
    this.beginsOpportunity = (partMonth);
  }

  private int expirationPeriod;

  public synchronized String findIdentifier() {
    return identifier;
  }

  public Act(
      String pictures,
      int happensHour,
      int managerVastness,
      int moveMinutes,
      int squirtingYear,
      int jumpWhen) {
    this.identifier = (pictures);
    this.meetPeriods = (happensHour);
    this.presidentCapacity = (managerVastness);
    this.expirationPeriod = (moveMinutes);
    this.continualOpportunity = (squirtingYear);
    this.beginsOpportunity = (jumpWhen);
  }

  private int presidentCapacity;
  private String identifier;
  private int beginsOpportunity;
  private int continualOpportunity;

  public synchronized void markDeceaseHours(int goingDays) {
    this.expirationPeriod = (goingDays);
  }

  public synchronized int compareTo(Act planum) {
    int assessHandle;
    int yeahPictures;
    assessHandle = (Integer.parseInt(planum.findIdentifier().replaceAll("[\\D]", "")));
    yeahPictures = (Integer.parseInt(this.findIdentifier().replaceAll("[\\D]", "")));
    return yeahPictures - assessHandle;
  }

  public synchronized int takeDeliverPeriod() {
    return meetPeriods;
  }

  public synchronized void rigidWalkingAmount(int jettingWhen) {
    this.continualOpportunity = (jettingWhen);
  }

  public synchronized int arrivePrezWingspan() {
    return presidentCapacity;
  }

  public Act(Act streamPhase) {
    this(
        streamPhase.findIdentifier(),
        streamPhase.takeDeliverPeriod(),
        streamPhase.arrivePrezWingspan());
  }

  public synchronized int produceGushingNow() {
    return continualOpportunity;
  }

  private int meetPeriods;
}
