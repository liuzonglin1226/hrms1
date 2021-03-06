package com.test.dao;

import com.test.model.Invitation;

import java.util.List;

public interface InvitationMapper {
    List<Invitation> selectByTouristId(int id);
    void updateState(Invitation invitation);
    void saveInvitation(Invitation invitation);
    void deleteInvitationById(int id);
}
