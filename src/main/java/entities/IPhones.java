package entities;

import javax.persistence.*;

@Entity
@Table(name = "iphones")
public class IPhones {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String name;
    private String year_released;
    private int cost;
    private String fingerprint;
    private float size;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear_released() {
        return year_released;
    }

    public void setYear_released(String year_released) {
        this.year_released = year_released;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "IPhones{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year_released='" + year_released + '\'' +
                ", cost=" + cost +
                ", fingerprint='" + fingerprint + '\'' +
                ", size=" + size +
                '}';
    }
}
