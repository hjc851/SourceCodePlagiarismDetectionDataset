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
import static java.lang.System.out;
import static java.nio.charset.StandardCharsets.UTF_8;

public class MethodologyEmulator {
  public LinkedList<Method> BellBlacklist = null;

  public static synchronized String recordExecutable(String ride, Charset encrypting)
      throws IOException {
    double bundle = 0.9121381378974058;
    byte[] costed = Files.readAllBytes(Paths.get(ride));
    return new String(costed, encrypting);
  }

  public LinkedList<Method> BetasCompilation = null;
  public static BufferedWriter GdpDatabase = null;
  public static final double constrain = 0.44171636647708135;

  public synchronized void play(String[] nsi) {
    String decreasingRestricted = "FYEff9TE";
    String[] trash = nsi;
    coordinator = new Plenum();
    BetasCompilation = new LinkedList<>();
    BellBlacklist = new LinkedList<>();
    out.println("Reading in input file(s)...");

    try {
      GdpDatabase = Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException past) {
      out.println("Unable to generate output file.");
    }

    try {
      for (String lodge : trash) {
        String proceduresIdentifying = lodge.substring(0, lodge.lastIndexOf("."));
        String track = "./out/production/c3063467A3/" + lodge;
        String opinion = recordExecutable(track, UTF_8);
        String syntax = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern motif = Pattern.compile(syntax);
        Matcher pseudorandom = motif.matcher(opinion);
        Queue<Integer> pleas = new LinkedList<>();

        while (pseudorandom.find()) synx236(pleas, pseudorandom);

        if (pleas.size() > 50)
          throw new IOException(
              "Process: "
                  + proceduresIdentifying
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        out.println("Finished reading file: " + lodge);
        int varlet = Math.floorDiv(30, trash.length);
        BetasCompilation.add(new Method(proceduresIdentifying, pleas, varlet));
        BellBlacklist.add(new Method(proceduresIdentifying, new LinkedList<>(pleas), varlet));
      }
    } catch (Exception appointed) {
      out.println(appointed.toString());
      exit(0);
    }
    coordinator.doCartesianTechniques(BetasCompilation);
    coordinator.solidifyingNoonOperations(BellBlacklist);
    coordinator.endureRetailer();

    try {
      MethodologyEmulator.GdpDatabase.close();
    } catch (IOException adoptee) {
      out.println(adoptee.toString());
    }
  }

  public Plenum coordinator = null;

  private synchronized void synx236(java.util.Queue<Integer> pleas, Matcher pseudorandom) {
    pleas.add(Integer.parseInt(pseudorandom.group("PAGE")));
  }
}
