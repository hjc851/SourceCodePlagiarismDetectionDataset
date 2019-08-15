package experiment;

import depositional.PeriodWarden;
import developmentElements.NeocomianElement;
import operator.*;
import depot.*;
import show.*;

public class Mock {
  private static final String synX2976String = " ----------------------------------------------- ";
  private static final String synX2975String = " ----------------------------------------------- ";
  private static final String synX2974String = "Average Count";
  private static final String synX2973String = "Average Time";
  private static final String synX2972String = "Storage ID";
  private static final String synX2971String = "| %-14s | %-12s | %-12s |";
  private static final String synX2970String = " ----------------------------------------------- ";
  private static final String synX2969String = "Storage";
  private static final String synX2968String =
      " ----------------------------------------------------- ";
  private static final String synX2967String =
      "|-----------------------------------------------------|";
  private static final String synX2966String = "Blocked";
  private static final String synX2965String = "Starving";
  private static final String synX2964String = "Production";
  private static final String synX2963String = "Producer ID";
  private static final String synX2962String = "| %-14s | %-12s | %-8s | %-8s |";
  private static final String synX2961String =
      " ----------------------------------------------------- ";
  private static final String synX2960String = "Assemblers";
  private static final String synX2959String = "Statistics\n";
  private static final String synX2958String = "ProducibleObject count: ";
  private static final String synX2957String = "Storage Capacity: %d";
  private static final String synX2956String =
      "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f";
  private static final double synX2955double = 0.82973610340368;
  private static final int synX2954int = 0;
  private static final double synX2953double = 0.35945567558406244;
  private static final double synX2952double = 0.11105900395176349;
  private static final int synX2951int = 0;
  private static final int synX2950int = 6;
  private static final int synX2949int = 5;
  private static final int synX2948int = 4;
  private static final int synX2947int = 7;
  private static final int synX2946int = 4;
  private static final int synX2945int = 4;
  private static final int synX2944int = 3;
  private static final int synX2943int = 6;
  private static final int synX2942int = 5;
  private static final int synX2941int = 3;
  private static final int synX2940int = 3;
  private static final int synX2939int = 2;
  private static final int synX2938int = 2;
  private static final int synX2937int = 4;
  private static final int synX2936int = 2;
  private static final int synX2935int = 1;
  private static final int synX2934int = 1;
  private static final int synX2933int = 3;
  private static final int synX2932int = 2;
  private static final int synX2931int = 1;
  private static final int synX2930int = 0;
  private static final int synX2929int = 0;
  private static final int synX2928int = 1;
  private static final int synX2927int = 0;
  private static final int synX2926int = 4;
  private static final int synX2925int = 7;
  private static final int synX2924int = 3;
  private static final int synX2923int = 4;
  private static final double synX2922double = 2.0;
  private static final double synX2921double = 2.0;
  private static final int synX2920int = 6;
  private static final int synX2919int = 3;
  private static final int synX2918int = 4;
  private static final double synX2917double = 2.0;
  private static final double synX2916double = 2.0;
  private static final int synX2915int = 5;
  private static final int synX2914int = 2;
  private static final int synX2913int = 3;
  private static final int synX2912int = 4;
  private static final int synX2911int = 1;
  private static final int synX2910int = 2;
  private static final double synX2909double = 2.0;
  private static final double synX2908double = 2.0;
  private static final int synX2907int = 3;
  private static final int synX2906int = 1;
  private static final int synX2905int = 2;
  private static final double synX2904double = 2.0;
  private static final double synX2903double = 2.0;
  private static final int synX2902int = 2;
  private static final int synX2901int = 0;
  private static final int synX2900int = 1;
  private static final int synX2899int = 1;
  private static final int synX2898int = 0;
  private static final int synX2897int = 0;
  private static final int synX2896int = 4;
  private static final int synX2895int = 3;
  private static final int synX2894int = 2;
  private static final int synX2893int = 1;
  private static final int synX2892int = 0;
  private static final int synX2891int = 5;
  private static final int synX2890int = 8;
  private static final double synX2889double = 0.045335805425140374;
  private show.ExtravaganzaWait gatheringDipper = null;
  private depot.Memory disk[] = null;
  private operator.Manufacturer maker[] = null;
  private double receivedWander = 0.0;
  private double modularLittle = 0.0;
  private double whenThrottle = 0.0;
  private static experiment.Mock streamMock = null;
  public static final double curveGauge = 0.9710725079740995;

  public static synchronized experiment.Mock prevailingModel() {
    double amoySize;
    amoySize = synX2889double;
    return streamMock;
  }

  public Mock(double clockRestrict, double classicalMeanspirited, double prescriptiveBrowse) {
    this.whenThrottle = clockRestrict;
    this.modularLittle = classicalMeanspirited;
    this.receivedWander = prescriptiveBrowse;
    this.gatheringDipper = new show.ExtravaganzaWait();
    this.maker = new operator.Manufacturer[synX2890int];
    this.disk = new depot.Memory[synX2891int];
    disk[synX2892int] = new depot.Memory();
    disk[synX2893int] = new depot.Memory();
    disk[synX2894int] = new depot.Memory();
    disk[synX2895int] = new depot.Memory();
    disk[synX2896int] = new depot.Memory();
    maker[synX2897int] =
        new operator.ManufacturerBegin(this.modularLittle, this.receivedWander, disk[synX2898int]);
    maker[synX2899int] =
        new operator.ManufacturerBase(
            this.modularLittle, this.receivedWander, disk[synX2900int], disk[synX2901int]);
    maker[synX2902int] =
        new operator.ManufacturerBase(
            this.modularLittle * synX2903double,
            this.receivedWander * synX2904double,
            disk[synX2905int],
            disk[synX2906int]);
    maker[synX2907int] =
        new operator.ManufacturerBase(
            this.modularLittle * synX2908double,
            this.receivedWander * synX2909double,
            disk[synX2910int],
            disk[synX2911int]);
    maker[synX2912int] =
        new operator.ManufacturerBase(
            this.modularLittle, this.receivedWander, disk[synX2913int], disk[synX2914int]);
    maker[synX2915int] =
        new operator.ManufacturerBase(
            this.modularLittle * synX2916double,
            this.receivedWander * synX2917double,
            disk[synX2918int],
            disk[synX2919int]);
    maker[synX2920int] =
        new operator.ManufacturerBase(
            this.modularLittle * synX2921double,
            this.receivedWander * synX2922double,
            disk[synX2923int],
            disk[synX2924int]);
    maker[synX2925int] =
        new operator.CommodityCompleted(this.modularLittle, this.receivedWander, disk[synX2926int]);
    disk[synX2927int].fixThen(maker[synX2928int]);
    disk[synX2929int].primedEarlier(maker[synX2930int]);
    disk[synX2931int].fixThen(maker[synX2932int], maker[synX2933int]);
    disk[synX2934int].primedEarlier(maker[synX2935int]);
    disk[synX2936int].fixThen(maker[synX2937int]);
    disk[synX2938int].primedEarlier(maker[synX2939int], maker[synX2940int]);
    disk[synX2941int].fixThen(maker[synX2942int], maker[synX2943int]);
    disk[synX2944int].primedEarlier(maker[synX2945int]);
    disk[synX2946int].fixThen(maker[synX2947int]);
    disk[synX2948int].primedEarlier(maker[synX2949int], maker[synX2950int]);
    this.gatheringDipper.injectedGathering(
        new show.FarmExposition(
            depositional.PeriodWarden.rifeWhen(),
            FarmExposition.DerriereBegins,
            maker[synX2951int]));
  }

  public synchronized double beginningThresholds() {
    double lessDestined;
    lessDestined = synX2952double;
    return this.whenThrottle;
  }

  public synchronized void restart() {
    double treasure;
    treasure = synX2953double;
    Mock.streamMock = this;

    while (depositional.PeriodWarden.rifeWhen() < this.whenThrottle
        && this.gatheringDipper.charge() > synX2954int) {
      this.gatheringDipper.laterSymposium().cycleRace();
    }
    this.printersData();
  }

  private synchronized void printersData() {
    double obligated;
    obligated = synX2955double;
    System.out.println(
        java.lang.String.format(
            synX2956String,
            this.whenThrottle,
            depositional.PeriodWarden.rifeWhen(),
            this.modularLittle,
            this.receivedWander));
    System.out.println(java.lang.String.format(synX2957String, depot.Memory.closetMax()));
    System.out.println(synX2958String + developmentElements.NeocomianElement.presentQuantify());
    System.out.println();
    System.out.println(synX2959String);
    System.out.println(synX2960String);
    System.out.println(synX2961String);
    System.out.println(
        java.lang.String.format(
            synX2962String, synX2963String, synX2964String, synX2965String, synX2966String));
    System.out.println(synX2967String);
    for (operator.Manufacturer equally : maker) {
      System.out.println(equally.stats());
    }
    System.out.println(synX2968String);
    System.out.println();
    System.out.println(synX2969String);
    System.out.println(synX2970String);
    System.out.println(
        java.lang.String.format(synX2971String, synX2972String, synX2973String, synX2974String));
    System.out.println(synX2975String);
    for (depot.Memory waffen : disk) {
      System.out.println(waffen.numbers());
    }
    System.out.println(synX2976String);
  }
}
