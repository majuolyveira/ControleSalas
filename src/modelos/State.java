package modelos;

import java.util.HashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Lirio
 */
public class State {

    private final Map<String, ClassRoom> rooms;
    private final Map<String, Subject> subjects;

    /**
     * Cria uma instância para gerenciar o estado do programa
     */
    public State() {
        this.rooms = new HashMap<>();
        this.subjects = new HashMap<>();
    }

    /**
     * Todas as salas
     *
     * @return uma lista com as salas cadastradas
     */
    public Map<String, ClassRoom> getRooms() {
        return rooms;
    }

    /**
     * Todas as disciplinas
     *
     * @return uma lista com as disciplinas cadastradas
     */
    public Map<String, Subject> getSubjects() {
        return subjects;
    }

    /**
     * Adiciona uma sala à lista de salas
     *
     * @param classroom
     */
    void addNewRoom(ClassRoom classroom) {
        rooms.put(classroom.getId(), classroom);
    }

    /**
     * Adiciona uma disciplina à lista de disciplinas
     *
     * @param subject
     */
    void addNewSubject(Subject subject) {
        subjects.put(subject.getCode(), subject);
    }

    /**
     * Pegar uma sala específica na lista
     * @param id o identificador da disciplina
     * @return a sala referente a esse <code>id</code>
     */
    ClassRoom getClassroom(String id) {
        return rooms.get(id);
    }

    /**
     * Pegar uma disciplina específica na lista
     *
     * @param code o código da disciplina
     * @return a disciplina referente a esse código
     */
    Subject getSubject(String code) {
        return subjects.get(code);
    }

    /**
     * Remover uma sala
     *
     * @param id o identificador da sala
     */
    void deleteClassroom(String id) {
        rooms.remove(id);
    }

    /**
     * Remover uma disciplina
     *
     * @param code o código da disciplina
     */
    void deleteSubject(String code) {
        subjects.remove(code);
    }

}
