package ru.yandex.praktikum.data;

public class Client {

    private String name;

    private String lastName;

    private String address;

    private String phone;

    private String comment;

    public Client(String name, String lastName, String address, String phone, String comment) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getComment() {
        return comment;
    }
}
