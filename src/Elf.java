public class Elf extends Hero{
    protected int arrowsCount;

    public Elf(String username, int level, int arrowsCount) throws Exception {
        super(username, level);
        this.setArrowsCount(arrowsCount);
    }

    protected void setArrowsCount(int arrowsCount) throws Exception{
        if (arrowsCount < 1 || arrowsCount > 100){
            throw new Exception("Wrong value to elf's arrows count");
        }
        this.arrowsCount = arrowsCount;
    }

    private boolean shootArrow(){
        if (arrowsCount > 0){
             arrowsCount = arrowsCount - 1;
            return true;
        }
        else
        return false;
    }

    public String action(){
        if (shootArrow()){
            return username + " shoot arrow";
        }
        else
        return username + " has no more arrows";
    }
}
