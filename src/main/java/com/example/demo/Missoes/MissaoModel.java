package com.example.demo.Missoes;

import com.example.demo.Ninja.NinjaModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_missoes")
public class MissaoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String nameOfMission;
    private String difficult;


    //uma missiao para muitos ninjas
    @OneToMany(mappedBy = "missoes")
    private NinjaModel ninja;

    public MissaoModel(){}

    public MissaoModel(String nameOfMission, String difficult) {
        this.nameOfMission = nameOfMission;
        this.difficult = difficult;
    }

    public String getNameOfMission() {
        return nameOfMission;
    }

    public void setNameOfMission(String nameOfMission) {
        this.nameOfMission = nameOfMission;
    }

    public String getDifficult() {
        return difficult;
    }

    public void setDifficult(String difficult) {
        this.difficult = difficult;
    }

    public NinjaModel getNinja() {
        return ninja;
    }

    public void setNinja(NinjaModel ninja) {
        this.ninja = ninja;
    }
}
