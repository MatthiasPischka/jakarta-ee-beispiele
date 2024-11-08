package de.pischka.primefaces.schnellstart.view;

import de.pischka.primefaces.schnellstart.model.ToDo;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@ViewScoped
public class ToDoVerwaltungController implements Serializable {
    private List<ToDo> toDos;
    private List<ToDo> toDosErledigt;
    private String toDoNeu;

    @PostConstruct
    private void init() {
        this.toDos = new ArrayList<>();
        this.toDos.add(new ToDo("Testen"));
        this.toDos.add(new ToDo("Dokumentieren"));
    }

    public void anlegen() {
        this.toDos.add(new ToDo(this.toDoNeu));
        this.toDoNeu = "";
    }

    public void loeschen() {
        this.toDosErledigt.forEach(this.toDos::remove);
    }

    public List<ToDo> getToDos() {
        return toDos;
    }

    public void setToDos(List<ToDo> toDos) {
        this.toDos = toDos;
    }

    public List<ToDo> getToDosErledigt() {
        return toDosErledigt;
    }

    public void setToDosErledigt(List<ToDo> toDosErledigt) {
        this.toDosErledigt = toDosErledigt;
    }

    public String getToDoNeu() {
        return toDoNeu;
    }

    public void setToDoNeu(String toDoNeu) {
        this.toDoNeu = toDoNeu;
    }
}
