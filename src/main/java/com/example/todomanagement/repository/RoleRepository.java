package com.example.todomanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.todomanagement.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

	Role findByName(String name);
}
