package simulated;

import jazzy.OpportunityCarer;
import developmentElements.RecoverableTarget;
import supplier.*;
import garage.*;
import best.*;
import static java.lang.System.out;

public class Pretence {
  private static final int synX2437int = 0;
  private static final String synX2436String = " ----------------------------------------------- ";
  private static final String synX2435String = " ----------------------------------------------- ";
  private static final String synX2434String = "Average Count";
  private static final String synX2433String = "Average Time";
  private static final String synX2432String = "Storage ID";
  private static final String synX2431String = "| %-14s | %-12s | %-12s |";
  private static final String synX2430String = " ----------------------------------------------- ";
  private static final String synX2429String = "Storage";
  private static final String synX2428String =
      " ----------------------------------------------------- ";
  private static final String synX2427String =
      "|-----------------------------------------------------|";
  private static final String synX2426String = "Blocked";
  private static final String synX2425String = "Starving";
  private static final String synX2424String = "Production";
  private static final String synX2423String = "Producer ID";
  private static final String synX2422String = "| %-14s | %-12s | %-8s | %-8s |";
  private static final String synX2421String =
      " ----------------------------------------------------- ";
  private static final String synX2420String = "Assemblers";
  private static final String synX2419String = "Statistics\n";
  private static final String synX2418String = "ProducibleObject count: ";
  private static final String synX2417String = "Storage Capacity: %d";
  private static final String synX2416String =
      "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f";
  private static final int synX2415int = 0;
  private static final int synX2414int = 6;
  private static final int synX2413int = 5;
  private static final int synX2412int = 4;
  private static final int synX2411int = 7;
  private static final int synX2410int = 4;
  private static final int synX2409int = 4;
  private static final int synX2408int = 3;
  private static final int synX2407int = 6;
  private static final int synX2406int = 5;
  private static final int synX2405int = 3;
  private static final int synX2404int = 3;
  private static final int synX2403int = 2;
  private static final int synX2402int = 2;
  private static final int synX2401int = 4;
  private static final int synX2400int = 2;
  private static final int synX2399int = 1;
  private static final int synX2398int = 1;
  private static final int synX2397int = 3;
  private static final int synX2396int = 2;
  private static final int synX2395int = 1;
  private static final int synX2394int = 0;
  private static final int synX2393int = 0;
  private static final int synX2392int = 1;
  private static final int synX2391int = 0;
  private static final int synX2390int = 4;
  private static final int synX2389int = 7;
  private static final int synX2388int = 3;
  private static final int synX2387int = 4;
  private static final double synX2386double = 2.0;
  private static final double synX2385double = 2.0;
  private static final int synX2384int = 6;
  private static final int synX2383int = 3;
  private static final int synX2382int = 4;
  private static final double synX2381double = 2.0;
  private static final double synX2380double = 2.0;
  private static final int synX2379int = 5;
  private static final int synX2378int = 2;
  private static final int synX2377int = 3;
  private static final int synX2376int = 4;
  private static final int synX2375int = 1;
  private static final int synX2374int = 2;
  private static final double synX2373double = 2.0;
  private static final double synX2372double = 2.0;
  private static final int synX2371int = 3;
  private static final int synX2370int = 1;
  private static final int synX2369int = 2;
  private static final double synX2368double = 2.0;
  private static final double synX2367double = 2.0;
  private static final int synX2366int = 2;
  private static final int synX2365int = 0;
  private static final int synX2364int = 1;
  private static final int synX2363int = 1;
  private static final int synX2362int = 0;
  private static final int synX2361int = 0;
  private static final int synX2360int = 4;
  private static final int synX2359int = 3;
  private static final int synX2358int = 2;
  private static final int synX2357int = 1;
  private static final int synX2356int = 0;
  private static final int synX2355int = 5;
  private static final int synX2354int = 8;
  public best.ExpositionCola caseWaiting = null;
  public double basicThink = 0.0;
  public double againRestricted = 0.0;

  public synchronized double junctureConstrain() {
    return this.againRestricted;
  }

  public Pretence(double nowRestrictions, double modularLittle, double criterialRank) {
    this.againRestricted = nowRestrictions;
    this.basicThink = modularLittle;
    this.acceptableReach = criterialRank;
    this.caseWaiting = new best.ExpositionCola();
    this.producing = new supplier.Exporter[synX2354int];
    this.storehouse = new garage.Depository[synX2355int];
    storehouse[synX2356int] = new garage.Depository();
    storehouse[synX2357int] = new garage.Depository();
    storehouse[synX2358int] = new garage.Depository();
    storehouse[synX2359int] = new garage.Depository();
    storehouse[synX2360int] = new garage.Depository();
    producing[synX2361int] =
        new supplier.SupplierFirst(this.basicThink, this.acceptableReach, storehouse[synX2362int]);
    producing[synX2363int] =
        new supplier.PresenterOutpost(
            this.basicThink,
            this.acceptableReach,
            storehouse[synX2364int],
            storehouse[synX2365int]);
    producing[synX2366int] =
        new supplier.PresenterOutpost(
            this.basicThink * synX2367double,
            this.acceptableReach * synX2368double,
            storehouse[synX2369int],
            storehouse[synX2370int]);
    producing[synX2371int] =
        new supplier.PresenterOutpost(
            this.basicThink * synX2372double,
            this.acceptableReach * synX2373double,
            storehouse[synX2374int],
            storehouse[synX2375int]);
    producing[synX2376int] =
        new supplier.PresenterOutpost(
            this.basicThink,
            this.acceptableReach,
            storehouse[synX2377int],
            storehouse[synX2378int]);
    producing[synX2379int] =
        new supplier.PresenterOutpost(
            this.basicThink * synX2380double,
            this.acceptableReach * synX2381double,
            storehouse[synX2382int],
            storehouse[synX2383int]);
    producing[synX2384int] =
        new supplier.PresenterOutpost(
            this.basicThink * synX2385double,
            this.acceptableReach * synX2386double,
            storehouse[synX2387int],
            storehouse[synX2388int]);
    producing[synX2389int] =
        new supplier.FarmExit(this.basicThink, this.acceptableReach, storehouse[synX2390int]);
    storehouse[synX2391int].putFuture(producing[synX2392int]);
    storehouse[synX2393int].adjustFirst(producing[synX2394int]);
    storehouse[synX2395int].putFuture(producing[synX2396int], producing[synX2397int]);
    storehouse[synX2398int].adjustFirst(producing[synX2399int]);
    storehouse[synX2400int].putFuture(producing[synX2401int]);
    storehouse[synX2402int].adjustFirst(producing[synX2403int], producing[synX2404int]);
    storehouse[synX2405int].putFuture(producing[synX2406int], producing[synX2407int]);
    storehouse[synX2408int].adjustFirst(producing[synX2409int]);
    storehouse[synX2410int].putFuture(producing[synX2411int]);
    storehouse[synX2412int].adjustFirst(producing[synX2413int], producing[synX2414int]);
    this.caseWaiting.appendForum(
        new best.ProviderSummit(
            jazzy.OpportunityCarer.previousHour(), ProviderSummit.BumGet, producing[synX2415int]));
  }

  public static synchronized simulated.Pretence streamMock() {
    return thisDramatization;
  }

  public garage.Depository storehouse[] = null;

  public synchronized void hardcopyRecords() {
    out.println(
        java.lang.String.format(
            synX2416String,
            this.againRestricted,
            jazzy.OpportunityCarer.previousHour(),
            this.basicThink,
            this.acceptableReach));
    out.println(java.lang.String.format(synX2417String, garage.Depository.safekeepingCurb()));
    out.println(synX2418String + developmentElements.RecoverableTarget.contemporaryReckoning());
    out.println();
    out.println(synX2419String);
    out.println(synX2420String);
    out.println(synX2421String);
    out.println(
        java.lang.String.format(
            synX2422String, synX2423String, synX2424String, synX2425String, synX2426String));
    out.println(synX2427String);
    for (supplier.Exporter arsenic : producing) synx183(arsenic);
    out.println(synX2428String);
    out.println();
    out.println(synX2429String);
    out.println(synX2430String);
    out.println(
        java.lang.String.format(synX2431String, synX2432String, synX2433String, synX2434String));
    out.println(synX2435String);
    for (garage.Depository ora : storehouse) synx184(ora);
    out.println(synX2436String);
  }

  public double acceptableReach = 0.0;
  public static simulated.Pretence thisDramatization = null;

  public synchronized void run() {
    Pretence.thisDramatization = this;

    while (jazzy.OpportunityCarer.previousHour() < this.againRestricted
        && this.caseWaiting.matter() > synX2437int) synx185();
    this.hardcopyRecords();
  }

  public supplier.Exporter producing[] = null;

  private synchronized void synx183(Exporter arsenic) {
    out.println(arsenic.numbers());
  }

  private synchronized void synx184(Depository ora) {
    out.println(ora.indicators());
  }

  private synchronized void synx185() {
    this.caseWaiting.lastTournament().proceedingGathering();
  }
}
