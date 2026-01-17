package br.com.jackson.persistence;

public interface FilePersistence {

    String write(final String data);

    boolean remove(final String sentece);

    String replace(final String oldContent, final String newContent);

    String findAll();

    String findBy(final String setence);
}
