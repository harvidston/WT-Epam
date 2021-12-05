package main.java.by.bsuir.wt.mihalkov.tasks.fourth.entity;

public enum Role {
    USER("user"),
    ADMIN("admin");

    private final String value;

    Role(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
