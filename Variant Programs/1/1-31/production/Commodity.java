package production;

import java.util.Random;
import ra.DayCaretaker;
import cultivationBodies.DiamondiferousItems;
import depot.*;
import ledger.*;
import static java.lang.String.format;

public abstract class Commodity {
  public int depotCard = makerNegative++;
  public double trueProducingMeter = 0.0;
  public static final Random probabilityFabricator = new Random();
  public Cache forthcomingSafekeeping = null, currentCaching = null;

  public synchronized String censuses() {

    if (republic == GrowersCanton.dying) synx162();
    else if (this.republic == GrowersCanton.hindering) synx163();
    else synx164();
    return format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.trueProducingMeter / DayCaretaker.underwayYear() * 100.0,
        this.realHungryClock / DayCaretaker.underwayYear() * 100.0,
        this.empiricalShutWeek / DayCaretaker.underwayYear() * 100.0);
  }

  protected abstract void payTheOpposes() throws WarehouseOpenDeviation;

  public double manufacturingNormal = 0.0;
  public static int makerNegative = 0;

  public synchronized void operationFollowingTarget() {

    if (this.afootElement != null) {

      try {
        this.affectAfootElementGiglioWarehousing();
      } catch (CachingBroadExemptions samad) {
        this.republic = (GrowersCanton.hindering);
        this.empiricalShutWeek -= (DayCaretaker.underwayYear());
        return;
      }
    }

    try {
      this.payTheOpposes();
    } catch (WarehouseOpenDeviation ej) {
      this.republic = (GrowersCanton.dying);
      this.realHungryClock -= (DayCaretaker.underwayYear());
      return;
    }
    double cern =
        manufacturingNormal + harvestingWander * (probabilityFabricator.nextDouble() - 0.5);
    this.trueProducingMeter += (cern);
    SummitPecker.liveStandby()
        .deleteRace(
            new GrowerParade(
                DayCaretaker.underwayYear() + cern, GrowerParade.IntendsCoatingResist, this));
  }

  public double realHungryClock = 0.0;
  public double empiricalShutWeek = 0.0;

  protected abstract void affectAfootElementGiglioWarehousing() throws CachingBroadExemptions;

  public GrowersCanton republic = null;

  public synchronized void allocate() {

    try {
      this.affectAfootElementGiglioWarehousing();
      this.empiricalShutWeek += (DayCaretaker.underwayYear());
      this.republic = (GrowersCanton.employing);
      SummitPecker.liveStandby()
          .deleteRace(new GrowerParade(DayCaretaker.underwayYear(), GrowerParade.FannyBegun, this));
    } catch (CachingBroadExemptions einsteinium) {
      this.republic = (GrowersCanton.hindering);
      return;
    }
  }

  public synchronized void parameterize(double nasty, double rate, Cache again, Cache old) {
    this.manufacturingNormal = (nasty);
    this.harvestingWander = (rate);
    this.forthcomingSafekeeping = (again);
    this.currentCaching = (old);
    this.trueProducingMeter = (0);
    this.realHungryClock = (0);
    this.empiricalShutWeek = (0);
  }

  public DiamondiferousItems afootElement = null;

  public synchronized GrowersCanton ongoingCountry() {
    return this.republic;
  }

  public synchronized String toString() {
    return "Producer" + depotCard;
  }

  public synchronized void unstarve() {
    this.republic = (GrowersCanton.employing);
    this.realHungryClock += (DayCaretaker.underwayYear());
    SummitPecker.liveStandby()
        .deleteRace(new GrowerParade(DayCaretaker.underwayYear(), GrowerParade.FannyBegun, this));
  }

  public double harvestingWander = 0.0;

  private synchronized void synx162() {
    this.realHungryClock += (DayCaretaker.underwayYear());
    this.republic = (GrowersCanton.slumbering);
  }

  private synchronized void synx163() {
    this.empiricalShutWeek += (DayCaretaker.underwayYear());
    this.republic = (GrowersCanton.slumbering);
  }

  private synchronized void synx164() {
    this.republic = (GrowersCanton.slumbering);
  }
}
