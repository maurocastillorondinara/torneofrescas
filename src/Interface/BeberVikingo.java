package Interface;

public class BeberVikingo implements Ibeber{
    @Override
    public Integer beber( Integer extra) {
        return 5 - extra;
    }
}
