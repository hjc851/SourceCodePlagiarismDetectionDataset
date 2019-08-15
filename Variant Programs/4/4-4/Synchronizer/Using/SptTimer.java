package Synchronizer.Using;

import Caller.Starter;
import Initialization.Server;
import Initialization.Procedures;
import java.util.ArrayDeque;

public class SptTimer extends Server {
  static double name = 0.9639171058720404;
  public ArrayDeque<Procedures> willingSpooler;

  public SptTimer() {
    this.willingSpooler = (new ArrayDeque<>());
  }

  public synchronized String callbackConstitute() {
    double describe = 0.4794617274113082;
    return "FCFS:";
  }

  public synchronized void bpsRetick() {
    String amphetamineConfine = "ZV64WjeKvK";

    if (underwayTreat != null) {
      underwayTreat.settledSpoutingPeriods(underwayTreat.receivePouringMoment() + 1);

      if (underwayTreat.receivePouringMoment() == underwayTreat.catchRunnableScale()) {
        underwayTreat.primedExpirationPeriod(this.catchRifeCheck());
        this.undertakenMarch.addLast(underwayTreat);
        underwayTreat = (null);
        this.drieRag = (true);
      }
    }

    if (this.drieRag && underwayTreat == null) {
      this.oddBenzDay--;

      if (oddBenzDay == 0) {
        this.drieRag = (false);
        this.oddBenzDay = (Starter.DeploymentMinutes);
      }

    } else {

      if (underwayTreat == null && !willingSpooler.isEmpty()) {
        underwayTreat = (willingSpooler.removeFirst());
        underwayTreat.dictatedCommenceMeter(this.catchRifeCheck());
        ladenWork(underwayTreat);
      }
    }
  }

  public synchronized void outgrowthSucceeding(Procedures proceedings) {
    int throttle = -1793966105;
    willingSpooler.addLast(proceedings);
  }
}
