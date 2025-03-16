package repository;

import entity.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageRepository {
        void add(ProgrammingLanguage language);//yeni bir programlama dili oluşturmak için kullanılır
        List<ProgrammingLanguage> getAll();// getaal metodu programlama dillerini liste olarak döndürür
        void delete(int id);
        void update(int id, ProgrammingLanguage language);
        ProgrammingLanguage getById(int id);
    }




