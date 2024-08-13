import java.util.Optional;

public class ResourceNotFoundException extends RuntimeException {
    public  ResourceNotFoundException(String msg) {
        super(msg);
    }

}
class EmpService{
    Optional<Integer> validate(Integer id) {
        if (id == 10) {
            return Optional.of(id);
        } else {
            throw new ResourceNotFoundException("id not present");
        }
    }

    public static void main(String[] args) {
        EmpService em = new EmpService();
        em.validate(10);
    }
}
