package com.company.networkv6.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseStringIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.UUID;

@NamePattern("%s|name")
@Table(name = "NETWORKV6_GOODS")
@Entity(name = "networkv6$Goods")
public class Goods extends BaseStringIdEntity implements HasUuid {
    @Id
    @Column(name = "NAME", nullable = false, length = 25)
    protected String name;

    @Column(name = "UUID")
    protected UUID uuid;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MAKER_NAME")
    protected Maker maker;

    @NotNull
    @Column(name = "COST", nullable = false)
    protected BigDecimal cost;

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Maker getMaker() {
        return maker;
    }

    public void setMaker(Maker maker) {
        this.maker = maker;
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