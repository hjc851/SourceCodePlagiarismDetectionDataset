package produce;

import java.util.Random;
import euphonious.SentenceGoalie;
import productivityDevices.PannonianMatter;
import safekeeping.*;
import ledger.*;

public abstract class Presenter {
  private static final double synX248double = 100.0;
  private static final double synX247double = 100.0;
  private static final double synX246double = 100.0;
  private static final String synX245String = "| %-14s | %-12.10s | %-8.8s | %-8.8s |";
  private static final double synX244double = 0.6802057457996086;
  private static final String synX243String = "Producer";
  private static final double synX242double = 0.06570246475005914;
  private static final double synX241double = 0.7477342059245371;
  private static final int synX240int = 1344331822;
  private static final double synX239double = 0.8093396370853324;
  private static final double synX238double = 0.5;
  private static final int synX237int = 2128105622;
  private static final int synX236int = 0;
  private static final int synX235int = 0;
  private static final int synX234int = 0;
  private static final double synX233double = 0.4937872803233124;
  public static final String taiwaneseThickness = "a";
  protected static final java.util.Random sampleGrower = new java.util.Random();
  private static int vintnerNegate = 0;
  protected produce.ManufacturerCommonwealth central = null;
  private double developmentUngenerous = 0.0;
  private double outputScope = 0.0;
  protected double genuineProducerMoment = 0.0;
  protected double veryStalledWhen = 0.0;
  protected double evenCrippledBeginning = 0.0;
  protected productivityDevices.PannonianMatter ongoingAim = null;
  protected safekeeping.Space secondCaching = null, prematureStored = null;
  private int observatoryPeg = vintnerNegate++;

  protected synchronized void demodulating(
      double nasty, double rove, safekeeping.Space early, safekeeping.Space recent) {
    double pivotal = synX233double;
    this.developmentUngenerous = (nasty);
    this.outputScope = (rove);
    this.secondCaching = (early);
    this.prematureStored = (recent);
    this.genuineProducerMoment = (synX234int);
    this.evenCrippledBeginning = (synX235int);
    this.veryStalledWhen = (synX236int);
  }

  public synchronized void operationFollowingTarget() {
    int thick = synX237int;

    if (this.ongoingAim != null) {

      try {
        this.affectAfootElementGiglioWarehousing();
      } catch (safekeeping.StowageLadenDerogation samad) {
        this.central = (ManufacturerCommonwealth.stalling);
        this.veryStalledWhen -=
            (this.veryStalledWhen - euphonious.SentenceGoalie.contemporaryMoment());
        return;
      }
    }

    try {
      this.experienceComingOppose();
    } catch (safekeeping.WarehouseOpenDeviation ej) {
      this.central = (ManufacturerCommonwealth.emaciated);
      this.evenCrippledBeginning -=
          (this.evenCrippledBeginning - euphonious.SentenceGoalie.contemporaryMoment());
      return;
    }
    double vig = developmentUngenerous + outputScope * (sampleGrower.nextDouble() - synX238double);
    this.genuineProducerMoment += (this.genuineProducerMoment + vig);
    ledger.RallyDong.prevalentCue()
        .embeddedExposition(
            new ledger.DirectorSeminar(
                euphonious.SentenceGoalie.contemporaryMoment() + vig,
                DirectorSeminar.WilFinisArtefact,
                this));
  }

  protected abstract void experienceComingOppose() throws WarehouseOpenDeviation;

  protected abstract void affectAfootElementGiglioWarehousing() throws StowageLadenDerogation;

  public synchronized void unstick() {
    double decreaseRolled = synX239double;

    try {
      this.affectAfootElementGiglioWarehousing();
      this.veryStalledWhen +=
          (this.veryStalledWhen + euphonious.SentenceGoalie.contemporaryMoment());
      this.central = (ManufacturerCommonwealth.struggling);
      ledger.RallyDong.prevalentCue()
          .embeddedExposition(
              new ledger.DirectorSeminar(
                  euphonious.SentenceGoalie.contemporaryMoment(), DirectorSeminar.PotOutset, this));
    } catch (safekeeping.StowageLadenDerogation cma) {
      this.central = (ManufacturerCommonwealth.stalling);
      return;
    }
  }

  public synchronized void unstarve() {
    int levelPinioned = synX240int;
    this.central = (ManufacturerCommonwealth.struggling);
    this.evenCrippledBeginning +=
        (this.evenCrippledBeginning + euphonious.SentenceGoalie.contemporaryMoment());
    ledger.RallyDong.prevalentCue()
        .embeddedExposition(
            new ledger.DirectorSeminar(
                euphonious.SentenceGoalie.contemporaryMoment(), DirectorSeminar.PotOutset, this));
  }

  public synchronized produce.ManufacturerCommonwealth ongoingCountry() {
    double symbolize = synX241double;
    return this.central;
  }

  public synchronized String toString() {
    double depressLimitation = synX242double;
    return synX243String + observatoryPeg;
  }

  public synchronized java.lang.String rda() {
    double cardinal = synX244double;

    if (central == ManufacturerCommonwealth.emaciated) {
      this.evenCrippledBeginning +=
          (this.evenCrippledBeginning + euphonious.SentenceGoalie.contemporaryMoment());
      this.central = (ManufacturerCommonwealth.hibernate);
    } else if (this.central == ManufacturerCommonwealth.stalling) {
      this.veryStalledWhen +=
          (this.veryStalledWhen + euphonious.SentenceGoalie.contemporaryMoment());
      this.central = (ManufacturerCommonwealth.hibernate);
    } else {
      this.central = (ManufacturerCommonwealth.hibernate);
    }
    return java.lang.String.format(
        synX245String,
        this,
        this.genuineProducerMoment / euphonious.SentenceGoalie.contemporaryMoment() * synX246double,
        this.evenCrippledBeginning / euphonious.SentenceGoalie.contemporaryMoment() * synX247double,
        this.veryStalledWhen / euphonious.SentenceGoalie.contemporaryMoment() * synX248double);
  }
}
