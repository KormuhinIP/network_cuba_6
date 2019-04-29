package com.company.networkv6.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseStringIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@NamePattern("%s  %s|number,name")
@Table(name = "NETWORKV6_SHOP")
@Entity(name = "networkv6$Shop")
public class Shop extends BaseStringIdEntity implements HasUuid {
    @Id
    @Column(name = "NUMBER_", nullable = false, length = 10)
    protected String number;

    @Column(name = "UUID")
    protected UUID uuid;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "NETWORK_NAME")
    protected Network network;

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    @Override
    public void setId(String id) {
        this.number = id;
    }

    @Override
    public String getId() {
        return number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}