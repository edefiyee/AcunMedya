package service;

import entity.ProgrammingLanguage;

import java.util.ArrayList;
import java.util.List;

public class ProgrammingLanguageManager implements ProgrammingLanguageService {
    private List<ProgrammingLanguage> languages = new ArrayList<>();

    @Override
    public void add(ProgrammingLanguage language) {
        languages.add(language);
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return languages;
    }

    @Override
    public void delete(int id) {
        languages.removeIf(lang -> lang.getId().equals(String.valueOf(id)));
    }

    @Override
    public void update(int id, ProgrammingLanguage language) {
        for (int i = 0; i < languages.size(); i++) {
            if (languages.get(i).getId().equals(String.valueOf(id))) {
                languages.set(i, language);
                break;
            }
        }
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        return languages.stream()
                .filter(lang -> lang.getId().equals(String.valueOf(id))) // String ile karşılaştırma
                .findFirst()
                .orElse(null);
    }

}


