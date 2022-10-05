package project1.demo.Project1;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 45)
    private String District;

    @Column(nullable = false, unique = true, length = 45)
    private String City;

    @Column(nullable = false, unique = true, length = 45)
    private String State;

    @Column(nullable = false, unique = true, length = 45)
    private Long Pincode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public Long getPincode() {
        return Pincode;
    }

    public void setPincode(Long pincode) {
        Pincode = pincode;
    }
}
