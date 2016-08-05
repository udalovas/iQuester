package com.iquester.web.api.controller;

import com.iquester.web.api.model.Quest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestController {

    @RequestMapping("/quests/{id}")
    public Quest quest(@PathVariable String id) {
        return new Quest(id, "foo");
    }
}
