package com.xenia.HRTools.model;

import lombok.Builder;

@Builder
public class SockRequestTemplate {
    private  String color;
    private  Integer size;

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

    private Integer compoud;
    private Boolean isItin;
private Integer compoudMin;

    public Integer getCompoudMin() {
        return compoudMin;
    }

    public void setCompoudMin(Integer compoudMin) {
        this.compoudMin = compoudMin;
    }

    public Integer getCompoudMax() {
        return compoudMax;
    }

    public void setCompoudMax(Integer compoudMax) {
        this.compoudMax = compoudMax;
    }

    private Integer compoudMax;



}
