package com.iquester.web.api.controller;

import com.iquester.domain.model.Quest;
import com.iquester.repository.QuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestController {

    @Autowired
    private QuestRepository questRepository;

    @RequestMapping("/quests/{id}")
    public Quest quest(@PathVariable String id) {
        return questRepository.findQuest(id);
    }
}
