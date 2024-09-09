package br.edu.fatecfranca.ex1;

import java.util.List;

public class Message {
    private int id;
    private String text;
    private Person person;
    private Forum forum;

    public Message(int id, String text, Person person, Forum forum) {
        this.id = id;
        this.text = text;
        this.person = person;
        this.forum = forum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Forum getForum() {
        return forum;
    }

    public void setForum(Forum forum) {
        this.forum = forum;
    }
}