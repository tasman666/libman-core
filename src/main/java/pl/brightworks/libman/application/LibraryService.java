package pl.brightworks.libman.application;

import pl.brightworks.libman.domain.library.Library;

import java.util.List;

public interface LibraryService {

    public void createLibrary(String name);

    public Library getLibrary(String name);

    public List<Library> getAllLibraries();
}
