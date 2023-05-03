package com.xenia.HRTools.service;

import com.xenia.HRTools.dao.SockDao;
import com.xenia.HRTools.model.SockRequestTemplate;
import org.springframework.stereotype.Service;

@Service
public class SockService {
  //  List<SockEntity> sockEntityList = new ArrayList<SockEntity>();
private  final SockDao sockDao;

    public SockService(SockDao sockDao) {
        this.sockDao = sockDao;
    }

    public void addSock(SockRequestTemplate sockRequestTemplate, Integer quantity) {

        for (int i = 0; i < quantity; i++) {

sockDao.addSock(Utility.mapSockToEntity(sockRequestTemplate));
           // sockEntityList.add(Utility.mapSockToEntity(sock));

        }

    }

    public Integer getSockCount(SockRequestTemplate sockRequestTemplate) {
//        Integer sockCount = 0;
//        for (var sockEntity : sockEntityList) {
//            if (sockEntity.equals(sock)) {
//                sockCount++;
//            }
//        }
//        return sockCount;
        return sockDao.getNumberOfSocks(sockRequestTemplate);
    }

}
