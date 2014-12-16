package pl.brightworks.libman.domain.library;

import java.util.List;

public interface Libraries {
    public void save(Library library);

    public List<Library> getAll();

    public Library get(String name);
}
