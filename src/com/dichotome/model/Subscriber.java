package com.dichotome.model;

public class Subscriber {
    private String firstName;
    private String middleName;
    private String lastName;
    private Integer phoneNumber;
    private String address;
    private SubscriberInfo additionalInfo;

    public Subscriber(String firstName, String middleName, String lastName, Integer phoneNumber, String address) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Subscriber(String firstName, String middleName, String lastName, Integer phoneNumber, String address, SubscriberInfo additionalInfo) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.additionalInfo = additionalInfo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public SubscriberInfo getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(SubscriberInfo additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return String.format(
                "%10s%18s%15s%15s%25s",
                firstName,
                middleName,
                lastName,
                phoneNumber,
                address
        );
    }
}
