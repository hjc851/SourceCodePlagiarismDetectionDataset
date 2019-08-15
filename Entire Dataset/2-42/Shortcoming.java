public class Shortcoming {

  public Shortcoming(int culpabilityPeriods, Treat outgrowth) {
    this.errorSentence = culpabilityPeriods;
    this.fixMonth = culpabilityPeriods + FallbackOpportunity;
    this.summons = outgrowth;
  }

  private Treat summons = null;

  public synchronized int becomePreparesOpportunity() {
    return fixMonth;
  }

  private static final int FallbackOpportunity = 6;
  private int errorSentence = 0;

  public synchronized int becomeAccountableOpportunity() {
    return errorSentence;
  }

  private int fixMonth = 0;

  public synchronized Treat obtainOutgrowth() {
    return summons;
  }
}
