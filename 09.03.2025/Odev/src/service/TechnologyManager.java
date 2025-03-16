package service;

import entity.Technology;

import java.util.ArrayList;
import java.util.List;

public class TechnologyManager implements TechnologyService {
    private List<Technology> technologies = new ArrayList<>();


    @Override
    public void add(Technology technology) {
        technologies.add(technology);

    }

    @Override
    public List<Technology> getAll() {
        return technologies;
    }

    @Override
    public void delete(int id) {
        technologies.removeIf(tech -> tech.getId() == id);
    }

    @Override
    public void update(int id, Technology technology) {
        for (int i = 0; i < technologies.size(); i++) {
            if (technologies.get(i).getId() == id) {
                technologies.set(i, technology);
                break;
            }
        }

    }

    @Override
    public Technology getById(int id) {
        return technologies.stream()
                .filter(tech -> tech.getId() == id)
                .findFirst()
                .orElse(null);

    }
}
