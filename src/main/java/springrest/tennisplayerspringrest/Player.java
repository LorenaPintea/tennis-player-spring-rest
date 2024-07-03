package springrest.tennisplayerspringrest;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity
public class Player {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String nationality;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date birthday;
    private Integer titles;

    public Player() {
    }

    public Player(Integer titles, Date birthday, String nationality, String name) {
        this.titles = titles;
        this.birthday = birthday;
        this.nationality = nationality;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getTitles() {
        return titles;
    }

    public void setTitles(Integer titles) {
        this.titles = titles;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", birthday=" + birthday +
                ", titles=" + titles +
                '}';
    }
}
