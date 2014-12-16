package pl.brightworks.libman.application;

import pl.brightworks.libman.domain.library.Library;
import pl.brightworks.libman.domain.library.Libraries;

import java.util.List;

public class DefaultLibraryService implements LibraryService {

    private Libraries libraries;

    public DefaultLibraryService(Libraries libraries) {
        this.libraries = libraries;
    }

    @Override
    public void createLibrary(String name) {
        libraries.save(new Library(name));
    }

    @Override
    public Library getLibrary(String name) {
        return libraries.get(name);
    }

    @Override
    public List<Library> getAllLibraries() {
        return libraries.getAll();
    }
}
