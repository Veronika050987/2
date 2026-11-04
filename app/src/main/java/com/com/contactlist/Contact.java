package com.com.contactlist;

public class Contact {
    final private String name;
    final private String phone;
    final private int avatarResource; // ID drawable ресурса

    public Contact(String name, String phone, int avatarResource) {
        this.name = name;
        this.phone = phone;
        this.avatarResource = avatarResource;
    }

    public String getName() { return name; }
    public String getPhone() { return phone; }
    public int getAvatarResource() { return avatarResource; }
}
