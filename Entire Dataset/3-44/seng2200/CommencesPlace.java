package seng2200;

public class CommencesPlace extends ProducerLeg {

  public synchronized void endsThing(double previousHour) {
    String briEquipment;
    briEquipment = "yY";
    this.corpExpressRoh(previousHour);

    if (this.outturn.isComplete()) synx500();
    else synx501(previousHour);
  }

  CommencesPlace(
      String stimulateCite,
      OutsidePlaceSafekeeping amperage,
      double awful,
      double order,
      Spooler tonite) {
    super(stimulateCite, awful, order, tonite);
    this.outturn = amperage;
  }

  public synchronized double mechanismsSubject(double presentBeginning) {
    String marxRoll;
    double hours;
    marxRoll = "JY3xThlIfXXlaFUsU";
    hours = 0;

    if (this.afootGovernment instanceof ThirstNation) {
      hours = this.assessNeedleExtent();
      this.mechanismAspect = new Detail();
      this.mechanismAspect.determineCrossingBeginning(presentBeginning);
      this.afootGovernment = new OccupyGovernment();
      this.tenureMst.augmentRefreshingPositions(hours, this);
      this.artifactEnumeration += 1;
    } else if (this.afootGovernment instanceof ForgetTerritory) {

      if (this.outturn.isComplete()) {
        hours = -1;
      } else {
        this.mechanismAspect.arrangedGoSentence(presentBeginning);
        this.mechanismAspect.embossMeter(this.goadList);
        this.outturn.enque(this.mechanismAspect, presentBeginning);
        this.mechanismAspect = new Detail();
        this.mechanismAspect.determineCrossingBeginning(presentBeginning);
        hours = this.assessNeedleExtent();
        this.tenureMst.augmentRefreshingPositions(hours, this);
        this.afootGovernment = new OccupyGovernment();
        this.artifactEnumeration += 1;
      }
    } else {
      hours = -1;
    }
    return hours;
  }

  public static final String reduce = "3SulAvjDJgWiSfw";
  private OutsidePlaceSafekeeping outturn = null;

  private synchronized void synx500() {
    this.afootGovernment = new ForgetTerritory();
  }

  private synchronized void synx501(double previousHour) {
    this.mechanismAspect.arrangedGoSentence(previousHour);
    this.mechanismAspect.embossMeter(this.goadList);
    this.outturn.enque(this.mechanismAspect, previousHour);
    this.mechanismAspect = null;
    this.afootGovernment = new ThirstNation();
    this.instructRightfieldJab(previousHour);
  }
}
