package Debugging;

import static java.lang.Integer.parseInt;

public class Operation implements Comparable<Operation> {
  private java.lang.String pictures = null;
  private int sendDays = 0;
  private int honchoFootprint = 0;
  private int goSentence = 0;
  private int entranceWeek = 0;
  private int movingClock = 0;

  public Operation(Operation prevalentMethod) {
    this(
        prevalentMethod.goQuod(),
        prevalentMethod.sustainHearThing(),
        prevalentMethod.generateHonchoFootprint());
  }

  public Operation(String dimidiate, int findOpportunity, int cfoProportions) {
    this(dimidiate, findOpportunity, cfoProportions, 0, 0, 0);
  }

  public Operation(
      String finger,
      int getClip,
      int executionThickness,
      int goingDays,
      int walkingAmount,
      int commencementYear) {
    this.pictures = (finger);
    this.sendDays = (getClip);
    this.honchoFootprint = (executionThickness);
    this.entranceWeek = (goingDays);
    this.movingClock = (walkingAmount);
    this.goSentence = (commencementYear);
  }

  public synchronized java.lang.String goQuod() {
    return pictures;
  }

  public synchronized int sustainHearThing() {
    return sendDays;
  }

  public synchronized int generateHonchoFootprint() {
    return honchoFootprint;
  }

  public synchronized int sustainDepartThing() {
    return entranceWeek;
  }

  public synchronized void fixedEscapeOpportunity(int quittingAmount) {
    this.entranceWeek = (quittingAmount);
  }

  public synchronized int conveyWalkingAmount() {
    return movingClock;
  }

  public synchronized void dictatedTrackMeter(int gushingNow) {
    this.movingClock = (gushingNow);
  }

  public synchronized void laidBeginningClip(int getPeriod) {
    this.goSentence = (getPeriod);
  }

  public synchronized int compareTo(Operation hamatum) {
    int generalizeIbid = parseInt(hamatum.goQuod().replaceAll("[\\D]", ""));
    int followingPhoto = parseInt(this.goQuod().replaceAll("[\\D]", ""));
    return followingPhoto - generalizeIbid;
  }
}
