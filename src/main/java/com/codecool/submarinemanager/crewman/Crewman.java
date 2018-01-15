package com.codecool.submarinemanager.crewman;

public class Crewman {

    private Integer id;
    private String firstName;
    private String lastName;
    private String rank;

    public Crewman(Integer id, String firstName, String lastName, String rank) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.rank = rank;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
