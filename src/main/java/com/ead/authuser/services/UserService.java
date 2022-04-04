package com.ead.authuser.services;

import com.ead.authuser.models.TbUserModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserService {

    List<TbUserModel> findAll();

    Optional<TbUserModel> findById(UUID userId);

    void delete(TbUserModel tbUserModel);

    void save(TbUserModel userModel);

    boolean existsByUsername(String username);

    boolean existsByEmail(String email);

    Page<TbUserModel> findAll(Specification<TbUserModel> spec, Pageable pageable);
}
