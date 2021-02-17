package stack;
import lombok.*;

import java.io.IOException;
@Getter
@Setter
@AllArgsConstructor
public class Client {
    public static void main(String[] args) throws IOException {
        String initialString = "";
        StackService service = new StackService();
        System.out.println(service.isStatementCorrect(initialString));
    }
}
