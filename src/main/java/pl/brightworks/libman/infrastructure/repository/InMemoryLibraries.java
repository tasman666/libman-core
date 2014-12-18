package pl.brightworks.libman.infrastructure.repository;

import pl.brightworks.libman.domain.library.Library;
import pl.brightworks.libman.domain.library.Libraries;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class InMemoryLibraries implements Libraries {

    private Map<String, Library> libraries = new ConcurrentHashMap<>();

    @Override
    public Long save(Library library) {
        Long id = IdGenerator.nextId();
        libraries.put(library.getName(), library.id(id));
        return id;
    }

    @Override
    public List<Library> getAll() {
        return new ArrayList<>(libraries.values());
    }

    @Override
    public Optional<Library> get(String name) {
        return Optional.ofNullable(libraries.get(name));
    }
}
