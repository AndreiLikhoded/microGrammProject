package com.example.micro_Gramm_Project.entity;


import lombok.Data;

@Data
public class User {
    private String login;
    private String email;
    private int id;
    private int age;
    private String password;
    private int numberOfPublications;
    private int numberOfSubscribes;
    private int numberOfSubscribers;

    public User(String login, String email, int id, int age, String password, int numberOfPublications, int numberOfSubscribes, int numberOfSubscribers) {
        this.login = login;
        this.email = email;
        this.id = id;
        this.age = age;
        this.password = password;
        this.numberOfPublications = numberOfPublications;
        this.numberOfSubscribes = numberOfSubscribes;
        this.numberOfSubscribers = numberOfSubscribers;
    }


}
