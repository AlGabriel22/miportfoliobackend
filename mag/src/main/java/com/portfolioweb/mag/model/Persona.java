
package com.portfolioweb.mag.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "persona")
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false, name = "id_info")
    private Long idInfo;
    @Column(name = "name_info", length = 100, nullable = false)
    private String nameInfo;
    @Column(name = "surname_info", length = 100, nullable = false)
    private String surnameInfo;
    @Column(name = "title_info", length = 100, nullable = false)
    private String titleInfo;
    @Column(name = "desc_info", length = 1000, nullable = false)
    private String descriptionInfo;
    @Column(name = "pic_info", length = 1000, nullable = false)
    private String profilePic;
    @Column(name = "banner_info", length = 1000, nullable = false)
    private String bannerPic;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEdu")
    private List<Education> educationList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idExp")
    private List<Experience> experienceList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idPro")
    private List<Project> projectList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idSkill")
    private List<Skill> skillsList;
    public Persona() {
    }

    public Persona(Long idInfo, String nameInfo, String surnameInfo, String titleInfo, String descriptionInfo, String profilePic, String bannerPic) {
        this.idInfo = idInfo;
        this.nameInfo = nameInfo;
        this.surnameInfo = surnameInfo;
        this.titleInfo = titleInfo;
        this.descriptionInfo = descriptionInfo;
        this.profilePic = profilePic;
        this.bannerPic = bannerPic;
    }
  
}
