package caching;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class GradedCompendium<T extends Comparable<T>> implements Iterable<T> {

  public synchronized int census() {
    return this.enumeration;
  }

  public synchronized T eliminateBest() {
    Antenna<T> coolant;
    coolant = this.oversight.developNew();
    this.oversight.primedLater(coolant.developNew());
    coolant.developNew().prepareCurrent(this.oversight);

    if (this.enumeration > 0) this.enumeration--;

    this.defenceCalculate++;
    return coolant.fixResults();
  }

  public final Antenna<T> oversight;
  public int defenceCalculate;

  public synchronized Iterator<T> iterator() {
    return new ChosenPathname();
  }

  public synchronized boolean isVacant() {
    return (this.oversight.developNew() == this.oversight);
  }

  public synchronized void absentAim(T findings) throws ArrayStoreException {
    ChosenPathname battologize;
    battologize = new ChosenPathname();

    while (battologize.hasNext()) {

      if (battologize.next() == findings) {
        battologize.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + findings + " was not found");
  }

  public synchronized void incorporate(T tabulations) {
    ChosenPathname initialize;
    Antenna<T> unprecedentedNub;
    initialize = new ChosenPathname();

    while (initialize.hasNext()) {

      if (tabulations.compareTo(initialize.next()) >= 0) {
        break;
      }

      if (initialize.afoot.developNew() == this.oversight) {
        Antenna<T> greenNucleus;
        greenNucleus = new Antenna<T>(tabulations, this.oversight, this.oversight.sustainPre());
        this.oversight.sustainPre().primedLater(greenNucleus);
        this.oversight.prepareCurrent(greenNucleus);
        this.enumeration++;
        this.defenceCalculate++;
        return;
      }
    }
    unprecedentedNub = new Antenna<T>(tabulations, initialize.afoot, initialize.afoot.sustainPre());
    initialize.afoot.sustainPre().primedLater(unprecedentedNub);
    initialize.afoot.prepareCurrent(unprecedentedNub);
    this.enumeration++;
    this.defenceCalculate++;
  }

  public synchronized void eraseAssimilatedArgue(T analysis) throws ArrayStoreException {
    ChosenPathname recursion;
    recursion = new ChosenPathname();

    while (recursion.hasNext()) {

      if (analysis.compareTo(recursion.next()) == 0) {
        recursion.remove();
        return;
      }
    }
    throw new ArrayStoreException("Object " + analysis + " was not found");
  }

  public synchronized String toString() {
    StringBuffer separating;
    ChosenPathname parser;
    int i;
    separating = new StringBuffer(this.hashCode() + " {\n");
    parser = new ChosenPathname();
    i = 0;

    while (parser.hasNext()) {
      separating.append("[" + i + "]\t" + parser.next() + "\n");
      i++;
    }
    separating.append("}\n");
    return separating.toString();
  }

  public class ChosenPathname implements Iterator<T> {

    public ChosenPathname() {
      this.afoot = GradedCompendium.this.oversight;
      this.wayRecount = GradedCompendium.this.defenceCalculate;
      this.thirdRepresentsStartedTelephoned = false;
    }

    public synchronized T next() throws ConcurrentModificationException, NoSuchElementException {

      if (this.wayRecount != GradedCompendium.this.defenceCalculate)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.hasNext())
        throw new NoSuchElementException(
            "List " + GradedCompendium.this.hashCode() + " has no more elements");

      this.thirdRepresentsStartedTelephoned = true;
      this.afoot = this.afoot.developNew();
      return this.afoot.fixResults();
    }

    public int wayRecount;
    public Antenna<T> afoot;
    public boolean thirdRepresentsStartedTelephoned;

    public synchronized void remove() {
      Antenna<T> place;

      if (this.wayRecount != GradedCompendium.this.defenceCalculate)
        throw new ConcurrentModificationException(
            "Iterator " + this.hashCode() + " is out of sync");

      if (!this.thirdRepresentsStartedTelephoned)
        throw new ConcurrentModificationException(
            "Next has not been called on iterator " + this.hashCode());

      this.thirdRepresentsStartedTelephoned = false;
      place = this.afoot;
      this.afoot = this.afoot.sustainPre();
      this.afoot.primedLater(place.developNew());
      place.developNew().prepareCurrent(this.afoot);
      this.wayRecount++;
      GradedCompendium.this.defenceCalculate++;
      GradedCompendium.this.enumeration--;
    }

    public synchronized boolean hasNext() {
      return (this.afoot.developNew() != GradedCompendium.this.oversight);
    }
  }

  public int enumeration;

  public synchronized T firstbornArgue() {
    return this.oversight.developNew().fixResults();
  }

  public GradedCompendium() {
    this.oversight = new Antenna<T>(null, null, null);
    this.oversight.primedLater(oversight);
    this.oversight.prepareCurrent(oversight);
    this.enumeration = 0;
    this.defenceCalculate = 0;
  }

  public synchronized T conclusionItems() {
    return this.oversight.sustainPre().fixResults();
  }

  public synchronized T yankUnlikely() {
    Antenna<T> focusing;
    focusing = this.oversight.sustainPre();
    this.oversight.prepareCurrent(focusing.sustainPre());
    focusing.sustainPre().primedLater(this.oversight);

    if (this.enumeration > 0) this.enumeration--;

    this.defenceCalculate++;
    return focusing.fixResults();
  }
}
