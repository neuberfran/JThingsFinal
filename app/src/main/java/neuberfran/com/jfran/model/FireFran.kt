package neuberfran.com.jfran.model
import com.google.firebase.database.IgnoreExtraProperties
import neuberfran.com.jfran.viewmodel.FireViewModel

class FireFran {

    var value:  Map<String, Boolean> = mapOf("on" to false)
    companion object Factory {
        fun create() :FireViewModel = FireViewModel()
        var COLLECTION = "device-configs"
        var DOCUMENT = "alarme"
        var FIELD_userId = "userId"
    }
    var alarmstate: Boolean  = false
    var gpioalarmstate: Boolean =  false
    var id: String? = null
    var userId: String? = null
    var owner: String? = null
}

//class FireFran {
//    var value: FireFranValue = FireFranValue(hashMapOf("on" to false),hashMapOf("openPercent" to 0 ))
//    companion object Factory {
//        fun create() :FireViewModel = FireViewModel()
//        var COLLECTION = "device-configs"
//        var DOCUMENT = "alarme"
//        var FIELD_userId = "userId"
//    }
//    var alarmstate: Boolean  = false
//    var garagestate: Boolean = false
//    var gpioalarmstate: Boolean =  false
//    var gpiogaragestate: Boolean = false
//    var id: String? = null
//    var userId: String? = null
//    var owner: String? = null
//}
//data class FireFranValue(
//    var on: Map<String, Boolean> = mapOf("value.on" to false),
//    var openPercent: Map<String, Number> = hashMapOf("value.openPercent" to 0)
//)


//class FireFran {
//
//    var value: FireFranValue = FireFranValue(false)
//    var percent: FireFranValueB = FireFranValueB (false)
//    companion object Factory {
//        fun create() :FireViewModel = FireViewModel()
//        var COLLECTION = "device-configs"
//        var DOCUMENT = "alarme"
//        var FIELD_userId = "userId"
//    }
//    var alarmstate: Boolean  = false
//    var garagestate: Boolean = false
//    var gpioalarmstate: Boolean =  false
//    var gpiogaragestate: Boolean = false
//    var id: String? = null
//    var userId: String? = null
//    var owner: String? = null
//}
//data class FireFranValue(
//    var on: Boolean
//)
//
//data class FireFranValueB(
//    var openPercent: Boolean
//)

//class FireFran(
//    var alarmstate: Boolean  = false,
//    var garagestate: Boolean = false,
//    var id: String? = null,
//    var userId: String? = null,
//    var owner: String? = null,
//    var value: FireFranValue? = null,
//    var valorb: FireFranValueB? = null
//){
//    companion object Factory {
//        fun create() :FireViewModel = FireViewModel()
//        var COLLECTION = "device-configs"
//        var DOCUMENT = "alarme"
//        var FIELD_userId = "userId"
//    }
//}
//data class FireFranValue(
//    var on: Boolean? = null
//)
//
//data class FireFranValueB(
//    var openPercent: Number? = null
//)

//data class FireFran(
//
//    var alarmstate: Boolean  = false,
//    var garagestate: Boolean = false,
//    var gpioalarmstate: Boolean =  false,
//    var gpiogaragestate: Boolean = false,
//    var id: String? = null,
//    var userId: String? = null,
//    var owner: String? = null,
//    var value: List<Boolean> = ArrayList(),
//    var valorb: List<Number> = ArrayList()
//)

