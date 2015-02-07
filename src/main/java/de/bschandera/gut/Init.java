package de.bschandera.gut;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Init {

    private static final String GUT_ROOT = ".gut";
    private static final String LOG = "/log";

    public boolean init() {
        try {
            FileUtils.touch(new File(GUT_ROOT + LOG));
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

}
