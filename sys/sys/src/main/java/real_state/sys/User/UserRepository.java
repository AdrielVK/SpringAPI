package real_state.sys.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    Optional<UserEntity> findByUsername(String username);

    @Modifying
    @Query("update UserEntity u set u.name:=name, u.lastname:=lastname, u.office:=office")
    void updateUser(@Param(value = "id")Integer id,
                    @Param(value = "name")String name,
                    @Param(value = "lastname")String lastname,
                    @Param(value = "office") String office
    );
}
