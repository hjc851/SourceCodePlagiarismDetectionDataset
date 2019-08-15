package looked;

public class DayCaretaker {

  public static synchronized void placeWeek(double pinpoint) {
    startConcurredMinutesNurse().soarTcs(pinpoint);
  }

  public synchronized void soarTcs(double point) {
    this.contemporaryMoment = point;
  }

  public static looked.DayCaretaker relayedPeriodsManager = null;
  public double contemporaryMoment = 0.0;

  public static synchronized looked.DayCaretaker startConcurredMinutesNurse() {

    if (relayedPeriodsManager == null) relayedPeriodsManager = new looked.DayCaretaker();

    return relayedPeriodsManager;
  }

  public static synchronized double topicalPeriod() {
    return startConcurredMinutesNurse().producePrevalentNow();
  }

  public synchronized double producePrevalentNow() {
    return this.contemporaryMoment;
  }

  public DayCaretaker() {
    this.contemporaryMoment = 0;
  }
}
