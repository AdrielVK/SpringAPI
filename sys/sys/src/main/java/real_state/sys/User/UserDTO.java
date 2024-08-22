package real_state.sys.User;

//aca se definen las clases que se utilizan para la comunicacion entre capas

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    int id;
    String username;
    String office;
    String name;
    String lastname;

}
