package com.avrajsri.funchat;


class InstantMessage {

    private String message;
    private String author;

    InstantMessage(String message, String author) {
        this.message = message;
        this.author = author;
    }

    public InstantMessage() {


    }

    public String getMessage() {
        return message;
    }

    public String getAuthor() {
        return author;
    }
}
