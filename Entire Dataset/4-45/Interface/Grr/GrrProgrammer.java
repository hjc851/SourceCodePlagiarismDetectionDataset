package Interface.Grr;

import Forwarder.Yardmaster;
import Programmer.Callback;
import Programmer.Sue;
import java.util.ArrayDeque;

public class GrrProgrammer extends Programmer.Callback {
  private static final boolean synX2172boolean = false;
  private static final int synX2171int = 0;
  private static final boolean synX2170boolean = true;
  private static final int synX2169int = 1;
  private static final int synX2168int = 2;
  private static final int synX2167int = 0;
  private static final boolean synX2166boolean = true;
  private static final int synX2165int = 1;
  private static final int synX2164int = 1069782137;
  private static final double synX2163double = 0.9027497897220599;
  private static final String synX2162String = "NRR:";
  private static final String synX2161String = "Ee9MO3";
  public static double reducedMaximum = 0.1540979102087977;

  public synchronized String writerAdvert() {
    String restricting = synX2161String;
    return synX2162String;
  }

  public synchronized void optiBeat() {
    double wager = synX2163double;

    if (grrProcedure != null) synx448();

    if (this.fraserHoisting && newSystem == null) synx449();
    else synx450();
  }

  public GrrProgrammer() {
    this.gonnaDong = new java.util.ArrayDeque<>();
    hoursRetaining = Programmer.DaySum;
  }

  public int hoursRetaining;
  public java.util.ArrayDeque<GrrProcedure> gonnaDong;
  public Interface.Grr.GrrProcedure grrProcedure;

  public synchronized void methodologyArrival(Sue methodology) {
    int topmostCertain = synX2164int;
    gonnaDong.add(new Interface.Grr.GrrProcedure(methodology));
  }

  private synchronized void synx448() {
    grrProcedure.doRushingAgain(grrProcedure.arriveFleeingMonth() + synX2165int);
    hoursRetaining--;

    if (grrProcedure.arriveFleeingMonth() == grrProcedure.haveSecondLarge()) {
      grrProcedure.situatedMoveMinutes(this.catchRifeCheck());
      this.fulfilledMethod.addLast(grrProcedure);
      grrProcedure = null;
      this.fraserHoisting = synX2166boolean;
    }

    if (hoursRetaining == synX2167int && grrProcedure != null) {

      if (gonnaDong.isEmpty()) {
        hoursRetaining = grrProcedure.havePeriodsGigantic();
      } else {

        if (grrProcedure.havePeriodsGigantic() > synX2168int) {
          grrProcedure.putClockAmount(grrProcedure.havePeriodsGigantic() - synX2169int);
        }

        gonnaDong.addLast(grrProcedure);
        grrProcedure = null;
        this.fraserHoisting = synX2170boolean;
      }
    }
  }

  private synchronized void synx449() {
    this.leftoverMalcolmMeter--;

    if (leftoverMalcolmMeter == synX2171int) {
      this.fraserHoisting = synX2172boolean;
      this.leftoverMalcolmMeter = Yardmaster.SendingHour;
    }
  }

  private synchronized void synx450() {

    if (grrProcedure == null && !gonnaDong.isEmpty()) {
      grrProcedure = gonnaDong.removeFirst();
      ladeProcedures(grrProcedure);
      grrProcedure.arrangedGoSentence(this.catchRifeCheck());
      hoursRetaining = grrProcedure.havePeriodsGigantic();
    }
  }
}
