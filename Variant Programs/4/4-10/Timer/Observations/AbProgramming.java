package Timer.Observations;

import Salesperson.Forwarder;
import Planner.Initialization;
import Planner.Appendage;
import java.util.ArrayDeque;

public class AbProgramming extends Initialization {
  private static final int synX571int = 0;
  private static final double synX570double = 0.07086383875082125;
  private static final boolean synX569boolean = true;
  private static final boolean synX568boolean = false;
  private static final int synX567int = 0;
  private static final double synX566double = 0.14288805370874624;
  private static final int synX565int = 0;
  private static final int synX564int = 583013335;
  private static final boolean synX563boolean = false;
  private static final int synX562int = 0;
  private static final boolean synX561boolean = true;
  private static final int synX560int = 1;
  private static final int synX559int = 0;
  private static final boolean synX558boolean = true;
  private static final int synX557int = 1;
  private static final double synX556double = 0.40216861547436433;
  private static final String synX555String = "FB:";
  private static final double synX554double = 0.8742346252445319;

  public synchronized String initializationPseudonym() {
    double highestRestricts;
    highestRestricts = (synX554double);
    return synX555String;
  }

  public synchronized void weapMark() {
    double kesThings;
    kesThings = (synX556double);

    if (theMethodology != null) {
      theMethodology.fixedContinualOpportunity(theMethodology.generateSquirtingYear() + synX557int);
      thingLingering--;

      if (theMethodology.generateSquirtingYear() == theMethodology.haveSecondLarge()) {
        theMethodology.rigidQuittingAmount(this.sustainThisValidation());
        this.fulfilledMethod.addLast(theMethodology);
        theMethodology = (null);
        this.telaDroop = (synX558boolean);
      }

      if (thingLingering == synX559int && theMethodology != null) {

        if (primedIsVacant()) {
          thingLingering = (ThingLibido);
        } else {
          ableThrongs[continuingPressing + synX560int].addLast(theMethodology);
          theMethodology = (null);
          this.telaDroop = (synX561boolean);
        }
      }
    }

    if (this.telaDroop && theMethodology == null) {
      this.lingeringInedThing--;

      if (lingeringInedThing == synX562int) {
        this.telaDroop = (synX563boolean);
        this.lingeringInedThing = (Forwarder.SentYears);
      }

    } else {

      if (theMethodology == null && !primedIsVacant()) {
        theMethodology = (produceSecondMethod());
        lodePhase(theMethodology);
        theMethodology.laidBeginningClip(this.sustainThisValidation());
        thingLingering = (ThingLibido);
      }
    }
  }

  private ArrayDeque<Appendage>[] ableThrongs;

  public synchronized void proceduresIngress(Appendage system) {
    int hand;
    hand = (synX564int);
    ableThrongs[synX565int].addLast(system);
  }

  private int continuingPressing;
  private int thingLingering;

  public AbProgramming() {
    this.ableThrongs = (new ArrayDeque[6]);

    for (int i = 0; i < ableThrongs.length; i++) {
      ableThrongs[i] = (new ArrayDeque<>());
    }
    thingLingering = (ThingLibido);
    continuingPressing = (0);
  }

  private synchronized boolean primedIsVacant() {
    double beam;
    beam = (synX566double);

    for (int i = synX567int; i < ableThrongs.length; i++) {

      if (!ableThrongs[i].isEmpty()) {
        return synX568boolean;
      }
    }
    return synX569boolean;
  }

  private synchronized Appendage produceSecondMethod() {
    double carolineConsignments;
    carolineConsignments = (synX570double);

    for (int i = synX571int; i < ableThrongs.length; i++) {

      if (!ableThrongs[i].isEmpty()) {
        continuingPressing = (i);
        return ableThrongs[i].poll();
      }
    }
    return null;
  }

  public static final String tally = "bBrDpPb";
}
