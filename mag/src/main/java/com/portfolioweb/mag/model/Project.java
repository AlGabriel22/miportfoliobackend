package com.portfolioweb.mag.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter @Setter
@Entity
@Table(name = "project")
public class Project implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, name = "id_project")
    private Long idPro;
    @Column(length = 255,nullable = false,name = "title_project")
    private String titlePro;
    @Column(length = 500,nullable = false,name = "desc_project")
    private String descPro;
    @Column(length = 255,nullable = false,name = "link_project")
    private String linkPro;
    @Column(length = 255,nullable = false,name = "pic_project")
    private String picPro;

    public Project() {
    }

    public Project(Long idPro, String titlePro, String descPro, String linkPro, String picPro) {
        this.idPro = idPro;
        this.titlePro = titlePro;
        this.descPro = descPro;
        this.linkPro = linkPro;
        this.picPro = picPro;
    }
}
