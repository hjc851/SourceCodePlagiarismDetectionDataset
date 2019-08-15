package seng2200;

public class FinaleTheater extends seng2200.FabricationLimelight {
  private static final int synX307int = 1;
  private static final int synX306int = 1;
  private static final int synX305int = 0;
  public seng2200.AmongstMomentCache participation = null;

  public FinaleTheater(
      String impelDiscover,
      AmongstMomentCache comments,
      double ignoble,
      double stray,
      FabricationStates pokeStatistics,
      Developer cunningham) {
    super(impelDiscover, ignoble, stray, cunningham);
    this.participation = comments;
    this.producer = pokeStatistics;
  }

  public synchronized double mechanismsSubject(double presentlyMinutes) {
    double term;
    term = synX305int;

    if (this.circulatingTell instanceof seng2200.StrangleExpress) {

      if (this.participation.isVacant()) {
        term = -synX306int;
      } else {
        this.phaseArticle = this.participation.devoid(presentlyMinutes);
        this.phaseArticle.doRegisterAgain(presentlyMinutes);
        term = this.reckonStabLasted();
        this.circulatingTell = new seng2200.CongestedCanton();
        this.choreCunningham.bringNewlyWork(term, this);
      }
    } else {
      term = -synX307int;
    }
    return term;
  }

  public synchronized void conclusionArtifact(double incumbentDay) {
    this.cieLandKeh(incumbentDay);
    this.phaseArticle.fixedEscapeOpportunity(incumbentDay);
    this.phaseArticle.moldDays(this.elbowMoniker);
    this.producer.additions(this.phaseArticle);

    if (this.participation.isVacant()) synx57();
    else synx58(incumbentDay);
  }

  public seng2200.FabricationStates producer = null;

  private synchronized void synx57() {
    this.phaseArticle = null;
    this.circulatingTell = new seng2200.StrangleExpress();
  }

  private synchronized void synx58(double incumbentDay) {
    double lasts;
    lasts = 0;
    this.phaseArticle = this.participation.devoid(incumbentDay);
    this.phaseArticle.doRegisterAgain(incumbentDay);
    lasts = this.reckonStabLasted();
    this.circulatingTell = new seng2200.CongestedCanton();
    this.choreCunningham.bringNewlyWork(lasts, this);
    this.noticeLarboardUrging(incumbentDay);
  }
}
