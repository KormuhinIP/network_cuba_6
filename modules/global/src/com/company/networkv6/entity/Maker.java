package com.company.networkv6.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseStringIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@NamePattern("%s|fullName")
@Table(name = "NETWORKV6_MAKER")
@Entity(name = "networkv6$Maker")
public class Maker extends BaseStringIdEntity implements HasUuid {
    @Id
    @Column(name = "NAME", nullable = false, length = 25)
    protected String name;

    @Column(name = "UUID")
    protected UUID uuid;

    @NotNull
    @Column(name = "FULL_NAME", nullable = false)
    protected String fullName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    protected User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    @Override
    public void setId(String id) {
        this.name = id;
    }

    @Override
    public String getId() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}