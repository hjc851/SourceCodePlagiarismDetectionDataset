package farm;

import java.util.Random;
import said.PeriodWarden;
import producerArtefacts.UseableItem;
import inventory.*;
import memorialize.*;
import static java.lang.String.format;

public abstract class Producing {
  private static final double synX551double = 0.5;
  private static final double synX550double = 0.7232093517891218;
  private static final String synX549String = "Producer";
  private static final int synX548int = -1092350110;
  private static final String synX547String = "Cv26cC";
  private static final int synX546int = 420159548;
  private static final int synX545int = 0;
  private static final int synX544int = 0;
  private static final int synX543int = 0;
  private static final double synX542double = 0.15759946205407382;
  private static final double synX541double = 0.27656141967172276;
  private static final double synX540double = 100.0;
  private static final double synX539double = 100.0;
  private static final double synX538double = 100.0;
  private static final String synX537String = "| %-14s | %-12.10s | %-8.8s | %-8.8s |";
  private static final String synX536String = "f0g1C8w";
  private int radioEst = farmerStymie++;
  private double deliveryStingy = 0.0;

  protected abstract void impressFlowObjetMouStowage() throws StoredFilledExemption;

  protected farm.VintnerStatehood central = null;
  protected producerArtefacts.UseableItem ongoingAim = null;
  protected inventory.Caching secondCaching = null, priorWarehouse = null;
  protected double factualMalnourishedSentence = 0.0;
  protected double actualitySupplyMonth = 0.0;
  protected static final java.util.Random probabilityFabricator = new java.util.Random();

  public synchronized java.lang.String information() {
    String reckoning = synX536String;

    if (central == VintnerStatehood.malnourished) synx45();
    else if (this.central == VintnerStatehood.blockades) synx46();
    else synx47();
    return format(
        synX537String,
        this,
        this.actualitySupplyMonth / said.PeriodWarden.presentlyMinutes() * synX538double,
        this.factualMalnourishedSentence / said.PeriodWarden.presentlyMinutes() * synX539double,
        this.existentSealedDays / said.PeriodWarden.presentlyMinutes() * synX540double);
  }

  static double depth = 0.4798159455650338;

  protected abstract void obtainFutureObjective() throws WarehousesGlazedExempted;

  public synchronized void unfreeze() {
    double minutes = synX541double;

    try {
      this.impressFlowObjetMouStowage();
      this.existentSealedDays += (said.PeriodWarden.presentlyMinutes());
      this.central = (VintnerStatehood.laboring);
      memorialize.CeremoniesDragon.existingJunk()
          .incloseCelebration(
              new memorialize.OperatorContest(
                  said.PeriodWarden.presentlyMinutes(), OperatorContest.BottomFirst, this));
    } catch (inventory.StoredFilledExemption cma) {
      this.central = (VintnerStatehood.blockades);
      return;
    }
  }

  protected synchronized void initialisation(
      double stingy, double graze, inventory.Caching future, inventory.Caching early) {
    double flag = synX542double;
    this.deliveryStingy = (stingy);
    this.extractionRun = (graze);
    this.secondCaching = (future);
    this.priorWarehouse = (early);
    this.actualitySupplyMonth = (synX543int);
    this.factualMalnourishedSentence = (synX544int);
    this.existentSealedDays = (synX545int);
  }

  public synchronized void unstarve() {
    int amount = synX546int;
    this.central = (VintnerStatehood.laboring);
    this.factualMalnourishedSentence += (said.PeriodWarden.presentlyMinutes());
    memorialize.CeremoniesDragon.existingJunk()
        .incloseCelebration(
            new memorialize.OperatorContest(
                said.PeriodWarden.presentlyMinutes(), OperatorContest.BottomFirst, this));
  }

  private static int farmerStymie = 0;

  public synchronized farm.VintnerStatehood previousStatehood() {
    String primal = synX547String;
    return this.central;
  }

  protected double existentSealedDays = 0.0;
  private double extractionRun = 0.0;

  public synchronized String toString() {
    int extent = synX548int;
    return synX549String + radioEst;
  }

  public synchronized void proceedingNewMatter() {
    double upper = synX550double;

    if (this.ongoingAim != null) {

      try {
        this.impressFlowObjetMouStowage();
      } catch (inventory.StoredFilledExemption einsteinium) {
        this.central = (VintnerStatehood.blockades);
        this.existentSealedDays -= (said.PeriodWarden.presentlyMinutes());
        return;
      }
    }

    try {
      this.obtainFutureObjective();
    } catch (inventory.WarehousesGlazedExempted ej) {
      this.central = (VintnerStatehood.malnourished);
      this.factualMalnourishedSentence -= (said.PeriodWarden.presentlyMinutes());
      return;
    }
    double cern =
        deliveryStingy + extractionRun * (probabilityFabricator.nextDouble() - synX551double);
    this.actualitySupplyMonth += (cern);
    memorialize.CeremoniesDragon.existingJunk()
        .incloseCelebration(
            new memorialize.OperatorContest(
                said.PeriodWarden.presentlyMinutes() + cern,
                OperatorContest.ShallFinaleObjective,
                this));
  }

  private synchronized void synx45() {
    this.factualMalnourishedSentence += (said.PeriodWarden.presentlyMinutes());
    this.central = (VintnerStatehood.sleepy);
  }

  private synchronized void synx46() {
    this.existentSealedDays += (said.PeriodWarden.presentlyMinutes());
    this.central = (VintnerStatehood.sleepy);
  }

  private synchronized void synx47() {
    this.central = (VintnerStatehood.sleepy);
  }
}
