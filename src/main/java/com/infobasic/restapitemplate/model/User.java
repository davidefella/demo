package com.infobasic.restapitemplate.model;

import java.time.LocalDateTime;

public class User {
    
    private int id; 
    private String username; 
    private String email; 
    private LocalDateTime dateRegistered; //data e ora di registrazione
    private boolean isEnabled = true; 
    private String role;

    public User(int id, String username, String email, LocalDateTime dateRegistered, boolean isEnabled, String role) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.dateRegistered = dateRegistered;
        this.isEnabled = isEnabled;
        this.role = role;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(LocalDateTime dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", email=" + email + ", dateRegistered=" + dateRegistered
                + ", isEnabled=" + isEnabled + ", role=" + role + "]";
    } 
    
}
