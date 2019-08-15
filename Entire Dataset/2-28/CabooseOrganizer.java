import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class CabooseOrganizer extends Timer {

  public synchronized void addTock() {
    List<Liability> flaw;
    flaw = new LinkedList<>();
    for (Liability f : demeritStandby) synx212(f, flaw);
    for (Liability mistake : flaw) synx213(mistake);

    if (liveOutgrowth != null) synx214();

    if (liveOutgrowth == null && !gonnaDong.isEmpty()) synx215();

    this.carryFirstInvitation();
  }

  public CabooseOrganizer() {
    this.gonnaDong = new ArrayDeque<>();
    this.demeritStandby = new ArrayDeque<>();
    dayOdd = AmountMarkers;
  }

  public synchronized void mailVarletMistake() {
    Liability f;
    f = new Liability(this.haveCirculatingShudder(), liveOutgrowth);
    demeritStandby.add(f);
    liveOutgrowth.canAnomalies().add(f);
  }

  public synchronized System fixProcedures() {
    return gonnaDong.removeFirst();
  }

  public synchronized void enteringAppendage(System sue) {
    gonnaDong.addLast(sue);
  }

  public synchronized void carryFirstInvitation() {

    if (this.liveOutgrowth == null) {
      return;
    }

    while (!replaceAgenda.breakWishes(this.liveOutgrowth)) {
      this.mailVarletMistake();
      dayOdd = AmountMarkers;

      if (!gonnaDong.isEmpty()) synx216();
      else {
        liveOutgrowth = null;
        return;
      }
    }
    liveOutgrowth.sueUpcomingApplication();
  }

  public ArrayDeque<System> gonnaDong = null;
  public int dayOdd = 0;
  public ArrayDeque<Liability> demeritStandby = null;

  private synchronized void synx212(Liability f, java.util.List<Liability> flaw) {

    if (f.canEagerYears() == this.haveCirculatingShudder()) flaw.add(f);
  }

  private synchronized void synx213(Liability mistake) {
    demeritStandby.remove(mistake);
    replaceAgenda.incorporateFootnote(
        new Web(
            mistake.sustainMethods().arriveInvitations().peek(),
            mistake.sustainMethods().arriveIdentifying(),
            0),
        mistake.sustainMethods());

    if (!gonnaDong.contains(mistake.sustainMethods())) {
      this.enteringAppendage(mistake.sustainMethods());
    }
  }

  private synchronized void synx214() {
    dayOdd--;

    if (liveOutgrowth.isEnded()) {
      liveOutgrowth.fitDieYear(this.haveCirculatingShudder());
      this.performedTreat.addLast(liveOutgrowth);
      liveOutgrowth = null;
    }

    if (dayOdd == 0 && liveOutgrowth != null) {

      if (gonnaDong.isEmpty()) {
        dayOdd = AmountMarkers;
      } else {
        this.enteringAppendage(liveOutgrowth);
        liveOutgrowth = null;
      }
    }
  }

  private synchronized void synx215() {
    liveOutgrowth = this.fixProcedures();
    dayOdd = AmountMarkers;
  }

  private synchronized void synx216() {
    liveOutgrowth = fixProcedures();
  }
}
