package com.dichotome.model;

public class SubscriberInfo {
    private String countryOfOrigin;
    private int age;
    private String job;

    public SubscriberInfo(String countryOfOrigin, int age, String job) {
        this.countryOfOrigin = countryOfOrigin;
        this.age = age;
        this.job = job;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "SubscriberInfo: country of origin - " + countryOfOrigin + ", age - " + age + ", job - " + job;
    }
}
