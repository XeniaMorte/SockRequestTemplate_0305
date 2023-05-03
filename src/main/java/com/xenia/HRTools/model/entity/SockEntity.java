package com.xenia.HRTools.model.entity;

import com.xenia.HRTools.model.SockRequestTemplate;
import jakarta.persistence.*;

@Entity
@Table(name = "sock")
public class SockEntity  {
    private String color;
    private Integer size;
    private Integer compoud;
    private Boolean isItin;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getCompoud() {
        return compoud;
    }

    public void setCompoud(Integer compoud) {
        this.compoud = compoud;
    }

    public Boolean getItin() {
        return isItin;
    }

    public void setItin(Boolean itin) {
        isItin = itin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public boolean equals(SockRequestTemplate sockRequestTemplate) {
        return (this.size.equals(sockRequestTemplate.getSize()) && this.color.equals(sockRequestTemplate.getColor()) && this.compoud.equals(sockRequestTemplate.getCompoud()));


    }
}
