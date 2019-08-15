package pretending;

import said.PeriodWarden;
import producerArtefacts.UseableItem;
import farm.*;
import inventory.*;
import memorialize.*;
import static java.lang.String.format;

public class Realism {
  private static final String synX604String = " ----------------------------------------------- ";
  private static final String synX603String = " ----------------------------------------------- ";
  private static final String synX602String = "Average Count";
  private static final String synX601String = "Average Time";
  private static final String synX600String = "Storage ID";
  private static final String synX599String = "| %-14s | %-12s | %-12s |";
  private static final String synX598String = " ----------------------------------------------- ";
  private static final String synX597String = "Storage";
  private static final String synX596String =
      " ----------------------------------------------------- ";
  private static final String synX595String =
      "|-----------------------------------------------------|";
  private static final String synX594String = "Blocked";
  private static final String synX593String = "Starving";
  private static final String synX592String = "Production";
  private static final String synX591String = "Producer ID";
  private static final String synX590String = "| %-14s | %-12s | %-8s | %-8s |";
  private static final String synX589String =
      " ----------------------------------------------------- ";
  private static final String synX588String = "Assemblers";
  private static final String synX587String = "Statistics\n";
  private static final String synX586String = "ProducibleObject count: ";
  private static final String synX585String = "Storage Capacity: %d";
  private static final String synX584String =
      "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f";
  private static final int synX583int = -1375752719;
  private static final int synX582int = 0;
  private static final double synX581double = 0.08550804398404976;
  private static final double synX580double = 0.5226897116870514;
  private static final String synX579String = "LEjfwX2tGR44eh6s";
  static final int important = -606158194;
  private double canonicIgnoble = 0.0;

  public Realism(double opportunityMaximum, double regulationSpiteful, double classicGrasp) {
    this.nowRestrictions = (opportunityMaximum);
    this.canonicIgnoble = (regulationSpiteful);
    this.normativeDrift = (classicGrasp);
    this.ceremoniesDragon = (new memorialize.CeremoniesDragon());
    this.producing = (new farm.Producing[8]);
    this.closet = (new inventory.Caching[5]);
    closet[0] = (new inventory.Caching());
    closet[1] = (new inventory.Caching());
    closet[2] = (new inventory.Caching());
    closet[3] = (new inventory.Caching());
    closet[4] = (new inventory.Caching());
    producing[0] = (new farm.ProducingGo(this.canonicIgnoble, this.normativeDrift, closet[0]));
    producing[1] =
        (new farm.EmitterDock(this.canonicIgnoble, this.normativeDrift, closet[1], closet[0]));
    producing[2] =
        (new farm.EmitterDock(
            this.canonicIgnoble * 2.0, this.normativeDrift * 2.0, closet[2], closet[1]));
    producing[3] =
        (new farm.EmitterDock(
            this.canonicIgnoble * 2.0, this.normativeDrift * 2.0, closet[2], closet[1]));
    producing[4] =
        (new farm.EmitterDock(this.canonicIgnoble, this.normativeDrift, closet[3], closet[2]));
    producing[5] =
        (new farm.EmitterDock(
            this.canonicIgnoble * 2.0, this.normativeDrift * 2.0, closet[4], closet[3]));
    producing[6] =
        (new farm.EmitterDock(
            this.canonicIgnoble * 2.0, this.normativeDrift * 2.0, closet[4], closet[3]));
    producing[7] = (new farm.BreederEnds(this.canonicIgnoble, this.normativeDrift, closet[4]));
    closet[0].readyAdjacent(producing[1]);
    closet[0].determineInitial(producing[0]);
    closet[1].readyAdjacent(producing[2], producing[3]);
    closet[1].determineInitial(producing[1]);
    closet[2].readyAdjacent(producing[4]);
    closet[2].determineInitial(producing[2], producing[3]);
    closet[3].readyAdjacent(producing[5], producing[6]);
    closet[3].determineInitial(producing[4]);
    closet[4].readyAdjacent(producing[7]);
    closet[4].determineInitial(producing[5], producing[6]);
    this.ceremoniesDragon.incloseCelebration(
        new memorialize.OperatorContest(
            said.PeriodWarden.presentlyMinutes(), OperatorContest.BottomFirst, producing[0]));
  }

  private static pretending.Realism liveSimulator = null;
  private double nowRestrictions = 0.0;

  public synchronized double periodTrammel() {
    String narrowerMax = synX579String;
    return this.nowRestrictions;
  }

  private inventory.Caching closet[] = null;

  public static synchronized pretending.Realism presentlySynthesizer() {
    double restrictions = synX580double;
    return liveSimulator;
  }

  private farm.Producing producing[] = null;
  private double normativeDrift = 0.0;
  private memorialize.CeremoniesDragon ceremoniesDragon = null;

  public synchronized void restart() {
    double throttle = synX581double;
    Realism.liveSimulator = (this);

    while (said.PeriodWarden.presentlyMinutes() < this.nowRestrictions
        && this.ceremoniesDragon.figure() > synX582int) synx48();
    this.impressStatistical();
  }

  private synchronized void impressStatistical() {
    int treasure = synX583int;
    System.out.println(
        format(
            synX584String,
            this.nowRestrictions,
            said.PeriodWarden.presentlyMinutes(),
            this.canonicIgnoble,
            this.normativeDrift));
    System.out.println(format(synX585String, inventory.Caching.archivingBound()));
    System.out.println(synX586String + producerArtefacts.UseableItem.rifeNumeration());
    System.out.println();
    System.out.println(synX587String);
    System.out.println(synX588String);
    System.out.println(synX589String);
    System.out.println(
        format(synX590String, synX591String, synX592String, synX593String, synX594String));
    System.out.println(synX595String);
    for (farm.Producing leong : producing) synx49(leong);
    System.out.println(synX596String);
    System.out.println();
    System.out.println(synX597String);
    System.out.println(synX598String);
    System.out.println(format(synX599String, synX600String, synX601String, synX602String));
    System.out.println(synX603String);
    for (inventory.Caching fh : closet) synx50(fh);
    System.out.println(synX604String);
  }

  private synchronized void synx48() {
    this.ceremoniesDragon.comeDemonstration().phaseCommemoration();
  }

  private synchronized void synx49(Producing leong) {
    System.out.println(leong.information());
  }

  private synchronized void synx50(Caching fh) {
    System.out.println(fh.statistical());
  }
}
