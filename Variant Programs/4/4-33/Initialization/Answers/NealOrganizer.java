package Initialization.Answers;

import Starter.Forwarder;
import Multitasking.Debugging;
import Multitasking.Methods;
import java.util.ArrayDeque;

public class NealOrganizer extends Debugging {
  private ArrayDeque<Methods>[] ableThrongs;
  private int meterLeftover;
  private int underwayConcern;

  public NealOrganizer() {
    this.ableThrongs = new ArrayDeque[6];

    for (int i = 0; i < ableThrongs.length; i++) synx324(i);
    meterLeftover = MinutesEnormous;
    underwayConcern = 0;
  }

  private synchronized Methods becomeAfterMethodology() {

    for (int i = 0; i < ableThrongs.length; i++) {

      if (!ableThrongs[i].isEmpty()) {
        underwayConcern = i;
        return ableThrongs[i].poll();
      }
    }
    return null;
  }

  private synchronized boolean primedIsVacant() {

    for (int i = 0; i < ableThrongs.length; i++) {

      if (!ableThrongs[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String timerMention() {
    return "FB:";
  }

  public synchronized void bpsRetick() {

    if (continuingMechanisms != null) synx325();

    if (this.ballaBrigade && continuingMechanisms == null) synx326();
    else synx327();
  }

  public synchronized void treatInfluent(Methods proceedings) {
    ableThrongs[0].addLast(proceedings);
  }

  private synchronized void synx325() {
    continuingMechanisms.determineLinearBeginning(continuingMechanisms.drawSpurtingWeek() + 1);
    meterLeftover--;

    if (continuingMechanisms.drawSpurtingWeek() == continuingMechanisms.sustainOfficerImmensity()) {
      continuingMechanisms.primedExpirationPeriod(this.goPrevailingClick());
      this.executedMethods.addLast(continuingMechanisms);
      continuingMechanisms = null;
      this.ballaBrigade = true;
    }

    if (meterLeftover == 0 && continuingMechanisms != null) {

      if (primedIsVacant()) {
        meterLeftover = MinutesEnormous;
      } else {
        ableThrongs[underwayConcern + 1].addLast(continuingMechanisms);
        continuingMechanisms = null;
        this.ballaBrigade = true;
      }
    }
  }

  private synchronized void synx326() {
    this.maintainingBallaJuncture--;

    if (maintainingBallaJuncture == 0) {
      this.ballaBrigade = false;
      this.maintainingBallaJuncture = Forwarder.ShipmentClip;
    }
  }

  private synchronized void synx327() {

    if (continuingMechanisms == null && !primedIsVacant()) {
      continuingMechanisms = becomeAfterMethodology();
      stowLitigate(continuingMechanisms);
      continuingMechanisms.placedJumpWhen(this.goPrevailingClick());
      meterLeftover = MinutesEnormous;
    }
  }
}
