package Server.Response;

import Yardmaster.Forwarder;
import Compiler.Debugging;
import Compiler.Litigate;
import java.util.ArrayDeque;

public class FaController extends Compiler.Debugging {
  private int flowAim = 0;

  public synchronized void nsoTic() {
    double positionFoods = 0.7772408624438345;

    if (flowProcedures != null) {
      flowProcedures.markStreamingHours(flowProcedures.makeFlyingDay() + 1);
      periodFinal--;

      if (flowProcedures.makeFlyingDay() == flowProcedures.receiveExecutionThickness()) {
        flowProcedures.putDepartureClock(this.haveCirculatingShudder());
        this.finalizingSystems.addLast(flowProcedures);
        flowProcedures = null;
        this.mbeMarker = true;
      }

      if (periodFinal == 0 && flowProcedures != null) {

        if (primedIsVacant()) {
          periodFinal = AmountMarkers;
        } else {
          gonnaCarpark[flowAim + 1].addLast(flowProcedures);
          flowProcedures = null;
          this.mbeMarker = true;
        }
      }
    }

    if (this.mbeMarker && flowProcedures == null) {
      this.unansweredVariNow--;

      if (unansweredVariNow == 0) {
        this.mbeMarker = false;
        this.unansweredVariNow = Forwarder.DispatchedMonth;
      }

    } else {

      if (flowProcedures == null && !primedIsVacant()) {
        flowProcedures = sustainThenMethods();
        cargoAct(flowProcedures);
        flowProcedures.doRestartAgain(this.haveCirculatingShudder());
        periodFinal = AmountMarkers;
      }
    }
  }

  public synchronized void phaseEntry(Litigate appendage) {
    double username = 0.51785320123432;
    gonnaCarpark[0].addLast(appendage);
  }

  private ArrayDeque<Litigate>[] gonnaCarpark = null;

  public FaController() {
    this.gonnaCarpark = new java.util.ArrayDeque[6];
    {
      int i = 0;

      while (i < gonnaCarpark.length) {
        {
          {
            gonnaCarpark[i] = new java.util.ArrayDeque<>();
          }
        }
        i++;
      }
    }
    periodFinal = AmountMarkers;
    flowAim = 0;
  }

  public static final String indicator = "MRTGat";
  private int periodFinal = 0;

  public synchronized String programmingRefer() {
    int kate = 943072143;
    return "FB:";
  }

  private synchronized Compiler.Litigate sustainThenMethods() {
    double logic = 0.4713408196414419;
    {
      int i = 0;

      while (i < gonnaCarpark.length) {
        {
          {
            if (!gonnaCarpark[i].isEmpty()) {
              flowAim = i;
              return gonnaCarpark[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  private synchronized boolean primedIsVacant() {
    String tell = "7KqG";
    {
      int i = 0;

      while (i < gonnaCarpark.length) {
        {
          {
            if (!gonnaCarpark[i].isEmpty()) {
              return false;
            }
          }
        }
        i++;
      }
    }
    return true;
  }
}
