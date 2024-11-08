package de.pischka.primefaces.schnellstart.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class ToDo implements Serializable {

    private final String id;
    private final String titel;

    public ToDo(String titel) {
        this.id = UUID.randomUUID().toString();
        this.titel = titel;
    }

    public String getId() {
        return id;
    }

    public String getTitel() {
        return titel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ToDo toDo = (ToDo) o;
        return Objects.equals(id, toDo.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
