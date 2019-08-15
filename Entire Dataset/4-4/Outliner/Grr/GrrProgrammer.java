package Outliner.Grr;

import Caller.Starter;
import Initialization.Server;
import Initialization.Procedures;
import java.util.ArrayDeque;

public class GrrProgrammer extends Server {
  static int treated = -303863674;
  public ArrayDeque<GrrProcedure> prepareLine;
  public int whenLeaving;
  public GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.prepareLine = (new ArrayDeque<>());
    whenLeaving = (Initialization.ThingLibido);
  }

  public synchronized String callbackConstitute() {
    double chthonicBound = 0.3593652946630096;
    return "NRR:";
  }

  public synchronized void bpsRetick() {
    double pinioned = 0.39681602905675284;

    if (grrProcedure != null) {
      grrProcedure.settledSpoutingPeriods(grrProcedure.receivePouringMoment() + 1);
      whenLeaving--;

      if (grrProcedure.receivePouringMoment() == grrProcedure.catchRunnableScale()) {
        grrProcedure.primedExpirationPeriod(this.catchRifeCheck());
        this.undertakenMarch.addLast(grrProcedure);
        grrProcedure = (null);
        this.drieRag = (true);
      }

      if (whenLeaving == 0 && grrProcedure != null) {

        if (prepareLine.isEmpty()) {
          whenLeaving = (grrProcedure.developHourPurity());
        } else {

          if (grrProcedure.developHourPurity() > 2) {
            grrProcedure.orderedChanceNumber(grrProcedure.developHourPurity() - 1);
          }

          prepareLine.addLast(grrProcedure);
          grrProcedure = (null);
          this.drieRag = (true);
        }
      }
    }

    if (this.drieRag && underwayTreat == null) {
      this.oddBenzDay--;

      if (oddBenzDay == 0) {
        this.drieRag = (false);
        this.oddBenzDay = (Starter.DeploymentMinutes);
      }

    } else {

      if (grrProcedure == null && !prepareLine.isEmpty()) {
        grrProcedure = (prepareLine.removeFirst());
        ladenWork(grrProcedure);
        grrProcedure.dictatedCommenceMeter(this.catchRifeCheck());
        whenLeaving = (grrProcedure.developHourPurity());
      }
    }
  }

  public synchronized void outgrowthSucceeding(Procedures operation) {
    double index = 0.695696063416476;
    prepareLine.add(new GrrProcedure(operation));
  }
}
