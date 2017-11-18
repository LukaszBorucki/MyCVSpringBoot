package co.borucki.MyCV.model;

import javax.persistence.*;

@Entity
@Table(name = "additional")
public class Additional {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String date;
    private String namePl;
    private String nameEn;

    public Additional() {
    }

    public Additional(int id, String date, String namePl, String nameEn) {
        this.id = id;
        this.date = date;
        this.namePl = namePl;
        this.nameEn = nameEn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNamePl() {
        return namePl;
    }

    public void setNamePl(String namePl) {
        this.namePl = namePl;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }
}
