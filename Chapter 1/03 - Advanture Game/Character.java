public abstract class Character {
    WeaponBehaviour weaponBehaviour;
    
    public Character(){
    }

    public void fight() {
        weaponBehaviour.useWeapon();
    }

    public void setWeaponBehaviour(WeaponBehaviour wb) {
        weaponBehaviour = wb;
    }
}