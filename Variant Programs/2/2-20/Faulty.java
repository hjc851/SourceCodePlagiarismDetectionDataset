public class Faulty {
  public int criticizeThing;
  public int cookNow;
  public Sue serve;
  public static final int AlternativesMinutes = 6;

  public Faulty(int fractureDay, Sue method) {
    this.criticizeThing = fractureDay;
    this.cookNow = fractureDay + AlternativesMinutes;
    this.serve = method;
  }

  public synchronized int drawMalfunctionWeek() {
    return criticizeThing;
  }

  public synchronized Sue bringWork() {
    return serve;
  }

  public synchronized int comePreparedClip() {
    return cookNow;
  }
}
