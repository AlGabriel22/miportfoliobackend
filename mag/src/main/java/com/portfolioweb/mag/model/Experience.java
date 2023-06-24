package com.portfolioweb.mag.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Getter @Setter
@Entity
@Table(name = "experience")
public class Experience implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, name = "id_exp")
    private Long idExp;
    @Column(length = 255,nullable = false,name = "title_exp")
    private String titleExp;
    @Column(name = "start_Exp", columnDefinition = "DATE",nullable = false)
    private LocalDate startDateExp;
    @Column(name = "end_exp", columnDefinition = "DATE",nullable = false)
    private LocalDate endDateExp;
    @Column(length = 500,name = "desc_exp",nullable = false)
    private String descExp;
    @Column(length = 1000,name = "pic_exp",nullable = false)
    private String picExp;

    public Experience() {
    }

    public Experience(Long idExp, String titleExp, LocalDate startDateExp, LocalDate endDateExp, String descExp, String picExp) {
        this.idExp = idExp;
        this.titleExp = titleExp;
        this.startDateExp = startDateExp;
        this.endDateExp = endDateExp;
        this.descExp = descExp;
        this.picExp = picExp;
    }
}
