package io.connectedhealth.idaas.hcdataobjects.common;

import java.util.Date;

public class Period {
    public Date start;
    public Date end;

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
}
