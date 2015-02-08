package de.bschandera.gut;

public class Main {

    private static final String INIT = "init";
    private static final String ADD = "add";
    private static final String COMMIT = "commit";
    private static final String LOG = "log";
    private static final String CHECKOUT = "checkout";

    public static void main(String[] args) {

        String secondArg = args[0];
        if (secondArg.equals(INIT)) {
            Init init = new Init();
            init.init();
        }else if(secondArg.equals(LOG)){
        	Log test = new Log();
        	test.log();
        }else if(secondArg.equals(COMMIT)){
        	Commit test = new Commit();
        	test.changeLog(15);
        }
        

    }

}
