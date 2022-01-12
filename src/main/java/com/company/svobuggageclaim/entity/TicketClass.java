package com.company.svobuggageclaim.entity;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;


public enum TicketClass implements EnumClass<String> {

    FIRST("A"),
    BUSINESS("B"),
    ECONOMY("E");

    private String id;

    TicketClass(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static TicketClass fromId(String id) {
        for (TicketClass at : TicketClass.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}