package UnitTests.SpringMockMVC.model;

import java.time.LocalDate;

public class Entidades {
    private String id;
    private String reserverName;
    private LocalDate checkin;
    private LocalDate checkout;
    private int numberGuests;

    public Entidades(String id, String reserverName, LocalDate checkin, LocalDate checkout, int numberGuests) {
        this.id = id;
        this.reserverName = reserverName;
        this.checkin = checkin;
        this.checkout = checkout;
        this.numberGuests = numberGuests;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReserverName() {
        return reserverName;
    }

    public void setReserverName(String reserverName) {
        this.reserverName = reserverName;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }

    public int getNumberGuests() {
        return numberGuests;
    }

    public void setNumberGuests(int numberGuests) {
        this.numberGuests = numberGuests;
    }
}
