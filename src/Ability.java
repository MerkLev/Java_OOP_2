public class Ability {

    String Name;
    int Health;
    int Speed;
    int Ranged;
    int Melee;
    double Vigor;
    int SpellDamage;
    double Level;
    String Type;

    interface Stepp{ public void step(); public String getInfo();}
    public class Imp implements Stepp {
        public void step() {
            System.out.format(" %s сделал шаг", Name);
        }

        public String getInfo() {
            return(" Я" + Type);
        }
    }
    public static void RangedAr(String Name, int Ranged, double Level) {
        System.out.format("%s наносит %s ед. урона в стрелковой атаке", Name, Ranged);
        Level += 0.1;
    }

    public static void MeleeAr(String Name, int Melee, double Level) {
        System.out.format("%s наносит %s ед. урона в ближней атаке", Name, Melee);
        Level += 0.1;
    }

    public static int Damage(int Health, int Damage) {
        return (Health = Health - Damage);
    }

    public static void Spell(String Name, int SpellDamage, double Level, double Vigor) {
        System.out.format("%s наносит %s ед. урона в ближней атаке", Name, SpellDamage);
        Level += 0.1;
        Vigor-= 0.1;
    }
}