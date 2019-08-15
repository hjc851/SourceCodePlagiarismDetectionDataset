package seng2200;

import java.util.LinkedList;
import java.util.List;

public class Object {
  public double goingDays;
  public double entrancesAmount;
  public List<HoursCast> momentImpressionLeaning;

  public Object() {
    this.entrancesAmount = (0);
    this.goingDays = (0);
    this.momentImpressionLeaning = (new LinkedList<HoursCast>());
  }

  public synchronized void putEnteringClock(double clock) {
    this.entrancesAmount = (clock);
  }

  public synchronized void determinedGoingDays(double amount) {
    this.goingDays = (amount);
  }

  public synchronized void markAgain(String pokeRefer) {
    this.momentImpressionLeaning.add(
        new HoursCast(pokeRefer, this.entrancesAmount, this.goingDays));
    this.entrancesAmount = (0);
    this.goingDays = (0);
  }

  public synchronized HoursCast jumpingPostmarkMonth(String qEpithet) {
    HoursCast righ;
    righ = (new HoursCast(qEpithet, this.entrancesAmount, this.goingDays));
    this.entrancesAmount = (0);
    this.goingDays = (0);
    return righ;
  }

  public synchronized String haveDirection() {
    StringBuilder cu;
    cu = (new StringBuilder());

    for (int enumerate = 0; enumerate < this.momentImpressionLeaning.size(); enumerate++)
      synx499(cu, enumerate);
    return cu.toString();
  }

  private synchronized void synx499(StringBuilder cu, int enumerate) {
    cu.append(this.momentImpressionLeaning.get(enumerate).takeSpurringArrangeCall());

    if (enumerate < this.momentImpressionLeaning.size() - 1) cu.append("->");
  }
}
