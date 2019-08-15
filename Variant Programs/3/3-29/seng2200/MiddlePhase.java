package seng2200;

public class MiddlePhase extends ProcessingScale {
  private static final int synX2353int = 0;
  private static final int synX2352int = 1;
  private static final int synX2351int = 1;
  private static final int synX2350int = 1;
  private static final int synX2349int = 1;
  private static final int synX2348int = 0;
  public EntreArrangeDisk produced;
  public EntreArrangeDisk involvement;

  public MiddlePhase(
      String orientedConstitute,
      EntreArrangeDisk stimulation,
      EntreArrangeDisk intensity,
      double equate,
      double array,
      Configuration genoa) {
    super(orientedConstitute, equate, array, genoa);
    this.involvement = (stimulation);
    this.produced = (intensity);
  }

  public synchronized double treatObject(double streamWeek) {
    double extent;
    extent = (synX2348int);

    if (this.flowNational instanceof FattenLaw) {

      if (this.involvement.isVacant()) {
        extent = (-synX2349int);
      } else {
        this.summonsIngredient = (this.involvement.element(streamWeek));
        this.summonsIngredient.adjustEnterMonth(streamWeek);
        extent = (this.computeNudgeLength());
        this.flowNational = (new OccupyGovernment());
        this.gigJimmie.totalRecentlySpeculate(extent, this);
      }
    } else if (this.flowNational instanceof EmbarrassGovernmental) {

      if (this.produced.isComplete()) {
        extent = (-synX2350int);
      } else {
        this.summonsIngredient.rigidQuittingAmount(streamWeek);
        this.summonsIngredient.affixMinutes(this.operatorsPseudonym);
        this.produced.enque(this.summonsIngredient, streamWeek);
        this.summonsIngredient = (null);

        if (this.involvement.isVacant()) {
          extent = (-synX2351int);
          this.flowNational = (new FattenLaw());
        } else {
          this.summonsIngredient = (this.involvement.element(streamWeek));
          this.summonsIngredient.adjustEnterMonth(streamWeek);
          extent = (this.computeNudgeLength());
          this.gigJimmie.totalRecentlySpeculate(extent, this);
          this.flowNational = (new OccupyGovernment());
        }
      }
    } else {
      extent = (-synX2352int);
    }
    return extent;
  }

  public synchronized void completingComponent(double previousHour) {
    this.ltdCommonwealthTheo(previousHour);

    if (this.produced.isComplete()) synx382();
    else synx383(previousHour);
  }

  private synchronized void synx382() {
    this.flowNational = (new EmbarrassGovernmental());
  }

  private synchronized void synx383(double previousHour) {
    this.summonsIngredient.rigidQuittingAmount(previousHour);
    this.summonsIngredient.affixMinutes(this.operatorsPseudonym);
    this.produced.enque(this.summonsIngredient, previousHour);
    this.advisingArightProductivity(previousHour);

    if (this.involvement.isVacant()) {
      this.summonsIngredient = (null);
      this.flowNational = (new FattenLaw());
    } else {
      double remainder;
      remainder = (synX2353int);
      this.summonsIngredient = (this.involvement.element(previousHour));
      this.summonsIngredient.adjustEnterMonth(previousHour);
      remainder = (this.computeNudgeLength());
      this.gigJimmie.totalRecentlySpeculate(remainder, this);
      this.flowNational = (new OccupyGovernment());
      this.communicatedBoltedOriented(previousHour);
    }
  }
}
