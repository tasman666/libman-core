package pl.brightworks.libman.application

import pl.brightworks.libman.domain.library.Libraries
import pl.brightworks.libman.domain.library.Library
import spock.lang.Specification

class LibraryApplicationServiceSpec extends Specification {

    def libraries = Mock(Libraries)
    def libraryApplicationService = new LibraryApplicationService(libraries)

    def "create library when library name does not exist"() {
        given:
            def libraryName = "libraryName"
            libraryNotExists(libraryName)

        when:
            def id = libraryApplicationService.createLibrary(libraryName)

        then:
            1 * libraries.save({library -> library.name == libraryName}) >> 99L
        then:
            id == Optional.of(99L)
    }

    def "not create library when library name exists"() {
        given:
            def libraryName = "libraryName"
            libraryExists(libraryName)

        when:
            def id = libraryApplicationService.createLibrary(libraryName)

        then:
            0 * libraries.save(_)
        then:
            id == Optional.empty()
    }

    private void libraryExists(String libraryName) {
        libraries.get(libraryName) >> Optional.of(new Library(libraryName))
    }

    private void libraryNotExists(String libraryName) {
        libraries.get(libraryName) >> Optional.empty()
    }
}
