import java.util.*;

public class Main {
    public static void main(String[] args) {
        Ability S = new Sniper("Eyeball");
        Ability M = new Monk("Holy Moly");
        Ability W = new Wizard("Merlyn");
        Ability P = new Peasant("uncle Vitya");
        Ability R = new Robber("Instasamka");
        Ability Sp = new Spearman("Spongebob");
        Ability C = new Crossbowman("Karasik");

        S.RangedAr(S.Name,S.Ranged, S.Level);

        Ability L [] = {S,M,W,P,R,Sp};
        for (Ability D: L){
            D.Imp.getInfo();
        }
    }
}