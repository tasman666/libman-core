package pl.brightworks.libman.application;

import pl.brightworks.libman.domain.library.Library;
import pl.brightworks.libman.domain.library.Libraries;

import java.util.List;
import java.util.Optional;

public class LibraryApplicationService {

    private Libraries libraries;

    public LibraryApplicationService(Libraries libraries) {
        this.libraries = libraries;
    }

    public Optional<Long> createLibrary(String name) {
        if (getLibrary(name).isPresent()) {
            return Optional.empty();
        } else {
            return Optional.of(libraries.save(new Library(name)));
        }
    }

    public Optional<Library> getLibrary(String name) {
        return libraries.get(name);
    }

    public List<Library> getAllLibraries() {
        return libraries.getAll();
    }
}
