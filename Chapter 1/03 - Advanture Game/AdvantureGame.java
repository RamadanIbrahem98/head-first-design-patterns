public class AdvantureGame {
    public static void main(String[] args) {
        Character king = new King();
        king.fight();

        Character queen = new Queen();
        queen.fight();

        Character knight = new Knight();
        knight.fight();

        Character troll = new Troll();
        troll.fight();

        Character human = new Human();
        human.fight();
        human.setWeaponBehaviour(new SwordBehaviour());
        human.fight();
    }
}