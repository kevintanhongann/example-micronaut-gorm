package example.micronaut.gorm.controller

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import io.reactivex.Single

@Controller("/")
class HomeController {

    @Get("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    Single<String> index(){
        Single.just("hello")
    }

}
