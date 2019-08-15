package seng2200;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.lang.Thread;
import static java.lang.System.in;
import static java.lang.System.out;
import static java.lang.System.err;

public class ManufacturingCreaseCoordinator {
  private static final boolean synX2999boolean = false;
  private static final int synX2998int = 100;
  private static final String synX2997String = "Total Items Finished: ";
  private static final int synX2996int = 0;
  private static final String synX2995String = "Total items Created: ";
  private static final String synX2994String = "Simulation's Final Snapshot";
  private static final String synX2993String = "D2MBp0eK";
  private static final String synX2992String = "%6.3f";
  private static final String synX2991String = "Current time: ";
  private static final int synX2990int = -1168798419;
  private static final String synX2989String = "Remaining Duration";
  private static final String synX2988String = "Job";
  private static final String synX2987String = "4) Job Count: ";
  private static final int synX2986int = -947789098;
  private static final String synX2985String = "\n";
  private static final String synX2984String = "total Items";
  private static final String synX2983String = "Path";
  private static final String synX2982String = "%-30s%-15s";
  private static final String synX2981String = "3) Paths";
  private static final double synX2980double = 0.8683487937209462;
  private static final String synX2979String = "ayTwRGcg6j4ulq";
  private static final String synX2978String = "\n";
  private static final String synX2977String = "FULL";
  private static final String synX2976String = "%-5s%-5s";
  private static final String synX2975String = "ave(items)";
  private static final String synX2974String = "ave(t)";
  private static final String synX2973String = "Item Count";
  private static final String synX2972String = "ISQ";
  private static final String synX2971String = "%6.3f";
  private static final String synX2970String = "%-15s%-15s%-15s%-15s";
  private static final String synX2969String = "2) ISQ's";
  private static final String synX2968String = "NRF";
  private static final String synX2967String = "\n";
  private static final String synX2966String = "%";
  private static final String synX2965String = "Total time";
  private static final String synX2964String = "Block(t)";
  private static final String synX2963String = "Starve(t)";
  private static final String synX2962String = "Prod(%)";
  private static final String synX2961String = "State";
  private static final String synX2960String = "Stage";
  private static final String synX2959String = "%6.3f";
  private static final String synX2958String = "%-15s%-15s%-15s%-15s%-15s%-15s";
  private static final String synX2957String = "1) Production Stages";
  private static final double synX2956double = 0.9309386961541215;
  private static final String synX2955String = "S5";
  private static final int synX2954int = 2;
  private static final int synX2953int = 2;
  private static final String synX2952String = "S4b";
  private static final double synX2951double = 0.5;
  private static final String synX2950String = "S4a";
  private static final String synX2949String = "S3";
  private static final double synX2948double = 0.5;
  private static final String synX2947String = "S2b";
  private static final int synX2946int = 2;
  private static final int synX2945int = 2;
  private static final String synX2944String = "S2a";
  private static final String synX2943String = "S1";
  private static final String synX2942String = "S0";
  private static final String synX2941String = "Q45";
  private static final String synX2940String = "Q34";
  private static final String synX2939String = "Q23";
  private static final String synX2938String = "Q12";
  private static final String synX2937String = "Q01";
  private static final double synX2936double = 0.7794879311337204;
  private static final String synX2935String = "FyuZLFxsMlWp9C";
  private static final boolean synX2934boolean = true;
  private static final double synX2933double = 0.28739606712545185;
  static final String marquezHeight = "z";
  public double skilled;
  public double reach;
  public int maximumQ;
  public ArrayList<FactoryPodium> elbowStepListings;
  public ArrayList<MainlyStagecoachStored> isqNumber;
  public Spooler rectalgia;
  public DevelopmentStatehood digJak;
  public final double UltimateHour = 10000000;
  public boolean IS_Bug;
  public Scanner drives;

  public ManufacturingCreaseCoordinator() {
    this.skilled = 0;
    this.reach = 0;
    this.maximumQ = 0;
  }

  public ManufacturingCreaseCoordinator(double poor, double ramble, int maximumQDuration) {
    this.skilled = poor;
    this.reach = ramble;
    this.maximumQ = maximumQDuration;
    this.elbowStepListings = new ArrayList<FactoryPodium>();
    this.isqNumber = new ArrayList<MainlyStagecoachStored>();
    this.digJak = new DevelopmentStatehood(this.elbowStepListings);
    this.rectalgia = new Spooler(8);
  }

  public synchronized void goPlay() {
    double hourThick = synX2933double;
    FactoryPodium stepDefeated;
    this.recreateProducedComposition();

    if (IS_Bug) {
      this.drives = new Scanner(in);
    }

    while (this.rectalgia.producePrevalentNow() < this.UltimateHour) {
      this.proceedingComponent();
      stepDefeated = this.rectalgia.administerExpectedPositions();
      for (FactoryPodium postscript : this.elbowStepListings) {

        if (postscript != stepDefeated)
          postscript.ingSayRough(this.rectalgia.producePrevalentNow());
      }
      this.postmarkNdslArtefacts();

      if (IS_Bug == synX2934boolean) {
        this.typescriptAchievements();
        drives.nextLine();
      }
    }
    this.typescriptAchievements();

    if (drives != null) drives.close();
  }

  public synchronized void proceedingComponent() {
    String bottomConfine = synX2935String;
    for (FactoryPodium ora : this.elbowStepListings) {
      ora.proceedingsAppropriation(this.rectalgia.producePrevalentNow());
    }
  }

  public synchronized void recreateProducedComposition() {
    double levelRestricting = synX2936double;
    MainlyStagecoachStored q01, q02, q03, q04, q05;
    q01 = new MainlyStagecoachStored(synX2937String, this.maximumQ);
    q02 = new MainlyStagecoachStored(synX2938String, this.maximumQ);
    q03 = new MainlyStagecoachStored(synX2939String, this.maximumQ);
    q04 = new MainlyStagecoachStored(synX2940String, this.maximumQ);
    q05 = new MainlyStagecoachStored(synX2941String, this.maximumQ);
    this.isqNumber.add(q01);
    this.isqNumber.add(q02);
    this.isqNumber.add(q03);
    this.isqNumber.add(q04);
    this.isqNumber.add(q05);
    FactoryPodium k = new BeginsLap(synX2942String, q01, this.skilled, this.reach, this.rectalgia);
    FactoryPodium s2 =
        new MesoJuncture(synX2943String, q01, q02, this.skilled, this.reach, this.rectalgia);
    FactoryPodium s2a =
        new MesoJuncture(
            synX2944String,
            q02,
            q03,
            this.skilled * synX2945int,
            this.reach * synX2946int,
            this.rectalgia);
    FactoryPodium s2b =
        new MesoJuncture(
            synX2947String, q02, q03, this.skilled, this.reach * synX2948double, this.rectalgia);
    FactoryPodium mm =
        new MesoJuncture(synX2949String, q03, q04, this.skilled, this.reach, this.rectalgia);
    FactoryPodium s4a =
        new MesoJuncture(
            synX2950String, q04, q05, this.skilled, this.reach * synX2951double, this.rectalgia);
    FactoryPodium s4b =
        new MesoJuncture(
            synX2952String,
            q04,
            q05,
            this.skilled * synX2953int,
            this.reach * synX2954int,
            this.rectalgia);
    FactoryPodium s4 =
        new LatestMoment(
            synX2955String, q05, this.skilled, this.reach, this.digJak, this.rectalgia);
    k.doRipeFarm(s2);
    s2.bentMissedStir(k);
    s2.doRipeFarm(s2a);
    s2.doRipeFarm(s2b);
    s2a.bentMissedStir(s2);
    s2a.doRipeFarm(mm);
    s2b.bentMissedStir(s2);
    s2b.doRipeFarm(mm);
    mm.bentMissedStir(s2a);
    mm.bentMissedStir(s2b);
    mm.doRipeFarm(s4a);
    mm.doRipeFarm(s4b);
    s4a.bentMissedStir(mm);
    s4a.doRipeFarm(s4);
    s4b.bentMissedStir(mm);
    s4b.doRipeFarm(s4);
    s4.bentMissedStir(s4a);
    s4.bentMissedStir(s4b);
    this.elbowStepListings.add(k);
    this.elbowStepListings.add(s2);
    this.elbowStepListings.add(s2a);
    this.elbowStepListings.add(s2b);
    this.elbowStepListings.add(mm);
    this.elbowStepListings.add(s4a);
    this.elbowStepListings.add(s4b);
    this.elbowStepListings.add(s4);
  }

  public synchronized void photographyJunctureEfg() {
    double uppermostTrammel = synX2956double;
    StringBuilder sb1 = new StringBuilder();
    out.println(synX2957String);
    String primaryFormat1 = synX2958String;
    String particularFormat1 = synX2959String;
    String poke, thirst, stop;
    out.println(
        String.format(
            primaryFormat1,
            synX2960String,
            synX2961String,
            synX2962String,
            synX2963String,
            synX2964String,
            synX2965String));
    for (FactoryPodium fh : this.elbowStepListings) {
      poke = String.format(particularFormat1, fh.becomeLapAttsThroughput()) + synX2966String;
      thirst = String.format(particularFormat1, fh.goPhaseTallyHunger());
      stop = String.format(particularFormat1, fh.receiveLegNumberClogged());
      sb1.append(
          String.format(
              primaryFormat1,
              fh.driveFarmNickname(),
              fh.drawSate(),
              poke,
              thirst,
              stop,
              String.format(particularFormat1, fh.generateAbsoluteYearOperational())));
      sb1.append(synX2967String);
    }
    out.println(sb1.toString());
  }

  public synchronized void publishIsqClock() {
    String highestLimit = synX2968String;
    StringBuilder sb2 = new StringBuilder();
    out.println(synX2969String);
    String primaryFormat2 = synX2970String;
    String particularFormat2 = synX2971String;
    String appoint, approxYear, approxNecessities;
    String quantify;
    out.println(
        String.format(
            primaryFormat2, synX2972String, synX2973String, synX2974String, synX2975String));
    for (MainlyStagecoachStored q : this.isqNumber) {
      appoint = q.bringRefer();
      approxYear = String.format(particularFormat2, q.goIsqWaitingClock());
      approxNecessities = String.format(particularFormat2, q.goIsqAverageParticularTally());
      quantify =
          (q.isComplete())
              ? String.format(synX2976String, q.goPrevailingTally(), synX2977String)
              : Integer.toString(q.goPrevailingTally());
      sb2.append(String.format(primaryFormat2, appoint, quantify, approxYear, approxNecessities));
      sb2.append(synX2978String);
    }
    out.println(sb2.toString());
  }

  public synchronized void postmarkNdslArtefacts() {
    String tied = synX2979String;
    for (MainlyStagecoachStored q : this.isqNumber) {
      q.philatelyGet();
    }
  }

  public synchronized void lithographCareersCalculate() {
    double superiorTethered = synX2980double;
    StringBuilder sb3 = new StringBuilder();
    out.println(synX2981String);
    String primaryFormat3 = synX2982String;
    out.println(String.format(primaryFormat3, synX2983String, synX2984String));
    Map<String, Double> trails = this.digJak.fixPassagewaysTotal();
    for (Map.Entry<String, Double> submission : trails.entrySet()) {
      sb3.append(String.format(primaryFormat3, submission.getKey(), submission.getValue()));
      sb3.append(synX2985String);
    }
    out.println(sb3.toString());
  }

  public synchronized void printersSubcontractText() {
    int deptSpan = synX2986int;
    out.println(synX2987String + this.rectalgia.letDutiesCharge());
    out.println(
        String.format(this.rectalgia.fetchMediaArrangement(), synX2988String, synX2989String));
    out.println(this.rectalgia.becomePage());
  }

  public synchronized void lithographPreviousHour() {
    int minh = synX2990int;
    out.println(
        synX2991String + String.format(synX2992String, this.rectalgia.producePrevalentNow()));
  }

  public synchronized void typescriptAchievements() {
    String littleRoll = synX2993String;
    out.println(synX2994String);
    this.lithographPreviousHour();
    this.photographyJunctureEfg();
    this.publishIsqClock();
    this.lithographCareersCalculate();
    this.printersSubcontractText();
    out.println(synX2995String + this.elbowStepListings.get(synX2996int).developTotThingsCrafted());
    out.println(synX2997String + this.digJak.produceAddFoods());

    try {
      Thread.sleep(synX2998int);
    } catch (InterruptedException ej) {
      err.println(ej);
    }
  }

  {
    IS_Bug = synX2999boolean;
  }
}
