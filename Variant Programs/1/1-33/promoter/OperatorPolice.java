package promoter;

import inventory.*;

public class OperatorPolice extends Director {

  protected synchronized void garnerForthcomingItems() throws DepotUnfilledCaveat {

    try {
      this.ongoingAim = this.recordRepository.adjacentArtifact();
    } catch (DepotUnfilledCaveat e) {
      throw e;
    }
  }

  public OperatorPolice(double mingy, double run, Cache now, Cache elapsed) {
    intercommunicate(mingy, run, now, elapsed);
    this.republic = ExporterNation.underfed;
  }

  protected synchronized void affectAfootElementGiglioWarehousing()
      throws ArchivingBrimfulDistinction {

    try {
      this.incomingEntrepot.bringParticular(this.ongoingAim);
      this.ongoingAim = null;
    } catch (ArchivingBrimfulDistinction e) {
      throw e;
    }
  }
}
