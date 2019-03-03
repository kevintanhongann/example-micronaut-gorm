package example.micronaut.gorm

import example.micronaut.gorm.domain.Person
import example.micronaut.gorm.service.PersonService
import io.micronaut.runtime.Micronaut
import groovy.transform.CompileStatic

import javax.inject.Inject

@CompileStatic
class Application {

    final PersonService personService

    Application(PersonService personService) {
        this.personService = personService
    }

    static void main(String[] args) {
        Micronaut.run(Application)
    }
}
