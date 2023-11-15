import java.time.LocalDate;

public class GeneratorId extends Telephone{

    public static long id = 0;
    public GeneratorId() {
    }

    public GeneratorId(String soz, long san, LocalDate localDate, long id) {
        super(soz, san, localDate, id);
    }


    public static long idGenerator(){
        return ++id;
    }
}
