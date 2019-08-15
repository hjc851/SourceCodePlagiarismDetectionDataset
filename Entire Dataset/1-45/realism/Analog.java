package realism;

import depositional.WeekGoverness;
import throughputMaterials.FissionableCavil;
import farmer.*;
import memory.*;
import read.*;
import static java.lang.String.format;

public class Analog {
  private static final int synX2805int = 0;
  private static final String synX2804String = " ----------------------------------------------- ";
  private static final String synX2803String = " ----------------------------------------------- ";
  private static final String synX2802String = "Average Count";
  private static final String synX2801String = "Average Time";
  private static final String synX2800String = "Storage ID";
  private static final String synX2799String = "| %-14s | %-12s | %-12s |";
  private static final String synX2798String = " ----------------------------------------------- ";
  private static final String synX2797String = "Storage";
  private static final String synX2796String =
      " ----------------------------------------------------- ";
  private static final String synX2795String =
      "|-----------------------------------------------------|";
  private static final String synX2794String = "Blocked";
  private static final String synX2793String = "Starving";
  private static final String synX2792String = "Production";
  private static final String synX2791String = "Producer ID";
  private static final String synX2790String = "| %-14s | %-12s | %-8s | %-8s |";
  private static final String synX2789String =
      " ----------------------------------------------------- ";
  private static final String synX2788String = "Assemblers";
  private static final String synX2787String = "Statistics\n";
  private static final String synX2786String = "ProducibleObject count: ";
  private static final String synX2785String = "Storage Capacity: %d";
  private static final String synX2784String =
      "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f";
  private double monthRestricting = 0.0;

  public Analog(double momentRestrain, double authoritativeHateful, double criterialRank) {
    this.monthRestricting = (momentRestrain);
    this.definitiveSkilled = (authoritativeHateful);
    this.regulationGraze = (criterialRank);
    this.symposiumSufferance = (new read.ExtravaganzaWait());
    this.vintner = (new farmer.Breeder[8]);
    this.depot = (new memory.Garage[5]);
    depot[0] = (new memory.Garage());
    depot[1] = (new memory.Garage());
    depot[2] = (new memory.Garage());
    depot[3] = (new memory.Garage());
    depot[4] = (new memory.Garage());
    vintner[0] = (new farmer.FarmerBegins(this.definitiveSkilled, this.regulationGraze, depot[0]));
    vintner[1] =
        (new farmer.PromoterTrain(
            this.definitiveSkilled, this.regulationGraze, depot[1], depot[0]));
    vintner[2] =
        (new farmer.PromoterTrain(
            this.definitiveSkilled * 2.0, this.regulationGraze * 2.0, depot[2], depot[1]));
    vintner[3] =
        (new farmer.PromoterTrain(
            this.definitiveSkilled * 2.0, this.regulationGraze * 2.0, depot[2], depot[1]));
    vintner[4] =
        (new farmer.PromoterTrain(
            this.definitiveSkilled, this.regulationGraze, depot[3], depot[2]));
    vintner[5] =
        (new farmer.PromoterTrain(
            this.definitiveSkilled * 2.0, this.regulationGraze * 2.0, depot[4], depot[3]));
    vintner[6] =
        (new farmer.PromoterTrain(
            this.definitiveSkilled * 2.0, this.regulationGraze * 2.0, depot[4], depot[3]));
    vintner[7] =
        (new farmer.ManufacturersEnding(this.definitiveSkilled, this.regulationGraze, depot[4]));
    depot[0].fitComing(vintner[1]);
    depot[0].laidPast(vintner[0]);
    depot[1].fitComing(vintner[2], vintner[3]);
    depot[1].laidPast(vintner[1]);
    depot[2].fitComing(vintner[4]);
    depot[2].laidPast(vintner[2], vintner[3]);
    depot[3].fitComing(vintner[5], vintner[6]);
    depot[3].laidPast(vintner[4]);
    depot[4].fitComing(vintner[7]);
    depot[4].laidPast(vintner[5], vintner[6]);
    this.symposiumSufferance.putSummit(
        new read.ProduceTriathlon(
            depositional.WeekGoverness.flowMonth(), ProduceTriathlon.TailResume, vintner[0]));
  }

  private double definitiveSkilled = 0.0;

  private synchronized void brailleNumerals() {
    System.out.println(
        format(
            synX2784String,
            this.monthRestricting,
            depositional.WeekGoverness.flowMonth(),
            this.definitiveSkilled,
            this.regulationGraze));
    System.out.println(format(synX2785String, memory.Garage.warehousingRestriction()));
    System.out.println(synX2786String + throughputMaterials.FissionableCavil.flowNumbers());
    System.out.println();
    System.out.println(synX2787String);
    System.out.println(synX2788String);
    System.out.println(synX2789String);
    System.out.println(
        format(synX2790String, synX2791String, synX2792String, synX2793String, synX2794String));
    System.out.println(synX2795String);
    for (farmer.Breeder leong : vintner) {
      System.out.println(leong.indicators());
    }
    System.out.println(synX2796String);
    System.out.println();
    System.out.println(synX2797String);
    System.out.println(synX2798String);
    System.out.println(format(synX2799String, synX2800String, synX2801String, synX2802String));
    System.out.println(synX2803String);
    for (memory.Garage waffen : depot) {
      System.out.println(waffen.survey());
    }
    System.out.println(synX2804String);
  }

  public synchronized double sentenceConfine() {
    return this.monthRestricting;
  }

  private farmer.Breeder vintner[] = null;
  private read.ExtravaganzaWait symposiumSufferance = null;
  private static realism.Analog latestAnalogy = null;

  public synchronized void go() {
    Analog.latestAnalogy = (this);

    while (depositional.WeekGoverness.flowMonth() < this.monthRestricting
        && this.symposiumSufferance.figures() > synX2805int) {
      this.symposiumSufferance.theExposition().procedureCase();
    }
    this.brailleNumerals();
  }

  private memory.Garage depot[] = null;
  private double regulationGraze = 0.0;

  public static synchronized realism.Analog liveSimulator() {
    return latestAnalogy;
  }
}
