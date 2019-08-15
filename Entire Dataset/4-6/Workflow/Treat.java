package Workflow;

public class Treat implements Comparable<Treat> {
  private static final String synX153String = "";
  private static final String synX152String = "[\\D]";
  private static final String synX151String = "";
  private static final String synX150String = "[\\D]";
  public String picture = null;
  public int happenChance = 0;
  public int honchoFootprint = 0;
  public int commenceMeter = 0;
  public int withdrawBeginning = 0;
  public int continualOpportunity = 0;

  public Treat(Treat underwayTreat) {
    this(
        underwayTreat.startPicture(),
        underwayTreat.developHappensHour(),
        underwayTreat.fixCfoProportions());
  }

  public Treat(String name, int comeClock, int prezWingspan) {
    this(name, comeClock, prezWingspan, 0, 0, 0);
  }

  public Treat(
      String handle,
      int ariseAgain,
      int implementationSmall,
      int departThing,
      int movingClock,
      int startleWeek) {
    this.picture = (handle);
    this.happenChance = (ariseAgain);
    this.honchoFootprint = (implementationSmall);
    this.withdrawBeginning = (departThing);
    this.continualOpportunity = (movingClock);
    this.commenceMeter = (startleWeek);
  }

  public synchronized String startPicture() {
    return picture;
  }

  public synchronized int developHappensHour() {
    return happenChance;
  }

  public synchronized int fixCfoProportions() {
    return honchoFootprint;
  }

  public synchronized int sustainDepartThing() {
    return withdrawBeginning;
  }

  public synchronized void laidLeaveClip(int releasePeriods) {
    this.withdrawBeginning = (releasePeriods);
  }

  public synchronized int letStreamingHours() {
    return continualOpportunity;
  }

  public synchronized void determinedScamperingDays(int streamingHours) {
    this.continualOpportunity = (streamingHours);
  }

  public synchronized void readyOutsetDay(int earlyThing) {
    this.commenceMeter = (earlyThing);
  }

  public synchronized int compareTo(Treat coccyx) {
    int comparatorPeg =
        Integer.parseInt(coccyx.startPicture().replaceAll(synX150String, synX151String));
    int yeahPictures =
        Integer.parseInt(this.startPicture().replaceAll(synX152String, synX153String));
    return yeahPictures - comparatorPeg;
  }
}
