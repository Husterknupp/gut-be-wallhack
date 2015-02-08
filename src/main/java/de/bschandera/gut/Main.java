package de.bschandera.gut;

public class Main {

    public static final String GUT = ".gut";

    private static final String INIT = "init";
    private static final String ADD = "add";
    private static final String COMMIT = "commit";
    private static final String LOG = "log";
    private static final String CHECKOUT = "checkout";

    public static void main(String[] args) {

        String command = args[0];
        if (command.equals(INIT)) {
            new Init().init();
        } else if (command.equals(LOG)) {
            new Log().log();
        } else if (command.equals(ADD)) {
            String fileName = args[1];
            new Add().add(fileName);
        }else if(command.equals(COMMIT)) {
            final Commit commit = new Commit();
            // TODO read commitId from HEAD file
            int commitId = commit.getCommitId();
            commit.changeLog(commitId);
        }
    }

}
