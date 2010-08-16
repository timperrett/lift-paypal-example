package bootstrap.liftweb

import _root_.net.liftweb.http.{LiftRules}
import _root_.net.liftweb.paypal.{PaypalRules}
import _root_.net.liftweb.common.{Full}
import _root_.net.liftweb.http.{S}
import _root_.liftweb.lib._

class Boot {
  def boot {
    
    PaypalRules.init
    
    // wire up the various DispatchPFs for both PDT and IPN
    PaypalHandler.dispatch.foreach(LiftRules.dispatch.append(_))
    
    
  }
}