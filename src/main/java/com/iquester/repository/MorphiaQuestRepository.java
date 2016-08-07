package com.iquester.repository;

import com.iquester.domain.model.Quest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MorphiaQuestRepository implements QuestRepository {

    @Autowired
    private MorphiaDataStoreProvider morphiaDataStoreProvider;

    public Quest findOne(String id) {
        return morphiaDataStoreProvider.getDataStore().get(Quest.class, id);
    }
}
