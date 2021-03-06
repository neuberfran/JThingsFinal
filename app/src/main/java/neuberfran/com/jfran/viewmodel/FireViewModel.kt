package neuberfran.com.jfran.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import neuberfran.com.jfran.model.FireFran
import neuberfran.com.jfran.model.FireFranB
import neuberfran.com.jfran.repository.FireRepository
import neuberfran.com.jfran.repository.FireRepositoryB

class FireViewModel : ViewModel() {

    private var firefran : MutableLiveData<FireFran>? = null
    private var firefrans: MutableLiveData<List<FireFran>>? = null
    private var firefranb : MutableLiveData<FireFranB>? = null
    private var firefransb: MutableLiveData<List<FireFranB>>? = null

    fun getFireFranById(firefranId : String) :MutableLiveData<FireFran> {

        if (firefran == null) {
            firefran = FireRepository.getInstance().getFireFranById(firefranId)
        }

        return firefran as MutableLiveData<FireFran>
     }

    val changeGpio:LiveData<Boolean>
        get() = FireRepository.getInstance().changeGpio

    val allFireFrans: MutableLiveData<List<FireFran>>
        get() {
            if (firefrans == null) {
                firefrans = FireRepository.getInstance().firefrans
            }
            return firefrans as MutableLiveData<List<FireFran>>
        }

      fun onChangeGpioAlarm() =
          FireRepository.getInstance().changeValueGpioAlarm()

    fun getFireFranByIdB(firefranIdB : String) :MutableLiveData<FireFranB> {

        if (firefranb == null) {
            firefranb = FireRepositoryB.getInstance().getFireFranByIdB(firefranIdB)
        }

        return firefranb as MutableLiveData<FireFranB>
    }

    val changeGpioB: LiveData<Boolean>
        get() = FireRepositoryB.getInstance().changeGpioB

    val allFireFransB: MutableLiveData<List<FireFranB>>
        get() {
            if (firefransb == null) {
                firefransb = FireRepositoryB.getInstance().firefransb
            }
            return firefransb as MutableLiveData<List<FireFranB>>
        }

    fun onChangeGpioGarage() =
        FireRepositoryB.getInstance().changeValueGpioGarage()

}