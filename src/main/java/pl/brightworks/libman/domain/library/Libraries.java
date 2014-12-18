package pl.brightworks.libman.domain.library;

import java.util.List;
import java.util.Optional;

public interface Libraries {
    public Long save(Library library);

    public List<Library> getAll();

    public Optional<Library> get(String name);
}
