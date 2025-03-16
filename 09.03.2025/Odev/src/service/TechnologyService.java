package service;

import entity.Technology;

import java.util.List;

public interface TechnologyService {
    void add(Technology technology);
    List<Technology> getAll();
    void delete(int id);
    void update(int id, Technology technology);
    Technology getById(int id);


}
