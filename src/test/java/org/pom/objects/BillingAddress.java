package org.pom.objects;

public class BillingAddress  {
    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public BillingAddress setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public BillingAddress setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getCompanytName() {
        return companytName;
    }

    public BillingAddress setCompanytName(String companytName) {
        this.companytName = companytName;
        return this;
    }

    public String getAddressLineone() {
        return addressLineone;
    }

    public BillingAddress setAddressLineone(String addressLineone) {
        this.addressLineone = addressLineone;
        return this;
    }

    public String getTown() {
        return town;
    }

    public BillingAddress setTown(String town) {
        this.town = town;
        return this;
    }

    public String getPostCode() {
        return postCode;
    }

    public BillingAddress setPostCode(String postCode) {
        this.postCode = postCode;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public BillingAddress setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public BillingAddress setEmail(String email) {
        this.email = email;
        return this;
    }

    private String lastName;
    private String companytName;
    private String addressLineone;
    private String town;
    private String postCode;
    private String phone;
    private String email;




}
