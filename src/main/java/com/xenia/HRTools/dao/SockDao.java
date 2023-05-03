package com.xenia.HRTools.dao;

import com.xenia.HRTools.dao.repository.SockRepository;
import com.xenia.HRTools.model.SockRequestTemplate;
import com.xenia.HRTools.model.entity.SockEntity;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

@Component
public class SockDao {
    private final SockRepository sockRepository ;

    public SockDao(SockRepository sockRepository) {
        this.sockRepository = sockRepository;
    }

    @Transactional
    public void addSock(SockEntity mapSockToEntity) {
        sockRepository.save(mapSockToEntity);
    }
    public Integer getNumberOfSocks(SockRequestTemplate sockRequestTemplate) {
        if (sockRequestTemplate.getCompoud() != null) {
            return sockRepository.countByColorAndCompoudAndSize(sockRequestTemplate.getColor(), sockRequestTemplate.getCompoud(), sockRequestTemplate.getSize());
        }
        if (sockRequestTemplate.getCompoudMin()!=null){
            return sockRepository.countByColorAndCompoudAndSize()
        }
    }
}
