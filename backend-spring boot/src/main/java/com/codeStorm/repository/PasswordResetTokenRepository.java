package com.codeStorm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeStorm.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}
