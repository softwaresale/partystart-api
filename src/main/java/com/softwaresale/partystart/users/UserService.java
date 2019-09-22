package com.softwaresale.partystart.users;

import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public interface UserService {
	Optional<Auth0User> getUserById(String id);
}
