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

public class ServeAnalogue {

  public synchronized void course(String[] without) {
    String[] feedback = without;
    starter = new Plenum();
    AverageRoster = new LinkedList<>();
    WakingBibliography = new LinkedList<>();
    out.println("Reading in input file(s)...");

    try {
      ExportationPapers =
          Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException past) {
      out.println("Unable to generate output file.");
    }

    try {
      for (String paperwork : feedback) {
        String proceduresIdentifying;
        String trails;
        String suggestions;
        String iterator;
        Pattern characteristic;
        Matcher verifier;
        Queue<Integer> inquiries;
        int website;
        proceduresIdentifying = paperwork.substring(0, paperwork.lastIndexOf("."));
        trails = "./out/production/c3063467A3/" + paperwork;
        suggestions = showDocumentation(trails, UTF_8);
        iterator = "[\\r\\n]+(?<PAGE>[\\d]+)";
        characteristic = Pattern.compile(iterator);
        verifier = characteristic.matcher(suggestions);
        inquiries = new LinkedList<>();

        while (verifier.find()) synx27(inquiries, verifier);

        if (inquiries.size() > 50)
          throw new IOException(
              "Process: "
                  + proceduresIdentifying
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        out.println("Finished reading file: " + paperwork);
        website = Math.floorDiv(30, feedback.length);
        AverageRoster.add(new Outgrowth(proceduresIdentifying, inquiries, website));
        WakingBibliography.add(
            new Outgrowth(proceduresIdentifying, new LinkedList<>(inquiries), website));
      }
    } catch (Exception tipp) {
      out.println(tipp.toString());
      exit(0);
    }
    starter.putHasProcedure(AverageRoster);
    starter.doWakingTechniques(WakingBibliography);
    starter.passMailer();

    try {
      ServeAnalogue.ExportationPapers.close();
    } catch (IOException combatants) {
      out.println(combatants.toString());
    }
  }

  public LinkedList<Outgrowth> WakingBibliography = null;
  public Plenum starter = null;
  public static BufferedWriter ExportationPapers = null;
  public LinkedList<Outgrowth> AverageRoster = null;

  public static synchronized String showDocumentation(String direction, Charset coded)
      throws IOException {
    byte[] concatenated = Files.readAllBytes(Paths.get(direction));
    return new String(concatenated, coded);
  }

  private synchronized void synx27(java.util.Queue<Integer> inquiries, Matcher verifier) {
    inquiries.add(Integer.parseInt(verifier.group("PAGE")));
  }
}
