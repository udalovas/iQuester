package com.iquester.web.api.controller;

import com.iquester.domain.model.Quest;
import com.iquester.repository.QuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/quests")
public class QuestController {

    @Autowired
    private QuestRepository questRepository;

    @RequestMapping("/{id}")
    public Quest findOne(@PathVariable String id) {
        return questRepository.findOne(id);
    }
}
