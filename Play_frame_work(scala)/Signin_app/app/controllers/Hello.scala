package controllers

import play.api.mvc._

class Hello extends Controller{

   def hello = Action {
     Ok(views.html.hello.render())
   }

}
