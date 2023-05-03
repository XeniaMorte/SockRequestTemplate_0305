package com.xenia.HRTools.service;

import com.xenia.HRTools.model.SockRequestTemplate;
import com.xenia.HRTools.model.entity.SockEntity;

public class Utility {
    public static SockEntity mapSockToEntity(SockRequestTemplate sockRequestTemplate) {
        SockEntity sockEntity=new SockEntity();
        sockEntity.setColor(sockRequestTemplate.getColor());
        sockEntity.setCompoud(sockRequestTemplate.getCompoud());
        sockEntity.setSize(sockRequestTemplate.getSize());
        sockEntity.setItin(sockRequestTemplate.getItin());
        return sockEntity;
        //to
    }
}
