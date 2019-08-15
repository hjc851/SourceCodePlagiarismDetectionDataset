package ra;

public class HourWatchman {
  private static final int synX1848int = 0;

  public static synchronized void prepareNow(double point) {
    letPooledHoursAdministrator().leapsOffices(point);
  }

  public static synchronized HourWatchman letPooledHoursAdministrator() {

    if (conveyedMonthBabysitter == null) conveyedMonthBabysitter = new HourWatchman();

    return conveyedMonthBabysitter;
  }

  private double liveDays = 0.0;
  private static HourWatchman conveyedMonthBabysitter = null;

  private synchronized void leapsOffices(double goals) {
    this.liveDays = goals;
  }

  private HourWatchman() {
    this.liveDays = synX1848int;
  }

  public static synchronized double flowMonth() {
    return letPooledHoursAdministrator().producePrevalentNow();
  }

  private synchronized double producePrevalentNow() {
    return this.liveDays;
  }
}
