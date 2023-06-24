package com.portfolioweb.mag.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Getter @Setter
@Entity
@Table(name = "education")
public class Education implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, name = "id_edu")
    private Long idEdu;
    @Column(length = 255, nullable = false, name = "title_edu")
    private String titleEdu;
    @Column(name = "start_edu", columnDefinition = "DATE", nullable = false)
    private LocalDate startDateEdu;
    @Column(name = "end_edu",  columnDefinition = "DATE", nullable = false)
    private LocalDate endDateEdu;
    @Column(length = 500, name = "desc_edu", nullable = false)
    private String descEdu;
    @Column(length = 1000, name = "pic_edu", nullable = false)
    private String picEdu;

    public Education() {
    }

    public Education(Long idEdu, String titleEdu, LocalDate startDateEdu, LocalDate endDateEdu, String descEdu, String picEdu) {
        this.idEdu = idEdu;
        this.titleEdu = titleEdu;
        this.startDateEdu = startDateEdu;
        this.endDateEdu = endDateEdu;
        this.descEdu = descEdu;
        this.picEdu = picEdu;
    }
}
