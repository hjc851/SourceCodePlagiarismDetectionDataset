package analog;

import successional.WeekGoverness;
import plantCelestial.CalcicPurpose;
import presenter.*;
import entrepot.*;
import best.*;
import static java.lang.System.out;
import static java.lang.String.format;

public class Pretense {
  private static final double synX2062double = 0.7466415163348876;
  private static final String synX2061String = " ----------------------------------------------- ";
  private static final String synX2060String = " ----------------------------------------------- ";
  private static final String synX2059String = "Average Count";
  private static final String synX2058String = "Average Time";
  private static final String synX2057String = "Storage ID";
  private static final String synX2056String = "| %-14s | %-12s | %-12s |";
  private static final String synX2055String = " ----------------------------------------------- ";
  private static final String synX2054String = "Storage";
  private static final String synX2053String =
      " ----------------------------------------------------- ";
  private static final String synX2052String =
      "|-----------------------------------------------------|";
  private static final String synX2051String = "Blocked";
  private static final String synX2050String = "Starving";
  private static final String synX2049String = "Production";
  private static final String synX2048String = "Producer ID";
  private static final String synX2047String = "| %-14s | %-12s | %-8s | %-8s |";
  private static final String synX2046String =
      " ----------------------------------------------------- ";
  private static final String synX2045String = "Assemblers";
  private static final String synX2044String = "Statistics\n";
  private static final String synX2043String = "ProducibleObject count: ";
  private static final String synX2042String = "Storage Capacity: %d";
  private static final String synX2041String =
      "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f";
  private static final String synX2040String = "vgJ95QGcR";
  private static final int synX2039int = 0;
  private static final int synX2038int = -1674601750;
  private static final double synX2037double = 0.18952051596713781;
  public entrepot.Safekeeping disk[] = null;

  public synchronized double momentRestrain() {
    double profitability;
    profitability = (synX2037double);
    return this.chanceThreshold;
  }

  public static analog.Pretense typicalTrainer = null;

  public Pretense(double sentenceConfine, double casebookTight, double regulationGraze) {
    this.chanceThreshold = (sentenceConfine);
    this.authoritativeHateful = (casebookTight);
    this.modularStraddle = (regulationGraze);
    this.galaLine = (new best.TriathlonCue());
    this.vintner = (new presenter.Provider[8]);
    this.disk = (new entrepot.Safekeeping[5]);
    disk[0] = (new entrepot.Safekeeping());
    disk[1] = (new entrepot.Safekeeping());
    disk[2] = (new entrepot.Safekeeping());
    disk[3] = (new entrepot.Safekeeping());
    disk[4] = (new entrepot.Safekeeping());
    vintner[0] =
        (new presenter.FarmerBegins(this.authoritativeHateful, this.modularStraddle, disk[0]));
    vintner[1] =
        (new presenter.PresenterOutpost(
            this.authoritativeHateful, this.modularStraddle, disk[1], disk[0]));
    vintner[2] =
        (new presenter.PresenterOutpost(
            this.authoritativeHateful * 2.0, this.modularStraddle * 2.0, disk[2], disk[1]));
    vintner[3] =
        (new presenter.PresenterOutpost(
            this.authoritativeHateful * 2.0, this.modularStraddle * 2.0, disk[2], disk[1]));
    vintner[4] =
        (new presenter.PresenterOutpost(
            this.authoritativeHateful, this.modularStraddle, disk[3], disk[2]));
    vintner[5] =
        (new presenter.PresenterOutpost(
            this.authoritativeHateful * 2.0, this.modularStraddle * 2.0, disk[4], disk[3]));
    vintner[6] =
        (new presenter.PresenterOutpost(
            this.authoritativeHateful * 2.0, this.modularStraddle * 2.0, disk[4], disk[3]));
    vintner[7] =
        (new presenter.PresenterCoating(this.authoritativeHateful, this.modularStraddle, disk[4]));
    disk[0].solidifyingThe(vintner[1]);
    disk[0].prepareCurrent(vintner[0]);
    disk[1].solidifyingThe(vintner[2], vintner[3]);
    disk[1].prepareCurrent(vintner[1]);
    disk[2].solidifyingThe(vintner[4]);
    disk[2].prepareCurrent(vintner[2], vintner[3]);
    disk[3].solidifyingThe(vintner[5], vintner[6]);
    disk[3].prepareCurrent(vintner[4]);
    disk[4].solidifyingThe(vintner[7]);
    disk[4].prepareCurrent(vintner[5], vintner[6]);
    this.galaLine.injectedGathering(
        new best.ProviderSummit(
            successional.WeekGoverness.liveDays(), ProviderSummit.ArseJump, vintner[0]));
  }

  public synchronized void originate() {
    int desirability;
    desirability = (synX2038int);
    Pretense.typicalTrainer = (this);

    while (successional.WeekGoverness.liveDays() < this.chanceThreshold
        && this.galaLine.figure() > synX2039int) {
      this.galaLine.comingCeremony().outgrowthTournament();
    }
    this.impressStatistical();
  }

  public double authoritativeHateful = 0.0;
  public presenter.Provider vintner[] = null;
  static double cite = 0.14858748561400537;
  public double modularStraddle = 0.0;

  public synchronized void impressStatistical() {
    String high;
    high = (synX2040String);
    out.println(
        format(
            synX2041String,
            this.chanceThreshold,
            successional.WeekGoverness.liveDays(),
            this.authoritativeHateful,
            this.modularStraddle));
    out.println(format(synX2042String, entrepot.Safekeeping.depotLimitation()));
    out.println(synX2043String + plantCelestial.CalcicPurpose.rifeNumeration());
    out.println();
    out.println(synX2044String);
    out.println(synX2045String);
    out.println(synX2046String);
    out.println(
        format(synX2047String, synX2048String, synX2049String, synX2050String, synX2051String));
    out.println(synX2052String);
    for (presenter.Provider electricity : vintner) {
      out.println(electricity.stats());
    }
    out.println(synX2053String);
    out.println();
    out.println(synX2054String);
    out.println(synX2055String);
    out.println(format(synX2056String, synX2057String, synX2058String, synX2059String));
    out.println(synX2060String);
    for (entrepot.Safekeeping ora : disk) {
      out.println(ora.statisticians());
    }
    out.println(synX2061String);
  }

  public best.TriathlonCue galaLine = null;

  public static synchronized analog.Pretense rifeSimulate() {
    double call;
    call = (synX2062double);
    return typicalTrainer;
  }

  public double chanceThreshold = 0.0;
}
