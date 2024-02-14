package com.jonatasmateus.dscommerce.repositories;

import com.jonatasmateus.dscommerce.entities.User;
import com.jonatasmateus.dscommerce.projections.UserDetailsProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query(nativeQuery = true, value = """
				SELECT user_tb.email AS username, user_tb.password, role_tb.id AS roleId, role_tb.authority
				FROM user_tb
				INNER JOIN user_role_tb ON user_tb.id = user_role_tb.user_id
				INNER JOIN role_tb ON role_tb.id = user_role_tb.role_id
				WHERE user_tb.email = :email
			""")
    List<UserDetailsProjection> searchUserAndRolesByEmail(String email);

	Optional<User> findByEmail(String email);
}