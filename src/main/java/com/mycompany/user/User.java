package com.mycompany.user;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 500)
    private String amount;

    @Column(length = 15, nullable = false)
    private String type;

    @Column(length = 455, nullable = false)
    private String description;

    private boolean Enabled;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getEnabled() {
        return Enabled;
    }

    public void  setEnabled(boolean patvirtinta) {
        this.Enabled = Enabled;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", amount='" + amount + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", enabled=" + Enabled +
                '}';
    }
}
