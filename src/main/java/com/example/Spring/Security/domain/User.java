package com.example.Spring.Security.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "users")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection(targetClass = UserRole.class, fetch = FetchType.EAGER)
    private Set <UserRole> role;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<UserRole> getRoles() {
        return role;
    }

    public void setRoles(Set<UserRole> roles) {
        this.role = roles;
    }
}
