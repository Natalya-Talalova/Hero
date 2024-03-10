public class Wizard extends Hero {
    protected int mana;
    protected int spellPower;

    public Wizard(String username, int level, int mana, int spellPower) throws Exception{
        super(username, level);
        this.setMana(mana);
        this.setSpellPower(spellPower);
    }

    private void setMana(int mana) throws Exception{
        if (mana < 1 || mana > 100){
            throw new Exception("Wrong value to wizard’s mana");
        }
        this.mana = mana;
    }

    private void setSpellPower(int spellPower) throws Exception{
        if (spellPower < 0 || spellPower > mana) {
            throw new Exception("Wrong value to wizard’s spell power");
        }
        this.spellPower = spellPower;
    }

    private boolean spell(){
        if (mana >= spellPower && mana > 0) {
            mana = mana - spellPower;
            return true;
        }
        else
        return false;
    }

    public String action(){
        if (spell()){
            return username + " spell with power " + spellPower;
        }
        else
        return username + " has no more mana";
    }
}
