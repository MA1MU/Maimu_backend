package mymoo.mymoodemo.api.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mymoo.mymoodemo.api.dto.request.group.GroupCreate;
import mymoo.mymoodemo.api.dto.request.group.GroupEdit;
import mymoo.mymoodemo.api.dto.response.group.GroupResponse;
import mymoo.mymoodemo.api.service.GroupService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@RestController
@RequiredArgsConstructor
public class GroupController {

    private final GroupService groupService;

    @PostMapping("/group")
    public void group(@RequestBody @Valid GroupCreate groupCreate){
        groupService.createGroup(groupCreate);
    }

    @GetMapping("/group/{groupId}")
    public GroupResponse get(@PathVariable Long groupId){
        return groupService.get(groupId);
    }

    @PatchMapping("/group/{groupId}")
    public void edit(@PathVariable Long groupId, @RequestBody @Valid GroupEdit groupEdit){
        groupService.edit(groupId, groupEdit);
    }

    @DeleteMapping("/group/{groupId}")
    public void delete(@PathVariable Long groupId){
        groupService.delete(groupId);
    }

}
