package neuberfran.com.jfran.model

import neuberfran.com.jfran.viewmodel.FireViewModel

class FireFranB {

    var value: Map<String, Int> = mapOf("value.openPercent" to 0)
    companion object Factory {
        fun create() : FireViewModel = FireViewModel()
        var COLLECTION = "device-configs"
        var DOCUMENT = "alarme"
        var FIELD_userId = "userId"
    }
    var garagestate: Boolean = false
    var gpiogaragestate: Boolean = false
    var id: String? = null
    var userId: String? = null
    var owner: String? = null
}