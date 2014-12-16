package pl.brightworks.libman.infrastructure.repository;

import pl.brightworks.libman.domain.library.Library;
import pl.brightworks.libman.domain.library.Libraries;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class InMemoryLibraries implements Libraries {

    private Map<String, Library> libraries = new ConcurrentHashMap<>();

    @Override
    public void save(Library library) {
        libraries.put(library.getName(), library);
    }

    @Override
    public List<Library> getAll() {
        return new ArrayList<>(libraries.values());
    }

    @Override
    public Library get(String name) {
        return libraries.get(name);
    }
}
