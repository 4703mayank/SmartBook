package com.bittercode.model;

public enum UserRole {
    ADMIN(1, "Admin"),
    CUSTOMER(2, "Customer");

    private final int roleId;
    private final String displayName;

    UserRole(int roleId, String displayName) {
        this.roleId = roleId;
        this.displayName = displayName;
    }

    public int getRoleId() {
        return roleId;
    }

    public String getDisplayName() {
        return displayName;
    }
}
