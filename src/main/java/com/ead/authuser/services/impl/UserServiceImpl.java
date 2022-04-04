package com.ead.authuser.services.impl;

import com.ead.authuser.models.TbUserModel;
import com.ead.authuser.repositories.UserRepository;
import com.ead.authuser.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<TbUserModel> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<TbUserModel> findById(UUID userId) {
        return userRepository.findById(userId);
    }

    @Override
    public void delete(TbUserModel tbUserModel) {
        userRepository.delete(tbUserModel);
    }

    @Override
    public void save(TbUserModel userModel) {
        userRepository.save(userModel);
    }

    @Override
    public boolean existsByUsername(String username) {
        return userRepository.existsByUsername(username);
    }

    @Override
    public boolean existsByEmail(String email) {
        return userRepository.existsByEmail(email);
    }

    @Override
    public Page<TbUserModel> findAll(Specification<TbUserModel> spec, Pageable pageable) {
        return userRepository.findAll(spec, pageable);
    }
}
