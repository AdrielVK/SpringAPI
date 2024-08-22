package real_state.sys.User;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public UserResponse updateUser(UserRequest userRequest) {
        UserEntity user = UserEntity.builder()
                .id(userRequest.id)
                .name(userRequest.getName())
                .lastname(userRequest.getLastname())
                .role(Role.EDITOR)
                .build();

        userRepository.updateUser(user.id, user.name, user.lastname, user.office);

        return new UserResponse("Usuario registrado correctamente");
    };

    public UserDTO getUser(Integer id){
        UserEntity user = userRepository.findById(id).orElse(null);

        if(user != null) {
            return UserDTO.builder()
                    .id(user.id)
                    .username(user.username)
                    .name(user.name)
                    .lastname(user.lastname)
                    .office(user.office)
                    .build();
        }
        return null;
    }
}
