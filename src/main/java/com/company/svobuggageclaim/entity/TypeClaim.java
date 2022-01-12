package com.company.svobuggageclaim.entity;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;


public enum TypeClaim implements EnumClass<String> {

    MISSING("M"),
    DAMAGE("D"),
    PLIFERAGE("P");

    private String id;

    TypeClaim(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static TypeClaim fromId(String id) {
        for (TypeClaim at : TypeClaim.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}