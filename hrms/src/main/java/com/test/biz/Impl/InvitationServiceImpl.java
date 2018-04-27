package com.test.biz.Impl;

import com.test.biz.InvitationService;
import com.test.dao.InvitationMapper;
import com.test.model.Invitation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvitationServiceImpl implements InvitationService {
    @Autowired
    private InvitationMapper invitationMapper;

    @Override
    public List<Invitation> selectByTouristId(int id) {
        return invitationMapper.selectByTouristId(id);
    }

    @Override
    public void saveInvitation(Invitation invitation) {
        invitationMapper.saveInvitation(invitation);
    }

    @Override
    public void deleteInvitationById(int id) {
        invitationMapper.deleteInvitationById(id);
    }

    @Override
    public void updateState(Invitation invitation) {
        invitationMapper.updateState(invitation);
    }
}
