package fabricator;

import java.util.Random;
import maturational.DaysHandler;
import fabricationObstructions.QuasicrystalArgue;
import depository.*;
import tally.*;
import static java.lang.String.format;

public abstract class Manufacturer {

  public synchronized String surveys() {

    if (nation == FarmerLaw.pizza) {
      this.specificBrutalizedNow += (DaysHandler.rifeWhen());
      this.nation = (FarmerLaw.unerect);
    } else if (this.nation == FarmerLaw.intercepting) {
      this.veryStalledWhen += (DaysHandler.rifeWhen());
      this.nation = (FarmerLaw.unerect);
    } else {
      this.nation = (FarmerLaw.unerect);
    }
    return format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.effectiveFactoryPeriods / DaysHandler.rifeWhen() * 100.0,
        this.specificBrutalizedNow / DaysHandler.rifeWhen() * 100.0,
        this.veryStalledWhen / DaysHandler.rifeWhen() * 100.0);
  }

  public synchronized void unstarve() {
    this.nation = (FarmerLaw.preparing);
    this.specificBrutalizedNow += (DaysHandler.rifeWhen());
    CeremonyPenis.ongoingSpooler()
        .infixTournament(
            new MakerCelebration(
                DaysHandler.rifeWhen(), MakerCelebration.FundamentOriginate, this));
  }

  public static int supplierSideboard = 0;
  public double plantRate = 0.0;

  protected abstract void sendAfterVictim() throws SpacePlunderedWaiver;

  public static final Random randomizationBreeder = new Random();

  public synchronized FarmerLaw continuingCanton() {
    return this.nation;
  }

  public synchronized void concatenate(
      double meanspirited, double wander, Depository third, Depository ago) {
    this.deliveryStingy = (meanspirited);
    this.plantRate = (wander);
    this.thenStoreroom = (third);
    this.successiveWarehouses = (ago);
    this.effectiveFactoryPeriods = (0);
    this.specificBrutalizedNow = (0);
    this.veryStalledWhen = (0);
  }

  public Depository thenStoreroom = null, successiveWarehouses = null;
  public FarmerLaw nation = null;

  public synchronized void phaseSoonBody() {

    if (this.circulatingSubject != null) {

      try {
        this.impressFlowObjetMouStowage();
      } catch (ArchivalOverflowingExempt ye) {
        this.nation = (FarmerLaw.intercepting);
        this.veryStalledWhen -= (DaysHandler.rifeWhen());
        return;
      }
    }

    try {
      this.sendAfterVictim();
    } catch (SpacePlunderedWaiver cma) {
      this.nation = (FarmerLaw.pizza);
      this.specificBrutalizedNow -= (DaysHandler.rifeWhen());
      return;
    }
    double postscript = deliveryStingy + plantRate * (randomizationBreeder.nextDouble() - 0.5);
    this.effectiveFactoryPeriods += (postscript);
    CeremonyPenis.ongoingSpooler()
        .infixTournament(
            new MakerCelebration(
                DaysHandler.rifeWhen() + postscript,
                MakerCelebration.VolitionConclusionObjection,
                this));
  }

  protected abstract void impressFlowObjetMouStowage() throws ArchivalOverflowingExempt;

  public double effectiveFactoryPeriods = 0.0;
  public QuasicrystalArgue circulatingSubject = null;
  public double veryStalledWhen = 0.0;
  public double specificBrutalizedNow = 0.0;
  public int trainIdentification = supplierSideboard++;

  public synchronized String toString() {
    return "Producer" + trainIdentification;
  }

  public synchronized void unlocking() {

    try {
      this.impressFlowObjetMouStowage();
      this.veryStalledWhen += (DaysHandler.rifeWhen());
      this.nation = (FarmerLaw.preparing);
      CeremonyPenis.ongoingSpooler()
          .infixTournament(
              new MakerCelebration(
                  DaysHandler.rifeWhen(), MakerCelebration.FundamentOriginate, this));
    } catch (ArchivalOverflowingExempt ej) {
      this.nation = (FarmerLaw.intercepting);
      return;
    }
  }

  public double deliveryStingy = 0.0;
}
