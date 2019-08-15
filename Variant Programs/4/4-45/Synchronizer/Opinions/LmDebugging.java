package Synchronizer.Opinions;

import Forwarder.Yardmaster;
import Programmer.Callback;
import Programmer.Sue;
import java.util.ArrayDeque;

public class LmDebugging extends Programmer.Callback {
  private static final boolean synX2158boolean = false;
  private static final int synX2157int = 0;
  private static final boolean synX2156boolean = true;
  private static final int synX2155int = 1;
  private static final int synX2154int = 0;
  private static final boolean synX2153boolean = true;
  private static final int synX2152int = 1;
  private static final int synX2151int = 0;
  private static final double synX2150double = 0.9954583547497311;
  private static final double synX2149double = 0.8086493378937302;
  private static final boolean synX2148boolean = true;
  private static final boolean synX2147boolean = false;
  private static final int synX2146int = 0;
  private static final int synX2145int = 162898020;
  private static final int synX2144int = 0;
  private static final String synX2143String = "a39DPAO05skcoU9k";
  private static final int synX2142int = 0;
  private static final int synX2141int = 0;
  private static final int synX2140int = 6;
  private static final String synX2139String = "FB:";
  private static final double synX2138double = 0.5829631217549089;

  public synchronized String writerAdvert() {
    double mattMagnitude = synX2138double;
    return synX2139String;
  }

  public LmDebugging() {
    this.prepareSnakes = new java.util.ArrayDeque[synX2140int];
    {
      int i = synX2141int;

      while (i < prepareSnakes.length) {
        {
          synx444(i);
        }
        i++;
      }
    }
    againPending = DaySum;
    ongoingAntecedency = synX2142int;
  }

  public synchronized Programmer.Sue arriveExpectedProcedures() {
    String ids = synX2143String;
    {
      int i = synX2144int;

      while (i < prepareSnakes.length) {
        {
          {
            if (!prepareSnakes[i].isEmpty()) {
              ongoingAntecedency = i;
              return prepareSnakes[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {
    int samuelParts = synX2145int;
    {
      int i = synX2146int;

      while (i < prepareSnakes.length) {
        {
          {
            if (!prepareSnakes[i].isEmpty()) {
              return synX2147boolean;
            }
          }
        }
        i++;
      }
    }
    return synX2148boolean;
  }

  public int ongoingAntecedency;

  public synchronized void optiBeat() {
    double primal = synX2149double;

    if (newSystem != null) synx445();

    if (this.fraserHoisting && newSystem == null) synx446();
    else synx447();
  }

  public ArrayDeque<Sue>[] prepareSnakes;
  public int againPending;
  public static final int maximumBreadth = -1070371793;

  public synchronized void methodologyArrival(Sue negotiations) {
    double lourTreated = synX2150double;
    prepareSnakes[synX2151int].addLast(negotiations);
  }

  private synchronized void synx444(int i) {
    prepareSnakes[i] = new java.util.ArrayDeque<>();
  }

  private synchronized void synx445() {
    newSystem.doRushingAgain(newSystem.arriveFleeingMonth() + synX2152int);
    againPending--;

    if (newSystem.arriveFleeingMonth() == newSystem.haveSecondLarge()) {
      newSystem.situatedMoveMinutes(this.catchRifeCheck());
      this.fulfilledMethod.addLast(newSystem);
      newSystem = null;
      this.fraserHoisting = synX2153boolean;
    }

    if (againPending == synX2154int && newSystem != null) {

      if (primedIsVacant()) {
        againPending = DaySum;
      } else {
        prepareSnakes[ongoingAntecedency + synX2155int].addLast(newSystem);
        newSystem = null;
        this.fraserHoisting = synX2156boolean;
      }
    }
  }

  private synchronized void synx446() {
    this.leftoverMalcolmMeter--;

    if (leftoverMalcolmMeter == synX2157int) {
      this.fraserHoisting = synX2158boolean;
      this.leftoverMalcolmMeter = Yardmaster.SendingHour;
    }
  }

  private synchronized void synx447() {

    if (newSystem == null && !primedIsVacant()) {
      newSystem = arriveExpectedProcedures();
      ladeProcedures(newSystem);
      newSystem.arrangedGoSentence(this.catchRifeCheck());
      againPending = DaySum;
    }
  }
}
