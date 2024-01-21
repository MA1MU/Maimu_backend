package mymoo.mymoodemo.api.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mymoo.mymoodemo.api.domain.group.Group;
import mymoo.mymoodemo.api.domain.group.GroupEditor;
import mymoo.mymoodemo.api.dto.request.group.GroupCreate;
import mymoo.mymoodemo.api.dto.request.group.GroupEdit;
import mymoo.mymoodemo.api.dto.response.group.GroupResponse;
import mymoo.mymoodemo.api.exception.GroupNotFound;
import mymoo.mymoodemo.api.repository.group.GroupRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class GroupService {

    private final GroupRepository groupRepository;

    public void createGroup(GroupCreate groupCreate){
        Group group = Group.builder()
                .groupName(groupCreate.getGroupName())
                .groupColor(groupCreate.getGroupColor())
                .build();
        groupRepository.save(group);
    }

    public GroupResponse get(long id){
        Group group = groupRepository.findById(id)
                .orElseThrow(GroupNotFound::new);

        return GroupResponse.builder()
                .id(group.getId())
                .groupName(group.getGroupName())
                .groupColor(group.getGroupColor())
                .build();
    }

    @Transactional
    public void edit(Long id, GroupEdit groupEdit){
        Group group = groupRepository.findById(id)
                .orElseThrow(GroupNotFound::new);

        GroupEditor.GroupEditorBuilder groupEditorBuilder = group.toEditor();

        GroupEditor groupEditor = groupEditorBuilder.groupName(groupEdit.getGroupName())
                .groupColor(groupEdit.getGroupColor())
                .build();
        group.edit(groupEditor);
    }

    public void delete(Long id){
        Group group = groupRepository.findById(id)
                .orElseThrow(GroupNotFound::new);
        groupRepository.delete(group);
    }


}
