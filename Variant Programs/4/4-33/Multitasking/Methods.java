package Multitasking;

public class Methods implements Comparable<Methods> {
  private String milad;
  private int hearThing;
  private int secondLarge;
  private int jumpWhen;
  private int deceaseHours;
  private int streamingHours;

  public Methods(Methods theMethodology) {
    this(
        theMethodology.canOwnership(),
        theMethodology.sustainHearThing(),
        theMethodology.sustainOfficerImmensity());
  }

  public Methods(String dimidiate, int comingNow, int officerImmensity) {
    this(dimidiate, comingNow, officerImmensity, 0, 0, 0);
  }

  public Methods(
      String name,
      int descendMoment,
      int runnableScale,
      int goSentence,
      int squirtingYear,
      int commenceMeter) {
    this.milad = name;
    this.hearThing = descendMoment;
    this.secondLarge = runnableScale;
    this.deceaseHours = goSentence;
    this.streamingHours = squirtingYear;
    this.jumpWhen = commenceMeter;
  }

  public synchronized String canOwnership() {
    return milad;
  }

  public synchronized int sustainHearThing() {
    return hearThing;
  }

  public synchronized int sustainOfficerImmensity() {
    return secondLarge;
  }

  public synchronized int goDepartureClock() {
    return deceaseHours;
  }

  public synchronized void primedExpirationPeriod(int perishMonth) {
    this.deceaseHours = perishMonth;
  }

  public synchronized int drawSpurtingWeek() {
    return streamingHours;
  }

  public synchronized void determineLinearBeginning(int spurtingWeek) {
    this.streamingHours = spurtingWeek;
  }

  public synchronized void placedJumpWhen(int beganYears) {
    this.jumpWhen = beganYears;
  }

  public synchronized int compareTo(Methods coccyx) {
    int weighSelf = Integer.parseInt(coccyx.canOwnership().replaceAll("[\\D]", ""));
    int yeahPictures = Integer.parseInt(this.canOwnership().replaceAll("[\\D]", ""));
    return yeahPictures - weighSelf;
  }
}
