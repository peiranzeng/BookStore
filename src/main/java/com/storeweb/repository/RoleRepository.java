package com.storeweb.repository;

import org.springframework.data.repository.CrudRepository;


import com.storeweb.domain.security.Role;


public interface RoleRepository extends CrudRepository<Role, Long> {
	Role findByname(String name);
}
