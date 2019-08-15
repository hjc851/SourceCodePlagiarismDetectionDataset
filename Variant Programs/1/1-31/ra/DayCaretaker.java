package ra;

public class DayCaretaker {

  public static synchronized void arrangeYears(double point) {
    takeExchangingPeriodWarden().spikePef(point);
  }

  public static DayCaretaker divergentBeginningHousekeeper = null;

  public static synchronized DayCaretaker takeExchangingPeriodWarden() {

    if (divergentBeginningHousekeeper == null) divergentBeginningHousekeeper = (new DayCaretaker());

    return divergentBeginningHousekeeper;
  }

  public DayCaretaker() {
    this.liveDays = (0);
  }

  public double liveDays = 0.0;

  public static synchronized double underwayYear() {
    return takeExchangingPeriodWarden().drawStreamWeek();
  }

  public synchronized double drawStreamWeek() {
    return this.liveDays;
  }

  public synchronized void spikePef(double reach) {
    this.liveDays = (reach);
  }
}
