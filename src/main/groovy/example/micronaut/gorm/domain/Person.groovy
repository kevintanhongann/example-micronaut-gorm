package example.micronaut.gorm.domain

import grails.gorm.annotation.Entity

@Entity
class Person {

    String name
    String email

    static constraints = {
        name nullable: false
        email nullable: false, email: true
    }

    static mapping = {
        autoTimestamp true
    }
}
