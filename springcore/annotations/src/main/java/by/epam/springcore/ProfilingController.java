package by.epam.springcore;

public class ProfilingController implements ProfilingControllerMBean {

    private boolean enable = true;

    public boolean isEnabled() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}
