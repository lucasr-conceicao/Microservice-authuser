package com.ead.authuser.repositories;

import com.ead.authuser.models.TbUserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<TbUserModel, UUID>, JpaSpecificationExecutor<TbUserModel> {

    boolean existsByUsername(String username);

    boolean existsByEmail(String email);

}
