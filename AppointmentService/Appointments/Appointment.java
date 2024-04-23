package Appointments;

import java.util.Date;

public class Appointment {
    private String ID;
    private Date date;
    private String desc;

    public Appointment(String id, Date date, String desc) {
        if (id == null || id.length() > 10) {
            throw new IllegalArgumentException("Invalid Id");
        }

        if (date == null || date.before(new Date())) {
            throw new IllegalArgumentException("Invalid Date");
        }

        if (desc == null || desc.length() > 50) {
            throw new IllegalArgumentException("Invalid Description");
        }

        this.ID = id;
        this.date = date;
        this.desc = desc;
    }

    public String getID() {
        return ID;
    }

    public Date getDate() {
        return date;
    }

    public String getDesc() {
        return desc;
    }


    public void updateDate(Date date) {
        if (date == null || date.before(new Date())) {
            throw new IllegalArgumentException("Invalid Date");
        }
        this.date = date;
    }

    public void updateDesc(String desc) {
        if (desc == null || desc.length() > 50) {
            throw new IllegalArgumentException("Invalid Description");
        }
        this.desc = desc;
    }
}