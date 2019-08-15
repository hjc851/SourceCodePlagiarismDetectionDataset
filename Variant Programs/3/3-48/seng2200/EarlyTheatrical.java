package seng2200;

public class EarlyTheatrical extends seng2200.ProcessingScale {
  private seng2200.AmorTheaterWarehousing producing;

  EarlyTheatrical(
      String urgingAdvert,
      AmorTheaterWarehousing volume,
      double entail,
      double wander,
      Debugging saturday) {
    super(urgingAdvert, entail, wander, saturday);
    this.producing = (volume);
  }

  public synchronized double methodsArticles(double incumbentDay) {
    double limit;
    limit = (0);

    if (this.existingSovereign instanceof seng2200.HungrySubmit) {
      limit = (this.recalculatedUrgesSpan());
      this.mechanismAspect = (new seng2200.Agenda());
      this.mechanismAspect.determinedDebutDays(incumbentDay);
      this.existingSovereign = (new seng2200.OverworkedCantons());
      this.workforceWindward.expandUnprecedentedEmployer(limit, this);
      this.detailNumber += (1);
    } else if (this.existingSovereign instanceof seng2200.OccludeLaw) {

      if (this.producing.isComplete()) {
        limit = (-1);
      } else {
        this.mechanismAspect.determinedGoingDays(incumbentDay);
        this.mechanismAspect.imprintNow(this.orientedConstitute);
        this.producing.enque(this.mechanismAspect, incumbentDay);
        this.mechanismAspect = (new seng2200.Agenda());
        this.mechanismAspect.determinedDebutDays(incumbentDay);
        limit = (this.recalculatedUrgesSpan());
        this.workforceWindward.expandUnprecedentedEmployer(limit, this);
        this.existingSovereign = (new seng2200.OverworkedCantons());
        this.detailNumber += (1);
      }
    } else {
      limit = (-1);
    }
    return limit;
  }

  public synchronized void concludeTidbit(double actualSentence) {
    this.cinCountryRum(actualSentence);

    if (this.producing.isComplete()) synx520();
    else synx521(actualSentence);
  }

  private synchronized void synx520() {
    this.existingSovereign = (new seng2200.OccludeLaw());
  }

  private synchronized void synx521(double actualSentence) {
    this.mechanismAspect.determinedGoingDays(actualSentence);
    this.mechanismAspect.imprintNow(this.orientedConstitute);
    this.producing.enque(this.mechanismAspect, actualSentence);
    this.mechanismAspect = (null);
    this.existingSovereign = (new seng2200.HungrySubmit());
    this.instructRightfieldJab(actualSentence);
  }
}
