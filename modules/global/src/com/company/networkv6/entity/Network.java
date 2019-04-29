package com.company.networkv6.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseStringIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@NamePattern("%s|name")
@Table(name = "NETWORKV6_NETWORK")
@Entity(name = "networkv6$Network")
public class Network extends BaseStringIdEntity implements HasUuid {
    @Id
    @Column(name = "NAME", nullable = false, length = 25)
    protected String name;

    @Column(name = "UUID")
    protected UUID uuid;

    @NotNull
    @Column(name = "FULL_NAME", nullable = false)
    protected String fullName;

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