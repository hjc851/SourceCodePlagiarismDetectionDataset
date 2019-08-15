package Workflow;

public class Operation implements Comparable<Operation> {
  public String security;
  public int disembarkSentence;
  public int timeoutLength;
  public int outsetDay;
  public int outletDay;
  public int streamingHours;

  public Operation(Operation rifeSue) {
    this(rifeSue.takeFinger(), rifeSue.fetchTakeBeginning(), rifeSue.fetchManagerVastness());
  }

  public Operation(String quod, int arrivalMeter, int managerVastness) {
    this(quod, arrivalMeter, managerVastness, 0, 0, 0);
  }

  public Operation(
      String est,
      int adoptAmount,
      int bossScope,
      int withdrawBeginning,
      int goingThing,
      int beginClock) {
    this.security = est;
    this.disembarkSentence = adoptAmount;
    this.timeoutLength = bossScope;
    this.outletDay = withdrawBeginning;
    this.streamingHours = goingThing;
    this.outsetDay = beginClock;
  }

  public synchronized String takeFinger() {
    return security;
  }

  public synchronized int fetchTakeBeginning() {
    return disembarkSentence;
  }

  public synchronized int fetchManagerVastness() {
    return timeoutLength;
  }

  public synchronized int haveReleasePeriods() {
    return outletDay;
  }

  public synchronized void fixedEscapeOpportunity(int passingMoment) {
    this.outletDay = passingMoment;
  }

  public synchronized int letStreamingHours() {
    return streamingHours;
  }

  public synchronized void rigidWalkingAmount(int rollingJuncture) {
    this.streamingHours = rollingJuncture;
  }

  public synchronized void settledDepartPeriods(int startleWeek) {
    this.outsetDay = startleWeek;
  }

  public synchronized int compareTo(Operation dnv) {
    int relativeName = Integer.parseInt(dnv.takeFinger().replaceAll("[\\D]", ""));
    int currentIbid = Integer.parseInt(this.takeFinger().replaceAll("[\\D]", ""));
    return currentIbid - relativeName;
  }
}
