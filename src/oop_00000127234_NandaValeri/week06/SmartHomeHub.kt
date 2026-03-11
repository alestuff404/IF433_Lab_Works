package oop_00000127234_NandaValeri.week06

class SmartHomeHub {

    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }

    fun turnOffAllSwitches() {
        println("\nMematikan semua perangkat...")

        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }
}