package project1.demo.Project1;

import javax.persistence.*;

@Embeddable
public class Address {

    @Column(name =" District" , table = "address" , nullable = false, length = 45)
    private String District;

    @Column(name = "City" ,  table = "address" , nullable = false, length = 45)
    private String City;

    @Column(name = "String" , table = "address" ,  nullable = false, length = 45)
    private String State;

    @Column(name = "Pincode" ,  table = "address" , nullable = false, length = 45)
    private Long Pincode;

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
