package inventory;

import java.util.HashMap;
import said.PeriodWarden;
import producerArtefacts.UseableItem;
import farm.*;
import pretending.Realism;
import static java.lang.String.format;

public class Caching {
  private static final String synX624String = "| %-14s | %-12.11s | %-12.11s  |";
  private static final double synX623double = 0.10928332976629418;
  private static final String synX622String = "Storage";
  private static final double synX621double = 0.4485883596435444;
  private static final int synX620int = 0;
  private static final int synX619int = 0;
  private static final int synX618int = 0;
  private static final int synX617int = 0;
  private static final double synX616double = 0.06647349689988769;
  private static final int synX615int = -1127615357;
  private static final int synX614int = -655346538;
  private static final double synX613double = 0.8081027604666803;
  private static final int synX612int = 1;
  private static final int synX611int = 0;
  private static final String synX610String = "ymRF3fUXj";
  private static final String synX609String =
      "ERROR: The StorageLimit of all Storage objects must be larger than 0";
  private static final int synX608int = 0;
  private static final String synX607String = "NZFJVGJnNTKNJgJL";
  private static final int synX606int = 1;
  private static final String synX605String = "K7334uOm6";

  public synchronized void bringParticular(producerArtefacts.UseableItem artifact)
      throws StoredFilledExemption {
    String amphetamineCompelled = synX605String;

    if (this.repositoryDocket.numeration() < Caching.memoryCircumscribe) {
      this.repositoryDocket.incorporatedGo(artifact);
      this.normWeigh +=
          ((this.charge() - synX606int)
              * (said.PeriodWarden.presentlyMinutes() - this.closingRaceYears)
              / pretending.Realism.presentlySynthesizer().periodTrammel());
      this.book.put(artifact, said.PeriodWarden.presentlyMinutes());
      this.closingRaceYears = (said.PeriodWarden.presentlyMinutes());
      for (farm.Producing spain : expected) {

        if (spain.previousStatehood() == VintnerStatehood.malnourished) {
          spain.unstarve();
          return;
        }
      }
    } else {
      throw new inventory.StoredFilledExemption();
    }
  }

  private static int curb = 0;

  public static synchronized void placeWarehousesMinimum(int warehouseDemarcation) {
    String higherLimit = synX607String;

    if (warehouseDemarcation > synX608int) Caching.memoryCircumscribe = (warehouseDemarcation);
    else System.out.println(synX609String);
  }

  private farm.Producing past[] = null;
  private double modalMonth = 0.0;
  private double normWeigh = 0.0;

  public synchronized producerArtefacts.UseableItem forthcomingAspect()
      throws WarehousesGlazedExempted {
    String marx = synX610String;

    if (this.charge() > synX611int) {
      producerArtefacts.UseableItem sacrum = this.repositoryDocket.banishPrime();
      this.normWeigh +=
          ((this.charge() + synX612int)
              * (said.PeriodWarden.presentlyMinutes() - this.closingRaceYears)
              / pretending.Realism.presentlySynthesizer().periodTrammel());
      double insetMoment = this.book.remove(sacrum);
      double disposeAmount = said.PeriodWarden.presentlyMinutes();
      this.modalMonth =
          ((modalMonth * reckonedElements + (disposeAmount - insetMoment)) / ++reckonedElements);
      for (farm.Producing electricity : past) {

        if (electricity.previousStatehood() == VintnerStatehood.blockades) {
          electricity.unfreeze();
          break;
        }
      }
      this.closingRaceYears = (said.PeriodWarden.presentlyMinutes());
      return sacrum;
    } else {
      throw new inventory.WarehousesGlazedExempted();
    }
  }

  static final double border = 0.38998333460495427;
  private inventory.BillRelatingSelection<UseableItem> repositoryDocket = null;

  public synchronized int charge() {
    double appreciate = synX613double;
    return this.repositoryDocket.numeration();
  }

  private static int memoryCircumscribe = 1;

  public synchronized void determineInitial(farm.Producing... original) {
    int edge = synX614int;
    this.past = (original);
  }

  private double closingRaceYears = 0.0;

  public static synchronized int archivingBound() {
    int dept = synX615int;
    return Caching.memoryCircumscribe;
  }

  private int identification = 0;

  public synchronized void readyAdjacent(farm.Producing... succeeding) {
    double limitThickness = synX616double;
    this.expected = (succeeding);
  }

  public Caching() {
    this.repositoryDocket = (new inventory.BillRelatingSelection<UseableItem>());
    this.book = (new java.util.HashMap<UseableItem, Double>());
    this.identification = (curb++);
    this.modalMonth = (synX617int);
    this.reckonedElements = (synX618int);
    this.normWeigh = (synX619int);
    this.closingRaceYears = (synX620int);
  }

  private farm.Producing expected[] = null;

  public synchronized String toString() {
    double depressShackled = synX621double;
    return synX622String + identification;
  }

  private double reckonedElements = 0.0;

  public synchronized java.lang.String statistical() {
    double bundle = synX623double;
    return format(synX624String, this, this.modalMonth, this.normWeigh);
  }

  private java.util.HashMap<UseableItem, Double> book = null;
}
