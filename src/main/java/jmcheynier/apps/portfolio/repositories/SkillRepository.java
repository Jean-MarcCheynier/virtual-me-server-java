package jmcheynier.apps.portfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import jmcheynier.apps.portfolio.models.Skill;

public interface SkillRepository extends JpaRepository<Skill, Long> {

}
