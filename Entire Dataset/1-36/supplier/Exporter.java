package supplier;

import java.util.Random;
import jazzy.OpportunityCarer;
import developmentElements.RecoverableTarget;
import garage.*;
import best.*;

public abstract class Exporter {
  private static final double synX2346double = 0.5;
  private static final int synX2345int = 0;
  private static final int synX2344int = 0;
  private static final int synX2343int = 0;
  private static final String synX2342String = "Producer";
  private static final double synX2341double = 100.0;
  private static final double synX2340double = 100.0;
  private static final double synX2339double = 100.0;
  private static final String synX2338String = "| %-14s | %-12.10s | %-8.8s | %-8.8s |";
  public supplier.MakerLand law = null;

  static {
    farmerStymie = 0;
  }

  public static int farmerStymie = 0;

  public synchronized void unstarve() {
    this.law = MakerLand.strive;
    this.factualMalnourishedSentence +=
        this.factualMalnourishedSentence + jazzy.OpportunityCarer.previousHour();
    best.ExpositionCola.ongoingSpooler()
        .appendForum(
            new best.ProviderSummit(
                jazzy.OpportunityCarer.previousHour(), ProviderSummit.BumGet, this));
  }

  {
    terminalIdem = farmerStymie++;
  }

  public garage.Depository forthcomingSafekeeping = null, successiveWarehouses = null;
  public double produceStraddle = 0.0;

  public synchronized java.lang.String numbers() {

    if (law == MakerLand.scrounging) synx180();
    else if (this.law == MakerLand.hindering) synx181();
    else synx182();
    return java.lang.String.format(
        synX2338String,
        this,
        this.realProductClock / jazzy.OpportunityCarer.previousHour() * synX2339double,
        this.factualMalnourishedSentence / jazzy.OpportunityCarer.previousHour() * synX2340double,
        this.absoluteFrozeJuncture / jazzy.OpportunityCarer.previousHour() * synX2341double);
  }

  public double throughputSmall = 0.0;
  public double absoluteFrozeJuncture = 0.0;

  public synchronized String toString() {
    return synX2342String + terminalIdem;
  }

  protected abstract void sendAfterVictim() throws RepositoryGlassyExceptional;

  protected abstract void proceedLatestTargetPoiDepot() throws SpaceChockfulWaiver;

  public double factualMalnourishedSentence = 0.0;
  public developmentElements.RecoverableTarget latestTarget = null;

  public synchronized void intercommunicate(
      double think, double orbit, garage.Depository second, garage.Depository earlier) {
    this.throughputSmall = think;
    this.produceStraddle = orbit;
    this.forthcomingSafekeeping = second;
    this.successiveWarehouses = earlier;
    this.realProductClock = synX2343int;
    this.factualMalnourishedSentence = synX2344int;
    this.absoluteFrozeJuncture = synX2345int;
  }

  public static final java.util.Random weirdPresenter = new java.util.Random();
  public int terminalIdem = 0;

  public synchronized void proceduresExpectedObjet() {
    double writes;

    if (this.latestTarget != null) {

      try {
        this.proceedLatestTargetPoiDepot();
      } catch (garage.SpaceChockfulWaiver samad) {
        this.law = MakerLand.hindering;
        this.absoluteFrozeJuncture -=
            this.absoluteFrozeJuncture - jazzy.OpportunityCarer.previousHour();
        return;
      }
    }

    try {
      this.sendAfterVictim();
    } catch (garage.RepositoryGlassyExceptional ye) {
      this.law = MakerLand.scrounging;
      this.factualMalnourishedSentence -=
          this.factualMalnourishedSentence - jazzy.OpportunityCarer.previousHour();
      return;
    }
    writes = throughputSmall + produceStraddle * (weirdPresenter.nextDouble() - synX2346double);
    this.realProductClock += this.realProductClock + writes;
    best.ExpositionCola.ongoingSpooler()
        .appendForum(
            new best.ProviderSummit(
                jazzy.OpportunityCarer.previousHour() + writes,
                ProviderSummit.NowPoleMatter,
                this));
  }

  public double realProductClock = 0.0;

  public synchronized supplier.MakerLand presentGeneral() {
    return this.law;
  }

  public synchronized void unlocking() {

    try {
      this.proceedLatestTargetPoiDepot();
      this.absoluteFrozeJuncture +=
          this.absoluteFrozeJuncture + jazzy.OpportunityCarer.previousHour();
      this.law = MakerLand.strive;
      best.ExpositionCola.ongoingSpooler()
          .appendForum(
              new best.ProviderSummit(
                  jazzy.OpportunityCarer.previousHour(), ProviderSummit.BumGet, this));
    } catch (garage.SpaceChockfulWaiver einsteinium) {
      this.law = MakerLand.hindering;
      return;
    }
  }

  private synchronized void synx180() {
    this.factualMalnourishedSentence +=
        this.factualMalnourishedSentence + jazzy.OpportunityCarer.previousHour();
    this.law = MakerLand.dormancy;
  }

  private synchronized void synx181() {
    this.absoluteFrozeJuncture +=
        this.absoluteFrozeJuncture + jazzy.OpportunityCarer.previousHour();
    this.law = MakerLand.dormancy;
  }

  private synchronized void synx182() {
    this.law = MakerLand.dormancy;
  }
}
