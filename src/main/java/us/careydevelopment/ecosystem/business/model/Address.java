package us.careydevelopment.ecosystem.business.model;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import us.careydevelopment.ecosystem.business.validator.ValidUsState;

import javax.validation.constraints.Size;

public class Address {

    @Size(max = 80, message = "Street address cannot exceed 80 characters")
    private String street1;

    @Size(max = 80, message = "Street address cannot exceed 80 characters")
    private String street2;

    @Size(max = 50, message = "City name cannot exceed 50 characters")
    private String city;
    
    @Size(max = 64, message = "Region name cannot exceed 64 characters")
    private String region;

    @Size(max = 64, message = "Province name cannot exceed 64 characters")
    private String province;

    @ValidUsState
    private String state;

    //use full country name or whichever country code you want
    @Size(max = 24, message = "Country name cannot exceed 24 characters")
    private String country;

    @Size(max = 16, message = "Postal code cannot exceed 16 characters")
    private String postalCode;

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getState() {
        return state;
    }

    public void setStage(String state) {
        this.state = state;
    }
    
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
