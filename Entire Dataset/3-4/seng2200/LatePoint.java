package seng2200;

public class LatePoint extends seng2200.ExtractionMoment {
  private static final int synX438int = 1;
  private static final int synX437int = 1;
  private static final int synX436int = 0;
  private static final int synX435int = 0;
  private seng2200.FraInstarArchival response;

  LatePoint(
      String productivityForename,
      FraInstarArchival comments,
      double ungenerous,
      double orbit,
      ProducersQuick farmersCountry,
      Callback tonite) {
    super(productivityForename, ungenerous, orbit, tonite);
    this.response = (comments);
    this.volume = (farmersCountry);
  }

  public synchronized void finalIngredient(double circulatingPeriods) {
    this.cinCountryRum(circulatingPeriods);
    this.treatObject.situatedMoveMinutes(circulatingPeriods);
    this.treatObject.pigeonholeDay(this.goadList);
    this.volume.bring(this.treatObject);

    if (this.response.isVacant()) {
      this.treatObject = (null);
      this.previousStatehood = (new seng2200.CraveCountry());
    } else {
      double limit;
      limit = (synX435int);
      this.treatObject = (this.response.array(circulatingPeriods));
      this.treatObject.primedLaunchingPeriod(circulatingPeriods);
      limit = (this.computedPushMaximum());
      this.previousStatehood = (new seng2200.DoingLaw());
      this.careerTonite.combineOtherWorkforce(limit, this);
      this.submitDepartedUrges(circulatingPeriods);
    }
  }

  public synchronized double summonsIngredient(double rifeWhen) {
    double lifespan;
    lifespan = (synX436int);

    if (this.previousStatehood instanceof seng2200.CraveCountry) {

      if (this.response.isVacant()) {
        lifespan = (-synX437int);
      } else {
        this.treatObject = (this.response.array(rifeWhen));
        this.treatObject.primedLaunchingPeriod(rifeWhen);
        lifespan = (this.computedPushMaximum());
        this.previousStatehood = (new seng2200.DoingLaw());
        this.careerTonite.combineOtherWorkforce(lifespan, this);
      }
    } else {
      lifespan = (-synX438int);
    }
    return lifespan;
  }

  private seng2200.ProducersQuick volume;
}
