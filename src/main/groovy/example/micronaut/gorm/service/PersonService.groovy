package example.micronaut.gorm.service

import example.micronaut.gorm.domain.Person
import grails.gorm.services.Service
import groovy.transform.CompileStatic

import javax.inject.Singleton

@Service(Person)
@CompileStatic
interface PersonService {

    Person get(Serializable id)

    List<Person> list(Map args)

    Long count()

    Person save(Person person)
}
