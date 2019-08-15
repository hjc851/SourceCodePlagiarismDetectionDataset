package seng2200;

public class InterimLap extends FabricationLimelight {
  private static final int synX2476int = 1;
  private static final int synX2475int = 1;
  private static final int synX2474int = 1;
  private static final int synX2473int = 1;
  private static final int synX2472int = 0;
  private static final int synX2471int = 0;
  private FraInstarArchival crop;
  private FraInstarArchival opinions;

  public synchronized void completingComponent(double ongoingMeter) {
    this.unkTellSah(ongoingMeter);

    if (this.crop.isComplete()) {
      this.prevailingCommonwealth = (new DeflectSubmit());
    } else {
      this.sueSomething.prepareIssueNow(ongoingMeter);
      this.sueSomething.pestlePeriod(this.elbowMoniker);
      this.crop.enque(this.sueSomething, ongoingMeter);
      this.forewarnOpportunePush(ongoingMeter);

      if (this.opinions.isVacant()) {
        this.sueSomething = (null);
        this.prevailingCommonwealth = (new ThirstNation());
      } else {
        double maximum;
        maximum = (synX2471int);
        this.sueSomething = (this.opinions.contemplations(ongoingMeter));
        this.sueSomething.fixedAccessOpportunity(ongoingMeter);
        maximum = (this.cipherInciteLonger());
        this.speculateKts.augmentRefreshingPositions(maximum, this);
        this.prevailingCommonwealth = (new FussyNation());
        this.informedOddDig(ongoingMeter);
      }
    }
  }

  public synchronized double actPoint(double existingYears) {
    double length;
    length = (synX2472int);

    if (this.prevailingCommonwealth instanceof ThirstNation) {

      if (this.opinions.isVacant()) {
        length = (-synX2473int);
      } else {
        this.sueSomething = (this.opinions.contemplations(existingYears));
        this.sueSomething.fixedAccessOpportunity(existingYears);
        length = (this.cipherInciteLonger());
        this.prevailingCommonwealth = (new FussyNation());
        this.speculateKts.augmentRefreshingPositions(length, this);
      }
    } else if (this.prevailingCommonwealth instanceof DeflectSubmit) {

      if (this.crop.isComplete()) {
        length = (-synX2474int);
      } else {
        this.sueSomething.prepareIssueNow(existingYears);
        this.sueSomething.pestlePeriod(this.elbowMoniker);
        this.crop.enque(this.sueSomething, existingYears);
        this.sueSomething = (null);

        if (this.opinions.isVacant()) {
          length = (-synX2475int);
          this.prevailingCommonwealth = (new ThirstNation());
        } else {
          this.sueSomething = (this.opinions.contemplations(existingYears));
          this.sueSomething.fixedAccessOpportunity(existingYears);
          length = (this.cipherInciteLonger());
          this.speculateKts.augmentRefreshingPositions(length, this);
          this.prevailingCommonwealth = (new FussyNation());
        }
      }
    } else {
      length = (-synX2476int);
    }
    return length;
  }

  InterimLap(
      String urgesGens,
      FraInstarArchival response,
      FraInstarArchival production,
      double imply,
      double wander,
      Configuration sked) {
    super(urgesGens, imply, wander, sked);
    this.opinions = (response);
    this.crop = (production);
  }
}
