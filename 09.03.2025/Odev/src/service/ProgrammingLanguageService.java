package service;

import entity.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageService {
    void add(ProgrammingLanguage language);
    List<ProgrammingLanguage> getAll();
    void delete(int id);
    void update(int id, ProgrammingLanguage language);
    ProgrammingLanguage getById(int id);

}
