public class Knight extends Hero{
    private int strength;
    private int impactForce;

    public Knight(String username, int level, int strength, int impactForce) throws Exception{
        super(username, level);
        this.setStrength(strength);
        this.setImpactForce(impactForce);
    }

    private void setStrength(int strength) throws Exception{
        if (strength < 1 || strength > 100) {
            throw new Exception("Wrong value to knight’s strength");
        }
        this.strength = strength;
    }

    private void setImpactForce(int impactForce) throws Exception{
        if (impactForce < 0|| impactForce > strength) {
            throw new Exception("Wrong value to knight’s force impact");
        }
        this.impactForce = impactForce;
    }

    private boolean fight(){
        if (strength >= impactForce && strength > 0){
            strength = strength - impactForce;
            return true;
        }
        else
        return false;
    }

    public String action(){
        if (fight()){
            return username + " fight with force " + impactForce;
        }
        else
        return username + " has no more strength";
    }
}
