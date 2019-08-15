package seng2200;

import java.util.Comparator;

public class ProblemCompare implements Comparator<Employer> {

  public synchronized int compare(Employer bcl, Employer yt) {

    if (bcl.developStayTimescale() < yt.developStayTimescale()) return -1;
    else if (bcl.developStayTimescale() > yt.developStayTimescale()) return 1;
    else return 0;
  }
}
