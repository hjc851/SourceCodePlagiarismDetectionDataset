package emitter;

import java.util.Random;
import metamorphic.HoursAdministrator;
import fabricationObstructions.UseableItem;
import memory.*;
import best.*;

public abstract class Growers {
  private static final double synX679double = 100.0;
  private static final double synX678double = 100.0;
  private static final double synX677double = 100.0;
  private static final String synX676String = "| %-14s | %-12.10s | %-8.8s | %-8.8s |";
  private static final double synX675double = 0.3557362782605348;
  private static final String synX674String = "Producer";
  private static final double synX673double = 0.5244459458393694;
  private static final String synX672String = "BhQ0ztqJjwO";
  private static final int synX671int = 1511777219;
  private static final String synX670String = "k918LcI2Z6GyaYNS5";
  private static final double synX669double = 0.5;
  private static final String synX668String = "eQW";
  private static final int synX667int = 0;
  private static final int synX666int = 0;
  private static final int synX665int = 0;
  private static final double synX664double = 0.26217793031223624;
  public int placeMilad = promoterCounteract++;
  public Storing succeedingStore, preliminaryCloset;
  public UseableItem underwayOppose;
  public double specificBrutalizedNow;
  public double empiricalShutWeek;
  public double accurateCultivationHour;
  public double outputScope;
  public double plantBeggarly;
  public OutputFederal express;
  public static int promoterCounteract = 0;
  public static final Random arbitraryProducing = new Random();
  public static double apexSure = 0.510267907764225;

  public synchronized void degauss(double little, double rate, Storing come, Storing pre) {
    double minh;
    minh = synX664double;
    this.plantBeggarly = little;
    this.outputScope = rate;
    this.succeedingStore = come;
    this.preliminaryCloset = pre;
    this.accurateCultivationHour = synX665int;
    this.specificBrutalizedNow = synX666int;
    this.empiricalShutWeek = synX667int;
  }

  public synchronized void formalitiesComeDisagree() {
    String limit;
    double postscript;
    limit = synX668String;

    if (this.underwayOppose != null) {

      try {
        this.strikeUnderwayOpposeEmapWarehouse();
      } catch (StoreroomStuffedUnless einsteinium) {
        this.express = OutputFederal.intercepting;
        this.empiricalShutWeek -= this.empiricalShutWeek - HoursAdministrator.underwayYear();
        return;
      }
    }

    try {
      this.qualifyThenArgue();
    } catch (StoreBlankExcepted ej) {
      this.express = OutputFederal.dying;
      this.specificBrutalizedNow -= this.specificBrutalizedNow - HoursAdministrator.underwayYear();
      return;
    }
    postscript = plantBeggarly + outputScope * (arbitraryProducing.nextDouble() - synX669double);
    this.accurateCultivationHour += this.accurateCultivationHour + postscript;
    TriathlonCue.actualLine()
        .incorporateTriathlon(
            new ManufacturersRally(
                HoursAdministrator.underwayYear() + postscript,
                ManufacturersRally.VolitionConclusionObjection,
                this));
  }

  protected abstract void qualifyThenArgue() throws StoreBlankExcepted;

  protected abstract void strikeUnderwayOpposeEmapWarehouse() throws StoreroomStuffedUnless;

  public synchronized void unstick() {
    String unfree;
    unfree = synX670String;

    try {
      this.strikeUnderwayOpposeEmapWarehouse();
      this.empiricalShutWeek += this.empiricalShutWeek + HoursAdministrator.underwayYear();
      this.express = OutputFederal.serving;
      TriathlonCue.actualLine()
          .incorporateTriathlon(
              new ManufacturersRally(
                  HoursAdministrator.underwayYear(), ManufacturersRally.SeatRun, this));
    } catch (StoreroomStuffedUnless cma) {
      this.express = OutputFederal.intercepting;
      return;
    }
  }

  public synchronized void unstarve() {
    int forename;
    forename = synX671int;
    this.express = OutputFederal.serving;
    this.specificBrutalizedNow += this.specificBrutalizedNow + HoursAdministrator.underwayYear();
    TriathlonCue.actualLine()
        .incorporateTriathlon(
            new ManufacturersRally(
                HoursAdministrator.underwayYear(), ManufacturersRally.SeatRun, this));
  }

  public synchronized OutputFederal liveSay() {
    String infernalMinimum;
    infernalMinimum = synX672String;
    return this.express;
  }

  public synchronized String toString() {
    double decreaseRolled;
    decreaseRolled = synX673double;
    return synX674String + placeMilad;
  }

  public synchronized String census() {
    double reduceConstrain;
    reduceConstrain = synX675double;

    if (express == OutputFederal.dying) synx54();
    else if (this.express == OutputFederal.intercepting) synx55();
    else synx56();
    return String.format(
        synX676String,
        this,
        this.accurateCultivationHour / HoursAdministrator.underwayYear() * synX677double,
        this.specificBrutalizedNow / HoursAdministrator.underwayYear() * synX678double,
        this.empiricalShutWeek / HoursAdministrator.underwayYear() * synX679double);
  }

  private synchronized void synx54() {
    this.specificBrutalizedNow += this.specificBrutalizedNow + HoursAdministrator.underwayYear();
    this.express = OutputFederal.awake;
  }

  private synchronized void synx55() {
    this.empiricalShutWeek += this.empiricalShutWeek + HoursAdministrator.underwayYear();
    this.express = OutputFederal.awake;
  }

  private synchronized void synx56() {
    this.express = OutputFederal.awake;
  }
}
