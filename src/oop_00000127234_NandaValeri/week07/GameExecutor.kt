package oop_00000127234_NandaValeri.week07

fun processEvent(event: BattleState) {
    when (event) {
        is MonsterEncounter -> println("Awas! Muncul monster ${event.monsterName}!")
        is LootDropped -> println("Selamat! Mendapat loot: ${event.item.name} (Rarity: ${event.item.rarity})")
        is GameOver -> println("Permainan Berakhir karena: ${event.reason}")
        SafeZone -> println("Kamu memasuki zona aman. Silahkan beristirahat.")
    }
}