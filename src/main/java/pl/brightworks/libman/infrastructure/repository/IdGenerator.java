package pl.brightworks.libman.infrastructure.repository;

public class IdGenerator {

    private static Long ID = 0L;

    public static Long nextId() {
        return ID++;
    }
}
