package com.iquester.repository;

import com.iquester.domain.model.Quest;

public interface QuestRepository {

    Quest findQuest(String id);
}
