import java.util.*;
 public class OptionalClass {
    public static void main(String[] args) {
        String[] names = new String[5];
        Optional<String> name = Optional.ofNullable(names[0]);

        if (name.isPresent()) {
            System.out.println("Length: " + name.get().length());
        } else {
            System.out.println("Name is null");
        }
    }
}
