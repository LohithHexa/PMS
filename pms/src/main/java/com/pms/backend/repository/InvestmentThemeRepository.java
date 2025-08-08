package com.pms.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pms.backend.entity.InvestmentTheme;

@Repository
public interface InvestmentThemeRepository extends JpaRepository<InvestmentTheme, Long> {
}
