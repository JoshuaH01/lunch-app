package controllers

import play.api.mvc.Action

class WelcomeController extends HomeController {
def welcome() = Action {
  Ok
  }
}
