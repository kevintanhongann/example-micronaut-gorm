package example.micronaut.gorm

import example.micronaut.gorm.domain.Person
import example.micronaut.gorm.service.PersonService
import io.micronaut.context.event.StartupEvent
import io.micronaut.runtime.event.annotation.EventListener

import javax.inject.Singleton

@Singleton
class Bootstrap {

    final PersonService personService

    Bootstrap(PersonService personService) {
        this.personService = personService
    }

    @EventListener
    void onStartup(StartupEvent event) {
        personService.save(new Person(name: 'kevin', email: 'kevin@kevin.com'))
        personService.save(new Person(name: 'kevin', email: 'kevin@kevin.com'))
        personService.save(new Person(name: 'kevin', email: 'kevin@kevin.com'))
        personService.save(new Person(name: 'kevin', email: 'kevin@kevin.com'))
        personService.save(new Person(name: 'kevin', email: 'kevin@kevin.com'))
        personService.save(new Person(name: 'kevin', email: 'kevin@kevin.com'))
    }
}
