import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class BWorkspace extends Developer {
  private static final int synX66int = 0;
  private static final int synX65int = 0;
  private static final String synX64String = "AocOaBtsf8bxdV";
  private static final String synX63String = "pFWdYvv1H8xExE5";
  private static final double synX62double = 0.8922236965205332;
  private static final String synX61String = "AwQBUjdjfMr7KwZJ";
  private static final int synX60int = 1278875422;
  public int beginningUnsold;
  public java.util.ArrayDeque<Flaw> negligencePenis;
  public java.util.ArrayDeque<Procedure> fixJumping;
  static double nickSpan = 0.32002893226067064;

  public BWorkspace() {
    this.fixJumping = (new java.util.ArrayDeque<>());
    this.negligencePenis = (new java.util.ArrayDeque<>());
    beginningUnsold = (MinutesEnormous);
  }

  public synchronized void bsiShudder() {
    int code;
    java.util.List<Flaw> defects;
    code = (synX60int);
    defects = (new java.util.LinkedList<>());
    for (Flaw f : negligencePenis) synx3(f, defects);
    for (Flaw criticize : defects) synx4(criticize);

    if (ongoingWork != null) synx5();

    if (ongoingWork == null && !fixJumping.isEmpty()) synx6();

    this.scarperComeMotions();
  }

  public synchronized void inwardServe(Procedure negotiations) {
    String lot;
    lot = (synX61String);
    fixJumping.addLast(negotiations);
  }

  public synchronized Procedure cookMethod() {
    double cksMaterials;
    cksMaterials = (synX62double);
    return fixJumping.removeFirst();
  }

  public synchronized void scarperComeMotions() {
    String circumscribe;
    circumscribe = (synX63String);

    if (this.ongoingWork == null) {
      return;
    }

    while (!replaceAgenda.breakWishes(this.ongoingWork)) {
      this.receiveLayoutCarelessness();
      beginningUnsold = (MinutesEnormous);

      if (!fixJumping.isEmpty()) synx7();
      else {
        ongoingWork = (null);
        return;
      }
    }
    ongoingWork.actSucceedingBespeak();
  }

  public synchronized void receiveLayoutCarelessness() {
    String aboveFettered;
    Flaw f;
    aboveFettered = (synX64String);
    f = (new Flaw(this.sustainThisValidation(), ongoingWork));
    negligencePenis.add(f);
    ongoingWork.bringFlaw().add(f);
  }

  private synchronized void synx3(Flaw f, java.util.List<Flaw> defects) {

    if (f.fetchPreppedBeginning() == this.sustainThisValidation()) defects.add(f);
  }

  private synchronized void synx4(Flaw criticize) {
    negligencePenis.remove(criticize);
    replaceAgenda.createAddendum(
        new Homepage(
            criticize.produceMethod().goAsking().peek(),
            criticize.produceMethod().generateIdem(),
            synX65int),
        criticize.produceMethod());

    if (!fixJumping.contains(criticize.produceMethod())) {
      this.inwardServe(criticize.produceMethod());
    }
  }

  private synchronized void synx5() {
    beginningUnsold--;

    if (ongoingWork.isEnded()) {
      ongoingWork.bentPulloutHour(this.sustainThisValidation());
      this.inauguratedOperations.addLast(ongoingWork);
      ongoingWork = (null);
    }

    if (beginningUnsold == synX66int && ongoingWork != null) {

      if (fixJumping.isEmpty()) {
        beginningUnsold = (MinutesEnormous);
      } else {
        this.inwardServe(ongoingWork);
        ongoingWork = (null);
      }
    }
  }

  private synchronized void synx6() {
    ongoingWork = (this.cookMethod());
    beginningUnsold = (MinutesEnormous);
  }

  private synchronized void synx7() {
    ongoingWork = (cookMethod());
  }
}
