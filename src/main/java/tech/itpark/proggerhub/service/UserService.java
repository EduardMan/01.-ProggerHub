package tech.itpark.proggerhub.service;

import lombok.RequiredArgsConstructor;
import tech.itpark.proggerhub.repository.UserRepository;

@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;
}
