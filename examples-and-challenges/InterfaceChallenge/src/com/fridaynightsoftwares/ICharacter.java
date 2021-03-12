package com.fridaynightsoftwares;

import java.util.ArrayList;
import java.util.List;

public interface ICharacter {
    ArrayList<String> save();
    void load(List<String> values);
    void loseHealth(double damage);
    void loseMp(double damage);
    void loseStr(double damage);
    void loseIntel(double damage);
    void loseAgi(double damage);
    void loseDex(double damage);
    void loseChr(double damage);
    void castMagic();
    void doPhysicalDamage();
}
