import java.time.LocalDate;

public class Telephone {
    private String soz;
    private long san;
    private LocalDate localDate;
    private long id;
    public Telephone() {
    }

    public Telephone(String soz, long san,LocalDate localDate,long id) {
        this.soz = soz;
        this.san = san;
        this.localDate = localDate;
        this.id = id;
    }

    public String getSoz() {
        return soz;
    }

    public void setSoz(String soz) {
        this.soz = soz;
    }

    public long getSan() {
        return san;
    }

    public void setSan(long san) {
        this.san = san;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
}
