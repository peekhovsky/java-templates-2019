package by.epam.springcore;

import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;

@Slf4j
@Profiling
public class TerminatorQuoter implements Quoter {

    @InjectRandomInt(min = 2, max = 10)
    private int repeat;

    private String message;

    public TerminatorQuoter() {
        log.debug("Constructor repeat: "  + repeat);
    }

    @PostConstruct
    public void init() {
        log.debug("Init repeat: "  + repeat);
    }


    public void setMessage(String message) {
        this.message = message;
    }

    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            log.debug("message = " + message);
        }
    }
}
