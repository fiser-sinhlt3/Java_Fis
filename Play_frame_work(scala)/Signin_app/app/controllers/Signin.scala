package controllers

import play.api._
import play.api.mvc._

class Signin extends Controller {
  val email = "a@gmail.com"
  val password = "1"

  def signin = Action {
     Ok(views.html.signin(""))
  }

  def checkSignin = Action(parse.tolerantFormUrlEncoded) {request =>
    var email = request.body.get("email").map(_.head).getOrElse("")
    var password = request.body.get("password").map(_.head).getOrElse("")

    if(checkUserData(email, password)){
      Redirect(routes.Hello.hello)
    }else{
      Ok(views.html.signin("Wrong password or email"))
    }
  }

  def checkUserData(e:String, p:String) : Boolean = {
    email == e && password == p
  }

}

