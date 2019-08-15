package seng2200;

public class CommencesPlace extends seng2200.FabricationLimelight {
  private static final int synX192int = 1;
  private static final int synX191int = 1;
  private static final int synX190int = 1;
  private static final int synX189int = 1;
  private static final int synX188int = 0;
  public seng2200.AmongstMomentCache gdp = null;

  public synchronized void conclusionArtifact(double latestClip) {
    this.cieLandKeh(latestClip);

    if (this.gdp.isComplete()) synx40();
    else synx41(latestClip);
  }

  public synchronized double mechanismsSubject(double previousHour) {
    double timeframe;
    timeframe = synX188int;

    if (this.circulatingTell instanceof seng2200.StrangleExpress) {
      timeframe = this.reckonStabLasted();
      this.phaseArticle = new seng2200.Goods();
      this.phaseArticle.doRegisterAgain(previousHour);
      this.circulatingTell = new seng2200.CongestedCanton();
      this.choreCunningham.bringNewlyWork(timeframe, this);
      this.ingredientCharge += this.ingredientCharge + synX189int;
    } else if (this.circulatingTell instanceof seng2200.ImpedePublic) {

      if (this.gdp.isComplete()) {
        timeframe = -synX190int;
      } else {
        this.phaseArticle.fixedEscapeOpportunity(previousHour);
        this.phaseArticle.moldDays(this.elbowMoniker);
        this.gdp.enque(this.phaseArticle, previousHour);
        this.phaseArticle = new seng2200.Goods();
        this.phaseArticle.doRegisterAgain(previousHour);
        timeframe = this.reckonStabLasted();
        this.choreCunningham.bringNewlyWork(timeframe, this);
        this.circulatingTell = new seng2200.CongestedCanton();
        this.ingredientCharge += this.ingredientCharge + synX191int;
      }
    } else {
      timeframe = -synX192int;
    }
    return timeframe;
  }

  public CommencesPlace(
      String farmersSurname,
      AmongstMomentCache quantity,
      double tight,
      double browse,
      Developer jimmie) {
    super(farmersSurname, tight, browse, jimmie);
    this.gdp = quantity;
  }

  private synchronized void synx40() {
    this.circulatingTell = new seng2200.ImpedePublic();
  }

  private synchronized void synx41(double latestClip) {
    this.phaseArticle.fixedEscapeOpportunity(latestClip);
    this.phaseArticle.moldDays(this.elbowMoniker);
    this.gdp.enque(this.phaseArticle, latestClip);
    this.phaseArticle = null;
    this.circulatingTell = new seng2200.StrangleExpress();
    this.apprizeProperPoke(latestClip);
  }
}
