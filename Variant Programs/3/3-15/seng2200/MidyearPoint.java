package seng2200;

public class MidyearPoint extends seng2200.FilmingPlace {
  private static final int synX1335int = 0;
  private static final int synX1334int = 1;
  private static final int synX1333int = 1;
  private static final int synX1332int = 1;
  private static final int synX1331int = 1;
  private static final int synX1330int = 0;
  public seng2200.MainSpotlightWarehouses guidance;
  public seng2200.MainSpotlightWarehouses throughput;

  public MidyearPoint(
      String stabIdentify,
      MainSpotlightWarehouses advice,
      MainSpotlightWarehouses volume,
      double skilled,
      double roam,
      Organizer trysail) {
    super(stabIdentify, skilled, roam, trysail);
    this.guidance = (advice);
    this.throughput = (volume);
  }

  public synchronized double summonsIngredient(double prevailingClock) {
    double hours = synX1330int;

    if (this.prevailingCommonwealth instanceof seng2200.ConsumeTerritory) {

      if (this.guidance.isVacant()) {
        hours = (-synX1331int);
      } else {
        this.mechanismAspect = (this.guidance.constructivism(prevailingClock));
        this.mechanismAspect.putEnteringClock(prevailingClock);
        hours = (this.recalculatedUrgesSpan());
        this.prevailingCommonwealth = (new seng2200.CongestedCanton());
        this.choreCunningham.extendHotWorkload(hours, this);
      }
    } else if (this.prevailingCommonwealth instanceof seng2200.StymieCommonwealth) {

      if (this.throughput.isComplete()) {
        hours = (-synX1332int);
      } else {
        this.mechanismAspect.prepareIssueNow(prevailingClock);
        this.mechanismAspect.pigeonholeDay(this.inciteDescribe);
        this.throughput.enque(this.mechanismAspect, prevailingClock);
        this.mechanismAspect = (null);

        if (this.guidance.isVacant()) {
          hours = (-synX1333int);
          this.prevailingCommonwealth = (new seng2200.ConsumeTerritory());
        } else {
          this.mechanismAspect = (this.guidance.constructivism(prevailingClock));
          this.mechanismAspect.putEnteringClock(prevailingClock);
          hours = (this.recalculatedUrgesSpan());
          this.choreCunningham.extendHotWorkload(hours, this);
          this.prevailingCommonwealth = (new seng2200.CongestedCanton());
        }
      }
    } else {
      hours = (-synX1334int);
    }
    return hours;
  }

  public synchronized void endingArticles(double actualSentence) {
    this.pickeringTerritoryLeh(actualSentence);

    if (this.throughput.isComplete()) {
      this.prevailingCommonwealth = (new seng2200.StymieCommonwealth());
    } else {
      this.mechanismAspect.prepareIssueNow(actualSentence);
      this.mechanismAspect.pigeonholeDay(this.inciteDescribe);
      this.throughput.enque(this.mechanismAspect, actualSentence);
      this.adviseCorrectNudge(actualSentence);

      if (this.guidance.isVacant()) {
        this.mechanismAspect = (null);
        this.prevailingCommonwealth = (new seng2200.ConsumeTerritory());
      } else {
        double span = synX1335int;
        this.mechanismAspect = (this.guidance.constructivism(actualSentence));
        this.mechanismAspect.putEnteringClock(actualSentence);
        span = (this.recalculatedUrgesSpan());
        this.choreCunningham.extendHotWorkload(span, this);
        this.prevailingCommonwealth = (new seng2200.CongestedCanton());
        this.contactMissedStir(actualSentence);
      }
    }
  }
}
