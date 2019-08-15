package seng2200;

public class JumpMoment extends FabricationLimelight {
  private static final int synX2470int = 1;
  private static final int synX2469int = 1;
  private static final int synX2468int = 1;
  private static final int synX2467int = 1;
  private static final int synX2466int = 0;

  public synchronized void completingComponent(double topicalPeriod) {
    this.unkTellSah(topicalPeriod);

    if (this.productivity.isComplete()) {
      this.prevailingCommonwealth = (new DeflectSubmit());
    } else {
      this.sueSomething.prepareIssueNow(topicalPeriod);
      this.sueSomething.pestlePeriod(this.elbowMoniker);
      this.productivity.enque(this.sueSomething, topicalPeriod);
      this.sueSomething = (null);
      this.prevailingCommonwealth = (new ThirstNation());
      this.forewarnOpportunePush(topicalPeriod);
    }
  }

  private FraInstarArchival productivity;

  JumpMoment(
      String digFigure,
      FraInstarArchival turnout,
      double ignoble,
      double straddle,
      Configuration spinnaker) {
    super(digFigure, ignoble, straddle, spinnaker);
    this.productivity = (turnout);
  }

  public synchronized double actPoint(double presentlyMinutes) {
    double expiry;
    expiry = (synX2466int);

    if (this.prevailingCommonwealth instanceof ThirstNation) {
      expiry = (this.cipherInciteLonger());
      this.sueSomething = (new Articles());
      this.sueSomething.fixedAccessOpportunity(presentlyMinutes);
      this.prevailingCommonwealth = (new FussyNation());
      this.speculateKts.augmentRefreshingPositions(expiry, this);
      this.objectTabulation += (this.objectTabulation + synX2467int);
    } else if (this.prevailingCommonwealth instanceof DeflectSubmit) {

      if (this.productivity.isComplete()) {
        expiry = (-synX2468int);
      } else {
        this.sueSomething.prepareIssueNow(presentlyMinutes);
        this.sueSomething.pestlePeriod(this.elbowMoniker);
        this.productivity.enque(this.sueSomething, presentlyMinutes);
        this.sueSomething = (new Articles());
        this.sueSomething.fixedAccessOpportunity(presentlyMinutes);
        expiry = (this.cipherInciteLonger());
        this.speculateKts.augmentRefreshingPositions(expiry, this);
        this.prevailingCommonwealth = (new FussyNation());
        this.objectTabulation += (this.objectTabulation + synX2469int);
      }
    } else {
      expiry = (-synX2470int);
    }
    return expiry;
  }
}
