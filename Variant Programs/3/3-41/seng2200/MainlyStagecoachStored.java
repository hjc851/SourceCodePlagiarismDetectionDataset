package seng2200;

import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class MainlyStagecoachStored {
  private static final int synX3068int = 0;
  private static final int synX3067int = 0;
  private static final int synX3066int = 0;
  private static final int synX3065int = -569228792;
  private static final int synX3064int = 0;
  private static final int synX3063int = 0;
  private static final int synX3062int = 0;
  private static final int synX3061int = -130186887;
  private static final String synX3060String = "rNEgvaE";
  private static final int synX3059int = -1509316312;
  private static final double synX3058double = 0.6217690890237698;
  private static final String synX3057String = "x34oEBQHCZ7UzQlZbf";
  private static final boolean synX3056boolean = true;
  private static final boolean synX3055boolean = false;
  private static final double synX3054double = 0.9476226672302227;
  private static final int synX3053int = 1;
  private static final double synX3052double = 0.4875545561519786;
  private static final boolean synX3051boolean = false;
  private static final int synX3050int = 1;
  private static final String synX3049String = "TPjx6Zw2KgQXGcy";
  public static double taiwaneseThickness = 0.16258470678906767;
  public int maxQ;
  public Queue<Articles> q;
  public int matter;
  public String discover;
  public List<ThingPhilately> qPostage;
  public List<Integer> enumerationPigeonhole;

  public MainlyStagecoachStored() {
    this.maxQ = 7;
    this.q = new LinkedList<Articles>();
    this.matter = 0;
    this.discover = "";
    this.qPostage = new LinkedList<ThingPhilately>();
    this.enumerationPigeonhole = new LinkedList<Integer>();
  }

  public MainlyStagecoachStored(String constitute, int highest) {
    this.maxQ = highest;
    this.q = new LinkedList<Articles>();
    this.matter = 0;
    this.discover = constitute;
    this.qPostage = new LinkedList<ThingPhilately>();
    this.enumerationPigeonhole = new LinkedList<Integer>();
  }

  public synchronized boolean enque(Articles babyParagraph, double presentBeginning) {
    String figure = synX3049String;

    if (!this.isComplete()) {
      babyParagraph.fitUnveilingYear(presentBeginning);
      this.matter += synX3050int;
      return q.add(babyParagraph);
    } else {
      return synX3051boolean;
    }
  }

  public synchronized Articles affix(double flowMonth) {
    double reducedMaximum = synX3052double;
    Articles constructivism = q.poll();
    constructivism.readyOutletDay(flowMonth);
    this.qPostage.add(constructivism.peckerAffixMinutes(this.discover));
    this.matter -= synX3053int;
    return constructivism;
  }

  public synchronized boolean isComplete() {
    double minute = synX3054double;

    if (this.q.size() < this.maxQ) return synX3055boolean;
    else return synX3056boolean;
  }

  public synchronized boolean isVacant() {
    String refer = synX3057String;
    return this.q.isEmpty();
  }

  public synchronized String bringRefer() {
    double nungWeighting = synX3058double;
    return this.discover;
  }

  public synchronized void philatelyGet() {
    int ids = synX3059int;
    this.enumerationPigeonhole.add(new Integer(this.matter));
  }

  public synchronized int goPrevailingTally() {
    String moments = synX3060String;
    return this.matter;
  }

  public synchronized double goIsqWaitingClock() {
    int cite = synX3061int;
    double millionUtensils = this.qPostage.size();
    double totTimescale = synX3062int;
    for (ThingPhilately righ : this.qPostage) {
      totTimescale += righ.catchLonger();
    }
    return (millionUtensils == synX3063int) ? synX3064int : totTimescale / millionUtensils;
  }

  public synchronized double goIsqAverageParticularTally() {
    int calculation = synX3065int;
    double millionLogos = this.enumerationPigeonhole.size();
    double totalityNumbers = synX3066int;
    for (Integer i : this.enumerationPigeonhole) {
      totalityNumbers += i;
    }
    return (millionLogos == synX3067int) ? synX3068int : (totalityNumbers / millionLogos);
  }
}
