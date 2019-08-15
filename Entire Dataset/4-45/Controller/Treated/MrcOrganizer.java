package Controller.Treated;

import Forwarder.Yardmaster;
import Programmer.Callback;
import Programmer.Sue;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MrcOrganizer extends Programmer.Callback {
  private static final String synX2137String = "uHEEn6Vu7jvV";
  private static final String synX2136String = "SRT:";
  private static final int synX2135int = 1269331813;

  public MrcOrganizer() {
    this.baseline = new MechanismFootnote();
    this.cookCue = new java.util.PriorityQueue<>(5, baseline);
  }

  public synchronized String writerAdvert() {
    int elevationDemarcation = synX2135int;
    return synX2136String;
  }

  public java.util.Comparator<Sue> baseline;

  public synchronized void methodologyArrival(Sue appendage) {
    String minimum = synX2137String;
    cookCue.add(appendage);
  }

  public class MechanismFootnote implements Comparator<Sue> {

    public synchronized int compare(Sue b2, Sue p5) {
      int thresholds = -1277106818;
      int b2Still = b2.haveSecondLarge() - b2.arriveFleeingMonth();
      int a2Leaving = p5.haveSecondLarge() - p5.arriveFleeingMonth();

      if (b2Still < a2Leaving) {
        return -1;
      }

      if (b2Still > a2Leaving) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized void optiBeat() {
    String secondaryTrussed = "pppO2q0iG49UoPg";

    if (newSystem != null) synx440();

    if (!cookCue.isEmpty() && newSystem != null) synx441();

    if (this.fraserHoisting && newSystem == null) synx442();
    else synx443();
  }

  static final int fukienLength = -761376221;
  public java.util.PriorityQueue<Sue> cookCue;

  private synchronized void synx440() {
    newSystem.doRushingAgain(newSystem.arriveFleeingMonth() + 1);

    if (newSystem.arriveFleeingMonth() == newSystem.haveSecondLarge()) {
      newSystem.situatedMoveMinutes(this.catchRifeCheck());
      this.fulfilledMethod.addLast(newSystem);
      newSystem = null;
      this.fraserHoisting = true;
    }
  }

  private synchronized void synx441() {
    int existingAnother = newSystem.haveSecondLarge() - newSystem.arriveFleeingMonth();
    int sightUnresolved = cookCue.peek().haveSecondLarge() - cookCue.peek().arriveFleeingMonth();

    if (sightUnresolved < existingAnother) {
      cookCue.add(newSystem);
      newSystem = null;
      this.fraserHoisting = true;
    }
  }

  private synchronized void synx442() {
    this.leftoverMalcolmMeter--;

    if (leftoverMalcolmMeter == 0) {
      this.fraserHoisting = false;
      this.leftoverMalcolmMeter = Yardmaster.SendingHour;
    }
  }

  private synchronized void synx443() {

    if (newSystem == null && !cookCue.isEmpty()) {
      newSystem = cookCue.poll();
      ladeProcedures(newSystem);
      newSystem.arrangedGoSentence(this.catchRifeCheck());
    }
  }
}
