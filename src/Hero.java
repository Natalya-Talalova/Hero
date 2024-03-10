public abstract class Hero {
    protected String username;
    protected int level;

    public Hero(String username, int level) throws Exception{
        this.setUsername(username);
        this.setLevel(level);
    }

    private void setUsername(String username) throws Exception {
        if (username.length() < 5){
            throw new Exception("Wrong value to hero's username");
        }
        this.username = username;
    }

    private void setLevel(int level) throws Exception{
        if (level < 0){
            throw new Exception("Wrong value to hero's level");
        }
        this.level = level;
    }

    public abstract String action();
}
