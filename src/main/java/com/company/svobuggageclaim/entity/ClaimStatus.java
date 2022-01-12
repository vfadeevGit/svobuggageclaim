package com.company.svobuggageclaim.entity;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;


public enum ClaimStatus implements EnumClass<String> {

    NEW("A"),
    REGISTERED("B"),
    INPROGRESS("C"),
    RESOLVED("D"),
    REJECTED("E");

    private String id;

    ClaimStatus(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static ClaimStatus fromId(String id) {
        for (ClaimStatus at : ClaimStatus.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}