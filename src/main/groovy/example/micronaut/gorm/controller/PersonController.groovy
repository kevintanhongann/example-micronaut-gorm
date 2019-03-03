package example.micronaut.gorm.controller

import example.micronaut.gorm.domain.Person
import example.micronaut.gorm.service.PersonService
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Delete
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Put
import io.micronaut.http.hateos.JsonError
import io.reactivex.Single

@Controller("/person")
class PersonController {

    final PersonService personService

    PersonController(PersonService personService) {
        this.personService = personService
    }

    @Get("/")
    Single<HttpResponse<?>> list() {
        Single.just(personService.list()).map({ result ->
            HttpResponse.ok(result)
        }).onErrorReturn({ throwable ->
            new JsonError(throwable.message)
        })
    }

    @Get("/{id}")
    Single<HttpResponse<?>> get(Long id){
        Single.just(personService.get(id)).map({ result ->
            HttpResponse.ok(result)
        })onErrorReturn({ throwable ->
            new JsonError(throwable.message)
        })
    }

    @Post("/")
    Single<Person> save(Person person){
        Single.just(personService.save(person))
    }

    @Put("/")
    Single<Person> update(Person person){
        Single.just(personService.save(person))
    }

    @Delete("/")
    Single<HttpResponse<?>> delete(Person person){
        Single.just(person.delete()).map({ result ->
            HttpResponse.ok(result)
        }).onErrorReturn({ throwable ->
            new JsonError(throwable.message)
        })
    }
}
