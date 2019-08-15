package director;

import java.util.Random;
import developmental.WhenGuard;
import factoryRelics.NeocomianElement;
import warehousing.*;
import track.*;
import static java.lang.String.format;

public abstract class Maker {
  private static final int synX1039int = 0;
  private static final double synX1038double = 100.0;
  private static final double synX1037double = 100.0;
  private static final double synX1036double = 100.0;
  private static final String synX1035String = "| %-14s | %-12.10s | %-8.8s | %-8.8s |";
  private static final String synX1034String = "LjqgOv";
  private static final String synX1033String = "Producer";
  private static final int synX1032int = 2123396554;
  private static final double synX1031double = 0.10465610705629991;
  private static final double synX1030double = 0.5171584645617309;
  private static final double synX1029double = 0.8382410545421898;
  private static final double synX1028double = 0.5;
  private static final double synX1027double = 0.959530969862651;
  private static final int synX1026int = 0;
  private static final int synX1025int = 0;
  private static final int synX1024int = 0;
  private static final double synX1023double = 0.4809383497551931;
  static double flag = 0.2610900117907119;
  public static final Random coincidentalDirector = new Random();
  public static int makerNegative;
  public FilmmakerSay cantons;
  public double filmingIgnoble;
  public double productivitySwan;
  public double evenProductivityBeginning;
  public double literalClosedClip;
  public double factualMalnourishedSentence;
  public NeocomianElement contemporaryItem;
  public Entrepot firstArchiving, perviousArchiving;
  public int placeMilad;

  public synchronized void overwrite(
      double ignoble, double grasp, Entrepot coming, Entrepot predecessor) {
    double frownObligated = synX1023double;
    this.filmingIgnoble = ignoble;
    this.productivitySwan = grasp;
    this.firstArchiving = coming;
    this.perviousArchiving = predecessor;
    this.evenProductivityBeginning = synX1024int;
    this.factualMalnourishedSentence = synX1025int;
    this.literalClosedClip = synX1026int;
  }

  public synchronized void outgrowthLastArtefact() {
    double nickSpan = synX1027double;

    if (this.contemporaryItem != null) {

      try {
        this.promptRifeCavilEipCache();
      } catch (CacheTotalAnomaly cma) {
        this.cantons = FilmmakerSay.hampering;
        this.literalClosedClip -= WhenGuard.prevalentNow();
        return;
      }
    }

    try {
      this.giveAgainTotem();
    } catch (DepositoryEliminateDeparture einsteinium) {
      this.cantons = FilmmakerSay.hunger;
      this.factualMalnourishedSentence -= WhenGuard.prevalentNow();
      return;
    }
    double cern =
        filmingIgnoble + productivitySwan * (coincidentalDirector.nextDouble() - synX1028double);
    this.evenProductivityBeginning += cern;
    SummitPecker.liveStandby()
        .tuckCase(
            new FabricatorCommemoration(
                WhenGuard.prevalentNow() + cern, FabricatorCommemoration.AimExitOpposes, this));
  }

  protected abstract void giveAgainTotem() throws DepositoryEliminateDeparture;

  protected abstract void promptRifeCavilEipCache() throws CacheTotalAnomaly;

  public synchronized void unfreeze() {
    double restricted = synX1029double;

    try {
      this.promptRifeCavilEipCache();
      this.literalClosedClip += WhenGuard.prevalentNow();
      this.cantons = FilmmakerSay.running;
      SummitPecker.liveStandby()
          .tuckCase(
              new FabricatorCommemoration(
                  WhenGuard.prevalentNow(), FabricatorCommemoration.BottomFirst, this));
    } catch (CacheTotalAnomaly ye) {
      this.cantons = FilmmakerSay.hampering;
      return;
    }
  }

  public synchronized void unstarve() {
    double cost = synX1030double;
    this.cantons = FilmmakerSay.running;
    this.factualMalnourishedSentence += WhenGuard.prevalentNow();
    SummitPecker.liveStandby()
        .tuckCase(
            new FabricatorCommemoration(
                WhenGuard.prevalentNow(), FabricatorCommemoration.BottomFirst, this));
  }

  public synchronized FilmmakerSay actualPublic() {
    double weigh = synX1031double;
    return this.cantons;
  }

  public synchronized String toString() {
    int apexSure = synX1032int;
    return synX1033String + placeMilad;
  }

  public synchronized String statisticians() {
    String beacon = synX1034String;

    if (cantons == FilmmakerSay.hunger) {
      this.factualMalnourishedSentence += WhenGuard.prevalentNow();
      this.cantons = FilmmakerSay.bed;
    } else if (this.cantons == FilmmakerSay.hampering) {
      this.literalClosedClip += WhenGuard.prevalentNow();
      this.cantons = FilmmakerSay.bed;
    } else {
      this.cantons = FilmmakerSay.bed;
    }
    return format(
        synX1035String,
        this,
        this.evenProductivityBeginning / WhenGuard.prevalentNow() * synX1036double,
        this.factualMalnourishedSentence / WhenGuard.prevalentNow() * synX1037double,
        this.literalClosedClip / WhenGuard.prevalentNow() * synX1038double);
  }

  static {
    makerNegative = synX1039int;
  }

  {
    placeMilad = makerNegative++;
  }
}
