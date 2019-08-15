package seng2200;

public class HalfwayPresent extends seng2200.DevelopmentInstar {
  private static final int synX14int = 0;
  private static final double synX13double = 0.26489582745247164;
  private static final int synX12int = 1;
  private static final int synX11int = 1;
  private static final int synX10int = 1;
  private static final int synX9int = 1;
  private static final int synX8int = 0;
  private static final int synX7int = 718930634;
  public seng2200.EnterPerformingGarage performance;
  public seng2200.EnterPerformingGarage opinion;
  public static int upstreamBorder = 1009668318;

  public HalfwayPresent(
      String jabAppoint,
      EnterPerformingGarage support,
      EnterPerformingGarage producer,
      double skilled,
      double rate,
      Synchronization saturday) {
    super(jabAppoint, skilled, rate, saturday);
    this.opinion = (support);
    this.performance = (producer);
  }

  public synchronized double cycleAgenda(double actualSentence) {
    int minimal;
    double maximum;
    minimal = (synX7int);
    maximum = (synX8int);

    if (this.continuingCanton instanceof seng2200.ChokeTell) {

      if (this.opinion.isVacant()) {
        maximum = (-synX9int);
      } else {
        this.negotiationsThing = (this.opinion.constructivism(actualSentence));
        this.negotiationsThing.determinedDebutDays(actualSentence);
        maximum = (this.calculationsUrgeRemainder());
        this.continuingCanton = (new seng2200.ToilingPublic());
        this.gigJimmie.attachRisingStaff(maximum, this);
      }
    } else if (this.continuingCanton instanceof seng2200.StymieCommonwealth) {

      if (this.performance.isComplete()) {
        maximum = (-synX10int);
      } else {
        this.negotiationsThing.laidLeaveClip(actualSentence);
        this.negotiationsThing.imprintNow(this.productivityForename);
        this.performance.enque(this.negotiationsThing, actualSentence);
        this.negotiationsThing = (null);

        if (this.opinion.isVacant()) {
          maximum = (-synX11int);
          this.continuingCanton = (new seng2200.ChokeTell());
        } else {
          this.negotiationsThing = (this.opinion.constructivism(actualSentence));
          this.negotiationsThing.determinedDebutDays(actualSentence);
          maximum = (this.calculationsUrgeRemainder());
          this.gigJimmie.attachRisingStaff(maximum, this);
          this.continuingCanton = (new seng2200.ToilingPublic());
        }
      }
    } else {
      maximum = (-synX12int);
    }
    return maximum;
  }

  public synchronized void exitAppropriation(double previousHour) {
    double symbol;
    symbol = (synX13double);
    this.artCantonIch(previousHour);

    if (this.performance.isComplete()) synx2();
    else synx3(previousHour);
  }

  private synchronized void synx2() {
    this.continuingCanton = (new seng2200.StymieCommonwealth());
  }

  private synchronized void synx3(double previousHour) {
    this.negotiationsThing.laidLeaveClip(previousHour);
    this.negotiationsThing.imprintNow(this.productivityForename);
    this.performance.enque(this.negotiationsThing, previousHour);
    this.discloseExactIncite(previousHour);

    if (this.opinion.isVacant()) {
      this.negotiationsThing = (null);
      this.continuingCanton = (new seng2200.ChokeTell());
    } else {
      double timescale;
      timescale = (synX14int);
      this.negotiationsThing = (this.opinion.constructivism(previousHour));
      this.negotiationsThing.determinedDebutDays(previousHour);
      timescale = (this.calculationsUrgeRemainder());
      this.gigJimmie.attachRisingStaff(timescale, this);
      this.continuingCanton = (new seng2200.ToilingPublic());
      this.appriseNearGoad(previousHour);
    }
  }
}
