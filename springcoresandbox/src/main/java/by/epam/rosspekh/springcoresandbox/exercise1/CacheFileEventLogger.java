package by.epam.rosspekh.springcoresandbox.exercise1;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class CacheFileEventLogger extends FileEventLogger {

    private int maxCacheSize;
    private List<Event> cache;

    public CacheFileEventLogger(String filename, int maxCacheSize) {
        super(filename);
        this.maxCacheSize = maxCacheSize;
        cache = new ArrayList<>(maxCacheSize);
    }

    @Override
    public void logEvent(final Event event) {
        cache.add(event);

        if (cache.size() > maxCacheSize) {
            writeEventsFromCache();
            cache.clear();
        }
    }

    private void writeEventsFromCache() {
        var builder = new StringBuilder();
        cache.forEach(s -> builder.append(s).append(" "));
        try {
            FileUtils.writeStringToFile(file, builder.toString() + "<end>\n", true);
        } catch (IOException e) {
            log.error(e.getLocalizedMessage());
        }
    }

    public void destroy() {
        if (!cache.isEmpty()) {
            writeEventsFromCache();
            cache.clear();
        }
    }

}
