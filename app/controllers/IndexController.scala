package controllers

import javax.inject._
import play.api.mvc._

class IndexController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def index() = Action {
    val user = Map("username" -> "Jane")
    val posts = List(
      Map(
        "author" -> "Shekhar",
        "body" -> "Getting started with Play"
      ),
      Map(
        "author" -> "Rahul",
        "body" -> "Getting started with Docker"
      )
    )
    Ok(views.html.index("Welcome", user, posts))
  }

}