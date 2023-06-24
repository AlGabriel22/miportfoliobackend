package com.portfolioweb.mag.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter @Setter
@Entity
@Table(name = "skill")
public class Skill implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_skill", nullable = false)
    private Long idSkill;
    @Column(name = "skill_name",nullable = false)
    private String skillName;
    @Column(name = "pic_skill")
    private String picSkill;
    @Column(name = "percent",nullable = false)
    private int percent;

    public Skill() {
    }

    public Skill(Long idSkill, String skillName, String picSkill, int percent) {
        this.idSkill = idSkill;
        this.skillName = skillName;
        this.picSkill = picSkill;
        this.percent = percent;
    }
}
