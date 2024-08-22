package real_state.sys.Auth;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import real_state.sys.User.UserRepository;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final UserRepository userRepository;
    
}
