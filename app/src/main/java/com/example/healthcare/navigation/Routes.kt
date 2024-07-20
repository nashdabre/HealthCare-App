package com.example.healthcare.navigation

 sealed class Routes(val routes:String) {
     object  Splash: Routes("splash")
     object  Home: Routes("home")
     object BottomNav: Routes("bottom_nav")
     object StartPage: Routes("startpage")
     object Chatbot: Routes("chatbot")
     object Doctor: Routes("doctor")
     object Eyedoc: Routes("eyedoc")
     object Ineyedoc1: Routes("ineyedoc1")
     object Articels: Routes("Articels")
     object Emergency: Routes("emergencycontact")
     object Languages: Routes("languages")
     object About: Routes("about")
     object Lang: Routes("lang")
     object Appointment: Routes("appointment")

     object TestLab: Routes("testlab")
     object Youtube0: Routes("youtube")
     object Youtube1: Routes("youtube1")
     object Youtube2: Routes("youtube2")
     object Youtube3: Routes("youtube3")
     object Youtube4: Routes("youtube4")
     object Youtube5: Routes("youtube5")


     /*object  Profile: Routes("profile")
     object  Notification: Routes("notificaton")
     object  Settings: Routes("settings")
     object BottomNav: Routes("bottom_nav")
     object dropDownMenu: Routes("dropdownmenu")

     object Doctor: Routes("doctor")
     object Eyedoc: Routes("eyedoc")
     object Childdoc: Routes("childdoc")
     object CardsSection: Routes("cardssection")
     object Heartdoc: Routes("heartdoc")
     object Dentaldoc: Routes("dentaldoc")
     object Aritcel: Routes("articel")
     object Youtube: Routes("youtube")
     object Youtube1: Routes("youtube1")
*/
     object Login: Routes("login")
     object Register: Routes("register")


}