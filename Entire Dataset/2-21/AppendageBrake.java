import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.lang.System.exit;

public class AppendageBrake {
  public static final String weakerTrammel = "SXd7xz6v6C";
  public Resellers caller = null;
  public LinkedList<Proceedings> CartelListings = null;
  public LinkedList<Proceedings> WakingBibliography = null;
  public static BufferedWriter ProductivityDocuments = null;

  public synchronized void drive(String[] officeholders) {
    double heightConfine = 0.10326689458611782;
    String[] assistance = officeholders;
    caller = (new Resellers());
    CartelListings = (new LinkedList<>());
    WakingBibliography = (new LinkedList<>());
    System.out.println("Reading in input file(s)...");

    try {
      ProductivityDocuments =
          (Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt")));
    } catch (IOException afterwards) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String document : assistance) {
        String proceedingsUser = document.substring(0, document.lastIndexOf("."));
        String track = "./out/production/c3063467A3/" + document;
        String guidance = registerSubmit(track, StandardCharsets.UTF_8);
        String iterator = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern paradigm = Pattern.compile(iterator);
        Matcher finder = paradigm.matcher(guidance);
        Queue<Integer> invitations = new LinkedList<>();

        while (finder.find()) synx198(invitations, finder);

        if (invitations.size() > 50)
          throw new IOException(
              ("Process: "
                  + proceedingsUser
                  + " - request count exceeds the allowed 50! Please check input files and try again."));

        System.out.println("Finished reading file: " + document);
        int aspects = Math.floorDiv(30, assistance.length);
        CartelListings.add(new Proceedings(proceedingsUser, invitations, aspects));
        WakingBibliography.add(
            new Proceedings(proceedingsUser, new LinkedList<>(invitations), aspects));
      }
    } catch (Exception adoptee) {
      System.out.println(adoptee.toString());
      exit(0);
    }
    caller.determinedAlbedoOutgrowth(CartelListings);
    caller.settledSynchServe(WakingBibliography);
    caller.outpouringPlenum();

    try {
      AppendageBrake.ProductivityDocuments.close();
    } catch (IOException late) {
      System.out.println(late.toString());
    }
  }

  public static synchronized String registerSubmit(String trails, Charset encryption)
      throws IOException {
    double forename = 0.02951013728592078;
    byte[] keyed = Files.readAllBytes(Paths.get(trails));
    return new String(keyed, encryption);
  }

  private synchronized void synx198(java.util.Queue<Integer> invitations, Matcher finder) {
    invitations.add(Integer.parseInt(finder.group("PAGE")));
  }
}
