package by.epam.rosspekh.springcoresandbox.exercise1;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

@Slf4j
@SuppressWarnings("WeakerAccess")
public class FileEventLogger implements EventLogger {

    protected String filename;

    protected File file;

    public FileEventLogger(String filename) {
        this.filename = filename;
    }

    public void init() throws IOException {
        this.file = new File(filename);
        if (!this.file.createNewFile() && !this.file.exists()) {
            throw new IOException();
        }
    }

    @Override
    public void logEvent(final Event event) {
        try {
            FileUtils.writeStringToFile(file, event + "\n", true);
        } catch (IOException e) {
            log.error(e.getLocalizedMessage());
        }
    }
}
