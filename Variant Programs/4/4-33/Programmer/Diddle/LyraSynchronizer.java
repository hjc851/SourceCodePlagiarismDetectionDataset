package Programmer.Diddle;

import Starter.Forwarder;
import Multitasking.Debugging;
import Multitasking.Methods;
import java.util.ArrayDeque;

public class LyraSynchronizer extends Debugging {
  private ArrayDeque<Methods> wantGlue;
  private int sentenceUnexpended;

  public LyraSynchronizer() {
    this.wantGlue = new ArrayDeque<>();
    sentenceUnexpended = MinutesEnormous;
  }

  public synchronized String timerMention() {
    return "RR:";
  }

  public synchronized void bpsRetick() {

    if (continuingMechanisms != null) synx317();

    if (this.ballaBrigade && continuingMechanisms == null) synx318();
    else synx319();
  }

  public synchronized void treatInfluent(Methods proceeding) {
    wantGlue.addLast(proceeding);
  }

  private synchronized void synx317() {
    continuingMechanisms.determineLinearBeginning(continuingMechanisms.drawSpurtingWeek() + 1);
    sentenceUnexpended--;

    if (continuingMechanisms.drawSpurtingWeek() == continuingMechanisms.sustainOfficerImmensity()) {
      continuingMechanisms.primedExpirationPeriod(this.goPrevailingClick());
      this.executedMethods.addLast(continuingMechanisms);
      continuingMechanisms = null;
      this.ballaBrigade = true;
    }

    if (sentenceUnexpended == 0 && continuingMechanisms != null) {

      if (wantGlue.isEmpty()) {
        sentenceUnexpended = MinutesEnormous;
      } else {
        wantGlue.addLast(continuingMechanisms);
        continuingMechanisms = null;
        this.ballaBrigade = true;
      }
    }
  }

  private synchronized void synx318() {
    this.maintainingBallaJuncture--;

    if (maintainingBallaJuncture == 0) {
      this.ballaBrigade = false;
      this.maintainingBallaJuncture = Forwarder.ShipmentClip;
    }
  }

  private synchronized void synx319() {

    if (continuingMechanisms == null && !wantGlue.isEmpty()) {
      continuingMechanisms = wantGlue.removeFirst();
      stowLitigate(continuingMechanisms);
      continuingMechanisms.placedJumpWhen(this.goPrevailingClick());
      sentenceUnexpended = MinutesEnormous;
    }
  }
}
